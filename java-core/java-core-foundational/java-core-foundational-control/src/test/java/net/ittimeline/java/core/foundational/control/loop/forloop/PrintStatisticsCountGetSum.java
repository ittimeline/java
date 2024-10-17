package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 打印满足条件整数并且统计个数以及总和
 * 需求：打印1-100之间所有9的倍数的整数，统计个数以及总和
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 16:37
 * @since Java21
 */
public class PrintStatisticsCountGetSum {
    public static void main(String[] args) {
        //被9整除的个数
        int count = 0;
        //被9整除的累加和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                //被9整除的累加和累加
                sum += i;
                //被9整除的个数累加
                count++;
            }
        }
        System.out.printf("1到100之间所有9的倍数的整数个数是%d个，总和是%d", count, sum);
    }
}
