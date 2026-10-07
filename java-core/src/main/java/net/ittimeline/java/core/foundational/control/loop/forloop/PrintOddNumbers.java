package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * for循环案例4：打印奇数并统计
 * 需求：打印1到100的奇数，每行显示10个，并且统计奇数的个数以及奇数的累加和
 * 分析：不能被2整除的数就是奇数，控制每行显示个数、统计个数采用计数器
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:06
 * @since Java 25
 */
public class PrintOddNumbers {
    static void main() {
        //奇数累加和
        int oddNumberSum = 0;
        //奇数个数
        int oddNumberCount = 0;
        //计数器 控制每行个数
        int count = 0;

        //从1遍历到100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                //打印奇数
                System.out.print(i + "\t");
                count++;
                //每行显示10个
                if (count % 10 == 0) {
                    System.out.println();
                }
                //奇数和累加
                oddNumberSum += i;
                //奇数个数累加
                oddNumberCount++;
            }
        }
        //换行
        System.out.println();
        System.out.printf("1到100的奇数和是%d，奇数个数是%d", oddNumberSum, oddNumberCount);
    }
}
