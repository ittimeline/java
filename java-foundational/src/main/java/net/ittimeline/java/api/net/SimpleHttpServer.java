package net.ittimeline.java.api.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 简化版的HTTP服务器
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/3 20:03
 * @since JDK11
 */
public class SimpleHttpServer {


    private static final String INDEX_PAGE="index.html";
    /**
     * 服务器处理客户端请求
     */
    public void handlerClientRequest() {
        //为了处理多个请求
        while (true) {
            ServerSocketConfig serverSocketConfig = new ServerSocketConfig();
            try (
                    ServerSocket serverSocket = new ServerSocket(serverSocketConfig.getPort());
                    final Socket socket = serverSocket.accept();
                    final InputStream inputStream = socket.getInputStream();
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                    BufferedInputStream bufferedInputStream=new
                            BufferedInputStream(SimpleHttpServer.class.getClassLoader().getResourceAsStream("static/index.html"));

                    final OutputStream outputStream = socket.getOutputStream();

                    OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream);

                    BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);

            ) {

                //读取浏览器客户端请求数据的第一行的内容  GET /index.html HTTP/1.1
                final String firstLineContent = bufferedReader.readLine();

                final String[] fistLineSplitContent = firstLineContent.split(" ");


                final String pageName = fistLineSplitContent[1].substring(1);

                System.out.println("服务器:客户端请求的页面地址是" + pageName);

                //如果客户端请求的页面是index.html
                if (INDEX_PAGE.equals(pageName)){
                    byte[]buffer=new byte[1024];
                    int byteLength=0;
                    System.out.println("服务器:开始将"+INDEX_PAGE+"页面返回给浏览器");

                    //告诉浏览器如何展示数据
                    bufferedWriter.write("HTTP/1.1 200 OK");
                    bufferedWriter.newLine();
                    bufferedWriter.write("Content-Type:text/html");
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();

                    while((byteLength = bufferedInputStream.read(buffer))!=-1){
                        bufferedWriter.write(new String(buffer,0,byteLength));
                    }
                    System.out.println("服务器:结束将"+INDEX_PAGE+"页面返回给浏览器");

                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
