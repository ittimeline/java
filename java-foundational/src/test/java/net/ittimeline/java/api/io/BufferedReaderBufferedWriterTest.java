package net.ittimeline.java.api.io;

import net.ittimeline.java.api.util.DateTimeUtils;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 缓冲字符流的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/29 17:05
 * @since JDK11
 */
public class BufferedReaderBufferedWriterTest {


    /**
     * 使用BufferedReader和BufferedWriter实现文本文件的复制
     */
    @Test
    public void testTextFileCopy() {
        long startTime = System.currentTimeMillis();
        File sourceFile = new File("D:\\io\\bufferedinputstreambufferedoutputstream.txt");
        File targetFile = new File("D:\\io\\buffered.txt");

        try (
                Reader reader = new FileReader(sourceFile);
                Writer writer = new FileWriter(targetFile);
                BufferedReader bufferedReader = new BufferedReader(reader);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
        ) {
            char[] buffer = new char[1024];
            int bufferLength = 0;
            while ((bufferLength = bufferedReader.read(buffer)) != -1) {
                bufferedWriter.write(buffer, 0, bufferLength);
            }
            long endTime = System.currentTimeMillis();
            long time = DateTimeUtils.calculatorTime(startTime, endTime);
            //使用BufferedReader和BufferedWriter实现bufferedinputstreambufferedoutputstream.txt文本文件的复制 耗时174毫秒
            System.out.println("使用BufferedReader和BufferedWriter实现bufferedinputstreambufferedoutputstream.txt文本文件的复制 耗时" + time + "毫秒");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 换行写数据
     */
    @Test
    public void testBufferedWriterNewLine() {
        File targetFile = new File("D:\\io\\writer.txt");

        try (
                Writer writer = new FileWriter(targetFile);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
        ) {
            bufferedWriter.write("跟光磊学Java");
            //换行
            bufferedWriter.newLine();
            bufferedWriter.write("跟光磊学前端");
            bufferedWriter.newLine();
            bufferedWriter.write("跟光磊学Linux");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 读取每行数据
     */
    @Test
    public void testBufferedReaderReadLine() {
        File targetFile = new File("D:\\io\\writer.txt");
        try (
                Reader reader = new FileReader(targetFile);
                BufferedReader bufferedReader = new BufferedReader(reader);

        ) {
            String content = null;
            while ((content = bufferedReader.readLine()) != null) {
                System.out.println(content);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 对文件内容升序排序
     */
    @Test
    public void testFileContentSort() {
        File targetFile = new File("D:\\io\\writer.txt");
        try (
                Reader reader = new FileReader(targetFile);
                BufferedReader bufferedReader = new BufferedReader(reader);
        ) {
            String content = null;
            List<String> list = new ArrayList<>();
            while ((content = bufferedReader.readLine()) != null) {
                //将读取到的每行的内容放到集合中
                list.add(content);
            }
            //对集合的元素进行升序排序
            Collections.sort(list);
            //创建FileWriter对象，文件已经存在会清空文件内容
            Writer writer = new FileWriter(targetFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String sortedContent : list) {
                bufferedWriter.write(sortedContent);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
