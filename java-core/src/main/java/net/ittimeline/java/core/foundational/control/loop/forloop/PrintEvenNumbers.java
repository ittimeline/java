package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * for循环案例3-打印偶数并统计
 * 需求：打印1到100的偶数，每行显示10个，并且统计偶数的个数以及偶数的累加和
 * 分析：能被2整除的数就是偶数，控制每行显示个数、统计个数采用计数器
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:06
 * @since Java 25
 */
public class PrintEvenNumbers {
    static void main() {
        //偶数和
        int evenNumberSum = 0;
        //偶数个数
        int evenNumberCount = 0;
        //计数器 控制每行个数
        int count = 0;

        //从1遍历到100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                //打印偶数
                System.out.print(i + "\t");
                count++;
                //每行显示10个
                if (count % 10 == 0) {
                    System.out.println();
                }

                //偶数和累加
                evenNumberSum += i;
                //偶数个数累加
                evenNumberCount++;
            }
        }
        //换行
        System.out.println();
        System.out.printf("1到100的偶数和是%d，偶数个数是%d", evenNumberSum, evenNumberCount);
    }
}
