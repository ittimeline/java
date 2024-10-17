package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 求三位数水仙花数
 * 需求：控制台打印输出三位数的水仙花数
 * 分析：水仙花数指的是每个位上的数字的 3次幂之和等于它本身
 * 三位的水仙花数共有4个：153，370，371，407
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 18:18
 * @since Java21
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        System.out.print("三位的水仙花数是");
        for (int i = 100; i < 1000; i++) {
            //获取每个数的个位、十位、百位
            int unit = i / 1 % 10;
            int decade = i / 10 % 10;
            int hundred = i / 100 % 10;
            //水仙花数：每个位上的数字的 3次幂之和等于它本身
            int sum = unit * unit * unit + decade * decade * decade + hundred * hundred * hundred;
            if (i == sum) {
                //三位的水仙花数共有4个：153，370，371，407
                System.out.print(i + " ");
            }
        }
    }
}
