package net.ittimeline.java.core.foundational.operator.relation;

/**
 * 关系运算符使用
 * 关系运算符的运算符有：>、>=、<、<=、==、!=
 * 关系运算符的运算结果是boolean类型，也就是要么是true，要么是false
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:37
 * @since Java 25
 */
public class RelationOperator {
    static void main() {
        System.out.println("6种关系运算符比较两个整数变量");
        int left = 10;
        int right = 20;
        //关系运算的结果是boolean类型，也就是要么是true，要么是false
        boolean result = left > right;
        //第一个%d会被left的值替换
        //第二个%d会被right的值替换
        //%b会被result的值替换
        System.out.printf("%d > %d 的结果是%b\n", left, right, result);
        result = left >= right;
        System.out.printf("%d >= %d 的结果是%b\n", left, right, result);

        result = left < right;
        System.out.printf("%d < %d 的结果是%b\n", left, right, result);

        result = left <= right;
        System.out.printf("%d <= %d 的结果是%b\n", left, right, result);

        result = left == right;
        System.out.printf("%d == %d 的结果是%b\n", left, right, result);

        result = left != right;
        System.out.printf("%d != %d 的结果是%b\n", left, right, result);
    }
}
