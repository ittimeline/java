package net.ittimeline.java.core.foundational.control.loop.breakstatement;

import java.util.Random;

/**
 * break语句案例2-生成指定随机数并统计次数
 * 需求：随机生成[1,100]的随机整数，直到生成随机数88，统计用了多少次
 * 分析：计数器：生成一个随机数就累加一次，遇到88就停止循环
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:24
 * @since Java 25
 */
public class RandomUntil88 {
    static void main() {
        Random random = new Random();
        int randomNumber;
        //计数器
        int count = 0;
        while (true) {
            //随机生成[1,100]的随机整数
            randomNumber = random.nextInt(100) + 1;
            //计数器累加
            count++;
            //随机数是88，那么终止循环
            if (randomNumber == 88) {
                break;
            }
        }
        System.out.printf("生成随机数%d一共用了%d次\n", randomNumber, count);

    }
}
