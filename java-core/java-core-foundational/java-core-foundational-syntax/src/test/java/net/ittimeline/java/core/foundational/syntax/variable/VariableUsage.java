package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量使用三种方式
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 6:12
 * @since Java21
 */
public class VariableUsage {
    public static void main(String[] args) {
        System.out.println("******************变量的使用方式1：打印输出******************");
        //定义整数类型变量age，初始化赋值为19
        int age = 19;
        //打印age变量就是打印age变量存储的值
        System.out.println(age);
        //不过为了让程序的运行结果更加直观，建议使用【字符串拼接打印】
        System.out.println("age = " + age);

        //定义浮点类型的变量height并且初始化赋值为180.0
        double height = 180.0;
        System.out.println(height);
        System.out.println("height = " + height);

        System.out.println("******************变量的使用方式2：修改变量的值******************");
        int number = 10;
        System.out.println("初始化赋值：number = " + number);
        number = 20;
        System.out.println("修改之后：number = " + number);

        System.out.println("******************变量的使用方式3：参与运算******************");
        //定义两个整数变量并分别赋值20和10
        int left = 20;
        int right = 10;
        //将两个整数相加的结果赋值给result
        int result = left + right;
        System.out.println("两个整数相加的结果是" + result);
    }
}
