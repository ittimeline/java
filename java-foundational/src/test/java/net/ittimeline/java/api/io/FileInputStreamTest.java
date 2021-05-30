package net.ittimeline.java.api.io;

import org.testng.annotations.Test;

import java.io.*;

/**
 * FileInputStream的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/28 19:23
 * @since JDK11
 */
public class FileInputStreamTest {

    /**
     * FileInputStream创建对象 如果指定目录的文件不存在，会引发FileNotFoundException
     */
    @Test
    public void testFileInputStreamConstructor() throws IOException {
        File file = new File("D:\\io\\inputstream\\test.txt");
        InputStream inputStream = new FileInputStream(file);
        String path = "D:\\io\\inputstream\\test.txt";
        inputStream = new FileInputStream(path);
        inputStream.close();
    }

    /**
     * 使用FileInputStream实现读取文件内容。 一次读取一个字节
     */
    @Test
    public void testFileInputStreamReadOneByte() throws IOException {

        File file = new File("D:\\io\\inputstream\\test.txt");
        InputStream inputStream = new FileInputStream(file);
        //读取一个字符
        // char content = (char)inputStream.read();
        // System.out.println(content);

        int value = 0;
        //当流没有达到末尾的时候就循环读，将读取到的返回结果赋值给value
        while ((value = inputStream.read()) != -1) {
            //把读取到的数字转换字符
            char content = (char) value;
            //输出到终端
            System.out.print(content);
        }

        inputStream.close();

    }


    /**
     * 使用FileInputStream实现读取文件内容。 一次读取多个字节
     */
    @Test
    public void testFileInputStreamReadManyByte() throws IOException {

        File file = new File("D:\\io\\inputstream\\test.txt");
        InputStream inputStream = new FileInputStream(file);


        //每次读取的内容存储到data数组
        byte[] data = new byte[4096];
        //实际读取的字节长度
        int byteLen = 0;

        while ((byteLen = inputStream.read(data)) != -1) {
            //将读取的内容(即字节数组data)转换成字符串
            String content = new String(data, 0, byteLen);
            System.out.println(content);
        }


        inputStream.close();

    }

    /**
     * 使用字节输入流和字节输出流实现图片拷贝
     */
    @Test
    public void testImageCopy() throws IOException{
        //1.创建字节输入流
        String path ="D:\\io\\跟光磊学Java-IO编程之字符输出流.mp4";
        InputStream inputStream=new FileInputStream(path);

        // 创建字节输出流
        String target="D:\\io\\Writer.mp4";
        OutputStream outputStream=new FileOutputStream(target);

        //每次读取1024字节长度存储到data数组中
        byte[]data=new byte[1024];
        //实际读取的字节长度
        int byteLen = 0;
        //循环读取法拉利.jpg图片的内容
        while ((byteLen=inputStream.read(data))!=-1){
            //将读取到的内容写入falali.jpg
            outputStream.write(data,0,byteLen);
        }

        //后打开的先关闭
        outputStream.close();
        //先打开的后关闭
        inputStream.close();


    }


}
