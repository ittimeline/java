package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 求五位数的回文数
 * 需求：求五位数的回文数，并统计回文数的数量
 * 分析：
 * 五位数：10000-99999之间的整数
 * 回文数：一个数字从左往右读和从右往左读还是同一个数字，例如12321就是一个回文数，12345不是回文数
 * 回文数的特征：个位等于万位，十位等于千位
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 18:23
 * @since Java21
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10000; i < 99999; i++) {
            //获取五位数的个位、十位、千位、万位
            int unit = i / 1 % 10;
            int decade = i / 10 % 10;
            int thousand = i / 1000 % 10;
            int tenThousand = i / 100000 % 10;
            // 回文数的特征：个位等于万位，十位等于千位
            if (unit == tenThousand && decade == thousand) {
                System.out.print(i + " ");
                count++;
                //每行打印5个
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("五位数的回文数个数是" + count);
    }
}
