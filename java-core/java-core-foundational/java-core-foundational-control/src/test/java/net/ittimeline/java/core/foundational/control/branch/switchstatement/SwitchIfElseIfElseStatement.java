package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * switch语句和if else if else语句对比
 * 凡是使用分支结构switch case语句都可以替换成分支结构if else if else语句，但是反之不成立
 * 在后期开发项目时如果某个需求既可以使用分支结构switch case语句又可以使用分支结构if else if else语句，建议使用分支结构switch case语句，因为效率稍高
 * if else if else 语句优势
 * ● if else if else 语句的条件是一个布尔类型值， if 条件表达式为 true 则进入分支，可以用于范围判断（区间判断），也可以用于等值判断， 使用范围更广。
 * ● switch case 语句的条件是一个常量值（byte，short，int，char，枚举，String），只能判断某个变量或表达式的结果是否等于某个常量值， 使用范围较狭窄
 * switch case 语句优势
 * ● 当条件是判断某个变量或表达式是否等于某个固定的常量值时，使用 if else if else 和 switch case 都可以，习惯上使用 switch case 更多。因为效率稍高。当条件是区间范围的判断时，只能使用if else if else 语句。
 * ● 使用 switch case 可以利用穿透性，同时执行多个分支，而 if else if else 没有穿透性。
 * <p>
 * 需求：根据用户输入的分数判断所在区间的等级
 * 90-100 等级A
 * 80-89 等级B
 * 70-79 等级C
 * 60-69 等级D
 * 0-59 等级E
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 15:28
 * @since Java21
 */
public class SwitchIfElseIfElseStatement {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入考试成绩（0~100）");
        int score = scanner.nextInt();
        System.out.println("考试成绩是" + score);
        if (score >= 0 && score <= 100) {
            System.out.print("基于if else if else语句实现：");
            if (score >= 90) {
                System.out.println("等级A");
            } else if (score >= 80) {
                System.out.println("等级B");
            } else if (score >= 70) {
                System.out.println("等级C");
            } else if (score >= 60) {
                System.out.println("等级D");
            } else {
                System.out.println("等级E");
            }
            System.out.print("基于switch case语句实现：");
            score /= 10;
            switch (score) {
                case 10:
                case 9:
                    System.out.println("等级A");
                    break;
                case 8:
                    System.out.println("等级B");
                    break;
                case 7:
                    System.out.println("等级C");
                    break;
                case 6:
                    System.out.println("等级D");
                    break;
                default:
                    System.out.println("等级E");
            }

        } else {
            System.out.println("考试成绩输入有误");
        }
        //关闭Scanner
        scanner.close();

    }
}
