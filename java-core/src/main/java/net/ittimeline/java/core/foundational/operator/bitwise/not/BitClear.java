package net.ittimeline.java.core.foundational.operator.bitwise.not;

/**
 * 按位取反运算符案例：位清除
 * 位清除：将指定二进制位设置为 0，其他二进制位保持不变。
 * <p>
 * 实现思路：
 * 1. 使用左移运算符 << 创建位掩码，将需要清除的位置设置为 1。
 * 2. 使用按位取反运算符 ~ 对位掩码取反，使需要清除的位置变成 0，其他位置变成 1。
 * 3. 使用按位与运算符 & 进行计算，从而清除指定的二进制位。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/5 10:39
 * @since Java 25
 */
public class BitClear {
    static void main() {
        // 原始数据：0110 1101
        int value = 0b0110_1101;

        /*
         * 清除从右往左第 4 位。
         *
         * value：
         *
         * 第8位 第7位   第6位 第5位  第4位   第3位 第2位 第1位
         *   0     1     1     0     1     1     0     1
         *
         * 创建位掩码：
         *
         * 1 << 3
         *
         * 0000 0001
         *     << 3
         * 0000 1000
         */
        int bitMask = 1 << 3;

        /*
         * 对位掩码取反：
         *
         * bitMask：
         * 0000 1000
         *
         * ~bitMask：
         * 1111 0111
         *
         * 然后使用按位与运算：
         *
         *   0110 1101
         * & 1111 0111
         * -------------
         *   0110 0101
         *
         * 第 4 位被清除为 0，其他位保持不变。
         */
        int result = value & ~bitMask;

        System.out.println("value = " + value);
        System.out.println("bitMask = " + bitMask);
        System.out.println("result = " + result);
    }
}
