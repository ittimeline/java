package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 浮点类型使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 7:16
 * @since Java21
 */
public class FloatTypeUsage {
    public static void main(String[] args) {
        //十进制浮点类型字面量的两种表示方法：十进制、科学计数法
        System.out.println("1.浮点数使用科学计数法表示");
        System.out.println("-512E-3 = " + -512E-3);
        System.out.println(".512E-3 = " + .512E-3);
        System.out.println(".512E3 = " + .512E3);

        System.out.println("2.浮点数使用十进制表示-单精度浮点型");
        //十进制单精度浮点类型
        //编译错误：小数字面量3.14默认是double类型，不能直接赋值给float类型的变量
        //因为不兼容类型：从double转换为float可能会有精度损失
        //float floatVar = 3.14;
        //float类型的小数字面量需要加上f或者F后缀
        float floatValue = 3.14f;
        System.out.println("floatValue = " + floatValue);
        System.out.println("2.浮点数使用十进制、科学计数法表示-双精度浮点型");
        // 十进制双精度浮点类型
        double doubleVar = 180.0;
        System.out.println("doubleVar = " + doubleVar);

        double doubleValue = 1.2E2;
        System.out.println("doubleValue = " + doubleValue);

        //可以将float类型的变量或者字面量赋值给double类型的变量
        System.out.println("3.将float类型的变量赋值给double类型的变量");
        float floatResult = 5.0f;
        double doubleResult = floatResult;
        System.out.println("doubleResult = " + doubleResult);
    }
}
