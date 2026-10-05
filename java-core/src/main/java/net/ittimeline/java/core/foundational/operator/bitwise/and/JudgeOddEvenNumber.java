package net.ittimeline.java.core.foundational.operator.bitwise.and;

import java.util.Scanner;

/**
 * 按位与应用案例：按位与判断某个数字是否为奇数或者偶数
 * 需求分析：通过按位与操作符与1进行按位与操作，结果为0则表示该数字为偶数，否则结果为1则表示该数字为奇数
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/5 9:57
 * @since Java 25
 */
public class JudgeOddEvenNumber {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个整数");
        int number = scanner.nextInt();

        if ((number & 1) == 0) {
            System.out.println(number + "是偶数");
        } else {
            System.out.println(number + "是奇数");
        }
        //关闭Scanner
        scanner.close();
    }
}
