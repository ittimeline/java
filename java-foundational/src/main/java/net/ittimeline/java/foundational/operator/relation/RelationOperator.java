package net.ittimeline.java.foundational.operator.relation;

/**
 * 关系运算符
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/13 20:29
 * @since JDK11
 */
public class RelationOperator {

    public static void main(String[] args) {
        // 关系运算符的结果类型是布尔类型，要么是true，要么是false

        //大于和小于
        System.out.println("10 > 20 = "+(10 > 20));
        System.out.println("10 < 20 = "+(10 < 20));

        // 等于和不等于
        System.out.println("10 == 10 = "+(10 == 10));
        System.out.println("10 != 10 = "+(10 != 10));

        // 大于或等于 和小于或等于
        System.out.println("10 <= 20 = "+(10 <= 20));
        System.out.println("10 >= 10 = "+(10 >= 10));


    }
}
