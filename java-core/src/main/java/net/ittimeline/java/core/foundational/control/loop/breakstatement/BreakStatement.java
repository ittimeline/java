package net.ittimeline.java.core.foundational.control.loop.breakstatement;

/**
 * break语句使用
 * 需求：打印1到10，但是打印到4时结束
 * 分析：打印到4时结束循环
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:23
 * @since Java 25
 */
public class BreakStatement {
    static void main() {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                //结束当前for循环
                break;
            }
            System.out.println(i);
        }
        System.out.println("程序遇到了break语句，结束了for循环");
    }
}
