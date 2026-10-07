package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环案例6-计算指定表达式
 * 需求：计算表达式1+(1+2)+(1+2+3)+...+(1+2+3+…+100)
 * 分析方式2：每项的和使用等差数列求和公式或高斯求和公式 n * (n + 1) / 2 ,其中n表示第几项
 * 实现方式2：
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:45
 * @since Java 25
 */
public class SumOfTriangularNumbersV2 {
    static void main() {
        //100项的总和
        long totalSum = 0;
        //一共100项
        for (int i = 1; i <= 100; i++) {
            //每项的和使用等差数列求和公式或高斯求和公式 n * (n + 1) / 2
            int termSum = i * (i + 1) / 2;
            //将当前项累加到总和
            totalSum += termSum;
        }
        System.out.println("表达式1+(1+2)+(1+2+3)+...+(1+2+3+…+100)的计算结果为" + totalSum);
    }
}
