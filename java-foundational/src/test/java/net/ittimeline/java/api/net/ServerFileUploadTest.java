package net.ittimeline.java.api.net;

import org.testng.annotations.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器文件上传的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/3 8:14
 * @since JDK11
 */
public class ServerFileUploadTest {


    /**
     *  服务器处理客户端文件上传请求V1
     * @throws IOException
     */
    @Test
    public void testServerFileUploadV1() throws IOException {
        ServerSocketConfig serverSocketConfig=new ServerSocketConfig();

        //使用本机IP和8888端口创建服务器
        ServerSocket serverSocket=new ServerSocket(serverSocketConfig.getPort());
        System.out.println("服务器:服务器启动成功，等待接收客户端请求");
        //等待客户端连接
        final Socket socket = serverSocket.accept();

        if (null!=socket){
            System.out.println("服务器:服务器接收到了客户端的文件上传请求，客户端的信息:"+socket);

            final InputStream inputStream = socket.getInputStream();

            String serverFilePath="D:\\fileupload\\writer.mp4";
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(serverFilePath));

            byte[]buffer=new byte[1024];
            int byteLength=0;
            System.out.println("服务器:开始将本地客户端上传的文件写入服务器的本地磁盘");
            // 现象：服务器一直在读取客户端写过来的数据
            //原因:服务器不知道客户端什么时候写完数据，虽然客户端的文件上传完成了，但是如果客户端没有关闭字节输入流
            while ((byteLength=inputStream.read(buffer))!=-1){
                bufferedOutputStream.write(buffer,0,byteLength);
            }
            System.out.println("服务器:结束将本地客户端上传的文件写入服务器的本地磁盘,服务器的文件磁盘路径"+serverFilePath);

        }
    }



    /**
     *  服务器处理客户端文件上传请求V2
     * @throws IOException
     */
    @Test
    public void testServerFileUploadV2() throws IOException {
        ServerSocketConfig serverSocketConfig=new ServerSocketConfig();

        //使用本机IP和8888端口创建服务器
        ServerSocket serverSocket=new ServerSocket(serverSocketConfig.getPort());
        System.out.println("服务器:服务器启动成功，等待接收客户端请求");
        //等待客户端连接
        final Socket socket = serverSocket.accept();

        if (null!=socket){
            System.out.println("服务器:服务器接收到了客户端的文件上传请求，客户端的信息:"+socket);

            final InputStream inputStream = socket.getInputStream();
            String serverFilePath="D:\\fileupload\\writer.mp4";
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(serverFilePath));

            byte[]buffer=new byte[1024];
            int byteLength=0;
            System.out.println("服务器:开始将本地客户端上传的文件写入服务器的本地磁盘");
            // 现象：服务器一直在读取客户端写过来的数据
            //原因:服务器不知道客户端什么时候写完数据，虽然客户端的文件上传完成了，但是如果客户端没有关闭字节输入流
            while ((byteLength=inputStream.read(buffer))!=-1){
                bufferedOutputStream.write(buffer,0,byteLength);
            }
            System.out.println("服务器:结束将本地客户端上传的文件写入服务器的本地磁盘,服务器的文件磁盘路径"+serverFilePath);


            //服务器处理客户端的文件成功之后给客户端响应数据
            String responseData="文件上传成功";
            final OutputStream outputStream = socket.getOutputStream();
            outputStream.write(responseData.getBytes());
            // 禁用此套接字的输出流。 对于 TCP 套接字，将发送任何先前写入的数据，然后是 TCP 的正常连接终止序列
            socket.shutdownOutput();

        }
    }





}
