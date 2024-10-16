package net.ittimeline.java.core.foundational.operator.autoincrement;

/**
 * 自减运算符使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 11:11
 * @since Java21
 */
public class AutoDecrementOperator {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("1.初始化赋值 number = " + number);
        --number;
        System.out.println("2.前置-- 自减1后number = " + number);
        number--;
        System.out.println("3.后置-- 自减1后number = " + number);
    }
}
