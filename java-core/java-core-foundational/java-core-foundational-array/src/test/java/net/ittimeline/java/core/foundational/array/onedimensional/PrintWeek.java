package net.ittimeline.java.core.foundational.array.onedimensional;

import java.util.Scanner;

/**
 * 输出英文星期几
 * 需求：用一个数组保存星期一到星期天的 7 个英语单词，从键盘输入 1-7，显示对应的单词
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 10:08
 * @since Java21
 */
public class PrintWeek {
    public static void main(String[] args) {
        //定义包含7个单词的数组
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数值（1~7）");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 7) {
            //索引的取值范围是0~6
            int index = number - 1;
            System.out.printf("数值%d对应的星期是%s\n", number, weeks[index]);
        } else {
            System.out.println("你的输入有误");
        }
        //关闭Scanner
        scanner.close();
    }
}
