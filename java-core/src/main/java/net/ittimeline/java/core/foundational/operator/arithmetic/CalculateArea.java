package net.ittimeline.java.core.foundational.operator.arithmetic;

import java.util.Scanner;

/**
 * 计算圆的面积
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/5 16:29
 * @since Java 25
 */
public class CalculateArea {
    static void main() {

        System.out.println("请输入圆的半径");
        //创建Scanner对象
        //System.in表示标准输入,也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        //读取用户从键盘输入的半径
        double radius = scanner.nextDouble();

        //计算圆的面积
        double area = Math.PI * radius * radius;

        System.out.printf("圆的半径是：%.2f，圆的面积是：%.2f\n", radius, area);

        //关闭Scanner
        scanner.close();
    }
}
