package net.ittimeline.java.core.foundational.control.loop.forloop;

import java.util.Scanner;

/**
 * 求最大公约数
 * 需求：提示用户从键盘输入两个整数，然后求这两个整数的最大公约数
 * 分析：
 * 公约数：两个整数同时能整除的数
 * 例如 12 可以被1，2，3，4，6，12整除
 * 20可以被1，2，4，5，10，20整除
 * 12和20的公约数是1，2，4 最大公约数是4
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 18:25
 * @since Java21
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number1 = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = scanner.nextInt();

        /*
            12 可以被1，2，3，4，6，12整除
            20可以被1，2，4，5，10，20整除
            12和20的公约数是1，2，4 最大公约数是4
         */
        //1. 先求出两个数的最小值，因为最大的公约数小于等于两个数的最小值
        int min = number1 < number2 ? number1 : number2;

        //2.求公约数
        System.out.printf("%d和%d的公约数是", number1, number2);
        for (int i = min; i > 0; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                System.out.print(i + " ");
            }
        }
        //换行
        System.out.println();

        //3.求最大公约数
        System.out.println("******************实现方式1******************");
        int greatestCommonDivisor = 0;
        for (int i = 1; i <= min; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                greatestCommonDivisor = i;
            }
        }

        System.out.printf("%d和%d的最大公约数是%d\n", number1, number2, greatestCommonDivisor);

        System.out.println("******************实现方式2******************");
        for (int i = min; i >= 1; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                System.out.printf("%d和%d的最大公约数是%d\n", number1, number2, i);
                break;
            }
        }
        //关闭Scanner
        scanner.close();
    }
}
