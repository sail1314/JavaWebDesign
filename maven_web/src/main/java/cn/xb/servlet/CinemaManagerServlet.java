package cn.xb.servlet;

import cn.xb.bean.Cinema;
import cn.xb.bean.Layout;
import cn.xb.dao.CinemaDao;
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

@WebServlet("/CinemaManagerServlet")
public class CinemaManagerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        //response.setCharacterEncoding("UTF-8");

        //创建数据库操作类
        CinemaDao cinemaDao = new CinemaDao();

        List<Cinema> list = new ArrayList<Cinema>();

        list = cinemaDao.getCinemaList();

        //System.out.println(list);
        HttpSession session = request.getSession();
        session.setAttribute("cinemaList",list);
        //System.out.println(list);
        response.sendRedirect("manager/manager_Cinema.jsp");
    }
}
