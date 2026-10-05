package net.ittimeline.java.core.foundational.operator.ternary;

import java.util.Scanner;

/**
 * 三元运算符使用
 * 三元运算符的格式：
 * 条件表达式 ? 表达式1 : 表达式2
 * 如果条件表达式为true,则执行表达式1,否则执行表达式2
 * 表达式1和表达式2的数据类型必须一致，三元运算符的整体就是这个数据类型
 * 表达式1和表达式2可以是任意的表达式，可以是方法的调用
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:39
 * @since Java 25
 */
public class TernaryOperator {
    static void main() {
        //求两个整数的最大值
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        //两个整数从键盘输入
        System.out.println("请输入第一个整数");
        int left = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int right = scanner.nextInt();
        int max = left > right ? left : right;
        System.out.printf("%d和%d的最大值是%d\n", left, right, max);
        //关闭Scanner
        scanner.close();
    }
}
