package net.ittimeline.java.core.foundational.syntax.data.type.primitive;

/**
 * 整数溢出内存原理
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 9:31
 * @since Java 25
 */
public class IntTypeOverFlow {
    static void main() {
        /*
            ① 求补码：计算机在执行运算的时候使用补码运算
            1个字节等于8个bit
            int占据4个字节，byte占据1个字节
            135默认是int类型，(byte)135表示将int类型转换为byte类型
            135的32位二进制表示：00000000 00000000 00000000 10000111
            强转为byte时，取低8位：10000111
            10000111 最高位是1，表示这是一个负数（补码形式）

            ② 补码转原码：（补码 - 1 → 取反）：
                   补码：10000111
                   减1：10000110
                   符号位不变，数值位取反 → 11111001

            ③ 原码转换为十进制
               原码：11111001
               数值部分：1111001 = 64 + 32 + 16 + 8 + 1 = 121
               符号位是1，表示负数
               所以最终结果是 -121
         */

        byte value = (byte) 135;
        System.out.println("value = " + value);
    }
}
