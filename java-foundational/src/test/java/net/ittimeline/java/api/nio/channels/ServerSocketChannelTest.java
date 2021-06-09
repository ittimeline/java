package net.ittimeline.java.api.nio.channels;

import net.ittimeline.java.api.net.ServerSocketConfig;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * ServerSocketChannel的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/7 16:16
 * @since JDK11
 */
public class ServerSocketChannelTest {


    /**
     * 服务器接收客户端的请求并且将客户端请求的数据打印输出
     */
    @Test
    public void serverV1() {

        try (
                final ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        ) {

            ServerSocketConfig serverSocketConfig = new ServerSocketConfig();
            serverSocketChannel.bind(new InetSocketAddress(serverSocketConfig.getPort()));
            System.out.println("服务器:服务器启动成功，准备接收客户端请求，服务器的信息是" + serverSocketChannel);

            while (true) {
                //这里会阻塞，也就是没有客户端连接，程序不会继续往下执行 默认ServerSocketChannel是阻塞的
                final SocketChannel socketChannel = serverSocketChannel.accept();
                System.out.println("服务器:服务器接收到客户端的连接请求，客户端的信息是" + socketChannel);

                ByteBuffer clientRequestByteBuffer =ByteBuffer.allocate(1024);
                final int clientRequestLength = socketChannel.read(clientRequestByteBuffer);
                String clientRequestData=new String(clientRequestByteBuffer.array(),0,clientRequestLength);
                System.out.println("服务器:客户端请求的数据是"+clientRequestData);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }




    /**
     * 服务器接收客户端的请求并且将客户端请求的数据打印输出
     * 并且要给客户端响应 今天天气非常好，可以晒太阳
     */
    @Test
    public void serverV2() {

        try (
                final ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        ) {

            ServerSocketConfig serverSocketConfig = new ServerSocketConfig();
            serverSocketChannel.bind(new InetSocketAddress(serverSocketConfig.getPort()));
            System.out.println("服务器:服务器启动成功，准备接收客户端请求，服务器的信息是" + serverSocketChannel);

            while (true) {
                //这里会阻塞，也就是没有客户端连接，程序不会继续往下执行 默认ServerSocketChannel是阻塞的
                final SocketChannel socketChannel = serverSocketChannel.accept();
                System.out.println("服务器:服务器接收到客户端的连接请求，客户端的信息是" + socketChannel);

                ByteBuffer clientRequestByteBuffer =ByteBuffer.allocate(1024);
                final int clientRequestLength = socketChannel.read(clientRequestByteBuffer);
                String clientRequestData=new String(clientRequestByteBuffer.array(),0,clientRequestLength);
                System.out.println("服务器:客户端请求的数据是"+clientRequestData);


                //服务器给客户端响应
                ByteBuffer serverResponseByteBuffer =ByteBuffer.allocate(1024);
                String serverResponseData="今天天气非常好，可以晒太阳";
                serverResponseByteBuffer.put(serverResponseData.getBytes());
                serverResponseByteBuffer.flip();
                socketChannel.write(serverResponseByteBuffer);
                System.out.println("服务器:服务器给客户端响应，响应的数据是"+serverResponseData);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }



















}
