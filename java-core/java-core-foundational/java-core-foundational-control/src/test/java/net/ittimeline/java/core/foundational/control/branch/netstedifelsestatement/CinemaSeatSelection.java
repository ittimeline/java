package net.ittimeline.java.core.foundational.control.branch.netstedifelsestatement;

import java.util.Scanner;

/**
 * if else语句嵌套if else语句
 * 需求：电影院选座
 * 假设某影院售卖了100张票，票的序号为1~100，其中奇数票号坐在左侧，偶数票号坐在右侧
 * 键盘输入一个整数表示票号，根据不同情况给出不同提示
 * 如果票号为奇数，那么打印做左边
 * 如果票号为偶数，那么打印坐在右边
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 10:39
 * @since Java21
 */
public class CinemaSeatSelection {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //1.键盘输入一个整数表示票号
        System.out.println("请输入票号");
        int number = scanner.nextInt();
        //2.判断票号是否1~100  真票
        if (number >= 0 && number <= 100) {
            //3.判断票号是偶数还是奇数
            if (number % 2 == 0) {
                System.out.println("坐右边");
            } else {
                System.out.println("坐左边");
            }
        } else {
            //假票
            System.out.println("你的输入有误");
        }
        //关闭Scanner
        scanner.close();
    }
}
