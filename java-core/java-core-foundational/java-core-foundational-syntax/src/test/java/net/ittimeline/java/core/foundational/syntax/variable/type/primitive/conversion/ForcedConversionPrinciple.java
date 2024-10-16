package net.ittimeline.java.core.foundational.syntax.variable.type.primitive.conversion;

/**
 * 基本数据类型强制类型转换内存原理
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 22:01
 * @since Java21
 */
public class ForcedConversionPrinciple {
    public static void main(String[] args) {
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
    }
}
