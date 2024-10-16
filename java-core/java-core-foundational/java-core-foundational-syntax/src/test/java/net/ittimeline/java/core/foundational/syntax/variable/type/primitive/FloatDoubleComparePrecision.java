package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * float和double精度对比
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 7:23
 * @since Java21
 */
public class FloatDoubleComparePrecision {
    public static void main(String[] args) {
        //分别使用float类型和double类型两种浮点类型变量存储圆周率
        //float类型变量floatVar存储圆周率，期望小数点后保留15位小数，实际保留7位小数
        float floatVar = 3.141592653589793f;
        //double类型变量doubleVar存储圆周率，期望小数点后保留20位，双击保留15位小数
        double doubleVar = 3.14159265358979323846;
        //float和double都是近似值，但是double比float精度更高
        //3.141592653589793f 输出结果是 3.1415927
        //3.14159265358979323846 输出结果是 3.141592653589793
        System.out.println("3.141592653589793f 输出结果是 " + floatVar);
        System.out.println("3.14159265358979323846 输出结果是 " + doubleVar);
    }
}
