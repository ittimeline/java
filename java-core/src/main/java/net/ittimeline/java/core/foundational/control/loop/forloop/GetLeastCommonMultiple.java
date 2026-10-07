package net.ittimeline.java.core.foundational.control.loop.forloop;

import java.util.Scanner;

/**
 * for循环案例12- 求最小公倍数
 * 需求：提示用户从键盘输入两个正整数，求这两个正整数的最小公倍数
 * 分析：
 * ● 公倍数 ：同时是两个正整数的倍数
 * ● 例如 12的倍数12，24，36，48，60…，120...,180...,240...
 * ● 20的倍数20，40，60…，120...,180...,240...
 * ● 12和20的公倍数60， 120， 180， 240...
 * ● 12和20的最小公倍数是60
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:11
 * @since Java 25
 */
public class GetLeastCommonMultiple {

    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个正整数");
        int number1 = scanner.nextInt();
        System.out.println("请输入第二个正整数");
        int number2 = scanner.nextInt();


        //1.求最小公倍数的上界和下界
        //两数乘积，作为搜索上界
        int upperBound = number1 * number2;
        //两数中较大的值，作为搜索下界
        int lowerBound = number1 > number2 ? number1 : number2;

        //2.求公倍数
        System.out.printf("%d和%d的公倍数是", number1, number2);
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                System.out.print(i + " ");
            }
        }
        //换行
        System.out.println();
        //3.求最小公倍数
        System.out.println("********************************实现方式1********************************");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                System.out.printf("%d和%d的最小公倍数是%d\n", number1, number2, i);
                //结束for循环
                break;
            }
        }

        System.out.println("********************************实现方式2********************************");
        int lowestCommonMultiple = 1;
        for (int i = upperBound; i >= lowerBound; i--) {
            if (i % number1 == 0 && i % number2 == 0) {
                lowestCommonMultiple = i;
            }
        }
        System.out.printf("%d和%d的最小公倍数是%d\n", number1, number2, lowestCommonMultiple);


        //关闭Scanner
        scanner.close();

    }

}
