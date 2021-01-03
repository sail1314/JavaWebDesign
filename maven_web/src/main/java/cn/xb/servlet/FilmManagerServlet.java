package cn.xb.servlet;

import cn.xb.bean.Film;
import cn.xb.bean.User;
import cn.xb.dao.FilmDao;
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

@WebServlet("/FilmManagerServlet")
public class FilmManagerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        //response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        List<Film> list = new ArrayList<Film>();

        Film film1 = (Film)session.getAttribute("film1");

        if(film1 == null) {
            //创建数据库操作类
            FilmDao filmDao = new FilmDao();
            list = filmDao.getFilmList();
        } else {
            list.add(film1);
        }

        session.setAttribute("filmList",list);
        session.removeAttribute("film1");
        //System.out.println(list);
        response.sendRedirect("manager/manager_Film.jsp");
    }
}
