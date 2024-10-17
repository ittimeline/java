package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 打印偶数并统计
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 16:33
 * @since Java21
 */
public class PrintEvenNumberStatistics {
    public static void main(String[] args) {
        //偶数和
        int evenNumberSum = 0;
        //偶数个数
        int evenNumberCount = 0;

        //从1遍历到100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                //偶数和累加
                evenNumberSum += i;
                //偶数个数累加
                evenNumberCount++;
            }
        }
        System.out.printf("1到100的偶数和是%d，偶数个数是%d", evenNumberSum, evenNumberCount);
    }
}
