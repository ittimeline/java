package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量内存原理
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/3 17:19
 * @since Java 25
 */
public class VariablePrinciple {
    static void main() {
        //定义整数变量，初始化赋值为100
        int number = 100;
        System.out.println("1.初始化变量后number = " + number);
        //将number存储的值改成200
        number = 200;
        System.out.println("2.修改变量后number = " + number);
    }
}
