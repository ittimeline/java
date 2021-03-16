package net.ittimeline.java.foundational.operator.logic;

/**
 * 短路或的短路特性
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/14 11:09
 * @since JDK11
 */
public class LogicOrShortCircuit {

    public static void main(String[] args) {
        int left =10;
        int right =20;
        // 短路或 运算规则: ||左右两边只要有一个true,那么运算结果就是true
        boolean flag = ++left >10 || right-- <20;
        System.out.println("left ="+left);
        System.out.println("right ="+right);
        System.out.println("flag ="+flag);
    }
}
