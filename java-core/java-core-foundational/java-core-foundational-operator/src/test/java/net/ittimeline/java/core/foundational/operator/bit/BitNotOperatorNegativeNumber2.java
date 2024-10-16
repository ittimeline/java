package net.ittimeline.java.core.foundational.operator.bit;

/**
 * 按位取反运算符操作负整数之~-10
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 20:26
 * @since Java21
 */
public class BitNotOperatorNegativeNumber2 {
    public static void main(String[] args) {
        /*
            1.先计算-10的补码（计算机中的数据是使用补码进行运算的，负数的补码等于原码取反加1）
                ①求10的原码
                10的原码：0000 0000 0000 0000 0000 0000 0000 1010

                ②求-10的原码（原码的最高位（左边的第一位）是符号位：0表示正数，1表示负数）
               -10的原码：1000 0000 0000 0000 0000 0000 0000 1010

                ③求-10的反码（原码求反码：最高位不变，其他位取反）
                -10的反码：1111 1111 1111 1111 1111 1111 1111 0101

                ④求-10的补码（补码=反码+1）
                -10的补码：1111 1111 1111 1111 1111 1111 1111 0110

            2.计算~-10（按位与计算规则是按照二进制位取反：1为0，0为1）
                1111 1111 1111 1111 1111 1111 1111 0110
                ~
                =
                0000 0000 0000 0000 0000 0000 0000 1001

            3.将补码换算成原码（根据补码求原码）
                补码：0000 0000 0000 0000 0000 0000 0000 1001
                原码：0000 0000 0000 0000 0000 0000 0000 1001

            4.将原码转换为十进制（ 打印输出结果是十进制）
                0000 0000 0000 0000 0000 0000 0000 1001转换为十进制结果是9

            5.程序运行结果
                ~-10 结果就是9
         */
        System.out.println("~-10 = " + (~-10));
    }
}
