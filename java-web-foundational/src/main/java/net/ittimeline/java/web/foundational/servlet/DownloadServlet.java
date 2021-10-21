package net.ittimeline.java.web.foundational.servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

/**
 * 自定义Servlet实现文件下载
 * @author tony 18601767221@163.com
 * @version 2021/7/17 19:50
 * @since JDK11
 */
@WebServlet("/download")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取下载的文件名
        String fileName = request.getParameter("fileName");
        String mimeType = getServletContext().getMimeType(fileName);
        //image/jpeg
        System.out.println("下载的文件的MIME type"+mimeType);
        response.setHeader("Content-Type",mimeType);

        //将文件名使用URL编码,解决客户端下载文件，文件名是中的时候显示乱码
       // http://localhost:8080/javaweb/images/%E5%8D%8E%E4%B8%BAmate40pro.jpg
        String encodeFileName = URLEncoder.encode(fileName, "UTF-8");

        //通过设置请求的方式告诉浏览器下载文件，而不是显示文件
        response.setHeader("Content-Disposition","attachment;filename="+encodeFileName);




        String path="images/"+fileName;
     /*   try(
                InputStream inputStream = getServletContext().getResourceAsStream(path);
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
*/

        try(
                InputStream inputStream = getServletContext().getResourceAsStream(path);
                ServletOutputStream outputStream = response.getOutputStream();
        ){

            IOUtils.copy(inputStream,outputStream);
        }catch(Exception ex){
             ex.printStackTrace();
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
