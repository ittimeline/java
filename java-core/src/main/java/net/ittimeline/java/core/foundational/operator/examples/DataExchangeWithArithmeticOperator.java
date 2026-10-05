package net.ittimeline.java.core.foundational.operator.examples;

import java.util.Scanner;

/**
 * 方式2：使用算术运算实现数据交换
 * 优势：不需要开辟临时空间
 * 缺点：适用性差（不支持非数值类型）、可能超出int类型的范围（溢出）
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 15:21
 * @since Java 25
 */
public class DataExchangeWithArithmeticOperator {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        int left = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int right = scanner.nextInt();

        System.out.println("数据交换实现方式2：使用算术运算(加减法)实现交换之前");
        System.out.printf("left = %d right = %d \n", left, right);

        //使用算术运算交换
        //left = 10 + 20
        left = left + right;
        //right = 30 -20
        right = left - right;
        //left = 30 -10
        left = left - right;

        System.out.println("数据交换实现方式2：使用算术运算(加减法)实现交换之后");
        System.out.printf("left = %d right = %d \n", left, right);

        //关闭Scanner
        scanner.close();
    }

}
