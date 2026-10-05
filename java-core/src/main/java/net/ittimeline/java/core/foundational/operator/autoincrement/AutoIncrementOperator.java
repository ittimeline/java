package net.ittimeline.java.core.foundational.operator.autoincrement;

/**
 * 自增运算符使用
 * 自增运算符的运算符有：++、--
 * 自增运算符的运算结果是int类型
 * 自增运算符的运算符有前置和后置之分
 * 前置自增：++number
 * 后置自增：number++
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:33
 * @since Java 25
 */
public class AutoIncrementOperator {
    static void main() {
        int number = 10;
        System.out.println("1.初始化赋值 number = " + number);
        ++number;
        System.out.println("2.前置++ 自增1后number = " + number);
        number++;
        System.out.println("3.后置++ 自增1后number = " + number);
    }
}
