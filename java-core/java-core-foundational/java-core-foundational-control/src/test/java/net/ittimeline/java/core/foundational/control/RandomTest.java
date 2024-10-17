package net.ittimeline.java.core.foundational.control;

import java.util.Random;

/**
 * Random生成随机数使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 7:00
 * @since Java21
 */
public class RandomTest {
    public static void main(String[] args) {
        //创建Random对象
        Random random = new Random();
        //生成1~9之间的随机数
        int randomNumber = random.nextInt(10);
        System.out.println("生成[1,9]之间的随机整数：" + randomNumber);
        //生成指定范围的随机数
        //获取指定范围[a，b]随机数公式：random.nextInt(b - a + 1 ) + a
        System.out.println("生成十个 [10,20]的随机数");
        for (int i = 0; i < 10; i++) {
            randomNumber = random.nextInt(20 - 10 + 1) + 10;
            System.out.println(randomNumber + "\t");
        }
    }
}
