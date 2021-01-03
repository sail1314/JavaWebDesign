package cn.xb.servlet;

import cn.xb.bean.Cinema;
import cn.xb.bean.Film;
import cn.xb.bean.Layout;
import cn.xb.dao.CinemaDao;
import cn.xb.dao.FilmDao;
import cn.xb.dao.LayoutDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/LayoutManagerServlet")
public class LayoutManagerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        //response.setCharacterEncoding("UTF-8");

        //创建数据库操作类
        LayoutDao layoutDao = new LayoutDao();

        List<Layout> list = new ArrayList<Layout>();

        list = layoutDao.getLayoutList();

        //System.out.println(list);
        HttpSession session = request.getSession();
        session.setAttribute("layoutList",list);

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

        response.sendRedirect("manager/manager_Layout.jsp");
    }
}
