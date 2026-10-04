package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量使用注意事项3：变量只能在定义的作用域范围内使用
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/3 17:17
 * @since Java 25
 */
public class VariableWarning3 {
    static void main() {
        //局部代码块
        {
            //定义变量
            int age = 19;
            //使用变量
            System.out.println("age = " + age);
        }
        //超过age所在的作用域范围
        //age只能在局部代码块内使用
        //java: 找不到符号
        //System.out.println("age = " + age);
    }
}
