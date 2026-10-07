package net.ittimeline.java.core.foundational.control.branch.ifelsestatment;

import java.util.Scanner;

/**
 * 双分支结构if else语句和三元运算符比较
 * if else语句
 * ● 更适合复杂逻辑，可以包含多行代码和更复杂的结构
 * ● 提供了更大的灵活性，可以处理多个条件和多个分支
 * ● 当逻辑比较复杂时，代码可读性较好
 * 三元运算符（关系表达式1?表达式1:表达式2）
 * ● 更适合简单的条件判断，适用于赋值操作中
 * ● 代码更加简洁，可以在一行内完成条件判断和赋值
 * ● 但是在某些情况下可能会牺牲可读性，特别是嵌套多个三元运算符时
 * 日常开发中if else语句的使用频率高于三元运算符
 * <p>
 * 需求：用户从键盘输入年龄，判断是否成年
 * 分析：判断年龄是否大于18
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 11:35
 * @since Java 25
 */
public class IfElseStatementTernaryOperator {

    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄（1~120）");
        int age = scanner.nextInt();
        System.out.println("1.使用三元运算符判断年龄");
        System.out.println(age >= 18 ? "成年" : "未成年");

        System.out.println("2.使用if else语句判断");
        if (age >= 18) {
            System.out.println("成年");
        } else {
            System.out.println("未成年");
        }
        //关闭Scanner
        scanner.close();
    }
}
