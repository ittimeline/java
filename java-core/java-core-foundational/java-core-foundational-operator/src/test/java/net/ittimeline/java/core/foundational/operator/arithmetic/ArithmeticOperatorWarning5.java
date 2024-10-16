package net.ittimeline.java.core.foundational.operator.arithmetic;

/**
 * 算术运算符使用注意事项5
 * 除法运算时除数不能是0，否则会发生ArithmeticException算术异常
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 9:51
 * @since Java21
 */
public class ArithmeticOperatorWarning5 {
    public static void main(String[] args) {
        int left = 20;
        int right = 0;
        int result = left / right;
        System.out.println("result = " + result);
    }
}
