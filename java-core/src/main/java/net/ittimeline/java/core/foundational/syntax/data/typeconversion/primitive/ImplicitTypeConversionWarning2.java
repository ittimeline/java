package net.ittimeline.java.core.foundational.syntax.data.typeconversion.primitive;

/**
 * 自动类型转换注意事项2
 * 有多种类型的数据混合运算时，系统首先自动将所有数据转换为取值范围最大的数据类型再进行计算，
 * 运算结果的数据类型也是所有数据中取值范围最大的数据类型
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 13:56
 * @since Java 25
 */
public class ImplicitTypeConversionWarning2 {
    static void main() {
        //2.有多种类型的数据混合运算时，系统首先自动将所有数据转换为取值范围最大的数据类型再进行计算
        //运算结果的数据类型也是所有数据中取值范围最大的数据类型
        byte byteValue = 10;
        short shortValue = 10;
        int intValue = 10;
        long longValue = 10L;
        float floatValue = 10.0f;
        double doubleValue = 10.0;
        double doubleResult = byteValue + shortValue + intValue + longValue + floatValue + doubleValue;
        System.out.println("doubleResult = " + doubleResult);

        //整数字面量1默认是int类型 因此结果是int类型
        int intResult = byteValue + 1;
        System.out.println("byte类型和整数字面量进行加法运算 intResult = " + intResult);

        //小数字面量3.14默认是double类型，因此结果是double类型
        doubleResult = byteValue + 3.14;
        System.out.println("byte类型和浮点类型字面量进行加法运算 doubleResult = " + doubleResult);
    }
}
