package net.ittimeline.java.core.foundational.control.branch.ifelsestatment;

import java.util.Scanner;

/**
 * 双分支结构if else语句案例4-判断数字是否为7的倍数
 * 需求：键盘输入一个数字，判断该数字是否为7的倍数
 * 分析：①输入数字 ②判断该数字是否能被7整除
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 12:51
 * @since Java 25
 */
public class MultipleOfSeven {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个数字");
        int number = scanner.nextInt();
        if (number % 7 == 0) {
            System.out.println(number + "是7的倍数");
        } else {
            System.out.println(number + "不是7的倍数");
        }

        //关闭Scanner
        scanner.close();
    }
}
