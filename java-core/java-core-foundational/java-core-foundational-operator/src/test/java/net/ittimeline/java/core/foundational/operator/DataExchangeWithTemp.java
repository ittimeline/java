package net.ittimeline.java.core.foundational.operator;

import java.util.Scanner;

/**
 * 使用临时变量实现数据交换
 * 优点：简单、适用性好(基本数据类型、引用数据类型都适用)
 * 缺点：需要开辟临时空间
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 21:22
 * @since Java21
 */
public class DataExchangeWithTemp {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int left = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int right = scanner.nextInt();
        System.out.println("数据交换实现方式1:使用临时变量实现交换之前");
        System.out.printf("left = %d  right = %d \n", left, right);

        //使用临时变量交换
        //① temp = 10 ② left =10
        int temp = left;
        //① right = 20 ② left =20
        left = right;
        //① temp = 10 ② right =10
        right = temp;
        System.out.println("数据交换实现方式1:基于临时变量实现交换之后");
        System.out.printf("left = %d  right = %d \n", left, right);
        //关闭Scanner
        scanner.close();
    }
}
