package net.ittimeline.java.api.nio.channels;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * 服务端:Selector实现同步非阻塞通讯
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/8 10:30
 * @since JDK11
 */
public class SelectorServerSocketChannelTest {
    public static void main(String[] args) {
        String threadName=Thread.currentThread().getName();
        try(
                //获取一个选择器
                final Selector selector = Selector.open();
                //获取多个ServerSocketChannel
                final ServerSocketChannel serverSocketChannel66666 = ServerSocketChannel.open();
                final ServerSocketChannel serverSocketChannel7777 = ServerSocketChannel.open();
                final ServerSocketChannel serverSocketChannel8888 = ServerSocketChannel.open();
        ){
            serverSocketChannel66666.bind(new InetSocketAddress(6666));
            serverSocketChannel7777.bind(new InetSocketAddress(7777));
            serverSocketChannel8888.bind(new InetSocketAddress(8888));

            // ServerSocketChannel 默认是阻塞的，因为要使用Selector实现同步非阻塞的，因此要将ServerSocketChannel设置成非阻塞的
            serverSocketChannel66666.configureBlocking(false);
            serverSocketChannel7777.configureBlocking(false);
            serverSocketChannel8888.configureBlocking(false);

            //将多个ServerSocketChannel注册到同一个选择器上
            //只能注册SelectionKey.OP_ACCEPT事件 也就是接收就绪事件
            serverSocketChannel66666.register(selector, SelectionKey.OP_ACCEPT);
            serverSocketChannel7777.register(selector, SelectionKey.OP_ACCEPT);
            serverSocketChannel8888.register(selector, SelectionKey.OP_ACCEPT);

            int  registeredChannelSize = selector.keys().size();

            System.out.println("服务器线程:"+threadName+"当前选择器上注册了"+registeredChannelSize+"个服务器通道");

            int connectedChannelSize = selector.selectedKeys().size();
            System.out.println("服务器线程:"+threadName+"当前选择器上客户端连接了"+connectedChannelSize+"个服务器通道");


            while (true) {
                System.out.println("服务器线程:"+threadName+"服务器:服务器开始等待客户端连接");
                selector.select();
                System.out.println("服务器线程:"+threadName+"服务器:服务器已经接收到了客户端的连接");

                connectedChannelSize = selector.selectedKeys().size();
                System.out.println("服务器线程:"+threadName+"当前选择器上客户端连接了"+connectedChannelSize+"个服务器通道");

                //处理客户端请求
                final Set<SelectionKey> selectionKeys = selector.selectedKeys();
                final Iterator<SelectionKey> selectionKeyIterator = selectionKeys.iterator();
                while (selectionKeyIterator.hasNext()) {
                    SelectionKey selectionKey =  selectionKeyIterator.next();
                    final ServerSocketChannel serverSocketChannel =(ServerSocketChannel) selectionKey.channel();
                    final SocketChannel socketChannel = serverSocketChannel.accept();
                    ByteBuffer clientRequestByteBuffer=ByteBuffer.allocate(1024);
                    final int clientRequestLength = socketChannel.read(clientRequestByteBuffer);
                    String clientRequestData=new String(clientRequestByteBuffer.array(),0,clientRequestLength);
                    System.out.println("服务器线程:"+threadName+"服务器:客户端请求的内容是"+clientRequestData);

                    //不同的请求内容响应的结果也不同
                    String serverResponseData=getResponseDataByRequestData(clientRequestData);

                    ByteBuffer serverResponseByteBuffer=ByteBuffer.allocate(1024);
                    serverResponseByteBuffer.put(serverResponseData.getBytes());
                    serverResponseByteBuffer.flip();
                    socketChannel.write(serverResponseByteBuffer);
                    System.out.println("服务器线程:"+threadName+"服务器:服务器给客户端的响应是"+serverResponseData);


                    //处理完成以后删除已经的处理的
                    selectionKeyIterator.remove();
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    /**
     * 根据不同的请求内容获取不同的响应内容
     * @param requestData
     * @return
     */
    private static String getResponseDataByRequestData(String requestData){
        String responseData=null;
        if("跟光磊学Java怎么样?".equals(requestData)){
            responseData="跟光磊学Java很好";
        }else if("跟光磊学前端怎么样?".equals(requestData)){
            responseData="跟光磊学前端很棒";
        }else if("跟光磊学Linux怎么样?".equals(requestData)){
            responseData="跟光磊学Linux很棒";
        }
        return responseData;
    }
}
