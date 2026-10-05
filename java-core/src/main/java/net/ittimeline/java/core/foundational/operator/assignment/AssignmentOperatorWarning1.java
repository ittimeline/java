package net.ittimeline.java.core.foundational.operator.assignment;

/**
 * 赋值运算符使用注意事项1
 * 赋值运算符是右结合的，即先计算右边的表达式，再赋给左边
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 15:13
 * @since Java 25
 */
public class AssignmentOperatorWarning1 {
    static void main() {
        //赋值运算符是右结合的，即先计算右边的表达式，再赋给左边
        int left, middle, right;
        //right = 100;
        //middle = right;    此时 right 的值是 100
        //left = middle;     此时 middle 的值是 100
        left = middle = right = 100;
        System.out.println("left = " + left);
        System.out.println("middle = " + middle);
        System.out.println("right = " + right);
    }

}
