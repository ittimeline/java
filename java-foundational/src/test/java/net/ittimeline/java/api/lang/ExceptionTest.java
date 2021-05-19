package net.ittimeline.java.api.lang;

import net.ittimeline.java.foundational.oop.Cellphone;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 异常的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/14 11:09
 * @since JDK11
 */
public class ExceptionTest {

    /**
     * 算术异常
     */
    @Test
    public void testCreateArithmeticException(){
        System.out.println("程序开始执行");
        //0不能当做除数，此处会引发ArithmeticException
        System.out.println(1/0);
        //由于没有处理ArithmeticException,JVM终止程序的运行，该语句不会执行
        System.out.println("程序结束执行");
    }


    @Test
    public void testThrowRuntimeException(){
        Cellphone cellphone=new Cellphone();
        cellphone.setPrice(-100);
        cellphone.setModel("iphone13");
    }

    /**
     * 声明式处理异常
     * @throws ParseException
     */
    public void throwsParseException()throws ParseException{
        throw new ParseException("解析异常",6);
    }


    /**
     * 声明式处理异常
     * @throws ParseException
     */
    @Test
    public void testThrowsParseException() throws ParseException{
        throwsParseException();
        System.out.println("结束程序...");
    }




    /**
     * 捕获处理异常
     * 有异常的处理流程
     */
    @Test
    public void testTryCatchWithException(){

        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println("begin try");
            dateFormat.parse("2021年05月14日");
            System.out.println("end try");

        } catch (ParseException e) {
            System.out.println("程序发生了异常");
        }

        //捕获处理异常后即使遇到了异常，catch代码块之后的代码依然会执行
        System.out.println("程序正常结束...");
    }

    /**
     * 捕获处理异常
     */
    @Test
    public void testTryCatchWithoutException(){

        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println("begin try");
            dateFormat.parse("2021-05-14");
            System.out.println("end try");

        } catch (ParseException e) {
            System.out.println("程序发生了异常");
        }

        //捕获处理异常后即使遇到了异常，catch代码块之后的代码依然会执行
        System.out.println("程序正常结束...");
    }


    /**
     * 抛出了两个运行时异常
     * 分别捕获多个异常
     * 同时捕获多个异常
     * @param flag
     */
    public void throwMultiRuntimeException(int flag){
        try {
            if(flag==1){
                throw new NullPointerException("空指针异常");
            }else if(flag ==2){
                throw new IllegalArgumentException("参数非法");
            }

            //Java7以后允许catch多个异常，但是异常的类型必须是平级的，也就是有共同的父类
        } catch ( IllegalArgumentException|NullPointerException e) {
            e.printStackTrace();
        }
    }


    /**
     * 捕获处理多个异常的测试方法
     */
    @Test
    public void testInvokeThrowMultiRuntimeException(){

        throwMultiRuntimeException(1);
        throwMultiRuntimeException(2);

    }


    /**
     * try/catch/finally的使用
     */
    @Test
    public void testTryCatchFinally(){
        Scanner input =null;

        try{
            input=new Scanner(System.in);
            System.out.println(1/0);
            //关闭资源
            input.close();
            System.out.println("在try代码块中关闭Scanner");
        }catch (Exception ex){
            System.out.println("系统发生了异常");
            return;
            //异常退出JVM
            //System.exit(-1);
        }finally {
            input.close();
            System.out.println("在finally代码块中关闭Scanner");
        }

        //如果catch中使用了return,此处的代码不会执行
        System.out.println("程序正常结束...");

    }


    /**
     * 方法重写的异常注意事项
     */
    @Test
    public void testGetFileInfo(){

        Father father=new Child();
        father.getFileInfo();

    }




}

class Father{
    /**
     * 获取文件信息
     * @throws IOException
     */
    public void getFileInfo(){

    }
}

class Child extends Father{

    @Override
    public void getFileInfo()  {
        try {
            throw new FileNotFoundException("文件不存在");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
