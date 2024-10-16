package net.ittimeline.java.core.foundational.operator.arithmetic;

import java.util.Scanner;

/**
 * 整数反转
 * 分析：
 * ① 参考数值拆分案例获取三位整数的个位、十位、百位
 * ② 三位数反转的计算公式：个位 * 100 + 十位 * 10 + 百位
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 9:59
 * @since Java21
 */
public class NumericalReversal {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入,也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //提升用户从键盘输入一个三位整数：大于等于100,小于1000的整数
        System.out.println("请输入一个三位整数：大于等于100,小于1000的整数");
        int number = scanner.nextInt();
        //获取三位整数的个位、十位、百位
        int unit = number / 1 % 10;
        int decade = number / 10 % 10;
        int hundred = number / 100 % 10;
        //计算反转后的结果
        int reversalNumber = unit * 100 + decade * 10 + hundred;
        System.out.printf("你输入的整数是%d,反转以后的结果是%d\n", number, reversalNumber);
        //关闭Scanner
        scanner.close();
    }
}
