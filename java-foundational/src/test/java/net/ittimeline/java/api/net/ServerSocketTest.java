package net.ittimeline.java.api.net;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ServerSocket的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/2 16:40
 * @since JDK11
 */
public class ServerSocketTest {


    /**
     *  服务器接收客户端请求，然后打印输出客户端的请求数据
     */
    @Test
    public void testServerSocketV1() throws IOException {
        ServerSocketConfig serverSocketConfig=new ServerSocketConfig();
        //以8888为端口创建服务器
        ServerSocket serverSocket=new ServerSocket(serverSocketConfig.getPort());
        System.out.println("服务器:服务器启动成功，准备接收客户端请求");
        //等待客户端请求，该方法会阻塞
        final Socket socket = serverSocket.accept();
        if(null!=socket){
            System.out.println("服务器:服务器接收客户端的请求成功，客户端的信息"+socket);
            //获取客户端请求的数据
            final InputStream inputStream = socket.getInputStream();
            byte[]buffer =new byte[1024];
            final int byteLength = inputStream.read(buffer);
            System.out.println("服务器:客户端请求的数据内容是"+new String(buffer,0,byteLength));

            socket.close(); //生产环境不使用
        }
    }


    @Test
    public void testServerSocketV2() throws IOException{
        ServerSocketConfig serverSocketConfig=new ServerSocketConfig();
        //以8888为端口创建服务器
        ServerSocket serverSocket=new ServerSocket(serverSocketConfig.getPort());
        System.out.println("服务器:服务器启动成功，准备接收客户端请求");
        while (true){
            //等待客户端请求，该方法会阻塞
            final Socket socket = serverSocket.accept();
            try {
                if(null!=socket){
                    System.out.println("服务器:服务器接收客户端的请求成功，客户端的信息"+socket);
                    //获取客户端请求的数据
                    final InputStream inputStream = socket.getInputStream();
                    byte[]buffer =new byte[1024];
                    final int byteLength = inputStream.read(buffer);
                    String clientRequestData=new String(buffer,0,byteLength);
                    System.out.println("服务器:客户端请求的数据内容是"+clientRequestData);
                    //服务器给客户端响应数据
                    String responseData="跟光磊学Java不错";

                    final OutputStream outputStream = socket.getOutputStream();
                    outputStream.write(responseData.getBytes());
                    System.out.println("服务器:服务器给客户端响应数据成功，响应的数据内容:"+responseData);
                    socket.close(); //生产环境不使用
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }



    @Test
    public void testServerSocketV3() throws IOException{
        ServerSocketConfig serverSocketConfig=new ServerSocketConfig();
        //以8888为端口创建服务器
        ServerSocket serverSocket=new ServerSocket(serverSocketConfig.getPort());
        System.out.println("服务器:服务器启动成功，准备接收客户端请求");
        //等待客户端请求，该方法会阻塞
        final Socket socket = serverSocket.accept();
        if(null!=socket){
            System.out.println("服务器:服务器接收客户端的请求成功，客户端的信息"+socket);
            //获取客户端请求的数据
            final InputStream inputStream = socket.getInputStream();
            byte[]buffer =new byte[1024];
             int byteLength = inputStream.read(buffer);
            System.out.println("服务器:客户端请求的数据内容是"+new String(buffer,0,byteLength));

            //服务器给客户端响应数据
            String responseData="跟光磊学Java不错";
            final OutputStream outputStream = socket.getOutputStream();
            outputStream.write(responseData.getBytes());
            System.out.println("服务器:服务器给客户端响应数据成功，响应的数据内容:"+responseData);

            byteLength = inputStream.read(buffer);
            System.out.println("服务器:客户端二次请求的数据内容是"+new String(buffer,0,byteLength));

            socket.close(); //生产环境不使用
        }
    }








}

