package net.ittimeline.java.core.foundational.operator.arithmetic;

/**
 * 算术运算符使用注意事项4
 * 只要有小数参与算术运算，那么运算的结果可能是不精确的
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:26
 * @since Java 25
 */
public class ArithmeticOperatorWarning4 {
    static void main() {
        //①计算结果精确
        System.out.println("操作数是浮点类型字面量：1.1 + 1.1 = " + (1.1 + 1.1));
        //②计算结果不精确
        System.out.println("操作数是浮点类型字面量：1.1 + 1.01 = " + (1.1 + 1.01));
        System.out.println("操作数是浮点类型字面量：1.1 - 1.01 = " + (1.1 - 1.01));
        System.out.println("操作数是浮点类型字面量：2.0 - 1.1 = " + (2.0 - 1.1));
        double left = 2.0;
        double right = 1.1;
        double result = left - right;
        System.out.println("操作数是浮点类型变量：2.0 - 1.1 = " + result);
    }
}
