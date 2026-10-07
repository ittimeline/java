package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环案例10-完数
 * 需求：找出1~1000之间的所有完数
 * 分析：
 * 完数定义：一个数等于它的所有因子（不包括自身）之和，例如6的因子是1，2，3，而1+2+3=6，所以6是完数
 * 实现步骤：① 判断一个数是不是完数 ②找出1~1000之间的所有完数
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:47
 * @since Java 25
 */
public class PerfectNumberFinder {
    static void main() {
        System.out.print("1~1000之间的所有完数：");
        // 遍历1到1000，逐一判断是否为完数
        for (int number = 1; number <= 1000; number++) {
            // sum：存放当前数所有真因子之和，每次循环重置为0
            int sum = 0;
            // 优化：一个数的真因子最大不超过它的一半，因此只需遍历到 number/2
            for (int i = 1; i <= number / 2; i++) {
                // 如果i是number的因子（即number能被i整除）
                if (number % i == 0) {
                    // 将因子累加到 sum 中
                    sum += i;
                }
            }
            // 判断因子和是否等于原数，若是则输出该完数
            if (sum == number) {
                System.out.print(number + "\t");
            }
        }
        //换行
        System.out.println();
    }
}
