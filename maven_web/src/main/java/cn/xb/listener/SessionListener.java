package cn.xb.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext application = se.getSession().getServletContext();
        int count = 1;
        if (application.getAttribute("count") != null) {
            count = (Integer) application.getAttribute("count");//获取application的值
            count++;
            application.setAttribute("count", count);
        }
        application.setAttribute("count", count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext application = se.getSession().getServletContext();
        Integer count = (Integer) application.getAttribute("count");
        count--;
        application.setAttribute("count", count);
    }
}
