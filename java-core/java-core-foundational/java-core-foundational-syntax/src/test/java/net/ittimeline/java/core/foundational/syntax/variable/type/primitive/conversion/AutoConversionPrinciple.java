package net.ittimeline.java.core.foundational.syntax.variable.type.primitive.conversion;

/**
 * 基本数据类型自动类型转换内存原理
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 21:48
 * @since Java21
 */
public class AutoConversionPrinciple {
    public static void main(String[] args) {
        /*
            一个字节的整数10在内存的二进制补码表示方式为0000 1010
            byte自动提升为int后占据4个字节
            因此在内存的二进制补码表示方式为0000 0000 0000 0000 0000 0000 0000 1010
        */

        byte byteVar = 10;
        //byte自动提升为int后占据4个字节
        int intVar = byteVar;
        System.out.println("intVar = " + intVar);
    }
}
