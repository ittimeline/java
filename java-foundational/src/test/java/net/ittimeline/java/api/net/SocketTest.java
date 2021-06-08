package net.ittimeline.java.api.net;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Socket的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/2 16:48
 * @since JDK11
 */
public class SocketTest {

    /**
     * 客户端向服务器发送请求数据
     * @throws IOException
     */
    @Test
    public void testSocketV1() throws IOException {
        ServerSocketConfig serverSocketConfig=new ServerSocketConfig();
        //创建客户端并且连接指定IP和端口的服务器，前提条件是服务器已经提前启动，否则会连接失败
        Socket socket=new Socket(serverSocketConfig.getIp(), serverSocketConfig.getPort());
        final OutputStream outputStream = socket.getOutputStream();
        String requestData="跟光磊学Java怎么样?";
        outputStream.write(requestData.getBytes());
        System.out.println("客户端:客户端给服务器发送请求数据成功，请求的数据内容是"+requestData);
        socket.close();

    }


    /**
     * 客户端向服务器发送请求数据,接收服务器端的响应数据并打印输出
     * @throws IOException
     */
    @Test
    public void testSocketV2() throws IOException {
        ServerSocketConfig serverSocketConfig=new ServerSocketConfig();
        //创建客户端并且连接指定IP和端口的服务器，前提条件是服务器已经提前启动，否则会连接失败
        Socket socket=new Socket(serverSocketConfig.getIp(), serverSocketConfig.getPort());
        final OutputStream outputStream = socket.getOutputStream();
        String requestData="跟光磊学Java怎么样?";
        outputStream.write(requestData.getBytes());
        System.out.println("客户端:客户端给服务器发送请求数据成功，请求的数据内容是"+requestData);

        final InputStream inputStream = socket.getInputStream();
        byte[]buffer =new byte[1024];
        final int byteLength = inputStream.read(buffer);
        System.out.println("客户端:服务器响应的数据内容是"+new String(buffer,0,byteLength));
        socket.close();

    }



    @Test
    public void testSocketV3() throws IOException{
        ServerSocketConfig serverSocketConfig=new ServerSocketConfig();
        //创建客户端并且连接指定IP和端口的服务器，前提条件是服务器已经提前启动，否则会连接失败
        Socket socket=new Socket(serverSocketConfig.getIp(), serverSocketConfig.getPort());
        final OutputStream outputStream = socket.getOutputStream();
        String requestData="跟光磊学Java怎么样?";
        outputStream.write(requestData.getBytes());
        System.out.println("客户端:客户端给服务器发送请求数据成功，请求的数据内容是"+requestData);

        final InputStream inputStream = socket.getInputStream();
        byte[]buffer =new byte[1024];
        final int byteLength = inputStream.read(buffer);
        System.out.println("客户端:服务器响应的数据内容是"+new String(buffer,0,byteLength));
        outputStream.write("那我好好学习吧".getBytes());


        socket.close();

    }













}
