package net.ittimeline.java.core.foundational.operator.assignment.compound;

/**
 * 扩展赋值运算符使用注意事项2
 * 扩展赋值运算符的优先级非常低，仅高于逗号运算符，因此右边的表达式总是先被完整计算。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 15:18
 * @since Java 25
 */
public class ArithmeticAssignmentOperatorWarning2 {
    static void main() {
        int value = 10;
        //先算 3 + 5 = 8
        //再算 value = value * 8 = 10 * 8 = 80
        value *= 3 + 5;
        System.out.println("value = " + value);
    }
}
