package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Scanner;

/**
 * 多分支结构if else if else语句语法格式和执行流程
 * if(布尔表达式1){
 *  语句块1
 * }else if(布尔表达式2){
 *  语句块2
 * }else if(布尔表达式3){
 *  语句块3
 * }else{
 *  语句块4
 * }
 * 先执行布尔表达式1，如果结果为true，执行语句块1，然后整个if else if else语句结束
 * 如果布尔表达式1结果为false，执行布尔表达式2，如果结果为true，执行语句块2，然后整个if else if else语句结束
 * 如果布尔表达式2结果为false，执行布尔表达式3，如果结果为true，执行语句块3，然后整个if else if else语句结束
 * 如果布尔表达式3结果为false，执行语句块4，然后整个if else if else语句结束
 * 多选一
 *
 * 多分支结构if else if else使用
 * 需求：根据用户输入考试成绩的分数奖励不同的物品
 * ● 如果成绩为100分，奖励一台小米SU7 Ultra
 * ● 如果成绩为[90,99]，奖励一台MacBook Pro 16
 * ● 如果成绩为[80,89]，奖励一台iPad Pro 12.9
 * ● 其他时，一顿竹笋炒肉
 * 分析：① 输入考试成绩 ② 根据条件判断考试成绩
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 11:40
 * @since Java 25
 */
public class IfElseIfElseStatement {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入考试成绩");
        int score = scanner.nextInt();

        System.out.println("********************************实现方式1********************************");
        //if else if else if else 语句顺序不能改变
        if (score == 100) {
            System.out.println("奖励一台小米SU7 Ultra");
        } else if (score >= 90) {
            System.out.println("奖励一台MacBook Pro 16");
        } else if (score >= 80) {
            System.out.println("奖励一台iPad Pro 12.9");
        } else {
            System.out.println("竹笋炒肉一顿");
        }
        System.out.println("********************************实现方式2********************************");
        //if else if else if else 语句顺序能改变
        if (score == 100) {
            System.out.println("奖励一台小米SU7 Ultra");
        } else if (score >= 90 && score <= 99) {
            System.out.println("奖励一台MacBook Pro 16");
        } else if (score >= 80 && score <= 89) {
            System.out.println("奖励一台iPad Pro 12.9");
        } else {
            System.out.println("竹笋炒肉一顿");
        }
        //关闭Scanner
        scanner.close();

    }
}
