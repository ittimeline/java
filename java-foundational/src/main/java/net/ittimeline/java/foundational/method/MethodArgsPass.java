package net.ittimeline.java.foundational.method;

import java.util.Arrays;

/**
 * 方法的参数传递机制
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/12 21:05
 * @since JDK11
 */
public class MethodArgsPass {

    public static void change(int number){
        System.out.println("1.形参 number = "+number);
        number=100;
        System.out.println("2.形参 number = "+number);

    }

    public static void change(int[] numbers){
        System.out.println("1.形参 numbers的内存地址是"+numbers);
        numbers=new int []{100,200,300};
        System.out.println("2.形参 numbers的内存地址是"+numbers);

    }

    public static void change(char[] chars){
        System.out.println("1.形参 chars数组的内容是"+ Arrays.toString(chars));
        chars[0]='z';
        System.out.println("2.形参 chars数组的内容是"+ Arrays.toString(chars));

    }



}
