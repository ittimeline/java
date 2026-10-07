package net.ittimeline.java.core.foundational.control.branch.ifstatement;

import java.util.Scanner;

/**
 * 单分支结构if语句语法格式和执行流程
 * if(布尔表达式){
 * 语句块
 * }
 * 布尔表达式为true,执行语句块
 * 单分支结构if语句使用
 * 需求：提示用户输入年龄，判断用户输入的年龄是否满18岁，如果满了18岁就提示他可以考驾照
 * 分析：判断年龄大于等于18
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 11:29
 * @since Java 25
 */
public class IfStatement {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = scanner.nextInt();

        //年龄合法性校验
        if (age < 0 || age >= 150) {
            System.out.println("你输入的年龄不合法");
            //结束方法（main方法）
            return;
        }

        //age >= 18 是关系表达式，因>=是关系运算符，关系表达式的结果是boolean类型，所以又称为boolean表达式
        if (age >= 18) {
            //语句块，目前只有一条执行语句
            System.out.println("恭喜你已经成年了，可以考驾照");
        }
        //关闭Scanner
        scanner.close();
        System.out.println("程序即将正常退出");

    }
}
