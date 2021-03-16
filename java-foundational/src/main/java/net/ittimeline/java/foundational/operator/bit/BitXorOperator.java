package net.ittimeline.java.foundational.operator.bit;

/**
 * 按位异或运算符的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/15 22:01
 * @since JDK11
 */
public class BitXorOperator {

    public static void main(String[] args) {
        // 按位异或(^): ^左右两边的二进制补码 相同为0，不同为1
        /*
          按位异或的计算过程

            256 默认是int，占据4个字节  二进制的补码表示方式为 0000 0000 0000 0000 0000 0001 0000 0000

            0000 0000 0000 0000 0000 0001 0000 0000 ^
            0000 0000 0000 0000 0000 0001 0000 0000 =
            0000 0000 0000 0000 0000 0000 0000 0000  转换成十进制的结果就是0

         */

        // 256 ^ 256 = 0
        System.out.println("256 ^ 256 = "+(256 ^ 256));
    }
}
