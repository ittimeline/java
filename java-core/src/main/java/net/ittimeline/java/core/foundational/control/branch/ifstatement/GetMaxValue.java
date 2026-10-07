package net.ittimeline.java.core.foundational.control.branch.ifstatement;

import java.util.Scanner;

/**
 * 单分支结构if语句案例1-求最大值
 * 需求：提示用户从键盘输入三个整数，求三个整数的最大值
 * 分析：先求两个整数的最大值，再求三个整数的最大值
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 11:31
 * @since Java 25
 */
public class GetMaxValue {
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


        //①先求两个整数的最大值
        //假设第一个整数是最大值
        int max = first;
        //如果第二个整数比max大
        if (second > max) {
            //将第二个整数赋值给max
            max = second;
        }
        //②再求三个整数的最大值
        //如果第三个整数比max还大
        if (third > max) {
            //将第三个整数赋值给max
            max = third;
        }


        System.out.printf("%d,%d,%d三个整数的最大值是%d\n", first, second, third, max);
        //关闭Scanner
        scanner.close();
    }
}
