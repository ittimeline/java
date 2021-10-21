package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * 我的第一个Servlet,基于注解配置的方式实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/15 18:54
 * @since JDK11
 */
@WebServlet(urlPatterns = "/welcome",loadOnStartup = 1,initParams ={@WebInitParam(name="name",value = "tony")} )
public class WelcomeServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("服务器创建了WelcomeServlet对象");
        String name = config.getInitParameter("name");
        System.out.println("初始化参数name的属性值是"+name);


    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("我的第一个Servlet-注解配置实现");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
