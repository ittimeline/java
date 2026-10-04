package net.ittimeline.java.core.foundational.syntax.data.type.primitive;

/**
 * 浮点类型使用
 * 十进制浮点类型字面量的两种表示方法：十进制和科学计数法
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 10:20
 * @since Java 25
 */
public class FloatTypeUsage {
    static void main() {
        /********************************1.浮点数使用科学计数法表示********************************/
        System.out.println("1.浮点数使用科学计数法表示");
        //1.2E2 等价于 1.2 * 10 ^ 2
        System.out.println("1.2E2 -->" + 1.2E2);

        //3.141592653589793 等价于3141592653589793E-15
        System.out.println("3141592653589793E-15 -->" + (3141592653589793E-15));

        double doubleValue = 512E-2;
        System.out.println("doubleValue = " + doubleValue);

        /********************************2.浮点数使用十进制表示********************************/
        System.out.println("2.浮点数使用十进制表示");
        //浮点类型字面量3.14默认是double类型，double类型的字面量不能赋值给float类型的变量floatVar1
        //java: 不兼容的类型: 从double转换到float可能会有损失
        //float floatVar1 = 3.14;
        //浮点类型的字面量默认是double类型，如果需要使用float类型的字面量，需要在float类型字面量结尾添加F或者f后缀
        float floatVar2 = 3.14f;
        System.out.println("floatVar2 = " + floatVar2);

        double doubleVar = 180.0;
        System.out.println("doubleVar = " + doubleVar);

        //可以将float类型的字面量赋值给double类型的变量，但是不能将double类型的字面量赋值给float类型的变量，因为可能会有精度损失。
        float floatResult = 5.0f;
        double doubleResult = floatResult;
        System.out.println("doubleResult = " + doubleResult);
    }
}
