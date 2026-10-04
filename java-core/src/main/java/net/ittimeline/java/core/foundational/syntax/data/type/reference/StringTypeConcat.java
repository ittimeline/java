package net.ittimeline.java.core.foundational.syntax.data.type.reference;

/**
 * 字符串拼接运算
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 13:44
 * @since Java 25
 */
public class StringTypeConcat {
    static void main() {
        System.out.println("1.字符串和整数进行拼接");
        int number = 101;
        String str = "编号：";
        String info = str + number;
        System.out.println(info);

        System.out.println("2.如何区分加号（+）表示加法还是字符串");
        int value = 100;
        char ch = 'A';
        String greeting = "Hello";

        //第一个加法表示加法运算，因为加号（+）左右两边没有String类型参与运算
        //第二个加法表示拼接运算，因为加号（+）左右两边有String类型参与运算
        //输出结果应该是165Hello
        System.out.println("value + ch + greeting = " + (value + ch + greeting));

        //第一个加法表示拼接运算，因为加号（+）左右两边有String类型参与运算
        //第二个加法表示拼接运算，因为加号（+）左右两边有String类型参与运算
        //输出结果应该是HelloA100
        System.out.println("greeting+ch+value = " + (greeting + ch + value));


        System.out.println("3.字符串和八种基本数据类型拼接运算");
        //使用字符串拼接个人信息
        String name = "tony";
        int age = 32;
        char gender = '男';
        double height = 175.0;
        double weight = 75.0;
        boolean isMarried = false;
        String personInfo = "个人信息--> 姓名：" + name + " 性别：" + gender + " 年龄：" + age + " 身高：" + height + " 体重：" + weight + " 婚姻状况：" + isMarried;
        System.out.println(personInfo);


        System.out.println("4.拼接图案 ：*   *   *");
        System.out.println("*   *   *");
        System.out.println("*" + '\t' + "*" + '\t' + "*");
        System.out.println("*" + "\t" + "*" + "\t" + "*");
        //错误的方式
        //下面打印输出的结果不是我们要的，因为操作数都是字符类型，最终运行的结果是int
        System.out.println('*' + '\t' + '*' + '\t' + '*');

    }
}
