package cn.xb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName="LoginFilter",urlPatterns = {"/ShopServlet"})
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 强转
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();

        response.setContentType("text/html;charset=UTF-8");
        // 解决重复登录的问题：session里面有登录数据就不需要在登录
        // 简单判断缓存中是否有登录用户
        if (session.getAttribute("user") == null) {// 没有用户
            // 没登录，驳回访问请求并重定向到登录页面
            PrintWriter writer = response.getWriter();
            writer.write("<script>");
            writer.write("alert('请先登录在进行操作！');");
            writer.write("window.location.href = 'login.jsp'");
            writer.write("</script>");
            writer.flush();
            writer.close();
            // 没登录，驳回访问请求并重定向到登录页面
            //response.sendRedirect("/offers/login.html");
            return;
        } else {
            chain.doFilter(request, response); // 放行，交给下一个过滤器
            return;
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
