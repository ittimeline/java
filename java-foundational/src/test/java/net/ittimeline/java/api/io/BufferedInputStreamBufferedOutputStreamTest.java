package net.ittimeline.java.api.io;

import net.ittimeline.java.api.util.DateTimeUtils;
import org.testng.annotations.Test;

import java.io.*;

/**
 * 字节缓冲流和字节流读写性能的对比
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/29 15:24
 * @since JDK11
 */
public class BufferedInputStreamBufferedOutputStreamTest {


    /**
     * 使用InputStream和OutputStream实现视频文件的拷贝
     */
    @Test
    public void testVideoCopyWithInputStreamOutputStream(){
        long startTime=System.currentTimeMillis();

        File sourceFile =new File("D:\\io\\跟光磊学Java-IO编程之字符输出流.mp4");
        File targetFile=new File("D:\\io\\writer.mp4");
        try(
                InputStream inputStream =new FileInputStream(sourceFile);
                OutputStream outputStream=new FileOutputStream(targetFile)
        ){
            byte[] buffer=new byte[1024];
            int bufferLength=0;
            //读和写的次数是一样的
            while((bufferLength=inputStream.read(buffer))!=-1){
                //writer()方法每次都是写bufferLength个字节到磁盘
                outputStream.write(buffer,0,bufferLength);
                //因此文件大小是递增的
                System.out.println("当前writer.mp4文件大小是"+targetFile.length()+"字节");
            }
            long endTime=System.currentTimeMillis();
            long time = DateTimeUtils.calculatorTime(startTime, endTime);
            // 使用不带缓冲的字节流拷贝 【一次读写8912个字节】  跟光磊学Java-IO编程之字符输出流.mp4文件耗时908毫秒 1秒钟不到
            // 使用不带缓冲的字节流拷贝 【一次读写1024个字节】  跟光磊学Java-IO编程之字符输出流.mp4文件耗时3724毫秒
            System.out.println("使用不带缓冲的字节流拷贝 【一次读写1024个字节】  跟光磊学Java-IO编程之字符输出流.mp4文件耗时"+time+"毫秒");
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    /**
     * 使用BufferedInputStream和BufferedOutputStream实现视频文件的拷贝
     */
    @Test
    public void testCopyVideoWithBufferedInputStreamBufferedOutputStream(){
        long startTime=System.currentTimeMillis();

        File sourceFile =new File("D:\\io\\跟光磊学Java-IO编程之字符输出流.mp4");
        File targetFile=new File("D:\\io\\writer.mp4");
        try(
                InputStream inputStream =new FileInputStream(sourceFile);
                OutputStream outputStream=new FileOutputStream(targetFile);

                BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
                BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(outputStream);
        ){
            byte[]buffer=new byte[1024];
            int bufferLength=0;
            //读取8次，写一次磁盘
            while ((bufferLength=bufferedInputStream.read(buffer))!=-1){
                bufferedOutputStream.write(buffer,0,bufferLength);
                System.out.println("当前writer.mp4文件大小是"+targetFile.length()+"字节");
            }
            long endTime=System.currentTimeMillis();
            long time = DateTimeUtils.calculatorTime(startTime, endTime);
            //使用带缓冲的字节流拷贝 【一次读写8192个字节】  跟光磊学Java-IO编程之字符输出流.mp4文件耗时844毫秒
            // 使用带缓冲的字节流拷贝 【一次读写8192个字节】  跟光磊学Java-IO编程之字符输出流.mp4文件耗时903毫秒
            System.out.println("使用带缓冲的字节流拷贝 【一次读写1024个字节】  跟光磊学Java-IO编程之字符输出流.mp4文件耗时"+time+"毫秒");

        }catch(IOException e){
            e.printStackTrace();
        }

    }













}
