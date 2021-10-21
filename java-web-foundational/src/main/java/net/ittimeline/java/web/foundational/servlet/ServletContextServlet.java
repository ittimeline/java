package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;

/**
 * ServletContext获取文件MIME类型
 * ServletContext获取Web资源真实路径
 * ServletContext获取Web资源输入流
 * @author tony 18601767221@163.com
 * @version 2021/7/16 8:56
 * @since JDK11
 */
@WebServlet("/context")
public class ServletContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext servletContext = getServletContext();
       // getMimeType(servletContext);
       // getRealPath(servletContext);
        getWebResourceAsStream(servletContext);

        getResourceAsStream();
    }

    /**
     * 获取文件的Mime Type
     * @param servletContext
     */
    private void getMimeType(ServletContext servletContext){
        String file="index.html";
        String mimeType = servletContext.getMimeType(file);
        System.out.println(file+"的MIME类型是"+mimeType);

        file="falalilafa.jpg";
        mimeType = servletContext.getMimeType(file);
        System.out.println(file+"的MIME类型是"+mimeType);

        file="十年.flac";
        mimeType = servletContext.getMimeType(file);
        System.out.println(file+"的MIME类型是"+mimeType);

        file="英雄.mp4";
        mimeType = servletContext.getMimeType(file);
        System.out.println(file+"的MIME类型是"+mimeType);
    }


    private void getRealPath(ServletContext servletContext){
        String resource="jdbc.properties";
        String realPath = servletContext.getRealPath(resource);

        System.out.println(resource+"的真实路径是"+realPath);

    }


    /**
     * 获取web资源的输入流
     * @param servletContext
     * @return
     */
    private InputStream getWebResourceAsStream(ServletContext servletContext){
        InputStream servletContextResourceAsStream = servletContext.getResourceAsStream("images/falalilafa.jpg");
        System.out.println("WebResource InputStream Object"+servletContextResourceAsStream);

        return servletContextResourceAsStream;
    }

    /**
     * 获取类路径的资源的路径
     * D:\workspace\java\ittimelinedotnet\java\out\artifacts\java_web_foundational_war_exploded\WEB-INF\classes
     * @return
     */
    private  InputStream getResourceAsStream(){
        InputStream resourceAsStream = ServletContextServlet.class.getClassLoader().getResourceAsStream("jdbc.properties");
        System.out.println("Resource InputStream Object"+resourceAsStream);

        return resourceAsStream;

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
