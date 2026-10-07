package net.ittimeline.java.core.foundational.control.loop.continuestatement;

/**
 * continue语句案例3-逢7过
 * 需求：朋友聚会的时候可能会玩一个游戏：逢7过
 * ● 游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说：过。
 * ● 要求使用程序在控制台打印出1-100之间的满足逢七必过规则的数据，每行显示5个
 * <p>
 * 分析：逢7过就是打印输出遇到包含7或者是7的倍数的数字就忽略
 * ● 包含7：即个位或者十位是7（如 7, 17, 27, 37... 以及 70~79 等））
 * ● 7的倍数：即能被7整除（如 7, 14, 21...）
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:31
 * @since Java 25
 */
public class PassSevenGame {
    static void main() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            //逢7过就是打印输出遇到包含7或者是7的倍数的数字就忽略
            //个位
            int ones = i / 1 % 10;
            //十位
            int tens = i / 10 % 10;
            if (ones == 7 || tens == 7 || i % 7 == 0) {
                continue;
            }
            count++;
            System.out.print(i + " ");
            //每行显示5个
            //count能被5整除
            if (count % 5 == 0) {
                //就换行
                System.out.println();
            }
        }
    }
}
