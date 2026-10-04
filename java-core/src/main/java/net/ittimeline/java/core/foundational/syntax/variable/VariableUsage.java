package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量的三种使用方式
 * 变量的使用方式1：打印输出
 * 变量的使用方式2：修改变量存储的值
 * 变量的使用方式2：参与运算
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/3 17:15
 * @since Java 25
 */
public class VariableUsage {
    static void main() {
        System.out.println("********************************变量的使用方式1：打印输出********************************");
        //声明整数变量age，并且初始化赋值18
        int age = 18;
        //打印变量age就是打印age存储的值
        System.out.println(age);
        //不过为了让程序的运行结果更加直观，建议使用【字符串拼接】打印
        System.out.println("age = " + age);
        System.out.println("********************************变量的使用方式2：修改变量存储的值********************************");

        int number = 10;
        System.out.println("初始化赋值：number = " + number);

        //修改变量的值
        number = 100;
        System.out.println("修改之后的值：number = " + number);

        System.out.println("********************************变量的使用方式2：参与运算********************************");
        //定义两个变量，并且分别赋值10,20,10和20是整数字面量
        int left = 10;
        int right = 20;
        //将两个整数相加的结果赋值给result，left + right称为算术表达式
        int result = left + right;
        System.out.println("result = " + result);

    }
}
