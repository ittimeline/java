package net.ittimeline.java.core.foundational.operator.ternary;

/**
 * 三元运算符使用注意事项2
 * 如果三元表达式运算后的结果赋值给新的变量，要求表达式 1 和表达式 2 为同种或兼容的数据类型
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 14:32
 * @since Java21
 */
public class TernaryOperatorWarning2 {
    public static void main(String[] args) {
        //表达式1是double类型，表达式2是int类类型,接收结果的类型必须是double
        //因为只有double兼容int
        double doubleResult = 2 > 1 ? 2.0 : 1;
        System.out.println("doubleResult = " + doubleResult);

        //如果使用int接收三元表达式的运算结果
        //则会编译错误，不兼容的类型: 从double转换到int可能会有损失
        int intResult = 2 > 1 ? (int) 2.0 : 1;
        System.out.println("intResult = " + intResult);
    }
}
