package cn.xb.servlet;

import cn.xb.bean.Cinema;
import cn.xb.bean.Film;
import cn.xb.bean.User;
import cn.xb.dao.CinemaDao;
import cn.xb.dao.FilmDao;
import cn.xb.dao.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet("/ShopServlet")
public class ShopServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        //获取前台提交的email和密码
        String name = request.getParameter("username");

        UserDao userDao = new UserDao();
        User user = userDao.getUserByName(name);
        session.removeAttribute("user");
        session.setAttribute("user",user);


        //创建数据库操作类
        CinemaDao cinemaDao = new CinemaDao();

        List<Cinema> list = new ArrayList<Cinema>();

        list = cinemaDao.getCinemaList();

        //System.out.println(list);

        session.setAttribute("cinemaList",list);
        //System.out.println(list);
        response.sendRedirect("shop.jsp");

    }
}
