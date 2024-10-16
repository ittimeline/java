package net.ittimeline.java.core.foundational.operator.relation;

/**
 * 关系运算符使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 13:22
 * @since Java21
 */
public class RelationOperator {
    public static void main(String[] args) {
        System.out.println("6种关系运算符比较两个整数变量");
        int left = 10;
        int right = 20;
        //关系运算的结果是boolean类型，也就是要么是true，要么是false
        boolean result = left > right;
        System.out.printf("%d > %d 的结果是%b\n", left, right, result);
        result = left > right;
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
