package net.ittimeline.java.core.foundational.operator.examples;

import java.util.Scanner;

/**
 * 方式3：使用按位异或运算实现数据交换
 * 优势：不需要开辟临时空间，也不会溢出
 * 缺点：适用性差（不适用非数值类型)、难以理解和维护
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 15:21
 * @since Java 25
 */
public class DataExchangeWithXorOperator {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        int left = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int right = scanner.nextInt();


        System.out.println("数据交换实现方式3：使用按位异或运算实现交换之前");
        System.out.printf("left = %d right = %d \n", left, right);

        //使用按位异或运算实现交换数据
        //left = 30
        left = left ^ right;
        System.out.println("1. left ^ right left = " + left);
        //right = 10
        right = left ^ right;
        System.out.println("2. left ^ right right = " + right);
        //left = 20
        left = left ^ right;
        System.out.println("3. left ^ right left = " + left);
        System.out.println("数据交换实现方式3：使用按位异或运算实现交换之后");
        System.out.printf("left = %d right = %d \n", left, right);

        //关闭Scanner
        scanner.close();
    }

}
