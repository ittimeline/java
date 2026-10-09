package net.ittimeline.java.core.foundational.operator.bitwise.or;

/**
 * 按位或应用案例：标志位设置
 * 请将 0 这个数字中第 2、4、6 位的二进制位设置为 1。
 * 这属于标志位设置的具体应用。
 *
 * <p>需求分析：
 * 将 0 这个数字中第 2、4、6 位设置为 1，
 * 可以使用左移运算符 << 和按位或运算符 |。
 *
 * <pre>
 * 假设二进制位从右往左，并且从第 1 位开始编号：
 *
 * 第 6 位  第 5 位  第 4 位  第 3 位  第 2 位  第 1 位
 *    1       0       1       0       1       0
 *
 * 最终结果：101010
 *
 * 1 << 1 = 000010   // 设置第 2 位
 * 1 << 3 = 001000   // 设置第 4 位
 * 1 << 5 = 100000   // 设置第 6 位
 *
 * 按位或：
 *
 * 000010
 * 001000
 * 100000
 * ------
 * 101010
 *
 * 二进制：101010
 * 十进制：42
 * </pre>
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/5 10:04
 * @since Java 25
 */
public class FlagBit {

    static void main() {
        int number = 0;

        // 将第 2 位设置为 1
        number = number | (1 << 1);

        // 将第 4 位设置为 1
        number = number | (1 << 3);

        // 将第 6 位设置为 1
        number = number | (1 << 5);

        System.out.println("最终结果： number = " + number);
        System.out.println(Integer.toBinaryString(number));
    }
}