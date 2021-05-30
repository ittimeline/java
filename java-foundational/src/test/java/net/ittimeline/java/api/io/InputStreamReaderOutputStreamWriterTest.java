package net.ittimeline.java.api.io;

import org.testng.annotations.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 转换流的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/29 19:00
 * @since JDK11
 */
public class InputStreamReaderOutputStreamWriterTest {


    /**
     * 读取GBK编码的文件
     * 会有乱码问题
     */
    @Test
    public void testReaderGBKFile() {

        try (

                Reader reader = new FileReader("D:\\io\\gbk.txt")
        ) {
            char[] buffer = new char[1024];

            int bufferLength = 0;

            while ((bufferLength = reader.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, bufferLength));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 使用InputStreamReader读取GBK文件
     */
    @Test
    public void testInputStreamReaderReadGBKFile() {
        try (
                InputStream inputStream = new FileInputStream("D:\\io\\gbk.txt");
                //使用GBK编码读取文件
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("gbk"));
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
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
     * 使用OutputStreamWriter实现按照指定编码来写文件
     */
    @Test
    public void testOutputStreamWriterUTF8File(){
        try(

                OutputStream outputStream=new FileOutputStream("D:\\io\\utf8.txt");
                OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream,"utf-8");
                BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);

        ){
            bufferedWriter.write("跟光磊学Java");
            bufferedWriter.newLine();
            bufferedWriter.write("跟光磊学Python");
            bufferedWriter.newLine();

        }catch(IOException e){
            e.printStackTrace();
        }


    }


    /**
     * 将GBK编码的gbk.txt文件编码转换成UTF-8
     */
    @Test
    public void testFileEncodingConvert(){
        try (
                InputStream inputStream = new FileInputStream("D:\\io\\gbk.txt");
                //使用GBK编码读取文件
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("gbk"));
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String content = null;

            List<String> list= new ArrayList<>();
            while ((content = bufferedReader.readLine()) != null) {
                list.add(content);
            }
            OutputStream outputStream=new FileOutputStream("D:\\io\\gbk.txt");
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream,"utf-8");
            BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);

            for (String convertedEncodingContent : list) {
                bufferedWriter.write(convertedEncodingContent);
            }
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }










}
