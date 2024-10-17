package net.ittimeline.java.core.foundational.control.branch.ifstatement;

import java.util.Scanner;

/**
 * 求三个整数的最小值
 * 需求：提示用户从键盘输入三个整数,求三个整数的最小值
 * 分析：先求两个整数的最小值,再求三个整数的最小值
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 8:08
 * @since Java21
 */
public class GetMinValue {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int first = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int second = scanner.nextInt();
        System.out.println("请输入第三个整数");
        int third = scanner.nextInt();

        //假设第一个值是最小值
        int minValue = first;

        //如果第二个值小于最小值
        if (second < minValue) {
            //将第二个值赋值给最小值
            minValue = second;
        }
        //如果第三个值小于最小值
        if (third < minValue) {
            //将第三个值赋值给最小值
            minValue = third;
        }

        System.out.printf("三个整数 %d、%d、%d的最小值是%d", first, second, third, minValue);

    }
}
