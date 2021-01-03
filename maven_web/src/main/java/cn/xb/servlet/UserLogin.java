package cn.xb.servlet;

import cn.xb.bean.Manager;
import cn.xb.bean.User;
import cn.xb.dao.ManagerDao;
import cn.xb.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/userLogin")
public class UserLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        //获取前台提交的email和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        //保存email和密码 查询申请人
        UserDao userDao = new UserDao();
        ManagerDao managerDao = new ManagerDao();

        Manager manager = managerDao.geManagerByNameAndPass(username, password);
        User user = userDao.getUserByNameAndPass(username, password);

        if (manager==null) {
            if (user != null) {
                //将登录用户对象保存到session里
                HttpSession session = request.getSession();
                session.removeAttribute("user");
                session.setAttribute("user", user);

                //登录成功  重定向
                request.getRequestDispatcher("index_user.jsp").forward(request, response);
            } else {
                PrintWriter writer = response.getWriter();
                writer.write("<script>");
                writer.write("alert('用户名或者密码错误！');");
                writer.write("window.location.href = 'login.jsp'");
                writer.write("</script>");
                writer.flush();
                writer.close();
            }
        } else {
            //登录成功  重定向
            response.sendRedirect("manager/index.html");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
