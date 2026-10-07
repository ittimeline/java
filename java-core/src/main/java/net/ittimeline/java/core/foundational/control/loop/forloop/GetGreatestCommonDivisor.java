package net.ittimeline.java.core.foundational.control.loop.forloop;

import java.util.Scanner;

/**
 * for循环案例11：求最大公约数
 * 需求：提示用户从键盘输入两个正整数，然后求这两个正整数的最大公约数
 * 分析：
 * ● 公约数：两个正整数同时能整除的数
 * ● 例如 12 可以被1，2，3，4，6，12整除
 * ● 20可以被1，2，4，5，10，20整除
 * ● 12和20的公约数是1，2，4 ，最大公约数是4
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:10
 * @since Java 25
 */
public class GetGreatestCommonDivisor {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个正整数");
        int number1 = scanner.nextInt();
        System.out.println("请输入第二个正整数");
        int number2 = scanner.nextInt();

        //1.先求出两个数的最小值，因为最大公约数小于等于这两个数的最小值
        int min = number1 < number2 ? number1 : number2;

        //2.求公约数
        System.out.printf("%d和%d的公约数是", number1, number2);
        for (int i = 1; i <= min; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                System.out.print(i + " ");
            }
        }
        //换行
        System.out.println();

        //3.求最大公约数
        System.out.println("********************************实现方式1********************************");
        int greatestComonDivisor = 1;
        for (int i = 1; i <= min; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                greatestComonDivisor = i;
            }
        }
        System.out.printf("%d和%d的最大公约数是%d\n", number1, number2, greatestComonDivisor);

        System.out.println("********************************实现方式2********************************");
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
