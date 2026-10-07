package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * for循环案例9-计算指定表达式的值
 * 需求：计算1-1/2+1/3-1/4...+1/99-1/100的和
 * 分析：
 * ● 一共100项，分子为1，分母从1到100
 * ● 分母是奇数做加法
 * ● 分母是偶数做减法
 * ● 要把表达式中的 1 写成 1.0（即用 1.0 除以分母），这样才能得到正确的小数结果，
 * 因为如果直接用 1/2、1/4 等，整数除法会得到 0。
 * ● 第一项是1.0 / 1
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:09
 * @since Java 25
 */
public class CalculateAlternatingHarmonicSum {
    static void main() {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            //分母是奇数做加法
            if (i % 2 != 0) {
                sum += 1.0 / i;
            }
            //分母是偶数做减法
            else {
                sum -= 1.0 / i;
            }
        }
        System.out.println("表达式1-1/2+1/3-1/4...+1/99-1/100求和的计算结果是" + sum);
    }
}
