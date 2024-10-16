package net.ittimeline.java.core.foundational.operator.ternary;

import java.util.Scanner;

/**
 * 三元运算符使用注意事项3
 * 开发中使用三元运算符的地方都可以改成if/else，反之不一定。建议在二者都能使用的情况下，推荐使用三元运算符，因为执行效率略高
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 14:36
 * @since Java21
 */
public class TernaryOperatorWarning3 {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是从键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄 ");
        int age = scanner.nextInt();
        //if/else判断是否成年，成年才能去网咖上网
        System.out.println("1.if/else判断是否成年，成年才能去网咖上网");
        if (age >= 18) {
            System.out.println("你成年了，可以去网咖上网了");
        } else {
            System.out.println("未成年人不能去网咖上网");
        }
        //三元运算判断是否成年，成年才能去网咖上网
        System.out.println("2.三元运算判断是否成年，成年才能去网咖上网");
        String result = age >= 18 ? "你成年了，可以去网咖上网了" : "未成年人不能去网咖上网";
        System.out.println(result);

        //关闭Scanner
        scanner.close();
    }
}
