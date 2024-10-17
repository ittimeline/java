package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 计算指定表达式的值
 * 需求：表达式为1+(1+2)+(1+2+3)+(1+2+3+…+100)
 * 分析：每项的和使用公式 i * (i + 1) / 2
 * 实现方式2
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 21:54
 * @since Java21
 */
public class SumOfSeriesV2 {
    public static void main(String[] args) {
        //100项的总和
        int totalSum = 0;
        //一共100项
        for (int i = 1; i <= 100; i++) {
            //每项的和使用公式 i * (i + 1) / 2
            int termSum = i * (i + 1) / 2;
            //将当前项累加到总和
            totalSum += termSum;
        }
        System.out.println("表达式1+(1+2)+(1+2+3)+(1+2+3+…+100)的值为" + totalSum);
    }
}
