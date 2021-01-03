package cn.xb.servlet;

import cn.xb.bean.User;
import cn.xb.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/UserManagerServlet")
public class UserManagerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        //response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        List<User> list = new ArrayList<>();

        User user1 = (User) session.getAttribute("user1");

        //System.out.println(user1);
        if (user1 == null) {
            //创建数据库操作类
            UserDao userDao = new UserDao();
            list = userDao.getUserList();

        } else {
            list.add(user1);
        }
        session.setAttribute("userList", list);
        session.removeAttribute("user1");
        response.sendRedirect("manager/manager_User.jsp");

        //request.getRequestDispatcher("manager/manager_User.jsp").forward(request,response);
    }
}
