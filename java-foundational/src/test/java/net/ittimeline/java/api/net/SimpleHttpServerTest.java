package net.ittimeline.java.api.net;

/**
 * 简化版的HTTP服务器的使用
 * @author tony 18601767221@163.com
 * @version 2021/6/3 20:09
 * @since JDK11
 */
public class SimpleHttpServerTest {

    public static void main(String[] args) {
        SimpleHttpServer simpleHttpServer=new SimpleHttpServer();
        simpleHttpServer.handlerClientRequest();
    }
}
