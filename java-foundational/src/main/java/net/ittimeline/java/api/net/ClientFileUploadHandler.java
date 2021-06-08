package net.ittimeline.java.api.net;

import java.io.*;
import java.net.Socket;

/**
 * 客户端文件上传
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/3 14:28
 * @since JDK11
 */
public class ClientFileUploadHandler {

    /**
     * 客户端上传文件
     *
     * @param localFileNamePath 本地文件路径
     */
    public void doFileUpload(String localFileNamePath) {

        //给服务器发请求数据,告诉服务器本地上传文件的路径是什么
        ServerSocketConfig serverSocketConfig = new ServerSocketConfig();
        try {
            //通过指定的IP和端口连接服务器
            Socket socket = new Socket(serverSocketConfig.getIp(), serverSocketConfig.getPort());
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(localFileNamePath.getBytes());
            System.out.println("客户端:客户端发给服务端本地上传文件的路径成功");

            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int byteLength = inputStream.read(buffer);
            //获取服务器处理客户端发送上传文件路径的响应结果
            String responseData = new String(buffer, 0, byteLength);
            if (null != responseData && responseData != "") {
                System.out.println("客户端:服务器处理客户端发送上传文件路径的响应结果是" + responseData);

                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(localFileNamePath));

                System.out.println("客户端:客户端开始上传文件，本地路径是" + localFileNamePath);
                while ((byteLength = bufferedInputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, byteLength);
                }
                System.out.println("客户端:客户端结束上传文件，本地路径是" + localFileNamePath);

                socket.shutdownOutput();

                //获取服务器处理客户端上传文件的处理结果
                inputStream = socket.getInputStream();
                while ((byteLength=inputStream.read(buffer))!=-1){
                    System.out.println("客户端:服务器处理客户端上传文件的响应内容是"+new String(buffer,0,byteLength));
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
