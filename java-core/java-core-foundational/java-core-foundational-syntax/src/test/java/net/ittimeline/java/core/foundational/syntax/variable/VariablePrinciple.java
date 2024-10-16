package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量内存原理
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 6:24
 * @since Java21
 */
public class VariablePrinciple {
    public static void main(String[] args) {
        //定义整数变量，初始化赋值为100
        int number = 100;
        System.out.println("1. 初始化变量后 number = " + number);
        //将number存储的值修改成200
        number = 200;
        System.out.println("2. 修改变量后 number = " + number);
    }
}
