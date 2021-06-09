package net.ittimeline.java.api.nio.channels;

import net.ittimeline.java.api.net.ServerSocketConfig;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author tony 18601767221@163.com
 * @version 2021/6/7 16:22
 * @since JDK11
 */
public class SocketChannelTest {


    /**
     * 客户端连接服务器并给服务器发送请求数据
     */
    @Test
    public void clientV1(){
        try(

                final SocketChannel socketChannel = SocketChannel.open()
        ){
            ServerSocketConfig serverSocketConfig=new ServerSocketConfig();
            socketChannel.connect(new InetSocketAddress(serverSocketConfig.getIp(),serverSocketConfig.getPort()));
            ByteBuffer clientRequestByteBuffer=ByteBuffer.allocate(1024);
            String requestData="今天天怎么样";
            clientRequestByteBuffer.put(requestData.getBytes());
            clientRequestByteBuffer.flip();
            socketChannel.write(clientRequestByteBuffer);
            System.out.println("客户端:客户端发送请求成功，请求的数据是"+requestData);


        }catch(IOException e){
            e.printStackTrace();
        }
    }



    /**
     * 客户端连接服务器并给服务器发送请求数据
     * 并且打印输出服务器响应的数据
     */
    @Test
    public void clientV2(){
        try(

                final SocketChannel socketChannel = SocketChannel.open()
        ){
            ServerSocketConfig serverSocketConfig=new ServerSocketConfig();
            socketChannel.connect(new InetSocketAddress(serverSocketConfig.getIp(),serverSocketConfig.getPort()));
            ByteBuffer clientRequestByteBuffer=ByteBuffer.allocate(1024);
            String requestData="今天天怎么样";
            clientRequestByteBuffer.put(requestData.getBytes());
            clientRequestByteBuffer.flip();
            socketChannel.write(clientRequestByteBuffer);
            System.out.println("客户端:客户端发送请求成功，请求的数据是"+requestData);

            //读取服务端响应的结果数据
            ByteBuffer serverResponseByteBuffer=ByteBuffer.allocate(1024);
            final int serverResponseLength = socketChannel.read(serverResponseByteBuffer);

            String serverResponseData=new String(serverResponseByteBuffer.array(),0,serverResponseLength);
            System.out.println("客户端:收到了服务器的响应，响应数据是"+serverResponseData);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
