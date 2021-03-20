package net.ittimeline.java.foundational.control.forstatement;

/**
 * 打印输出符合需求的四位整数
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/17 12:42
 * @since JDK11
 */
public class ForIfElseNestArithmeticLogic {

    public static void main(String[] args) {
        //需求1 打印出四位数字中 个位+百位 = 十位加千位 ，其中个位为偶数，千位为奇数的数字，并且打印出符合条件的个数
        //需求2 符合条件的数字，每行显示5个，用空格隔开
        int count = 0;
        for (int i = 1000; i < 9999; i++) {
            //获取数字的个位,十位,百位,千位
            int unit = i / 1 % 10;
            int ten = i / 10 % 10;
            int hundred = i / 100 % 10;
            int thousand = i / 1000 % 10;
            if (unit + hundred == ten + thousand) {
                if (unit % 2 == 0 && thousand % 2 != 0) {
                    count++;
                    System.out.print(i + " ");
                    if (count % 5 == 0) {
                        //换行
                        System.out.println();
                    }
                }
            }
        }
        System.out.println("总共符合条件的数字的个数有" + count + "个");
    }
}
