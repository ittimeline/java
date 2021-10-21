package net.ittimeline.java.web.foundational.listener;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * @author tony 18601767221@163.com
 * @version 2021/7/23 17:10
 * @since JDK11
 */
//@WebListener
public class ContextLoaderListener implements ServletContextListener {

    public ContextLoaderListener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        /* This method is called when the servlet context is initialized(when the Web application is deployed). */
        System.out.println("ServletContextListener监听服务启动了,项目的部署虚拟路径"+servletContextEvent.getServletContext().getContextPath());
        //Spring初始化IOC容器
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        /* This method is called when the servlet Context is undeployed or Application Server shuts down. */
        System.out.println("ServletContextListener监听服务关闭了,项目的部署虚拟路径"+servletContextEvent.getServletContext().getContextPath());

    }


}
