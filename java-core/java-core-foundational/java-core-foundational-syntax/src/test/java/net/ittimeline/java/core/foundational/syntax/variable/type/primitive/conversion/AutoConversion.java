package net.ittimeline.java.core.foundational.syntax.variable.type.primitive.conversion;

/**
 * 基本数据类型自动类型转换使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 21:43
 * @since Java21
 */
public class AutoConversion {
    public static void main(String[] args) {
        //整数类型字面量100默认是int类型，但是在byte的取值范围（-128~127）之内，因此可以赋值给byte类型的变量
        byte byteVar = 100;

        System.out.println("1.byte自动提升为short");
        //byte类型的变量
        short shortResult = byteVar;
        System.out.println("shortResult = " + shortResult);

        System.out.println("2.short自动提升为int");
        //整数类型字面量10000默认是int类型，但是在short的取值范围（-32768~32767）之内，因此可以赋值给short类型的变量
        short shortVar = 10000;
        int intResult = shortVar;
        System.out.println("intResult = " + intResult);

        System.out.println("2.char自动提升为int");
        char charVar = 'a';
        intResult = charVar;
        System.out.println("intResult = " + intResult);

        System.out.println("3.int自动提升为long");
        //10_0000_0000是int类型字面量
        int intVar = 10_0000_0000;
        long longResult = intVar;
        System.out.println("longResult = " + longResult);

        System.out.println("4.long自动提升为float");
        //100_0000_0000L是long类型字面量
        long longVar = 100_0000_0000L;
        float floatResult = longVar;
        System.out.println("floatResult = " + floatResult);

        System.out.println("5.float自动提升为double");
        //100e8就是100*10^8，也就是100 0000 0000
        float floatVar = 100e8f;
        double doubleResult = floatVar;
        //1.0E10 就是1.0*10^10
        System.out.println("doubleResult = " + doubleResult);
    }
}
