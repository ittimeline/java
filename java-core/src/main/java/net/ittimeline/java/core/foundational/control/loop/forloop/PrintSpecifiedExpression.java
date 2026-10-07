package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * for循环案例6-打印指定的表达式
 * 需求：打印如下指定表达式
 * 0 + 5  = 5
 * 1 + 4  = 5
 * 2 + 3  = 5
 * 3 + 2  = 5
 * 4 + 1  = 5
 * 分析：
 * ● 第一个操作数从0开始，依次递增，最大4
 * ● 第二个操作数从5开始，依次递减，最小是1
 * ● 计算结果=第一个操作数+第二个操作数
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:07
 * @since Java 25
 */
public class PrintSpecifiedExpression {
    static void main() {
        for (int i = 0; i < 5; i++) {
            //第一个操作数从0开始，依次递增，最大4
            int left = i;
            //第二个操作数从5开始，依次递减，最小是1
            int right = 5 - i;
            //计算结果=第一个操作数+第二个操作数
            int result = left + right;
            System.out.printf("%d + %d = %d\n", left, right, result);
        }
    }
}
