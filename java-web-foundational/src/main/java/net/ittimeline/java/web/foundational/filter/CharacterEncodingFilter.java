package net.ittimeline.java.web.foundational.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * POST请求和POST响应参数乱码的解决
 * @author tony 18601767221@163.com
 * @version 2021/7/23 11:41
 * @since JDK11
 */
@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {

    }


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("CharacterEncodingFilter拦截到了所有请求");
        //处理POST请求的请求参数乱码
        request.setCharacterEncoding("UTF-8");
        //处理POST响应响应的结果乱码
        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

}