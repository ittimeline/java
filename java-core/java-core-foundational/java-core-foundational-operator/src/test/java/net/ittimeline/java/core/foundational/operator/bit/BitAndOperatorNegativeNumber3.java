package net.ittimeline.java.core.foundational.operator.bit;

/**
 * 按位与运算符操作负整数之5 & -10
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 20:02
 * @since Java21
 */
public class BitAndOperatorNegativeNumber3 {
    public static void main(String[] args) {
        /*
            1.先计算5和-10的补码（计算机中的数据是使用补码进行运算的，正数的原码、反码、补码都一样，负数的补码等于原码取反加1）
                ①求5和10的原码
                5的原码：0000 0000 0000 0000 0000 0000 0000 0101
               10的原码：0000 0000 0000 0000 0000 0000 0000 1010

                ②求5和-10的原码（原码的最高位（左边的第一位）是符号位：0表示正数，1表示负数）
                5的原码：0000 0000 0000 0000 0000 0000 0000 0101
              -10的原码：1000 0000 0000 0000 0000 0000 0000 1010

                ③求5和-10的反码（原码求反码：最高位不变，其他位取反）
                5的反码：0000 0000 0000 0000 0000 0000 0000 0101
              -10的反码：1111 1111 1111 1111 1111 1111 1111 0101

                ④求-5和-3的补码（补码=反码+1）
                5的补码：0000 0000 0000 0000 0000 0000 0000 0101
              -10的补码：1111 1111 1111 1111 1111 1111 1111 0110

            2.计算5 & -10（按位与计算规则是按照二进制位进行与运算：同1为1，有0为0）
                0000 0000 0000 0000 0000 0000 0000 0101
                &
                1111 1111 1111 1111 1111 1111 1111 0110
                =
                0000 0000 0000 0000 0000 0000 0000 0100

            3.将补码换算成原码
                补码：0000 0000 0000 0000 0000 0000 0000 0100
                原码：0000 0000 0000 0000 0000 0000 0000 0100

            4.将原码转换为十进制（ 打印输出结果是十进制）
                0000 0000 0000 0000 0000 0000 0000 0100转换为十进制结果是4

            5. 程序运行结果
                5 & -10 结果就是4
         */
        System.out.println("5 & -10 = " + (5 & -10));
    }
}
