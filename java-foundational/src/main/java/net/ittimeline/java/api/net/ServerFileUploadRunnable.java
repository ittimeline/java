package net.ittimeline.java.api.net;

import java.io.*;
import java.net.Socket;
import java.time.LocalDate;

/**
 * 服务器端处理客户端文件上传请求的线程任务
 * @author tony 18601767221@163.com
 * @version 2021/6/3 14:59
 * @since JDK11
 */
public class ServerFileUploadRunnable implements Runnable{

    private final Socket socket;

    ServerFileUploadRunnable(final  Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {

        System.out.println("服务器线程"+Thread.currentThread().getName()+"开始处理文件上传任务");
        try {
            if (null!=socket){
                System.out.println("服务器:服务器接收到了客户端的文件上传请求，客户端的信息:"+socket);
                /*********************************************获取客户端上传的本地文件路径**************************************************/

                final InputStream inputStream = socket.getInputStream();
                byte[] buffer=new byte[1024];
                int byteLength = inputStream.read(buffer);
                //获取客户端上传文件的本地文件路径名
                String localFilePathName=new String(buffer,0,byteLength);

                //服务告诉客户端 我收到了你上传的本地文件路径名
                final OutputStream outputStream = socket.getOutputStream();
                String responseData="服务器已经接收到了客户端上上传文件的本地路径,本地路径是"+localFilePathName;
                outputStream.write(responseData.getBytes());

                /*********************************************处理客户端上传的文件********************************************************/
                //这个就是根据本地上传的文件路径生成服务器的磁盘文件路径
                final String serverFilePathName = generatorServerFilePathName(localFilePathName);

                BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(serverFilePathName));

                System.out.println("服务器:开始将本地客户端上传的文件写到"+serverFilePathName);
                while ((byteLength=inputStream.read(buffer))!=-1){
                    bufferedOutputStream.write(buffer,0,byteLength);
                }
                System.out.println("服务器:结束将本地客户端上传的文件写到"+serverFilePathName);

                responseData="服务器处理客户端上传的文件处理成功";
                outputStream.write(responseData.getBytes());

                socket.shutdownOutput();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("服务器线程"+Thread.currentThread().getName()+"结果处理文件上传任务");


    }


    /**
     *  根据客户端上传文件的本地磁盘路径 生成服务器的磁盘路径
     * @param localFilePathName 客户端上传文件的本地磁盘路径
     * @return 服务器的磁盘路径
     */
    public String generatorServerFilePathName(String localFilePathName){

        StringBuffer  serverFilePathName=new StringBuffer("D:\\fileupload\\");
        //获取当前日期
        LocalDate localDate=LocalDate.now();
        //拼接当前系统日期
        serverFilePathName.append(localDate.getYear()).append("\\");
        serverFilePathName.append(localDate.getMonthValue()).append("\\");
        serverFilePathName.append(localDate.getDayOfMonth()).append("\\");

        File file =new File(serverFilePathName.toString());
        //如果目录不存在
        if (!file.exists()){
            //那么就创建
            file.mkdirs();
        }
        serverFilePathName.append(System.currentTimeMillis());
        //文件后缀名
        final String suffixName = localFilePathName.substring(localFilePathName.lastIndexOf("."));

        serverFilePathName.append(suffixName);

        return serverFilePathName.toString();

    }

}
