package net.ittimeline.java.foundational.operator.ternary;

/**
 * 三元运算符的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/14 13:48
 * @since JDK11
 */
public class TernaryOperator {

    public static void main(String[] args) {

        int left =10;
        int right =20;
        System.out.println("left ="+left);
        System.out.println("right ="+right);
        //   布尔表达式? 结果1:结果2
        int max =left>right?left:right;
        int min =left<right?left:right;
        System.out.println("两个整数的最大值是"+max+"两个整数的最小值"+min);

        min=left>right?right:left;
        System.out.println("另外一种方式求两个整数的最小值"+min);
    }
}
