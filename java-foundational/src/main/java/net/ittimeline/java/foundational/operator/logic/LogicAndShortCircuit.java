package net.ittimeline.java.foundational.operator.logic;

/**
 * 短路与
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/14 11:05
 * @since JDK11
 */
public class LogicAndShortCircuit {
    public static void main(String[] args) {

        int left =10;
        int right =20;
        // 短路与 运算规则: &&左右两边只要有一个false,那么运算结果就是false
        boolean flag = left++ >10 && right-- <20;
        System.out.println("left ="+left);
        System.out.println("right ="+right);
        System.out.println("flag ="+flag);

    }
}
