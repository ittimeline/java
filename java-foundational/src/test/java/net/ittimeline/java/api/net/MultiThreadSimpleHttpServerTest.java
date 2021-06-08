package net.ittimeline.java.api.net;

/**
 * 多线程版简化版HTTP服务器的使用
 * @author tony 18601767221@163.com
 * @version 2021/6/3 20:49
 * @since JDK11
 */
public class MultiThreadSimpleHttpServerTest {

    public static void main(String[] args) {
        MultiThreadSimpleHttpServer multiThreadSimpleHttpServer=new MultiThreadSimpleHttpServer();
        multiThreadSimpleHttpServer.handlerClientRequest();
    }
}
