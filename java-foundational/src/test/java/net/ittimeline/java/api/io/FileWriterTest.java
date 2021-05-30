package net.ittimeline.java.api.io;

import org.testng.annotations.Test;

import java.io.*;

/**
 * FileWriter的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/29 7:51
 * @since JDK11
 */
public class FileWriterTest {


    /**
     * 创建FileWriter对象，文件不存在会自动创建
     * 创建FileWriter对象， append默认为false,文件存在会清空文件内容
     * 创建FileWriter对象，如果目录不存在，那么就会引发 java.io.FileNotFoundException:D:\io\writer\writer.txt (系统找不到指定的路径。)
     *
     * @throws IOException
     */
    @Test
    public void testFileWriterConstructorAppendFalse() throws IOException {
        File file = new File("D:\\io\\writer\\writer.txt");
        Writer writer = new FileWriter(file);
        String path = "D:\\io\\writer\\writer.txt";
        writer = new FileWriter(path);


        writer.close();

    }

    /**
     * 创建FileWriter对象，文件不存在会自动创建
     * 创建FileWriter对象， append为true,文件存在则不会清空文件内容
     * 创建FileWriter对象，如果目录不存在，那么就会引发 java.io.FileNotFoundException:D:\io\writer\writer.txt (系统找不到指定的路径。)
     *
     * @throws IOException
     */
    @Test
    public void testFileWriterConstructorAppendTrue() throws IOException {
        File file = new File("D:\\io\\writer\\writer.txt");
        Writer writer = new FileWriter(file, true);
        writer.close();
    }

    /**
     * 使用FileWriter往文件中写数据
     */
    @Test
    public void testFileWriterWriteData() throws IOException {
        File file = new File("D:\\io\\writer\\writer.txt");
        Writer writer = new FileWriter(file, false);
        //65对应的字符是A
        writer.write(65);

        writer.flush();
        writer.write(66);

        writer.write("跟光磊学Java");

        char[] chs = new char[]{'G', 'o', '!'};
        writer.write(chs);

        char[] offsetChs = {'P', 'y', 't', 'h', 'o', 'n', 'g'};
        writer.write(offsetChs, 0, 6);

        //关闭流之后将缓冲区的数据写到文件
        writer.close();

        //流关闭之后不能再使用
        //writer.write(65);
    }


    /**
     * 基于FileReader和FileWriter实现文本文件的复制
     */
    @Test
    public void testTextFileCopy() throws IOException {

        //准备复制的源文件
        File source = new File("D:\\io\\data.txt");
        //字符输入流
        Reader reader = new FileReader(source);
        //准备复制的目标文件，就是将源文件的内容复制到哪里
        File target = new File("D:\\io\\data_copy.txt");
        //字符输出流
        Writer writer = new FileWriter(target);

        //每次读取的字符内容
        char[] buffer = new char[10];
        //每次读取字符内容的长度(字符的个数)
        int bufLen = 0;
        //当未达到文件末尾时，循环读取data.txt的文本内容，将读取到的内容存储到buffer，并且将读取到的字符个数赋值给bufLen
        while ((bufLen = reader.read(buffer)) != -1) {
            //将每次读取到内容写到data_copy.txt
            writer.write(buffer, 0, bufLen);
        }
        //关闭字符输出流
        writer.close();
        //关闭字符输入流
        reader.close();
    }
}
