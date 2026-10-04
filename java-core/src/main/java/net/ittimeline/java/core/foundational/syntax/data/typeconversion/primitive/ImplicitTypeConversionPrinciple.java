package net.ittimeline.java.core.foundational.syntax.data.typeconversion.primitive;

/**
 * 自动类型转换内存原理
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 13:56
 * @since Java 25
 */
public class ImplicitTypeConversionPrinciple {
    static void main() {
                 /*
            一个字节的整数10在内存的二进制补码表示方式为0000 1010
            byte自动提升为int后占据4个字节
            因此在内存的二进制补码表示方式为0000 0000 0000 0000 0000 0000 0000 1010
        */

        byte byteVar = 10;
        //byte自动提升为int后占据4个字节
        int intVar = byteVar;
        System.out.println("intVar = " + intVar);
        // 查看二进制表示（补前导零到32位）
        System.out.println("byte 10 的8位二进制: " + String.format("%8s", Integer.toBinaryString(byteVar & 0xFF)).replace(' ', '0'));
        System.out.println("int 10 的32位二进制: " + String.format("%32s", Integer.toBinaryString(intVar)).replace(' ', '0'));
    }
}
