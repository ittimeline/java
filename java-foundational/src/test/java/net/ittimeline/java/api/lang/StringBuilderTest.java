package net.ittimeline.java.api.lang;

import org.testng.annotations.Test;

/**
 * StringBuilder 常用方法的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/29 9:51
 * @since JDK11
 */
public class StringBuilderTest {


    /**
     * StringBuilder对象创建的两种方式
     */
    @Test
    public void testStringBuilderConstructor(){

        StringBuilder empty=new StringBuilder();
        System.out.println("empty.length() = "+empty.length());

        StringBuilder str =new StringBuilder("法拉利拉法");
        System.out.println("str.length() = "+str.length());

    }


    /**
     * StringBuilder实现字符串拼接
     */
    @Test
    public void testStringBuilderAppend(){

        StringBuilder builder=new StringBuilder();
        StringBuilder one =builder.append("跟光磊学Java,");
        // 链式编程
        StringBuilder two= builder.append("跟光磊学习Go语言,").append("跟光磊学习Python");

        System.out.println(builder);

        System.out.println("one==two = "+(one==two));
        System.out.println("one.equals(two)"+one.equals(two));
        System.out.println(one);
        System.out.println(two);
    }



    /**
     * StringBuilder实现字符串反转
     */
    @Test
    public void testStringBuilderReverse(){
        String str="Java";
        StringBuilder builder=new StringBuilder(str);
        System.out.println("反转之前的字符串内容:"+str);
        System.out.println("反转之后的字符串内容:"+builder.reverse());

    }


    /**
     * StringBuilder实现字符串插入
     */
    @Test
    public void testStringBuilderInsert(){
        String str="跟学Java";
        StringBuilder builder=new StringBuilder(str);
        builder.insert(1,"光磊");
        System.out.println("字符串插入的结果"+builder);

    }


    /**
     * StringBuilder和String的相互转换
     */
    @Test
    public void testStringBuilder2String(){

        //String转StringBuilder
        String str="法拉利拉法";
        StringBuilder builder=new StringBuilder();
        //StringBuilder转String
        String toStringResult = builder.toString();
    }







}
