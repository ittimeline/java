package net.ittimeline.java.core.foundational.operator.ternary;

/**
 * 三元运算符使用注意事项1
 * 三元运算的结果必须是要被使用，例如打印输出或者赋值，否则会编译错误
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 13:32
 * @since Java21
 */
public class TernaryOperatorWarning1 {
    public static void main(String[] args) {
        int age = 19;
        //使用变量保存三元运算的结果并打印输出
        String result = (age >= 18) ? "你成年了" : "你未成年";
        System.out.println(result);
    }
}
