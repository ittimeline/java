package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环案例13-打印沙漏形状
 * <p>
 * 需求：打印沙漏形状，效果如下图所示：
 * <pre>
 *  *********
 *   *******
 *    *****
 *     ***
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 * </pre>
 * <p>
 * 图形规律（总行数 9，中间行第 5 行）：
 * <pre>
 * 上半部分（含中间行）
 * 行号(i)  空格数   星号数   说明
 *   0        0        9      第一行
 *   1        1        7
 *   2        2        5
 *   3        3        3
 *   4        4        1      中间行
 *
 * 下半部分
 * 行号(i)  空格数   星号数   说明
 *   0        3        3      下半部分第一行
 *   1        2        5
 *   2        1        7
 *   3        0        9      最后一行
 * </pre>
 * 公式总结：
 * <ul>
 *   <li><b>上半部分</b>（i 从 0 到 4）：空格数 = i，星号数 = 9 - 2 * i</li>
 *   <li><b>下半部分</b>（i 从 0 到 3）：空格数 = 3 - i，星号数 = 2 * i + 3</li>
 *   <li><b>统一公式</b>（总行数 rows = 9，中间行 mid = 4）：<br>
 *       对于任意行 i（0~8），距离 d = |i - mid|，空格数 = d，星号数 = 9 - 2 * d</li>
 * </ul>
 * 实现步骤（拆分上下部分）：
 * <ol>
 *   <li>上半部分：外层循环 i 从 0 到 4，共 5 行。
 *     <ul>
 *       <li>内层循环①：打印空格，数量为 i。</li>
 *       <li>内层循环②：打印星号，数量为 9 - 2 * i。</li>
 *       <li>换行。</li>
 *     </ul>
 *   </li>
 *   <li>下半部分：外层循环 i 从 0 到 3，共 4 行。
 *     <ul>
 *       <li>内层循环①：打印空格，数量为 3 - i。</li>
 *       <li>内层循环②：打印星号，数量为 2 * i + 3。</li>
 *       <li>换行。</li>
 *     </ul>
 *   </li>
 * </ol>
 * <p>
 * 扩展：若想打印任意奇数行沙漏，可将总行数设为变量 {@code rows}，中间行索引 {@code mid = rows / 2}，
 * 然后使用统一公式：空格数 = |i - mid|，星号数 = rows - 2 * |i - mid|。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/8 20:00
 * @since Java 25
 */
public class PrintHourglass {
    static void main() {
        //上半部分

        //外层循环控制行数
        //上半部分5行
        for (int i = 0; i < 5; i++) {
            //内层循环控制列数

            //先打印空格
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //再打印*
            for (int j = 0; j < 9 - 2 * i; j++) {
                System.out.print("*");
            }
            //最后换行
            System.out.println();
        }


        //下半部分
        //外层循环控制行数
        for (int i = 0; i < 4; i++) {
            //内层循环控制列数

            //先打印空格
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }

            //再打印星号
            for (int j = 0; j < 2 * i + 3; j++) {
                System.out.print("*");
            }

            //最后换行
            System.out.println();
        }

    }
}