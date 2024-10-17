package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 打印奇数并统计
 * 需求：打印1-100以内的奇数，并且统计奇数的个数以及奇数的累加和
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 16:35
 * @since Java21
 */
public class PrintOddNumberStatistics {
    public static void main(String[] args) {
        //奇数累加和
        int oddNumberSum = 0;
        //奇数个数
        int oddNumberCount = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                //奇数累加和累加
                oddNumberSum += i;
                //奇数个数累加
                oddNumberCount++;
            }
        }
        System.out.printf("1到100的奇数和是%d，奇数个数是%d", oddNumberSum, oddNumberCount);
    }
}
