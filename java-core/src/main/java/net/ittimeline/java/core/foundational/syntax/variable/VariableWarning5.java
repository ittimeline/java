package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量使用注意事项5：一条语句可以定义多个数据类型相同的变量，但是不推荐使用 ，
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/3 17:18
 * @since Java 25
 */
public class VariableWarning5 {
    static void main() {
        int left = 10, middle = 20, right = 30;
        System.out.println("left = " + left);
        System.out.println("middle = " + middle);
        System.out.println("right = " + right);
    }
}
