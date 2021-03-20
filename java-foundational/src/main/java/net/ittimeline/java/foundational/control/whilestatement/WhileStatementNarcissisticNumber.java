package net.ittimeline.java.foundational.control.whilestatement;

/**
 * 使用while循环的扩展语法格式实现求3位数的水仙花数
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/17 18:45
 * @since JDK11
 */
public class WhileStatementNarcissisticNumber {

    public static void main(String[] args) {
        // 水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）。
        // 统计三位数的水仙花数的个数

        /*
            初始化语句;
            while(循环条件语句){
                循环体语句
                迭代语句
            }
          */

        int i=100;
        int count=0;
        while(i < 1000){
            int unit = i / 1 % 10;
            int ten = i / 10 % 10;
            int hundred = i / 100 % 10;

            int value = unit * unit * unit + ten * ten * ten + hundred * hundred * hundred;

            if (value == i) {
                count++;
                System.out.print(value + " ");
            }
            i++;
        }

        //换行
        System.out.println();
        System.out.println("三位数的水仙花个数是"+count+"个");




    }
}
