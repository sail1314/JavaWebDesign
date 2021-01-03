package cn.xb.servlet;

import cn.xb.bean.User;
import cn.xb.dao.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        //获取前台提交的email和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String yanzhenma = request.getParameter("yanzhenma");

        HttpSession session = request.getSession();
        String yzm = (String) session.getAttribute("yzm");

        User user = new User(null, username, password, null, new Date());

        UserDao userDao = new UserDao();
        //查询是否有相同的用户名
        Integer count = userDao.selectUserNameCount(username);

        if (count > 0){
            //数据库中已经有相同的email的用户
            //通过response对象给客户端一个错误提示
            PrintWriter writer = response.getWriter();
            writer.write("<script>");
            writer.write("alert('申请注册的用户名已经被占用!');");
            writer.write("window.location.href = 'register.jsp'");
            writer.write("</script>");
            writer.flush();
            writer.close();
        }else if(!username.matches("^[a-z][a-zA-Z0-9]{5,}$")){
            PrintWriter writer = response.getWriter();
            writer.write("<script>");
            writer.write("alert('申请注册的用户名格式不正确！六位以上，必须小写字母开头');");
            writer.write("window.location.href = 'register.jsp'");
            writer.write("</script>");
            writer.flush();
            writer.close();
        }else if (!yzm.equalsIgnoreCase(yanzhenma)){
            PrintWriter writer = response.getWriter();
            writer.write("<script>");
            writer.write("alert('申请注册的验证码不正确！');");
            writer.write("window.location.href = 'register.jsp'");
            writer.write("</script>");
            writer.flush();
            writer.close();
        }else {

            //flag是否注册成功
            boolean flag = userDao.saveUser(user);
            if (flag) {
                //注册成功就跳转到登录页面  重定向
                response.sendRedirect("login.jsp");

            } else {
                //注册失败返回注册页面 请求转发
                RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
                dispatcher.forward(request, response);

            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
