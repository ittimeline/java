package net.ittimeline.java.web.foundational.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 统计网站访问人数的Filter
 * @author tony 18601767221@163.com
 * @version 2021/7/23 17:27
 * @since JDK11
 */
@WebFilter("/*")
public class StatisticFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {

        Integer count=0;
        config.getServletContext().setAttribute("count",count);
        System.out.println("服务器启动之后网站访问的人数是"+count);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("StatisticFilter拦截到了客户端的请求");
        HttpServletRequest httpServletRequest=(HttpServletRequest) request;
        ServletContext servletContext = httpServletRequest.getServletContext();
        System.out.println("客户端请求的地址是"+httpServletRequest.getRequestURL());
        System.out.println("客户端的user agent"+httpServletRequest.getHeader("user-agent"));
        Integer count = (Integer)servletContext.getAttribute("count");
        count++;
        servletContext.setAttribute("count",count);
        System.out.println("客户端访问网站之后当前网站的访问人数是"+count);
        //放行
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

}