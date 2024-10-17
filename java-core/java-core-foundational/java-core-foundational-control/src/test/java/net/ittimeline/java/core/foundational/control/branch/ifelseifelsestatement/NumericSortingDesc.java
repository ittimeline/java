package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Scanner;

/**
 * 数字降序排序
 * 需求：提示用户从键盘输入三个整数，然后从大到小降序排序输出
 * 分析：先比较第一个整数和第二个整数，然后再将第三个数分别和第一个数、第二个数进行比较
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 10:42
 * @since Java21
 */
public class NumericSortingDesc {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字");
        int number1 = scanner.nextInt();

        System.out.println("请输入第二个数字");
        int number2 = scanner.nextInt();

        System.out.println("请输入第三个数字");
        int number3 = scanner.nextInt();
        System.out.print("三个整数从小到大的顺序是");
        //先比较第一个整数和第二个整数，然后再将第三个数分别和第一个数、第二个数进行比较
        if (number1 > number2) {
            //第三个数比第一个数大，那么第三个数是三个整数中最大的一个
            if (number3 > number1) {
                System.out.println(number2 + "," + number1 + "," + number3);
            }
            //第三个数比第二个数小，那么第三个数就是三个整数中最小的一个
            else if (number3 < number2) {
                System.out.println(number3 + "," + number2 + "," + number1);
            }
            //第三个数介于第一个数和第二个数的中间
            else {
                System.out.println(number2 + "," + number3 + "," + number1);
            }
        } else if (number1 < number2) {
            //第三个数比第一个数小，那么第三个数就是三个整数中最小的一个
            if (number3 < number1) {
                System.out.println(number3 + "," + number1 + "," + number2);
            }
            //第三个数比第二个数大，那么第三个数是三个整数中最大的一个
            else if (number3 > number2) {
                System.out.println(number1 + "," + number2 + "," + number3);
            }
            //第三个数介于第一个数和第二个数的中间
            else {
                System.out.println(number1 + "," + number3 + "," + number2);
            }
        }
        //关闭Scanner
        scanner.close();
    }
}
