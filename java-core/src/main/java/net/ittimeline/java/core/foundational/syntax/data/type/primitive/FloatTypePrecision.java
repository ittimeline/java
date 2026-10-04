package net.ittimeline.java.core.foundational.syntax.data.type.primitive;

/**
 * 单精度浮点类型float精度问题
 * float类型字面量精度问题
 * float类型变量精度问题
 * float类型字面量、变量算术运算精度问题
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 10:21
 * @since Java 25
 */
public class FloatTypePrecision {
    static void main() {
        //单精度浮点类型float字面量的精度问题
        //float类型的精度为6~7位十进制有效数字（从第一个非0数字开始计算，包含整数部分和小数部分，末尾的0是有效数字
        System.out.println("1.单精度浮点类型float字面量的精度问题");
        System.out.println("float类型字面量 2.1234567f 打印输出结果是 " + 2.1234567f);
        System.out.println("float类型字面量 2.12345678f 打印输出结果是 " + 2.12345678f);

        //单精度浮点类型float变量的精度问题
        System.out.println("2.单精度浮点类型float变量的精度问题");
        float floatVar1 = 2.1234567f;
        System.out.println("float类型变量 floatVar1  打印输出结果是 " + floatVar1);
        float floatVar2 = 2.12345678f;
        System.out.println("float类型变量 floatVar2  打印输出结果是 " + floatVar2);

        //单精度浮点类型float运算的精度问题
        System.out.println("3.单精度浮点类型float运算的精度问题");
        //单精度浮点类型float字面量算术运算
        System.out.println("float类型字面量 算术运算 1.0f -0.9f  运算结果是 " + (1.0f - 0.9f));
        //单精度浮点类型float变量算术运算
        float left = 1.0f;
        float right = 0.9f;
        //计算 left -right的结果赋值给floatResult
        float floatResult = left - right;
        System.out.println("float类型变量 算术运算 1.0f -0.9f  运算结果是 " + floatResult);


    }
}
