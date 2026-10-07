package net.ittimeline.java.core.foundational.control.loop.whileloop;

/**
 * while循环使用
 * 需求：统计1到100的偶数的个数以及偶数的累加和
 * 分析：偶数就是能被2整除的数
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:14
 * @since Java 25
 */
public class WhileLoop {
    static void main() {
        //偶数和
        int evenNumberSum = 0;
        //偶数个数
        int evenNumberCount = 0;

        //循环初始化语句
        int i = 1;
        //循环条件判断语句
        while (i <= 100) {
            //循环体语句
            if (i % 2 == 0) {
                evenNumberSum += i;
                evenNumberCount++;
            }
            //循环迭代语句
            i++;
        }
        System.out.printf("1到100的偶数和是%d，偶数个数是%d", evenNumberSum, evenNumberCount);
    }
}
