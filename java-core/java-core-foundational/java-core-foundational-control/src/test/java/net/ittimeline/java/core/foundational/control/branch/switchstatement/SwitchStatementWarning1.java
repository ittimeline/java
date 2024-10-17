package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * 分支结构switch语句使用注意事项1
 * switch的表达式支持六种数据类型，包括基本数据类型byte，short，char，int以及引用数据类型枚举（JDK5.0新增）、String（JDK7.0支持）
 * 需求：根据用户输入的季节输出季节的特点
 * ● 春季：春暖花开
 * ● 夏季：夏日炎炎
 * ● 秋季：秋高气爽
 * ● 冬季：白雪皑皑
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 11:34
 * @since Java21
 */
public class SwitchStatementWarning1 {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入季节");
        String season = scanner.next();
        switch (season) {
            case "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winter":
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
