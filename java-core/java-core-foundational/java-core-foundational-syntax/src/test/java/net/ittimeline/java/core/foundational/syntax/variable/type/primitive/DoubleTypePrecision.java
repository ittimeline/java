package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * double类型精度问题
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 7:21
 * @since Java21
 */
public class DoubleTypePrecision {
    public static void main(String[] args) {
        //双精度浮点类型double字面量的精度问题
        System.out.println("1.双精度浮点类型double字面量的精度问题");
        //双精度浮点类型double占据8个字节，可以精确地表示小数点后的15位有效数字
        System.out.println("3.14159_26535_89793 打印输出结果是" + 3.14159_26535_89793);
        //小数字面量3.14159265358979323846是双精度浮点类型double，由于double只能表示小数点后15位有效数字
        //因此输出结果是3.141592653589793
        System.out.println("3.14159_26535_89793_2 打印输出结果是" + 3.14159_26535_89793_2);

        //双精度浮点类型double变量的精度问题
        System.out.println("2.双精度浮点类型double变量的精度问题");
        double doubleVar = 3.141592653589793;
        System.out.println("双精度浮点类型double变量 doubleVar = " + doubleVar);
        double doubleValue = 3.14159_26535_89793_2;
        System.out.println("双精度浮点类型double变量 doubleValue = " + doubleValue);

        double doubleSource = 23.14159_26535_89793;
        System.out.println("双精度浮点类型double变量doubleSource = " + doubleSource);
        double doubleTarget = 123.14159_26535_89793;
        System.out.println("双精度浮点类型double变量doubleTarget = " + doubleTarget);

        //双精度浮点类型double运算的精度问题
        System.out.println("3.双精度浮点类型double运算的精度问题");
        System.out.println("双精度浮点类型double字面量算术运算 1.0 - 0.9 = " + (1.0 - 0.9));

        double doubleLeft = 1.0;
        double doubleRight = 0.9;
        double doubleResult = doubleLeft - doubleRight;
        //双精度浮点类型double变量算术运算运算结果是近似值，不精确
        System.out.println("双精度浮点类型double变量算术运算  1.0 - 0.9 = " + doubleResult);
    }
}
