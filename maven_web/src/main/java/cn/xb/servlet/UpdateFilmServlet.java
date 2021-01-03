package cn.xb.servlet;

import cn.xb.bean.Film;
import cn.xb.dao.FilmDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/UpdateFilmServlet")
@MultipartConfig
public class UpdateFilmServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        FilmDao filmDao = new FilmDao();
        //获取前台提交的email和密码
        Integer fid = Integer.parseInt(request.getParameter("fid"));
        String name = request.getParameter("name");
        String detail = request.getParameter("detail");
        Integer price = Integer.parseInt(request.getParameter("price"));
        System.out.println(fid);

        //上传头像
        Part part = request.getPart("headShot");
        //上传的文件名head1.jpg
        String fileName = part.getSubmittedFileName();

        if (fileName != null && fileName.length() != 0) {
            //创建保存文件目录
            String dir = this.getServletContext().getRealPath("/images");
            //判断 目录是否存在
            File imgDir = new File(dir);
            if (!imgDir.exists()) {
                imgDir.mkdirs();
            }
            //上传到服务器文件路径imgDir+'/'+fileName
            part.write(dir + "/" + fileName);
        }

        Film film = new Film(fid, name, detail, price, fileName, new Date(), null, null);
        System.out.println(film);


        //查询是否有相同的用户名
        Integer count = filmDao.selectFilmIdCount(fid);

        if (count == 0) {
            //数据库中已经有相同的email的用户
            //通过response对象给客户端一个错误提示
            PrintWriter writer = response.getWriter();
            writer.write("<script>");
            writer.write("alert('申请添加的电影编号不存在!');");
            writer.write("window.location.href = 'manager/film/updataFilm.html'");
            writer.write("</script>");
            writer.flush();
            writer.close();
        } else {
            //flag是否注册成功
            boolean flag = filmDao.UpdateFilm(film);
            //System.out.println(film);
            if (flag) {
                //注册成功就跳转到用户信息列表页面  重定向
                response.sendRedirect("FilmManagerServlet");
            } else {
                //注册失败返回注册页面 请求转发
                RequestDispatcher dispatcher = request.getRequestDispatcher("manager/film/updataFilm.html");
                dispatcher.forward(request, response);
            }
        }

    }
}
