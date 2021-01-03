package cn.xb.servlet;

import cn.xb.bean.User;
import cn.xb.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        //获取前台提交的email和密码
        Integer uid = Integer.parseInt(request.getParameter("uid"));

        UserDao userDao = new UserDao();
        //查询是否有相同的用户名
        Integer count = userDao.selectUserIdCount(uid);
        //System.out.println(count);

        if (count == 0){
            //数据库中已经有相同的email的用户
            //通过response对象给客户端一个错误提示
            PrintWriter writer = response.getWriter();
            writer.write("<script>");
            writer.write("alert('申请删除的用户id不存在!');");
            writer.write("window.location.href = 'manager/user/deleteUser.html'");
            writer.write("</script>");
            writer.flush();
            writer.close();
        } else {

            //flag是否注册成功
            boolean flag = userDao.DeleteUser(uid);
            if (flag) {
                //注册成功就跳转到用户信息列表页面  重定向
                response.sendRedirect("UserManagerServlet");
            } else {
                //注册失败返回注册页面 请求转发
                response.sendRedirect("manager/user/deleteUser.html");
            }
        }
    }
}
