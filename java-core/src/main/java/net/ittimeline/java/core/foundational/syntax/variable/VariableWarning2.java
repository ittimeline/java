package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量使用注意事项2：同一个作用域范围内的变量不能重复定义，例如main方法中不能定义同名的变量
 * 作用域：理解成一对{}
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/3 17:16
 * @since Java 25
 */
public class VariableWarning2 {
    static void main() {
        int number = 20;
        //java: 已在方法 main()中定义了变量 number
        //int number = 200;
    }
}
