package net.ittimeline.java.core.foundational.syntax.data.typeconversion.primitive;

/**
 * 强制类型转换使用注意事项
 * 强制类型转换可能会发生精度损失或者溢出
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 13:57
 * @since Java 25
 */
public class ExplicitTypeConversionWarning {
    static void main() {
        //1. double -> int 精度损失示例
        // double 强制转换为 int 的精度问题（小数部分被截断）

        double doubleVar = 5.8;
        System.out.println("转换前 doubleVar = " + doubleVar);
        // 强制类型转换，将 double 转为 int，小数部分直接丢失
        int intVar = (int) doubleVar;
        System.out.println("转换后 intVar = " + intVar); // 输出 5

        // 2. int -> byte 溢出示例
        int intValue1 = 128;
        System.out.println("转换前 intValue1 = " + intValue1);

        // byte 范围: -128 ~ 127，超过会溢出
        byte byteValue1 = (byte) intValue1;
        System.out.println("转换后 byteValue1 = " + byteValue1); // 输出 -128

        // 原理：
        // int 128 二进制（32位）：00000000 00000000 00000000 10000000
        // 转为 byte 只取低 8 位：10000000
        // 10000000 是负数补码，十进制值 -128

        int intValue2 = 200;
        System.out.println("转换前 intValue2 = " + intValue2);

        byte byteValue2 = (byte) intValue2;
        System.out.println("转换后 byteValue2 = " + byteValue2); // 输出 -56

        // 原理：
        // int 200 二进制（32位）：00000000 00000000 00000000 11001000
        // 转为 byte 只取低 8 位：11001000
        // 11001000 是负数补码
        // 转换为十进制：-56


    }
}
