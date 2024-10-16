package net.ittimeline.java.core.foundational.syntax.variable.type.primitive.conversion;

/**
 * 基本数据类型强制类型转换注意事项
 * 强制类型转换可能会发生精度损失或者溢出
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 21:59
 * @since Java21
 */
public class ForcedConversionWarning {
    public static void main(String[] args) {
        //double强制转换为int的精度损失问题
        System.out.println("1.double强制转换为int的精度损失问题");
        double doubleVar = 5.8;
        System.out.println("double强制转换为int之前 doubleVar = " + doubleVar);

        //double强制转换为int后小数部分会被舍弃，会有精度损失
        int intVar = (int) doubleVar;
        System.out.println("double强制转换为int之后 intVar = " + intVar);


        //int强制转换为byte的数据溢出问题
        System.out.println("2.int强制转换为byte的数据溢出问题");
        int intValue = 128;
        System.out.println("int强制转换为byte之前 intValue = " + intValue);
        //128超出byte的表示范围，因此结果为-128，因为底层二进制补码是1000 0000
        byte byteVar = (byte) intValue;
        System.out.println("int强制转换为byte之后 byteVar = " + byteVar);
    }
}
