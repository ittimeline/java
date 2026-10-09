package net.ittimeline.java.core.foundational.syntax.data.typeconversion.primitive;

/**
 * 强制类型转换内存原理
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/8 12:39
 * @since Java 25
 */
public class ExplicitTypeConversionPrinciple {
    static void main() {
        /*
            4个字节300 二进制表示方式 0000 0000 0000 0000 0000 0001 0010 1100
            强制转换为1个字节 0010 1100
            最左边0表示正数
            转换为十进制44
         */
        int intValue = 300;
        System.out.println("int强制转换为byte之前 intValue = " + intValue);
        byte byteVar = (byte) intValue;
        System.out.println("int强制转换为byte之后 byteVar = " + byteVar);
        // 查看二进制表示（补前导零到32位）
        System.out.println("byte 300 的8位二进制: " + String.format("%8s", Integer.toBinaryString(byteVar & 0xFF)).replace(' ', '0'));
        System.out.println("int 300 的32位二进制: " + String.format("%32s", Integer.toBinaryString(intValue)).replace(' ', '0'));
    }
}
