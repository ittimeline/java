package net.ittimeline.java.web.foundational.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * LoginFilter拦截到/login请求对应的LoginServlet
 * @author tony 18601767221@163.com
 * @version 2021/7/23 10:58
 * @since JDK11
 */
//@WebFilter("/login")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("1.服务器创建了LoginFilter对象");
    }


    /**
     * doFilter方法每次都会执行，只要有匹配上拦截的资源
     * @param request
     * @param response
     * @param chain
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("2.LoginFilter拦截到了所有.html结尾的请求");

        //放行:这次请求通过，让它访问想访问的LoginServlet资源
        //如果不放行，则访问不到请求的资源，直接返回
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("3.服务器销毁了LoginFilter对象");

    }

}