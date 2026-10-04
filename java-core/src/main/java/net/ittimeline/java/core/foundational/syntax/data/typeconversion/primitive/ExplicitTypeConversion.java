package net.ittimeline.java.core.foundational.syntax.data.typeconversion.primitive;

/**
 * 强制类型转换使用
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 13:57
 * @since Java 25
 */
public class ExplicitTypeConversion {
    static void main() {
        System.out.println("1.double强制转换为int");
        //自动类型提升
        double doubleVar = 12;
        System.out.println("doubleVar = " + doubleVar);
        //java: 不兼容的类型: 从double转换到int可能会有损失
        //int intVar = doubleVar;
        int intResult = (int) doubleVar;
        System.out.println("intResult = " + intResult);

        System.out.println("2.long强制转换为int");
        long longVar = 1200000000;
        //java: 不兼容的类型: 从long转换到int可能会有损失
        //intResult = longVar;
        intResult = (int) longVar;
        System.out.println("intResult = " + intResult);
    }
}
