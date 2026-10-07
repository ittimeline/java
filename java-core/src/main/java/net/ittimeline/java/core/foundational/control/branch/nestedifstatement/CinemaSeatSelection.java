package net.ittimeline.java.core.foundational.control.branch.nestedifstatement;

import java.util.Scanner;

/**
 * 需求：电影院选座位
 * 假设某影院售卖了100张票，票的序号为1~100，其中奇数票号坐在左侧，偶数票号坐在右侧
 * 键盘输入一个整数表示票号，根据不同情况给出不同提示
 * 如果票号为奇数，那么打印坐在左边
 * 如果票号为偶数，那么打印坐在右边
 * <p>
 * 分析：① 键盘输入序号（整数），② 判断序号是否在[1,100]，如果不在则提示序号非法
 * ③ 判断序号如果为奇数，那么打印坐在左边，否则打印坐在右边
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 13:11
 * @since Java 25
 */
public class CinemaSeatSelection {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        //1.键盘输入票号
        System.out.println("请输入序号");
        //2.判断是否是整数
        if (!scanner.hasNextInt()) {
            System.out.println("输入错误：请输入一个整数！");
            scanner.close();
            return;
        }
        int number = scanner.nextInt();


        //3.判断序号是否在[1,100]
        if (number >= 1 && number <= 100) {
            //4.判断奇偶：偶数坐右边，奇数坐左边
            //偶数 坐在右边
            if (number % 2 == 0) {
                System.out.println("坐在右边");
            } else {
                //奇数 坐在左边
                System.out.println("坐在左边");
            }
        } else {
            System.out.println("序号非法");
        }

        //关闭Scanner
        scanner.close();
    }
}
