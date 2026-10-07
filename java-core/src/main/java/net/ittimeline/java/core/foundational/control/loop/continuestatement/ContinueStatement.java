package net.ittimeline.java.core.foundational.control.loop.continuestatement;

/**
 * continue语句使用
 * 需求：打印1到10，遇到4不打印
 * 分析：循环条件是1到10，遇到4就忽略本次循环
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:30
 * @since Java 25
 */
public class ContinueStatement {
    static void main() {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                //忽略本次循环
                //结束本次循环，继续下一次循环
                continue;
            }
            System.out.println(i);
        }
    }
}
