package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Scanner;

/**
 * 多分支结构if else if else 语句案例4-大小写字母转换
 * 需求：用户从键盘输入一个字母，如果是大写字母则转换小写字母，如果是小写字母则转大写字母
 * 分析：① 大写字母转小写字母：大写字母+32  ②小写字母转大写字母：小写字母-32
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 13:05
 * @since Java 25
 */
public class LetterCaseConverter {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个字母: ");
        String input = scanner.nextLine();

        //获取用户输入的第一个字符
        char ch = input.charAt(0);

        //大写字母转小写字母
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
            System.out.println("转换后的小写字母为: " + ch);
        }
        //小写字母转大写字母
        else if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch - 32);
            System.out.println("转换后的大写字母为: " + ch);
        }
        //兜底 非字母输入
        else {
            System.out.println("输入的不是字母，请重新运行程序！");
        }
        //关闭Scanner
        scanner.close();
    }
}
