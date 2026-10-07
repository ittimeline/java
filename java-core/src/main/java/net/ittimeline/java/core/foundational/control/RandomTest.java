package net.ittimeline.java.core.foundational.control;

import java.util.Random;

/**
 * Random类生成随机数使用
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 12:43
 * @since Java 25
 */
public class RandomTest {
    static void main() {
        //创建Random对象
        Random random = new Random();
        //生成0~9之间的随机数
        //[ 或者 ]表示包含
        // (或者 )表示不包含
        int randomNumber = random.nextInt(10);
        System.out.println("生成[0,9]之间的随机整数：" + randomNumber);

        //生成指定范围的随机数
        //获取指定范围[a,b]随机数公式：random.nextInt(b - a + 1) + a
        System.out.println("生成10个[10,20]的随机数");
        for (int i = 0; i < 10; i++) {
            randomNumber = random.nextInt(20 - 10 + 1) + 10;
            System.out.print(randomNumber + "\t");
        }
        //换行
        System.out.println();
        //Java 17 新增方法
        System.out.println("Java 17 新增方法 生成10个[10,20]的随机数");
        for (int i = 0; i < 10; i++) {
            randomNumber = random.nextInt(10, 21);
            System.out.print(randomNumber + "\t");
        }
    }
}
