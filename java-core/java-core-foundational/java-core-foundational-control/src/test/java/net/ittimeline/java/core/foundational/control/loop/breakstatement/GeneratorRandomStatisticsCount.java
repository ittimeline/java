package net.ittimeline.java.core.foundational.control.loop.breakstatement;

/**
 * 生成指定随机数并统计次数
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 19:58
 * @since Java21
 */
public class GeneratorRandomStatisticsCount {
    public static void main(String[] args) {
        //统计次数-计数器
        int count = 0;
        //随机生成[1,100]的随机整数
        int randomNumber = (int) (Math.random() * (100 - 1 + 1)) + 1;
        //计数器累加
        count++;
        //循环条件是当随机数不是88
        while (randomNumber != 88) {
            //循环随机生成[1,100]的随机整数
            randomNumber = (int) (Math.random() * (100 - 1 + 1)) + 1;
            //计数器累加
            count++;
            //随机数是88，那么终止循环
            if (randomNumber == 88) {
                break;
            }
        }
        System.out.printf("当前随机数是%d，一共用了%d次\n", randomNumber, count);
    }
}
