package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * for循环案例5-打印满足条件整数并统计
 * 需求：打印1-100之间所有9的倍数的整数，统计个数以及总和
 * 分析：9的倍数就是能被9整除的数，统计个数使用计数器，求总和累加即可
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:07
 * @since Java 25
 */
public class PrintMultiplesOfNine {
    static void main() {
        //被9整除的个数
        int count = 0;
        //被9整除的累加和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                System.out.print(i + "\t");
                //被9整除的累加和累加
                sum += i;
                //被9整除的个数累加
                count++;
            }
        }
        //换行
        System.out.println();
        System.out.printf("1到100之间所有9的倍数的整数个数是%d个，总和是%d", count, sum);
    }
}
