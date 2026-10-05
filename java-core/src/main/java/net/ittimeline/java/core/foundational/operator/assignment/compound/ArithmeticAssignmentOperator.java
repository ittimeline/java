package net.ittimeline.java.core.foundational.operator.assignment.compound;

/**
 * 算术复合赋值运算符使用
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 15:16
 * @since Java 25
 */
public class ArithmeticAssignmentOperator {
    static void main() {
        // 1. 算术复合赋值
        int a = 10;
        // a = a + 5
        a += 5;
        System.out.println("a += 5  => " + a);   // 15

        int b = 20;
        // b = b - 3
        b -= 3;
        System.out.println("b -= 3  => " + b);   // 17

        int c = 7;
        // c = c * 2
        c *= 2;
        System.out.println("c *= 2  => " + c);   // 14

        int d = 20;
        // d = d / 3 (整数除法)
        d /= 3;
        System.out.println("d /= 3  => " + d);   // 6

        int e = 17;
        // e = e % 5
        e %= 5;
        System.out.println("e %= 5  => " + e);   // 2

        // 2. 字符串连接（+= 也可用于字符串）
        String str = "Hello";
        //str =str +" World"
        str += " World";            // 字符串连接
        System.out.println("str += \" World\" => " + str); // Hello World
    }

}
