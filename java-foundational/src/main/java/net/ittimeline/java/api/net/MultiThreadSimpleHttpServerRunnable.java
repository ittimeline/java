package net.ittimeline.java.api.net;

import java.io.*;
import java.net.Socket;


/**
 * 处理浏览器客户端的任务
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/3 20:43
 * @since JDK11
 */
public class MultiThreadSimpleHttpServerRunnable implements Runnable {
    private static final String INDEX_PAGE = "index.html";


    final Socket socket;

    MultiThreadSimpleHttpServerRunnable(final Socket socket) {
        this.socket = socket;

    }

    @Override
    public void run() {

        System.out.println("多线程服务器线程" + Thread.currentThread().getName() + "开始处理浏览器客户端的请求");
        try (

                final InputStream inputStream = socket.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                BufferedInputStream bufferedInputStream = new
                        BufferedInputStream(MultiThreadSimpleHttpServerRunnable.class.getClassLoader().
                        getResourceAsStream("static/index.html"));

                final OutputStream outputStream = socket.getOutputStream();

                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {


            //读取浏览器客户端请求数据的第一行的内容  GET /index.html HTTP/1.1
            final String firstLineContent = bufferedReader.readLine();

            final String[] fistLineSplitContent = firstLineContent.split(" ");


            final String pageName = fistLineSplitContent[1].substring(1);

            System.out.println("服务器:客户端请求的页面地址是" + pageName);

            //如果客户端请求的页面是index.html
            if (INDEX_PAGE.equals(pageName)) {
                byte[] buffer = new byte[1024];
                int byteLength = 0;
                System.out.println("服务器:开始将" + INDEX_PAGE + "页面返回给浏览器");

                //告诉浏览器如何展示数据
                bufferedWriter.write("HTTP/1.1 200 OK");
                bufferedWriter.newLine();
                bufferedWriter.write("Content-Type:text/html");
                bufferedWriter.newLine();
                bufferedWriter.newLine();

                while ((byteLength = bufferedInputStream.read(buffer)) != -1) {
                    bufferedWriter.write(new String(buffer, 0, byteLength));
                }
                System.out.println("服务器:结束将" + INDEX_PAGE + "页面返回给浏览器");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("多线程服务器线程" + Thread.currentThread().getName() + "结束处理浏览器客户端的请求");


    }
}
