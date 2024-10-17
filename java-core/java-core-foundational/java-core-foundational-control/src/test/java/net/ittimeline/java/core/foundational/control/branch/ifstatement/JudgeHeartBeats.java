package net.ittimeline.java.core.foundational.control.branch.ifstatement;

import java.util.Scanner;

/**
 * 体检
 * 需求：成年人心率的正常范围是每分钟 60-100 次。体检时，如果心率不在此范围内，则提示需要做进一步的检查
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 8:11
 * @since Java21
 */
public class JudgeHeartBeats {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入心跳的次数");
        int heartBeats = scanner.nextInt();
        //如果体检不在[60，100]范围内
        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("你需要做进一步的检查");
        }
        //关闭Scanner
        scanner.close();
        System.out.println("体检结束");
    }
}
