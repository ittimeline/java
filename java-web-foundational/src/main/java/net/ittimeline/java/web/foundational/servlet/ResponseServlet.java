package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * HttpServletResponse设置响应数据
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/17 16:51
 * @since JDK11
 */
@WebServlet("/response")
public class ResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // setResponseLineData(response);

        // setResponseHeaderData(response);

        //  sendRedirect(response);
        //重定向跳转到百度
        //   response.sendRedirect("https://www.baidu.com");


       // responseText(response);

        responseImage(response);
    }

    /**
     * HttpServletResponse设置响应行数据
     *
     * @param response
     */
    private void setResponseLineData(HttpServletResponse response) {

        //权限不够，服务器收到了客户端请求，但是拒绝处理
        response.setStatus(403);
    }


    /**
     * HttpServletResponse设置响应头的数据实现2秒钟之后跳转到淘宝首页
     *
     * @param response
     */
    private void setResponseHeaderData(HttpServletResponse response) {
        //服务器告诉浏览器2秒钟之后跳到淘宝首页
        response.setHeader("Refresh", "2;url=https://www.taobao.com");
    }


    /**
     * HttpServletResponse设置响应头的数据实现重定向跳转(立即跳转)
     *
     * @param response
     */
    private void sendRedirect(HttpServletResponse response) {
        response.setStatus(302);
        response.setHeader("Location", "https://www.baidu.com");
    }


    /**
     * HttpServletResponse设置响应体数据- 使用字符输出流往浏览器输出文本字符串
     *
     * @param response
     */
    private void responseText(HttpServletResponse response) {
        //处理POST响应的乱码
        response.setContentType("text/html;charset=UTF-8");

        try {
            PrintWriter writer = response.getWriter();
            //write() 方法输出字符串，不能输出数字
            //println() 既能输出字符串，又能输出非非字符串
            writer.println(1);
            writer.println("<h1>学习JavaWeb很简单<h1>");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * HttpServletResponse设置响应体数据- 使用字节输出流往浏览器输出图片
     *
     * @param response
     */
    private void responseImage(HttpServletResponse response){

        String file="images/falalilafa.jpg";
        String mimeType = getServletContext().getMimeType(file);
        response.setHeader("Content-Type",mimeType);
        
        try(
                InputStream inputStream = getServletContext().getResourceAsStream(file);
                ServletOutputStream outputStream = response.getOutputStream();
        ){
            byte[]buffer=new byte[8192];
            int length=0;

            while ((length=inputStream.read(buffer))!=-1){
                outputStream.write(buffer,0,length);
            }

        }catch(Exception ex){
             ex.printStackTrace();
        }


    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
