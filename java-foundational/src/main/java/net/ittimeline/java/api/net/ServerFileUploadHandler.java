package net.ittimeline.java.api.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 服务器:负责处理客户端上传的文件
 * @author tony 18601767221@163.com
 * @version 2021/6/3 14:08
 * @since JDK11
 */
public class ServerFileUploadHandler {
    /**
     * 线程池 用于处理多个客户端上传文件的请求
     */
    private static final ExecutorService executorService= Executors.newFixedThreadPool(20);
    /**
     * 处理客户端上传的文件
     */
    public void doFileUpload(){
        try {
            ServerSocketConfig serverSocketConfig=new ServerSocketConfig();
            //使用本机IP和8888端口创建服务器
            ServerSocket serverSocket=new ServerSocket(serverSocketConfig.getPort());
            System.out.println("服务器:服务器启动成功，等待接收客户端请求");
            //死循环就是为了避免客户端的 java.net.SocketException: Connection reset
            while(true){
                //等待客户端连接
                final Socket socket = serverSocket.accept();
                ServerFileUploadRunnable serverFileUploadRunnable=new ServerFileUploadRunnable(socket);
                //将任务提交到线程池
                executorService.submit(serverFileUploadRunnable);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
