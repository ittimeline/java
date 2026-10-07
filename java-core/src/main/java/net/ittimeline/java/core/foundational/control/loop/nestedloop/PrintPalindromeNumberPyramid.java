package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环案例14-打印回文数字金字塔
 * <p>
 * 需求：打印回文数字金字塔，效果如下图所示：
 * <pre>
 *          1
 *         121
 *        12321
 *       1234321
 *      123454321
 * </pre>
 * <p>
 * 图形规律：
 * <pre>
 * 行号(i)  空格数   数字个数   数字内容
 *   0        4        1        1
 *   1        3        3        121
 *   2        2        5        12321
 *   3        1        7        1234321
 *   4        0        9        123454321
 * </pre>
 * 公式总结（i 从 0 开始）：
 * <ul>
 *   <li>空格数 = 4 - i</li>
 *   <li>数字总个数 = 2 * i + 1</li>
 *   <li>前半部分数字：从 1 递增到 i + 1</li>
 *   <li>后半部分数字：从 i 递减到 1</li>
 * </ul>
 * <p>
 * 实现步骤：
 * <ol>
 *   <li>外层循环控制行数，i 从 0 到 4，共 5 行。</li>
 *   <li>内层循环①：打印空格，数量为 4 - i。</li>
 *   <li>内层循环②：打印前半部分数字，j 从 1 到 i + 1。</li>
 *   <li>内层循环③：打印后半部分数字，j 从 i 递减到 1。</li>
 *   <li>每行结束后换行。</li>
 * </ol>
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 18:43
 * @since Java 25
 */
public class PrintPalindromeNumberPyramid {
    static void main() {

        //外层循环控制行数
        for (int i = 0; i < 5; i++) {
            //内层循环控制列数
            //①先打印空格：4 - i 个
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }

            //再打印数字
            //②打印前半部分数字：1 到 i+1
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            //③打印后半部分数字：i 到 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //④最后打印换行
            System.out.println();

        }
    }
}
