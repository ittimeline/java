package net.ittimeline.java.commonsio;

import net.ittimeline.java.api.util.DateTimeUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import java.io.*;

/**
 * commons-io组件的使用
 *  commons-io官网地址 https://commons.apache.org/proper/commons-io/
 * @author tony 18601767221@163.com
 * @version 2021/5/30 15:56
 * @since JDK11
 *
 */
public class CommonsIOTest {


    /**
     * 使用IOUtils的copy方法实现文件拷贝
     */
    @Test
    public void testFileCopy(){
        long startTime=System.currentTimeMillis();
        try(
                InputStream inputStream=new FileInputStream("D:\\io\\java.pdf");
                OutputStream outputStream=new FileOutputStream("D:\\io\\java_copy.pdf")
        ){
            //拷贝2GB以下的使用copy方法
            IOUtils.copy(inputStream,outputStream);
            //拷贝2GB以上的文件使用copyLarge方法
           // IOUtils.copyLarge(inputStream,outputStream);
            long endTime=System.currentTimeMillis();
            long time = DateTimeUtils.calculatorTime(startTime, endTime);
            System.out.println("IOUtils拷贝1.55G文件耗时"+time+"毫秒");
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    /**
     * 使用commons-io提供的FileUtils的copyDirectoryToDirectory()方法实现文件夹拷贝
     */
    @Test
    public void testFileUtilsCopyDirectoryToDirectory(){
        long startTime =System.currentTimeMillis();
        File sourceDir=new File("D:\\io\\source");
        File destinationDir =new File("D:\\io\\target");
        try {
            //将source文件夹拷贝到target目录下
            FileUtils.copyDirectoryToDirectory(sourceDir,destinationDir);
            long endTime =System.currentTimeMillis();
            long time = DateTimeUtils.calculatorTime(startTime, endTime);
            System.out.println("FileUtils拷贝source文件夹耗时"+time+"毫秒");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 使用FileUtils的copyFileToDirectory()方法实现将指定的文件java.pdf拷贝到指定的文件夹D:\io\java
     */
    @Test
    public void testFileUtilsCopyFileToDirectory(){

        File sourceFile=new File("D:\\io\\source\\java.pdf");
        File targetFile=new File("D:\\io\\java");
        try {
            FileUtils.copyFileToDirectory(sourceFile,targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
