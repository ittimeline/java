package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环案例4-打印复杂图形
 * 需求：打印复杂图形，效果如下图所示
 * $ # $ # $
 * # $ # $ #
 * $ # $ # $
 * # $ # $ #
 * $ # $ # $
 * 分析方式2：找每行和每列的规律
 * ● 奇数行$ # $ # $ 每个奇数列是$ 每个偶数列数#
 * ● 偶数行 # $ # $ # 每个奇数列是# 每个偶数列数$
 * 实现方式2：
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:44
 * @since Java 25
 */
public class PrintCheckerboardV2 {
    static void main() {
        //外层循环控制行数
        for (int i = 1; i <= 5; i++) {
            //内层循环控制列数
            for (int j = 1; j <= 5; j++) {
                //奇数行 * # * # * 每个奇数列是* 每个偶数列数#
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print("$ ");
                    } else {
                        System.out.print("# ");
                    }
                }
                //偶数行 # * # * # 每个奇数列是# 每个偶数列数*
                else {
                    if (j % 2 != 0) {
                        System.out.print("# ");
                    } else {
                        System.out.print("$ ");
                    }
                }
            }
            System.out.println();
        }
    }
}
