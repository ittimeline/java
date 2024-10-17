package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 打印符号条件的四位整数
 * 需求：循环结构for语句打印符合条件的四位整数
 * 条件1： 打印出四位整数中 个位+十位=百位+千位，其中个位为偶数，千位为奇数的数字，并且打印出符合条件的数字
 * 条件2：符合条件的数字，每行显示5个，使用空格隔开
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 18:20
 * @since Java21
 */
public class PrintThousandNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i <= 9999; i++) {
            //个位
            int unit = i / 1 % 10;
            //十位
            int decade = i / 10 % 10;
            //百位
            int hundred = i / 100 % 10;
            //千位
            int thousand = i / 1000 % 10;
            //个位+十位=百位+千位，其中个位为偶数，千位为奇数的数字
            if (unit + decade == hundred + thousand && unit % 2 == 0 && thousand % 2 != 0) {
                System.out.print(i + " ");
                count++;
                //每打印5个数字就换行
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
