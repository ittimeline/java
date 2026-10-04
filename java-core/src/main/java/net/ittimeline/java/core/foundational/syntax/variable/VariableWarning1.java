package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量使用注意事项1：变量在使用前必须要定义，也就是必须要声明和赋值
 * 方法体中的代码有序执行：遵循自上而下的顺序执行
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/3 17:16
 * @since Java 25
 */
public class VariableWarning1 {
    static void main() {
        //java: 找不到符号
        //System.out.println("age = " + age);
        int number;
        //java: 可能尚未初始化变量number
        //System.out.println("number = " + number);
    }
}
