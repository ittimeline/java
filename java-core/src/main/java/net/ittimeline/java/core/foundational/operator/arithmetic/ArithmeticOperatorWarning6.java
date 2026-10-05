package net.ittimeline.java.core.foundational.operator.arithmetic;

/**
 * 算术运算符使用注意事项6
 * 除法运算：被除数/除数，如果是小数，那么除数为0，结果是无穷（Infinity）
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:26
 * @since Java 25
 */
public class ArithmeticOperatorWarning6 {
    static void main() {
        double left = 8.0;
        double right = 0.0;
        double result = left / right;
        System.out.println("result = " + result);
    }
}
