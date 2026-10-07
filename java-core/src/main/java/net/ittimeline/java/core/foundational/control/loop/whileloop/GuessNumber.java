package net.ittimeline.java.core.foundational.control.loop.whileloop;

import java.util.Random;
import java.util.Scanner;

/**
 * while循环案例2-猜数字
 * 需求：随机生成一个100以内的整数，然后让用户猜，
 * 如果猜的数字太大了提示你猜的数字太大了，
 * 如果猜的数字太小了提示你猜的数字太小了，
 * 并且统计用户猜中数字一共猜了多少次。
 * 分析：①生成随机数 ②用户从键盘输入的整数  ③随机数和用户输入的整数比较 ④ 统计次数
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:17
 * @since Java 25
 */
public class GuessNumber {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //随机生成100以内[1,100]的整数
        Random random = new Random();
        //获取指定范围[a,b]随机数公式：random.nextInt(b - a + 1) + a
        int randomNumber = (random.nextInt(100 - 1 + 1)) + 1;

        //统计猜数字的次数
        int guessCount = 0;
        //是否继续猜数字
        boolean flag = true;
        while (flag) {
            System.out.println("请输入你猜的数字");
            int guessNumber = scanner.nextInt();
            guessCount++;
            if (guessNumber > randomNumber) {
                System.out.println("你猜的数字太大了");
            } else if (guessNumber < randomNumber) {
                System.out.println("你猜的数字太小了");
            } else {
                //猜中数字，结束循环
                flag = false;
                System.out.printf("恭喜你猜中了，数字是%d,一共猜了%d次", randomNumber, guessCount);
            }

        }
        //关闭Scanner
        scanner.close();
    }

}
