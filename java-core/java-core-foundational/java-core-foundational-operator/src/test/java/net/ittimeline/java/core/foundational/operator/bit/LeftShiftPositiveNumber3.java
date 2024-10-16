package net.ittimeline.java.core.foundational.operator.bit;

/**
 * 左移运算符操作正整数之8 << 28
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 20:30
 * @since Java21
 */
public class LeftShiftPositiveNumber3 {
    public static void main(String[] args) {
        /*
            1.先计算8的补码(计算机中的数据是使用补码进行运算的，正数的原码、反码、补码都一样)
                8的补码：0000 0000 0000 0000 0000 0000 0000 1000

            2.计算8 << 28（左移运算符的运算规则是用于将数据的二进制位向左移动，右边填充0。左移n位在一定范围内就是乘以2的n次方）
                0000 0000 0000 0000 0000 0000 0000 1000
                << 28
                =
                1000 0000 0000 0000 0000 0000 0000 0000
                1000 0000 0000 0000 0000 0000 0000 0000是-2147483648的补码，并且没有原码和反码

            3. 程序运行结果
                8 << 28 结果就是-2147483648
         */
        //8默认是int
        System.out.println("8 << 28 = " + (8 << 28));
        //如果8是long，那么 8 << 28不会溢出
        long number = 8;
        System.out.println("8 << 28 = " + (number << 28));
        System.out.println("长整型 number << 28 = " + (number << 28));
    }
}
