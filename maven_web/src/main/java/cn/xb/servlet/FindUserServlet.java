package cn.xb.servlet;

import cn.xb.bean.User;
import cn.xb.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FindUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        //获取前台提交的email和密码
        String name = request.getParameter("name");

        UserDao userDao = new UserDao();
        //查询是否有相同的用户名
        Integer count = userDao.selectUserNameCount(name);
        //System.out.println(count);

        if (count == 0){
            //数据库中已经有相同的email的用户
            //通过response对象给客户端一个错误提示
            PrintWriter writer = response.getWriter();
            writer.write("<script>");
            writer.write("alert('申请查看的用户不存在!');");
            writer.write("window.location.href = 'manager/user/findUser.html'");
            writer.write("</script>");
            writer.flush();
            writer.close();
        } else {

            User user = userDao.getUserByName(name);

            if (user != null) {
                //注册成功就跳转到用户信息列表页面  重定向
                request.getSession().setAttribute("user1",user);
                response.sendRedirect("UserManagerServlet");
            } else {
                //注册失败返回注册页面 请求转发
                response.sendRedirect("manager/user/findUser.html");
            }
        }
    }
}
