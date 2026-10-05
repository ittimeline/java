package net.ittimeline.java.core.foundational.operator.bitwise.leftshift;

/**
 * 左移运算符操作正整数之8 << 28
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 15:05
 * @since Java 25
 */
public class LeftShiftPositiveNumber3 {
    static void main() {
        /*
            1.先计算8的补码(计算机中的数据是使用补码进行运算的，正数的原码、反码、补码都一样)
                8的补码：0000 0000 0000 0000 0000 0000 0000 1000

            2.计算8 << 28（左移运算符的运算规则是用于将数据的二进制位向左移动，右边填充0。）
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
        System.out.println("int能够表示的最小值是" + Integer.MIN_VALUE);
        //如果8是long，那么 8 << 28就是一个正数
        long number = 8;
        System.out.println("长整型 number << 28 = " + (number << 28));
    }

}
