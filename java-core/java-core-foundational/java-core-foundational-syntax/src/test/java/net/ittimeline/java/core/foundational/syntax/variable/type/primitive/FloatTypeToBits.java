package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 查看浮点数的二进制表示
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 9:30
 * @since Java21
 */
public class FloatTypeToBits {
    public static void main(String[] args) {
        System.out.println("1.查看四个字节浮点数3.625和0.9的二进制表示");
        float firstFloatValue = 3.625f;
        System.out.println("四个字节的浮点数3.625的二进制表示是"
                + Integer.toBinaryString(Float.floatToIntBits(firstFloatValue)));

        float secondFloatValue = 0.9f;
        System.out.println("四个字节的浮点数0.9的二进制表示是"
                + Integer.toBinaryString(Float.floatToIntBits(secondFloatValue)));

        System.out.println("2.查看八个字节浮点数3.625和0.9的二进制表示");
        double firstDoubleValue = 3.625;
        System.out.println("八个字节的浮点数3.625的二进制表示是"
                + Long.toBinaryString(Double.doubleToLongBits(firstDoubleValue)));
        double secondDoubleValue = 0.9;
        System.out.println("八个字节的浮点数0.9的二进制表示是"
                + Long.toBinaryString(Double.doubleToLongBits(secondDoubleValue)));
    }
}
