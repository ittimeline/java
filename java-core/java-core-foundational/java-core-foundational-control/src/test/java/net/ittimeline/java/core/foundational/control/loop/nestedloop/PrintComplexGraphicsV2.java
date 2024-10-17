package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 打印复杂图形
 * 需求：打印复杂图形，效果如下图所示
 * # * # *
 * # * # * #
 * # * # *
 * # * # * #
 * # * # *
 * 分析：找每行和每列的规律
 * ● 奇数行 * # * # * 每个奇数列是* 每个偶数列数#
 * ● 偶数行 # * # * # 每个奇数列是# 每个偶数列数*
 * 实现方式2
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 21:39
 * @since Java21
 */
public class PrintComplexGraphicsV2 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                //奇数行 * # * # * 每个奇数列是* 每个偶数列数#
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("# ");
                    }
                }
                //偶数行 # * # * # 每个奇数列是# 每个偶数列数*
                else {
                    if (j % 2 != 0) {
                        System.out.print("# ");
                    } else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}
