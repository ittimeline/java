package net.ittimeline.java.api.io;

import org.testng.annotations.Test;

import java.io.*;

/**
 * FileOutputStream的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/28 18:19
 * @since JDK11
 */
public class FileOutputStreamTest {


    /**
     * 创建FileOutputStream对象，文件不存在会自动创建
     * 创建FileOutputStream对象，文件存在会清空文件内容
     * 创建FileOutputStream对象，如果目录不存在，那么就会引发 java.io.FileNotFoundException: D:\io\outputstream\test.txt (系统找不到指定的路径。)
     *
     * @throws FileNotFoundException
     */
    @Test
    public void testFileOutputStreamConstructor() throws FileNotFoundException {

        File file =new File("D:\\io\\outputstream\\test.txt");
        String path="D:\\io\\outputstream\\test.txt";
        OutputStream outputStream=new FileOutputStream(path);
        outputStream=new FileOutputStream(file);
    }


    /**
     * 使用FileOutputStream以字节为单位往指定的文件写数据
     * FileOutputStream#write(int a)不能写中文
     */
    @Test
    public void testFileOutputStreamWriteData() throws IOException {
        File file =new File("D:\\io\\outputstream\\test.txt");
        //这种方式创建FileOutputStream对象会清空文件中已经存在的内容
        OutputStream outputStream=new FileOutputStream(file);
        //往test.txt文件中写一个字节的数据
        //97对应的字符是a
        //65对应的字符就是A
        outputStream.write(97);

        byte[]data={98,99,100,101,102,103};
        outputStream.write(data);

        //48对应的字符就是0
        byte[]offSetData={48,49,50,51,52,53,54,55};
        outputStream.write(offSetData,0,5);

        int chinese='中';
        //20013
        System.out.println("中对应的数字是"+chinese);

        //一个中文字符在UTF-8的编码下占据3个字节，但是write()方法只能写一个字节，因此文本编辑器无法完整的解析
       // outputStream.write(20013);

        //操作完成之后关闭资源
        outputStream.close();
    }

    /**
     * 使用FileOutputStream实现换行写数据
     * @throws IOException
     */
    @Test
    public void testFileOutputStreamWriteDataNewLine()throws  IOException{

        File file =new File("D:\\io\\outputstream\\test.txt");
        OutputStream outputStream=new FileOutputStream(file);
        String osName = System.getProperty("os.name");
        //手动处理不同操作系统的换行
        if (osName.equals("Windows 10")){
            //默认没有换行
            outputStream.write("跟光磊学Java\r\n".getBytes());
            outputStream.write("跟光磊学Linux\r\n".getBytes());
            outputStream.write("跟光磊学前端\r\n".getBytes());
        }else if (osName.equals("Mac OS X")){
            outputStream.write("跟光磊学Java\n".getBytes());
            outputStream.write("跟光磊学Linux\n".getBytes());
            outputStream.write("跟光磊学前端\n".getBytes());
        }

        outputStream.close();

    }

    /**
     * 使用FileOutputStream实现文件内容的拼接(追加)
     */
    @Test
    public void testFileOutputStreamWriteDataAppend() throws IOException{

        File file =new File("D:\\io\\outputstream\\test.txt");
        OutputStream outputStream=new FileOutputStream(file,true);
        outputStream.write("跟光磊学Go\r\n".getBytes());
        outputStream.write("跟光磊学Python\r\n".getBytes());
        outputStream.close();
    }




}
