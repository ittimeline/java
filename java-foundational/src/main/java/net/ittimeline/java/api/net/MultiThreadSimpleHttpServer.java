package net.ittimeline.java.api.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 多线程版简化版HTTP服务器
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/3 20:39
 * @since JDK11
 */
public class MultiThreadSimpleHttpServer {

    /**
     * 线程池，用于并发处理多个客户端的请求
     */
    private static final ExecutorService executorService = Executors.newFixedThreadPool(20);

    /**
     * 多线程处理客户端请求，提供对外访问的
     */
    public void handlerClientRequest() {
        while (true) {
            ServerSocketConfig serverSocketConfig = new ServerSocketConfig();
            try (
                    ServerSocket serverSocket = new ServerSocket(serverSocketConfig.getPort());
            ) {
                final Socket socket = serverSocket.accept();
                MultiThreadSimpleHttpServerRunnable multiThreadSimpleHttpServerRunnable = new MultiThreadSimpleHttpServerRunnable(socket);
                executorService.submit(multiThreadSimpleHttpServerRunnable);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
