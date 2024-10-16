package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * float类型精度问题
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 7:19
 * @since Java21
 */
public class FloatTypePrecision {
    public static void main(String[] args) {
        //单精度浮点类型float字面量的精度问题
        System.out.println("1.单精度浮点类型float字面量的精度问题");
        //单精度浮点类型float占据四个字节，可以精确地表示小数点后的最多 6 到 7 位数字
        System.out.println("3.141592f 打印输出结果是 " + 3.141592f);
        System.out.println("3.1415926f 打印输出结果是 " + 3.1415926f);
        System.out.println("2.1234567f 打印输出结果是 " + 2.1234567f);
        System.out.println("2.12345678f 打印输出结果是 " + 2.12345678f);

        //单精度浮点类型float变量的精度问题
        System.out.println("2.单精度浮点类型float变量的精度问题");
        float floatVar = 3.141592f;
        System.out.println("floatVar 打印输出结果是 " + floatVar);
        float floatValue = 3.1415926f;
        System.out.println("floatValue 打印输出结果是 " + floatValue);

        //单精度浮点类型float运算的精度问题
        System.out.println("3.单精度浮点类型float运算的精度问题");
        System.out.println("单精度浮点类型float字面量算术运算 1.0f - 0.9f = " + (1.0f - 0.9f));
        float floatLeft = 1.0f;
        float floatRight = 0.9f;
        float floatResult = floatLeft - floatRight;
        System.out.println("单精度浮点类型float变量算术运算 1.0f - 0.9f = " + floatResult);

    }
}
