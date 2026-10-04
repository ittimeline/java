package net.ittimeline.java.core.foundational.syntax.data.typeconversion.primitive;

/**
 * 自动类型转换使用
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 13:54
 * @since Java 25
 */
public class ImplicitTypeConversion {
    static void main() {
        System.out.println("1.byte自动提升为short");
        //整数字面量100默认是int类型，但是在byte的取值范围内（-128 ~ 127），因此可以赋值给byte类型变量
        byte byteVar = 100;
        short shortResult = byteVar;
        System.out.println("shortResult = " + shortResult);

        System.out.println("2.short自动提升为int");
        //整数字面量12000默认是int，但是在short的取值范围内（-32768 ~ 32767），因此可以赋值给short类型变量
        short shortVar = 12000;
        int intResult = shortVar;
        System.out.println("intResult = " + intResult);

        System.out.println("3.char自动提升为int");
        char charVar = 'a';
        intResult = charVar;
        System.out.println("intResult = " + intResult);

        System.out.println("4.int提升为long");
        int intVar = 1000000000;
        long longResult = intVar;
        System.out.println("longResult = " + longResult);

        System.out.println("5.long提升为float");
        long longVar = 1234567890;
        float floatResult = longVar;
        System.out.println("floatResult = " + floatResult);


        //6.float提升为double
        System.out.println("6.float提升为double");
        float floatVar = 1.0e8f;
        double doubleResult = floatVar;
        System.out.println("doubleResult = " + doubleResult);
    }
}
