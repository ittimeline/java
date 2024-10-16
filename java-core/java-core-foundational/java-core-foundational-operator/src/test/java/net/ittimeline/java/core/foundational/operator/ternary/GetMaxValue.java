package net.ittimeline.java.core.foundational.operator.ternary;

import java.util.Scanner;

/**
 * 求用户输入三个整数最大值
 * 需求：提示用户从键盘输入三个整数，求三个整数的最大值
 * 分析：先求两个整数的最大值，再求三个整数的最大值
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 14:39
 * @since Java21
 */
public class GetMaxValue {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int first = scanner.nextInt();

        System.out.println("请输入第二个整数");
        int second = scanner.nextInt();

        System.out.println("请输入第三个整数");
        int third = scanner.nextInt();

        //先找出first和second中的最大值
        int tempMax = first > second ? first : second;

        //再比较tempMax和third;
        int finalMax = tempMax > third ? tempMax : third;
        System.out.println("三个整数的最大值" + finalMax);

        //关闭Scanner
        scanner.close();
    }
}
