package cn.xb.servlet;

import cn.xb.bean.*;
import cn.xb.dao.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/OrderManagerServlet")
public class OrderManagerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        //response.setCharacterEncoding("UTF-8");

        //创建数据库操作类
        OrderDao orderDao = new OrderDao();

        List<Order> list = new ArrayList<Order>();

        list = orderDao.getOrderList();

        //System.out.println(list);
        HttpSession session = request.getSession();
        session.setAttribute("orderList",list);
        session.removeAttribute("layoutList");
        session.removeAttribute("film");
        session.removeAttribute("cinema");
        session.removeAttribute("user");


        //创建数据库操作类
        LayoutDao layoutDao = new LayoutDao();

        List<Layout> list3 = new ArrayList<Layout>();

        list3 = layoutDao.getLayoutList();

        //System.out.println(list);
        request.getSession();
        session.setAttribute("layout",list3);

        //创建数据库操作类
        FilmDao filmDao = new FilmDao();

        List<Film> list1 = new ArrayList<Film>();

        list1 = filmDao.getFilmList();

        session.setAttribute("film",list1);

        //创建数据库操作类
        CinemaDao cinemaDao = new CinemaDao();

        List<Cinema> list2 = new ArrayList<Cinema>();

        list2 = cinemaDao.getCinemaList();

        session.setAttribute("cinema",list2);

        UserDao userDao = new UserDao();

        List<User> list4 = new ArrayList<User>();

        for (Order o: list) {
            User u = userDao.getUserById(o.getUid());
            list4.add(u);
        }
//        System.out.println(list);
        session.setAttribute("user",list4);
        //System.out.println(list);
        response.sendRedirect("manager/manager_Order.jsp");
    }
}
