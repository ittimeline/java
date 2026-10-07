package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * 分支结构switch语句使用注意事项4
 * 需求：根据用户输入的数字判断是工作日还是休息日，1~5是工作日，6~7是休息日，其他数字输入有误
 * 分析：
 * 1. 获取用户输入的数字。
 * 2. 判断数字的范围：
 * ○ 若在1~5之间，输出“工作日”。
 * ○ 若在6~7之间，输出“休息日”。
 * ○ 否则输出“输入有误”。
 * @author tony 18601767221@163.com
 * @version 2026/10/7 13:35
 * @since Java 25
 */
public class SwitchStatementWarning4 {
    static void main() {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("你的输入有误");
                break;
        }
        //关闭Scanner
        scanner.close();
    }
}
