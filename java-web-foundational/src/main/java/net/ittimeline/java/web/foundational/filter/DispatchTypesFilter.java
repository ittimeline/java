package net.ittimeline.java.web.foundational.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * DispatchTypesFilter 拦截客户端请求和服务器请求转发的请求
 * @author tony 18601767221@163.com
 * @version 2021/7/23 11:26
 * @since JDK11
 */
@WebFilter(value = "/request/*",dispatcherTypes = {DispatcherType.REQUEST,DispatcherType.FORWARD})
public class DispatchTypesFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
    }


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest= (HttpServletRequest) request;
        System.out.println("DispatchTypesFilter过滤器拦截到了"+httpServletRequest.getRequestURL()+"的请求");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

}