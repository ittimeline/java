package net.ittimeline.java.foundational.method;

import java.util.Arrays;

/**
 * 方法的参数传递机制测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/12 21:06
 * @since JDK11
 */
public class MethodArgsPassTest {
    public static void main(String[] args) {
        //形参数据值的改变 不会影响实参的数据值
        System.out.println("******************基本数据类型的参数传递机制*******************");
        int number =10;
        System.out.println("1.实参 number = "+number);
        MethodArgsPass.change(number);
        System.out.println("2.实参 number = "+number);
        System.out.println("******************基本数据类型的参数传递机制*******************");



        System.out.println("******************引用数据类型的参数传递机制-改地址*******************");

        int[] numbers ={1,2,3};
        System.out.println("1.实参 numbers的内存地址是"+numbers);
        MethodArgsPass.change(numbers) ;
        System.out.println("2.实参 numbers的内存地址是"+numbers);
        System.out.println("******************引用数据类型的参数传递机制-改地址*******************");



        System.out.println("******************引用数据类型的参数传递机制-改内容*******************");
        char[] chars={'a','b','c'};
        System.out.println("1.实参 chars数组的内容是"+ Arrays.toString(chars));
        MethodArgsPass.change(chars);
        System.out.println("2.实参 chars数组的内容是"+ Arrays.toString(chars));

        System.out.println("******************引用数据类型的参数传递机制-改内容*******************");

    }
}
