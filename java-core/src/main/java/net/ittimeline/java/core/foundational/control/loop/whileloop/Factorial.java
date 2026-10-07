package net.ittimeline.java.core.foundational.control.loop.whileloop;

import java.util.Scanner;

/**
 * while循环案例3-n的阶乘
 * 需求：提示用户从键盘输入一个非负整数 n，计算并输出 n!。
 * <pre>
 * n! = n × (n-1) × (n-2) × ... × 2 × 1
 * 规定：0! = 1
 * 负数没有阶乘
 * </pre>
 * 分析：
 * <ol>
 *   <li>读取用户输入的整数 n。</li>
 *   <li>若 n < 0，提示错误并退出。</li>
 *   <li>若 n == 0，直接输出 1。</li>
 *   <li>若 n > 0，用 while 循环从 n 递减到 1，累乘到 result 中。</li>
 *   <li>输出原始 n 和计算结果。</li>
 * </ol>
 * 注意：阶乘结果增长极快，n 较大时会超出 long 范围（20! 已接近 long 上限），
 * 本示例使用 long，适用于 n ≤ 20。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 19:43
 * @since Java 25
 */
public class Factorial {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个非负整数：");
        int number = scanner.nextInt();

        // 输入校验
        if (number < 0) {
            System.out.println("负数没有阶乘，请输入非负整数！");
            return;
        }


        // 保存原始输入，用于最终输出
        int originalNumber = number;

        // 阶乘结果初始化为 1（乘法单位元）
        long result = 1;

        // 0! = 1，循环不会执行，result 保持 1
        while (number > 0) {
            result *= number;
            number--;
        }

        // 输出结果
        System.out.printf("%d 的阶乘是：%d%n", originalNumber, result);
        //关闭Scanner
        scanner.close();
    }
}
