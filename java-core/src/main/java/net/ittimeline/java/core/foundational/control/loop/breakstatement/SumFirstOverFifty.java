package net.ittimeline.java.core.foundational.control.loop.breakstatement;

/**
 * break语句案例1-求和
 * 需求：计算1-100的和，求出当和第一次大于50的当前数
 * 分析：和第一次大于50就停止循环
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:23
 * @since Java 25
 */
public class SumFirstOverFifty {
    static void main() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 50) {
                System.out.printf("计算1-100的和，当和第一次大于50的当前数是%d,和是%d\n", i, sum);
                break;
            }
        }
    }
}
