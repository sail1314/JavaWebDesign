package cn.xb.servlet;


import cn.xb.dao.UserDao;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@WebServlet("/AJAXServlet")
public class AJAXServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");

        //System.out.println("接受到前台请求.........");

        //创建操作数据库类
        UserDao userDao = new UserDao();

        //判断是否有相同的email
        Integer count = userDao.selectUserNameCount(username);

        HashMap<String, Object> map = new HashMap<>();

        //账号必须字母开头，可以有数字，必须6位以上
        if(username.matches("^[a-z][a-zA-Z0-9]{5,}$")){
            // 判断数据库中是否已经有了该邮箱
            if (count > 0){
                //已存在
                map.put("userExsit",true);
                map.put("msg","此用户名太受欢迎，请更换一个");
            }else {
                //不存在
                map.put("userExsit",false);
                map.put("msg","用户名可用");
            }
        }else {
            //不存在
            map.put("userExsit",true);
            map.put("msg","账号必须小写字母开头，可以有数字，必须6位以上");
        }

        //将map转为json，并且传递给客户端
        //将map转为json,jackson
        ObjectMapper objectMapper = new ObjectMapper();
        //并且传递给客户端
        objectMapper.writeValue(response.getWriter(),map);
    }
}
