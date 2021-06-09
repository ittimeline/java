package net.ittimeline.java.api.nio.channels;

import net.ittimeline.java.api.net.ServerSocketConfig;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * 客户端:基于AIO异步双向通讯
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/8 15:53
 * @since JDK11
 */
public class AsynchronousSocketChannelTest {

    public static void main(String[] args) {
        try(
                final AsynchronousSocketChannel asynchronousSocketChannel = AsynchronousSocketChannel.open()
        ){
            ServerSocketConfig serverSocketConfig=new ServerSocketConfig();
            //客户端异步连接服务器
            asynchronousSocketChannel.connect(new InetSocketAddress(serverSocketConfig.getIp(), serverSocketConfig.getPort()), null,
                    new CompletionHandler<Void, Object>() {
                        @Override
                        public void completed(Void result, Object attachment) {
                            //客户端连接服务器成功以后，给服务器发送异步请求
                            System.out.println("客户端:客户端连接服务器成功");
                            String requestData="跟光磊学Java怎么样";
                            ByteBuffer clientRequestByteBuffer =ByteBuffer.allocate(1024);
                            clientRequestByteBuffer.put(requestData.getBytes());
                            clientRequestByteBuffer.flip();
                            asynchronousSocketChannel.write(clientRequestByteBuffer, null,
                                    new CompletionHandler<Integer, Object>() {
                                        @Override
                                        public void completed(Integer result, Object attachment) {
                                            System.out.println("客户端:客户端向服务器发送请求完成,请求的数据是"+requestData);
                                        }
                                        @Override
                                        public void failed(Throwable exc, Object attachment) {
                                        }
                                    });
                            System.out.println("客户端:客户端向服务器发送请求就绪,请求的数据是"+requestData);
                            //处理服务器的响应数据
                            ByteBuffer serverResponseByteBuffer=ByteBuffer.allocate(1024);
                            asynchronousSocketChannel.read(serverResponseByteBuffer, null,
                                    new CompletionHandler<Integer, Object>() {
                                        @Override
                                        public void completed(Integer serverResponseDataLength, Object attachment) {
                                            String serverResponseData=new String(serverResponseByteBuffer.array(),0,serverResponseDataLength);
                                            System.out.println("客户端:客户端收到了服务器的响应结果，响应的数据是"+serverResponseData);
                                        }
                                        @Override
                                        public void failed(Throwable exc, Object attachment) {
                                        }
                                    });
                        }
                        @Override
                        public void failed(Throwable exc, Object attachment) {
                        }
                    });
            System.out.println("客户端:客户端连接服务器就绪");

            while (true){
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
