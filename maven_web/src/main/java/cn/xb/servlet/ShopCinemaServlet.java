package cn.xb.servlet;

import cn.xb.bean.Cinema;
import cn.xb.bean.Film;
import cn.xb.bean.Layout;
import cn.xb.bean.User;
import cn.xb.dao.CinemaDao;
import cn.xb.dao.FilmDao;
import cn.xb.dao.LayoutDao;
import cn.xb.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ShopCinemaServlet")
public class ShopCinemaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        //获取前台提交的email和密码
        String name = request.getParameter("username");
        //System.out.println(name);
        Integer id = Integer.parseInt(request.getParameter("id"));
        //System.out.println(id);

        UserDao userDao = new UserDao();
        User user = userDao.getUserByName(name);
        session.removeAttribute("user");
        session.setAttribute("user",user);


        //创建数据库操作类
        CinemaDao cinemaDao = new CinemaDao();

        Cinema cinema = cinemaDao.getCinemabyId(id);

        //System.out.println(list);
        session.removeAttribute("cinema");
        session.setAttribute("cinema",cinema);

        LayoutDao layoutDao = new LayoutDao();

        List<Layout> layoutlist = new ArrayList<>();

        layoutlist = layoutDao.getLayoutListbyCinemaId(cinema.getId());

        session.setAttribute("layoutList",layoutlist);

        response.sendRedirect("Layout.jsp");
    }
}
