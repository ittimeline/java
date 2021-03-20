package net.ittimeline.java.foundational.control.forstatement;

/**
 * 显示时间，精确到分钟
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/18 15:49
 * @since JDK11
 */
public class ForNestTime {

    public static void main(String[] args) {

        int  count =0;
        //遍历小时
        for (int hour = 0; hour <24 ; hour++) {
            for (int minute = 0; minute <60 ; minute++) {
                for (int second = 0; second < 60 ; second++) {
                    System.out.printf("%d小时%d分%d秒\n",hour,minute,second);
                    count++;
                }

            }

        }

        System.out.println("内层循环总共执行了"+count+"次");
    }
}
