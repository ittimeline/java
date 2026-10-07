package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * 分支结构switch语句使用注意事项1
 * 需求：根据用户输入的季节输出季节的特点
 * ● 春季：春暖花开
 * ● 夏季：夏日炎炎
 * ● 秋季：秋高气爽
 * ● 冬季：白雪皑皑
 * 分析：
 * 1. 获取用户输入的季节名称。
 * 2. 判断该名称是否为“春季”、“夏季”、“秋季”或“冬季”。
 * 3. 如果是，输出对应的季节特点；否则提示“输入有误”。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 13:33
 * @since Java 25
 */
public class SwitchStatementWarning1 {
    static void main() {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入季节");
        String season = scanner.next();
        switch (season) {
            case "春季":
                System.out.println("春暖花开");
                break;
            case "夏季":
                System.out.println("夏日炎炎");
                break;
            case "秋季":
                System.out.println("秋高气爽");
                break;
            case "冬季":
                System.out.println("白雪皑皑");
                break;
            default:
                System.out.println("季节有误");
                break;
        }
        //关闭Scanner
        scanner.close();
    }

}
