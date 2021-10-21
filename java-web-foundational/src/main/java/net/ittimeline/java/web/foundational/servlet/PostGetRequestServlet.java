package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * HttpServletRequest获取请求数据
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/17 14:20
 * @since JDK11
 */
@WebServlet("/request")
public class PostGetRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

          getRequestLineData(request);

        //   getRequestHeaderData(request);

        getRequestBodyData(request);
    }

    /**
     * HttpServletRequest获取请求行数据
     *
     * @param request
     */
    private void getRequestLineData(HttpServletRequest request) {

        System.out.println("HttpServletRequest获取请求行数据 ---> 获取请求的方式" + request.getMethod());
        //请求的URI: /javaweb/request  由项目名(虚拟路径)+资源名组成
        // URI 表示统一资源标识符 在当前服务器中可以使用这个地址来唯一标识这个资源
        System.out.println("HttpServletRequest获取请求行数据 ---> 获取请求的URI:" + request.getRequestURI());
        //URL 表示统一资源定位符 是在互联网中访问该资源的地址
        //请求的URL: http://localhost:8080/javaweb/request
        System.out.println("HttpServletRequest获取请求行数据 ---> 获取请求的URL:" + request.getRequestURL());
        System.out.println("HttpServletRequest获取请求行数据 ---> 获取请求的协议信息:" + request.getProtocol());

        System.out.println("HttpServletRequest获取请求行数据 ---> 获取请求的项目名(虚拟路径):" + request.getContextPath());

        System.out.println("HttpServletRequest获取请求行数据 ---> 获取请求(客户端)的ip地址:" + request.getRemoteAddr());
        System.out.println("HttpServletRequest获取请求行数据 ---> 获取请求的服务器的端口:" + request.getServerPort());
        System.out.println("HttpServletRequest获取请求行数据 ---> 获取请求参数(get请求URL?后的参数):" + request.getQueryString());

    }

    /**
     * HttpServletRequest获取请求头数据
     */
    private void getRequestHeaderData(HttpServletRequest request) {
        System.out.println("HttpServletRequest获取请求头数据--->获取请求的浏览器信息" + request.getHeader("User-Agent"));

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            System.out.println("HttpServletRequest获取请求头数据--->获取所有请求头的名称" + headerNames.nextElement());
        }
    }

    /**
     * HttpServletRequest获取请求体数据
     *
     * @param request
     */
    private void getRequestBodyData(HttpServletRequest request) {
        //Get请求没有请求体只能获取请求参数

        // 测试地址 http://localhost:8080/javaweb/request?name=admin&password=11111
        System.out.println("HttpServletRequest获取请求体数据 获取指定名称的参数值(值只有一个)" + request.getParameter("name"));
        System.out.println("HttpServletRequest获取请求体数据 获取指定名称的参数值(值只有一个)" + request.getParameter("password"));

        String[] hobbies = request.getParameterValues("hobby");
        System.out.println("HttpServletRequest获取请求体数据 获取指定名称的参数值(值可能有多个)" + Arrays.toString(hobbies));

        Map<String, String[]> allRequestParameterMap = request.getParameterMap();
        System.out.println("HttpServletRequest获取请求体数据获取所有请求参数");
        Set<Map.Entry<String, String[]>> entries = allRequestParameterMap.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            System.out.print("请求参数名:"+entry.getKey());
            System.out.print("请求参数值:"+Arrays.toString(entry.getValue()));
            System.out.println();
        }

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
