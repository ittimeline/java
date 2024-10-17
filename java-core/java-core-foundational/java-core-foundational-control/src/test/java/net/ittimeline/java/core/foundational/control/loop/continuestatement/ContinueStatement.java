package net.ittimeline.java.core.foundational.control.loop.continuestatement;

/**
 * continue语句使用
 * 需求：打印1到10，遇到4不打印
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 20:20
 * @since Java21
 */
public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                //结束本次循环，继续下一次循环
                continue;
            }
            System.out.println(i);
        }
    }
}
