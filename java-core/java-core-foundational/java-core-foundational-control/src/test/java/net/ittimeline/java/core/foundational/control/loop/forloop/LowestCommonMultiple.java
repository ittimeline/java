package net.ittimeline.java.core.foundational.control.loop.forloop;

import java.util.Scanner;

/**
 * 求最小公倍数
 * 需求：提示用户从键盘输入两个整数，然后求这两个整数的最小公倍数
 * 分析：
 * 公倍数 ：同时是两个整数的倍数
 * 例如 12的倍数12，24，36，48，60…
 * 20的倍数20，40，60，80…
 * 12和20的最小公倍数是60
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 18:30
 * @since Java21
 */
public class LowestCommonMultiple {
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
            公倍数 ：同时是两个整数的倍数
            例如 12的倍数12，24，36，48，60…
            20的倍数20，40，60，80…
            12和20的最小公倍数是60
         */

        int start = number1 * number2;
        int end = number1 > number2 ? number1 : number2;
        //2.求公倍数
        System.out.printf("%d和%d的公倍数是", number1, number2);
        for (int i = start; i >= end; i--) {
            if (i % number1 == 0 && i % number2 == 0) {
                System.out.print(i + " ");
            }
        }
        //换行
        System.out.println();
        //3.求最小公倍数
        System.out.print("实现方式1：");
        int lowestCommonMultiple = start;
        for (int i = start; i >= end; i--) {
            if (i % number1 == 0 && i % number2 == 0) {
                lowestCommonMultiple = i;
            }
        }
        System.out.printf("%d和%d的最小公倍数是%d\n", number1, number2, lowestCommonMultiple);

        System.out.print("实现方式2：");
        for (int i = end; i <= start; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                System.out.printf("%d和%d的最小公倍数是%d\n", number1, number2, i);
                //结束for循环
                break;
            }
        }

        //关闭Scanner
        scanner.close();

    }
}
