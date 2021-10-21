package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * 我的第一个Servlet-XML配置实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/15 18:38
 * @since JDK11
 */
public class HelloWorldServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("1.服务器启动后创建了HelloWorldServlet对象");
        //通过ServletConfig对象获取Servlet初始化参数
        String contextConfigLocation = config.getInitParameter("contextConfigLocation");
        System.out.println("contextConfigLocation 属性值是"+contextConfigLocation);

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("2.客户端发起请求时调用 我的第一个Servlet-XML配置实现");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("3.服务器停止服务的时候销毁HelloWorldServlet对象");
    }
}
