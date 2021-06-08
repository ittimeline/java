package net.ittimeline.java.api.net;

import org.testng.annotations.Test;

import java.io.*;
import java.net.Socket;

/**
 * 客户端上传文件的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/3 8:22
 * @since JDK11
 */
public class ClientFileUploadTest {


    /**
     * 客户端上传文件给服务器V1
     * @throws IOException
     */
    @Test
    public void testClientFileUploadV1() throws IOException {

        String localFilePath="D:\\io\\writer.mp4";
        BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream(localFilePath));
        ServerSocketConfig serverSocketConfig=new ServerSocketConfig();
        //通过指定的IP和端口连接服务器
        Socket socket=new Socket(serverSocketConfig.getIp(), serverSocketConfig.getPort());
        final OutputStream outputStream = socket.getOutputStream();
        byte[]buffer=new byte[1024];
        int byteLength=0;

        System.out.println("客户端:客户端开始上传文件给服务器，本地文件的路径是"+localFilePath);
        while ((byteLength=bufferedInputStream.read(buffer))!=-1){
            outputStream.write(buffer,0,byteLength);
        }
        //文件上传完毕之后，关闭输出流，否则服务器会一直处于等待状态
        socket.shutdownOutput();
        System.out.println("客户端:客户端结束上传文件给服务器，本地文件的路径是"+localFilePath);

        socket.close();

    }



    /**
     * 客户端上传文件给服务器V2
     * @throws IOException
     */
    @Test
    public void testClientFileUploadV2() throws IOException {

        String localFilePath="D:\\io\\writer.mp4";
        BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream(localFilePath));
        ServerSocketConfig serverSocketConfig=new ServerSocketConfig();
        //通过指定的IP和端口连接服务器
        Socket socket=new Socket(serverSocketConfig.getIp(), serverSocketConfig.getPort());
        final OutputStream outputStream = socket.getOutputStream();
        byte[]buffer=new byte[1024];
        int byteLength=0;

        System.out.println("客户端:客户端开始上传文件给服务器，本地文件的路径是"+localFilePath);
        while ((byteLength=bufferedInputStream.read(buffer))!=-1){
            outputStream.write(buffer,0,byteLength);
        }
        //文件上传完毕之后，关闭输出流，否则服务器会一直处于等待状态
        socket.shutdownOutput();
        System.out.println("客户端:客户端结束上传文件给服务器，本地文件的路径是"+localFilePath);

        //客户端处理服务器的响应
        final InputStream inputStream = socket.getInputStream();
        while((byteLength=inputStream.read(buffer))!=-1){
            System.out.println("客户端: 服务器处理客户端文件上传的响应内容是"+new String(buffer,0,byteLength));
        }
        socket.close();
    }





}
