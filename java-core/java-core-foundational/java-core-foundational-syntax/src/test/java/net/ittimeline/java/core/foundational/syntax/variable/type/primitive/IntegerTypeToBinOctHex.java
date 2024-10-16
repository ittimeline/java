package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 查看整数的二进制、八进制、十六进制补码表示方式
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 6:58
 * @since Java21
 */
public class IntegerTypeToBinOctHex {
    public static void main(String[] args) {
        int intNumber = 25;
        System.out.println("四个字节整数类型25的二进制补码表示方式为" + Integer.toBinaryString(intNumber));
        System.out.println("四个字节整数类型25的八进制补码表示方式为" + Integer.toOctalString(intNumber));
        System.out.println("四个字节整数类型25的十六进制补码表示方式为" + Integer.toHexString(intNumber));

        intNumber = -25;
        System.out.println("四个字节整数类型-25的二进制补码表示方式为" + Integer.toBinaryString(intNumber));
        System.out.println("四个字节整数类型-25的八进制补码表示方式为" + Integer.toOctalString(intNumber));
        System.out.println("四个字节整数类型-25的十六进制补码表示方式为" + Integer.toHexString(intNumber));
    }
}
