package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量使用注意事项3
 * 变量只能在定义的作用域范围内使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 6:19
 * @since Java21
 */
public class VariableWarning3 {
    public static void main(String[] args) {
        //局部代码块
        {
            int age = 18;
            //局部代码块内部使用变量age
            System.out.println(age);
        }
        //超过了age所在的作用于范围，age只能在局部代码内部使用
        //System.out.println(age);
    }
}
