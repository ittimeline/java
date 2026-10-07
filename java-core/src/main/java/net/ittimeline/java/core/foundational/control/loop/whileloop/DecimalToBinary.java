package net.ittimeline.java.core.foundational.control.loop.whileloop;

import java.util.Scanner;

/**
 * while循环案例3-十进制转二进制
 * 需求：键盘输入一个非负整数，输出它的二进制表示。例如输入10，输出1010。
 * 分析：十进制整数转换为任意进制数的规则：除基取余法，即不断地除以基数（几进制，基数就是几），直到商数为0，再将余数倒着拼接起来即可。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:17
 * @since Java 25
 */
public class DecimalToBinary {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入一个十进制整数（非负）");
            int decimal = scanner.nextInt();
            if (decimal < 0) {
                System.out.println("输入错误：不能为负数，请重新输入");
            } else if (decimal == 0) {
                System.out.println("十进制0转换成二进制还是0");
                //处理完0后退出循环
                flag = false;
            } else {
                //商
                int quotient = decimal;
                //十进制转二进制的结果
                String binary = "";
                while (quotient > 0) {
                    //取余数（当前低位）
                    int remainder = quotient % 2;
                    //将新余数拼接到前面，自动逆序
                    binary = remainder + binary;
                    //更新商
                    //quotient=quotient/2;
                    quotient /= 2;
                }
                System.out.printf("十进制%d转换成二进制结果是%s\n", decimal, binary);
                //处理完非负数后退出循环
                flag = false;
            }

        }


        //关闭Scanner
        scanner.close();
    }
}
