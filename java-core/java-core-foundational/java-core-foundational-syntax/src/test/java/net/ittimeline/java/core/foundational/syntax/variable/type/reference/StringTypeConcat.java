package net.ittimeline.java.core.foundational.syntax.variable.type.reference;

/**
 * 字符串拼接
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 10:00
 * @since Java21
 */
public class StringTypeConcat {
    public static void main(String[] args) {
        System.out.println("1.字符串和整数拼接");
        int number = 101;
        String str = "编号：";
        //字符串和整数拼接的结果还是String类型
        String info = str + number;
        System.out.println(info);

        System.out.println("2.如何区分+号是表示加法还是字符串拼接");
        int value = 100;
        char ch = 'A';
        String greeting = "Hello";
        //第一个+表示加法运算，因为+左右两边没有String类型参与拼接运算
        //第二个+表示字符串拼接，因为+右边有String类型参与拼接运算
        //输出结果应该是value+ch+greeting = 165Hello
        System.out.println("value+ch+greeting = " + (value + ch + greeting));

        //第一个+表示字符串拼接，因为+右边有String类型参与拼接运算
        //第二个+表示加法运算，因为+左右两边没有String类型参与拼接运算
        //输出结果应该是greeting+ch+number =HelloA100
        System.out.println("greeting+ch+number = " + (greeting + ch + number));

        System.out.println("3.字符串和八种基本数据类型拼接运算");
        //使用字符串拼接个人信息
        String name = "tony";
        int age = 30;
        char gender = '男';
        double height = 175.00;
        double weight = 150.00;
        boolean isMarried = false;
        System.out.println("个人信息： 姓名:" + name + "年龄：" + age + "性别：" + gender
                + "身高：" + height + "体重：" + weight + "是否已婚：" + isMarried);

        System.out.println("4.四种方式拼接图案：*   *   *");
        System.out.println("*   *   *");
        System.out.println("*" + "\t" + "*" + "\t*");
        System.out.println('*' + "\t" + "*" + "\t*");
        //只要打印语句中有一个字符串 最终的结果就是字符串
        System.out.println("*" + '\t' + "*" + "\t*");
        //下面打印输出的结果不是我们要的 因为操作数都是字符类型，最终运行的结果是int
        System.out.println('*' + '\t' + '*' + '\t' + '*');
    }
}
