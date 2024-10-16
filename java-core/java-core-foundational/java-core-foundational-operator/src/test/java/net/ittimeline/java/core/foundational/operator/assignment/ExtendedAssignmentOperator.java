package net.ittimeline.java.core.foundational.operator.assignment;

/**
 * 扩展赋值运算符基本使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 21:05
 * @since Java21
 */
public class ExtendedAssignmentOperator {
    public static void main(String[] args) {
        System.out.println("******************一.赋值运算符和算术运算符结合使用******************");
        int number = 100;
        System.out.println("1.number = " + number);
        number += 10;
        System.out.println("2.number += 10  number = " + number);
        number -= 20;
        System.out.println("3.number -= 20  number = " + number);
        number *= 5;
        System.out.println("4.number *= 5  number = " + number);
        number /= 3;
        System.out.println("5.number /= 3  number = " + number);
        number %= 150;
        System.out.println("6.number %= 150  number = " + number);
        System.out.println("******************二.赋值运算符和位运算符结合使用******************");
        int left = 10;
        int right = 8;
        System.out.println("1.left = " + left + " right = " + right);
        left &= right;
        System.out.println("2.left &= right  left = " + left + " right = " + right);
        left |= right;
        System.out.println("3.left |= right  left = " + left + " right = " + right);
        left ^= right;
        System.out.println("4.left ^= right  left = " + left + " right = " + right);
        right <<= 2;
        System.out.println("5.right <<= 2  left = " + left + " right = " + right);
        right >>= 2;
        System.out.println("6.right <<= 2  left = " + left + " right = " + right);
        right >>>= 3;
        System.out.println("7.right >>>= 3  left = " + left + " right = " + right);
    }
}
