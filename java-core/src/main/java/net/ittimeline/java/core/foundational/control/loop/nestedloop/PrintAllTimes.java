package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环案例2-打印时间
 * 需求：打印一天中从 00:00:00 到 23:59:59 的所有时间点，每个时间点格式为 HH:mm:ss（小时、分钟、秒均为两位数，不足时补零）。
 * 分析：
 * ● 一天有 24 小时（0～23），每小时 60 分钟（0～59），每分钟 60 秒（0～59）。
 * ● 可以使用三层嵌套循环：
 * ○ 最外层循环控制小时（hour），从 0 到 23。
 * ○ 中间层循环控制分钟（minute），从 0 到 59。
 * ○ 最内层循环控制秒（second），从 0 到 59。
 * ● 在循环的最内层，将当前的小时、分钟、秒按照 HH:mm:ss 格式打印出来。
 * ● 由于需要输出两位数，可使用 System.out.printf("%02d:%02d:%02d%n", hour, minute, second) 或 String.format 进行格式化。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:41
 * @since Java 25
 */
public class PrintAllTimes {
    static void main() {
        int count = 0;
        //最外层循环控制小时（hour），从 0 到 23。
        for (int hour = 0; hour < 24; hour++) {//外层循环执行24次
            //中间层循环控制分钟（minute），从 0 到 59。
            for (int minute = 0; minute < 60; minute++) {//中间层循环执行24轮，每轮60次，执行1440次
                //最内层循环控制秒（second），从 0 到 59。
                for (int second = 0; second < 60; second++) {//最内层循环执行24*60轮，每轮60次，执行86400次
                    System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
                    count++;
                }
            }
        }
        System.out.println("嵌套三层循环执行次数为" + count);
    }
}
