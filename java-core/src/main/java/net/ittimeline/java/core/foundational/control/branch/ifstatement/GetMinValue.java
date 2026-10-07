package net.ittimeline.java.core.foundational.control.branch.ifstatement;

import java.util.Scanner;

/**
 * 单分支结构if语句案例2-求最小值
 * 需求：提示用户从键盘输入三个整数，求三个整数的最小值
 * 分析：先求两个整数的最小值，再求三个整数的最小值
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 11:33
 * @since Java 25
 */
public class GetMinValue {
    static void main() {
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

        //①先求两个整数的最小值
        //假设第一个整数是最小值
        int min = first;
        //如果第二个整数比min小
        if (second < min) {
            //将第二个整数赋值给min
            min = second;
        }
        //②再求三个整数的最小值
        //如果第三个整数比min还小
        if (third < min) {
            //将第三个整数赋值给min
            min = third;
        }

        System.out.printf("%d,%d,%d三个整数的最小值是%d\n", first, second, third, min);
        //关闭Scanner
        scanner.close();

    }
}
