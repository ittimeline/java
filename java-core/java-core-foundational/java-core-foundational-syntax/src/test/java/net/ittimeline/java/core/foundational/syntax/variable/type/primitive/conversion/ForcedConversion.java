package net.ittimeline.java.core.foundational.syntax.variable.type.primitive.conversion;

/**
 * 基本数据类型强制类型转换使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 21:52
 * @since Java21
 */
public class ForcedConversion {
    public static void main(String[] args) {
        System.out.println("1.double强制转换为int");
        //自动类型提升
        double doubleValue = 12;
        System.out.println("doubleValue = " + doubleValue);
        //编译错误：从double转换到int可能会有损失
        //int result = doubleValue;
        int intResult = (int) doubleValue;
        System.out.println("intResult = " + intResult);

        System.out.println("2.long强制转换为int");
        long longValue = 12_0000_0000;
        System.out.println("longValue = " + longValue);
        //编译错误：不兼容的类型: 从long转换到int可能会有损失
        //intResult = longValue;
        intResult = (int) longValue;
        System.out.println("intResult = " + intResult);
    }
}
