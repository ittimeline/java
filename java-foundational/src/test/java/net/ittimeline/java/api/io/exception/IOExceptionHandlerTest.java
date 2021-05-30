package net.ittimeline.java.api.io.exception;

import org.testng.annotations.Test;

import java.io.*;

/**
 * IO异常处理
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/29 9:38
 * @since JDK11
 */
public class IOExceptionHandlerTest {
    /**
     * Java7以前的IO异常处理
     */
    @Test
    public void testJava7BeforeIOExceptionHandler(){
        Reader reader=null;
        Writer writer=null;
        //准备复制的源文件
        File source = new File("D:\\io\\data.txt");
        //准备复制的目标文件，就是将源文件的内容复制到哪里
        File target = new File("D:\\io\\data_copy.txt");
        try {
            //字符输入流
             reader = new FileReader(source);
            //字符输出流
             writer = new FileWriter(target);
            //每次读取的字符内容
            char[] buffer = new char[10];
            //每次读取字符内容的长度(字符的个数)
            int bufLen = 0;
            //当未达到文件末尾时，循环读取data.txt的文本内容，将读取到的内容存储到buffer，并且将读取到的字符个数赋值给bufLen
            while ((bufLen = reader.read(buffer)) != -1) {
                //将每次读取到内容写到data_copy.txt
                writer.write(buffer, 0, bufLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭字符输出流
            try {
                if(null!=writer){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //关闭字符输入流
                try {
                    if (null!=reader){
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    /**
     * Java7以后的异常处理
     * 使用try-with-resources语句
     */
    @Test
    public void testJava7AfterIOExceptionHandler(){
        //准备复制的源文件
        File source = new File("D:\\io\\data.txt");
        //准备复制的目标文件，就是将源文件的内容复制到哪里
        File target = new File("D:\\io\\data_copy.txt");
        try(
                //类必须实现Autocloseable接口才能使用try-with-resources语句
                //字符输入流
                Reader reader = new FileReader(source);
                //字符输出流
                Writer writer = new FileWriter(target);
        ) {
            //每次读取的字符内容
            char[] buffer = new char[10];
            //每次读取字符内容的长度(字符的个数)
            int bufLen = 0;
            //当未达到文件末尾时，循环读取data.txt的文本内容，将读取到的内容存储到buffer，并且将读取到的字符个数赋值给bufLen
            while ((bufLen = reader.read(buffer)) != -1) {
                //将每次读取到内容写到data_copy.txt
                writer.write(buffer, 0, bufLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


