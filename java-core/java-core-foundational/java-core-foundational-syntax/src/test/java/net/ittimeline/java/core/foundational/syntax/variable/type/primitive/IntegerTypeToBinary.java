package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 正整数25和负整数-25在内存中的存储
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 9:19
 * @since Java21
 */
public class IntegerTypeToBinary {
    public static void main(String[] args) {
        //Integer类提供静态方法public static String toBinaryString(int i)查看整数的二进制表示方式
        System.out.println("正整数25的二进制补码方式是" + Integer.toBinaryString(25));
        System.out.println("负整数-25的二进制补码方式是" + Integer.toBinaryString(-25));
    }
}
