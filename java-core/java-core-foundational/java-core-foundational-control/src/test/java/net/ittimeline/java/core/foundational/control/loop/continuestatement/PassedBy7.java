package net.ittimeline.java.core.foundational.control.loop.continuestatement;

/**
 * 逢7过
 * 需求：朋友聚会的时候可能会玩一个游戏：逢7过
 * 游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说：过
 * 需求：使用程序在控制台打印出1-100之间的满足逢七必过规则的数据，每行显示5个
 * 分析：
 * 包含7：即个位或者十位是7
 * 7的倍数：即能被7整除
 * 逢7过就是打印输出遇到包含7或者是7的倍数的数字就忽略
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 21:03
 * @since Java21
 */
public class PassedBy7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            //个位
            int unit = i % 10;
            //十位
            int decade = i / 10 % 10;
            //逢7过就是打印输出遇到包含7或者是7的倍数的数字就忽略
            if (i % 7 == 0 || unit == 7 || decade == 7) {
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
