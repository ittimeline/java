package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环案例4-打印复杂图形
 * 需求：打印复杂图形，效果如下图所示
 * $ # $ # $
 * # $ # $ #
 * $ # $ # $
 * # $ # $ #
 * $ # $ # $
 * 分析方式1：整体来看25个符号中奇数是$ ，偶数是#
 * 实现方式1：
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:43
 * @since Java 25
 */
public class PrintCheckerboardV1 {
    static void main() {
        int count = 0;
        //外层循环控制行数
        for (int i = 1; i <= 5; i++) {
            //内层循环控制列数
            for (int j = 1; j <= 5; j++) {
                count++;
                //偶数是#
                if (count % 2 == 0) {
                    System.out.print("# ");
                }
                //奇数是$
                else {
                    System.out.print("$ ");
                }
            }
            //换行
            System.out.println();
        }
    }
}
