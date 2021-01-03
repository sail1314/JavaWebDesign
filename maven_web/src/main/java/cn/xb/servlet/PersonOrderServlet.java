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

@WebServlet("/PersonOrderServlet")
public class PersonOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        //response.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");

        UserDao userDao = new UserDao();
        User user = userDao.getUserByName(name);

        OrderDao orderDao = new OrderDao();
        List<Order> order = new ArrayList<Order>();
        order = orderDao.getOrderbyUid(user.getId());
        //System.out.println(order);

        if (order==null){
            session.setAttribute("have",false);
        } else{
            session.setAttribute("have",true);

            session.setAttribute("order4",order);
        }
        session.removeAttribute("layoutList");
        session.removeAttribute("film");
        session.removeAttribute("cinema");


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

        List<User> list4 = new ArrayList<>();

        list4 = userDao.getUserList();

//        System.out.println(list);
        request.getSession();
        session.setAttribute("user",list4);

        response.sendRedirect("manager/PersonOrderList.jsp");
    }
}
