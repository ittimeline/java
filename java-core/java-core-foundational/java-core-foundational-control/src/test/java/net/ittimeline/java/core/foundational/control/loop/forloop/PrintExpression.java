package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 打印指定的表达式
 * 0 + 5  = 5
 * 1 + 4  = 5
 * 2 + 3  = 5
 * 3 + 2  = 5
 * 4 + 1  = 5
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 16:39
 * @since Java21
 */
public class PrintExpression {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //第一个操作数从0开始，依次递增，最大4
            int left = i;
            //第二个操作数从5开始，依次递减，最小是1
            int right = 5 - i;
            //第三个操作数=第一个操作数+第二个参数
            int result = left + right;
            System.out.printf("%d + %d = %d\n", left, right, result);
        }
    }
}
