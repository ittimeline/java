package net.ittimeline.java.core.foundational.control.loop.breakstatement;

/**
 * 求和
 * 需求：计算1-100的和，求出当和第一次大于50的当前数
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 19:57
 * @since Java21
 */
public class GetSumGreaterThan50 {
    public static void main(String[] args) {
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
