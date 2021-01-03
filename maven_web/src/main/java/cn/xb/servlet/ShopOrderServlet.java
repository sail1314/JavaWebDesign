package cn.xb.servlet;

import cn.xb.bean.*;
import cn.xb.dao.*;
import org.omg.PortableInterceptor.INACTIVE;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/ShopOrderServlet")
public class ShopOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        //获取前台提交的email和密码
        String name = request.getParameter("username");
        //System.out.println(name);
        Integer cid = Integer.parseInt(request.getParameter("cid"));
        Integer fid = Integer.parseInt(request.getParameter("fid"));
        Integer lid = Integer.parseInt(request.getParameter("lid"));
        session.removeAttribute("user");
        session.removeAttribute("cinema");
        session.removeAttribute("layout");
        session.removeAttribute("film");
        session.removeAttribute("order");

        UserDao userDao = new UserDao();
        User user = userDao.getUserByName(name);
        session.setAttribute("user", user);

        //创建数据库操作类
        CinemaDao cinemaDao = new CinemaDao();
        Cinema cinema = cinemaDao.getCinemabyId(cid);
        session.setAttribute("cinema", cinema);

        LayoutDao layoutDao = new LayoutDao();
        Layout layout = layoutDao.getLayoutbyId(lid);
        session.setAttribute("layout", layout);

        FilmDao filmDao = new FilmDao();
        Film film = filmDao.getFilmById(fid);
        session.setAttribute("film", film);

        OrderDao orderDao = new OrderDao();
        Random random = new Random();
        Integer rand = random.nextInt(800)+101;
        String code1 = "EEE"+rand.toString();
        while(true) {
            if (orderDao.selectOrderCodeCount(code1) == 0) {
                Integer ps = random.nextInt(40) + 1;
                Order order = new Order(null, ps, code1, user.getId(), fid, cid, lid);
                orderDao.saveOrder(order);
                break;
            } else {
                code1 = "EEE" + (random.nextInt(800) + 101);
            }
        }

        Order orderByFid = orderDao.getOrderByCode(code1);
        session.setAttribute("order", orderByFid);

        response.sendRedirect("Order.jsp");
    }
}
