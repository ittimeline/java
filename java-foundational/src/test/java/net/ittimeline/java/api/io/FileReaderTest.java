package net.ittimeline.java.api.io;

import org.testng.annotations.Test;

import java.io.*;

/**
 * FileReader的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/29 6:53
 * @since JDK11
 */
public class FileReaderTest {


    /**
     * 创建FileReader的两种方式 如果文件不存在会引发FileNotFoundException异常
     * @throws FileNotFoundException
     */
    @Test
    public void testFileReaderConstructor()throws IOException {

        File file=new File("D:\\io\\reader\\reader.txt");
        Reader reader=new FileReader(file);
        String path="D:\\io\\reader\\reader.txt";
        reader=new FileReader(path);
        reader.close();



    }


    /**
     * 使用FileReader以字符为单位读取文件。一次读取一个字符
     */
    @Test
    public void testFileReaderReadOneChar() throws IOException{

        File file=new File("D:\\io\\reader\\reader.txt");

        try(
                Reader reader=new FileReader(file);

        ) {
            int value=0;
            //循环读取文件内容，当返回值不是-1的时候将读取的值赋值给value
            while((value=reader.read())!=-1){
                //将返回值转换成字符
                char ch =(char)value;
                //打印输出在终端
                System.out.print(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 使用FileReader以字符为单位读取文件。一次读取多个字符
     */
    @Test
    public void testFileReaderReadManyChar() {
        File file=new File("D:\\io\\reader\\reader.txt");
        try(
                Reader reader = new FileReader(file);
                ) {

            char[]buffer=new char[1024];
            int bufLen =0;
            int count =0;
            while ((bufLen=reader.read(buffer))!=-1){
                System.out.print(new String(buffer,0,bufLen));
                count++;
            }
            System.out.println();
            System.out.println("读取文件的次数"+count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
