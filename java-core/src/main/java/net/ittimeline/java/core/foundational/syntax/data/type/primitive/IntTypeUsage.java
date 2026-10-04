package net.ittimeline.java.core.foundational.syntax.data.type.primitive;

/**
 * 四种整数类型使用
 * 关于Java基本数据类型中的整数类型
 * 1. 整数类型包含4个：byte、short、int、long
 * 2. 如果极大的整数超过long，可以使用JDK中内置的类：java.math.BigInteger（引用类型）
 * 3. 整数字面量默认是int类型，如果需要将整数字面量当作long类型，需要将整数字面量加L
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 9:30
 * @since Java 25
 */
public class IntTypeUsage {
    static void main() {
        /********************************1.byte类型变量定义与使用********************************/
        System.out.println("1.byte类型变量定义与使用");
        //整数字面量12是int类型，但是在byte的取值范围内，因此赋值成功
        byte byteSmall = 12;
        System.out.println("byteSmall = " + byteSmall);

        //整数字面量128是int类型，但是不在byte的取值范围内，因此赋值失败
        //java: 不兼容的类型: 从int转换到byte可能会有损失
        //byte byteBig = 128;
        /********************************2.short类型变量定义与使用********************************/
        System.out.println("2.short类型变量定义与使用");

        //整数字面量12000是int类型，但是在short的取值范围内，因此赋值成功
        short shortSmall = 12000;
        System.out.println("shortSmall = " + shortSmall);

        //整数字面量32768是int类型，但是不在short的取值范围内，因此赋值失败
        //short shortBig=32768;

        /********************************3.int类型变量定义与使用********************************/
        System.out.println("3.int类型变量定义与使用");

        //整数字面量1200000000是int类型，但是在int的取值范围内，因此赋值成功
        int intSmall = 2147483647;
        System.out.println("intSmall = " + intSmall);

        //整数字面量2147483648是int类型，但是不在int的取值范围内，因此赋值失败
        //java: 整数太大
        //int intBig = 2147483648;

        /********************************4.long类型变量定义与使用********************************/
        System.out.println("4.long类型变量定义与使用");
        //整数字面量2147483648L是long类型，但是在long的取值范围内，因此赋值成功
        long longSmall = 2147483648L;
        System.out.println("longSmall = " + longSmall);

        //整数字面量2147483648000000000000LL是long类型，但是不在long的取值范围内，因此赋值失败
        //java: 整数太大
        //long longBig = 2147483648000000000000L;

    }
}
