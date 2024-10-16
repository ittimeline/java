package net.ittimeline.java.core.foundational.operator.assignment;

/**
 * 赋值运算符使用注意事项1
 * 赋值运算符的运算顺序是从右往左
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 21:09
 * @since Java21
 */
public class AssignmentOperatorWarning1 {
    public static void main(String[] args) {
        //赋值运算符的运算顺序是从右往左
        int left, middle, right;
        left = middle = right = 100;
        System.out.println("left = " + left);
        System.out.println("middle = " + middle);
        System.out.println("right = " + right);
    }
}
