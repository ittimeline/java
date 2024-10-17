package net.ittimeline.java.core.foundational.control;

/**
 * 使用Math类生成随机数
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 6:49
 * @see Math#random()
 * @since Java21
 */
public class MathGeneratorRandomTest {
    public static void main(String[] args) {
        //1. 获取指定范围的随机数
        //[ 或者 ]表示包含
        //( 或者 )表示不包含
        System.out.println("生成[0.0,1.0)的随机小数：" + Math.random());

        System.out.println("生成[0.0,6.0)的随机小数：" + Math.random() * 6);
        System.out.println("生成[0,5])的随机整数：" + (int) (Math.random() * 6));
        System.out.println("生成[1,6])的随机整数：" + ((int) (Math.random() * 6) + 1));

        //获取指定范围[a,b]随机数公式：(int)(Math.random() * (b - a + 1 ) ) + a
        //产生[200,500]之间的随机整数
        System.out.println("产生200-500之间的随机整数：" + ((int) (Math.random() * (500 - 200 + 1)) + 200));
    }
}
