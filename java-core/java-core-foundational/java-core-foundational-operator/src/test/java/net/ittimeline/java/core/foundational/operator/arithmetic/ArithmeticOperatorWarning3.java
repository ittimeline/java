package net.ittimeline.java.core.foundational.operator.arithmetic;

/**
 * 算术运算符使用注意事项3
 * 当两个整数进行除法运算的时候运算结果只会保留整数部分，丢弃小数部分，如果想要保留除法运算结果的小数部分，有如下两种方式
 * ①可以使用强制类型转换将其中一个操作数转成double
 * ②将其中一个操作数乘以1.0后再进行运算
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 9:48
 * @since Java21
 */
public class ArithmeticOperatorWarning3 {
    public static void main(String[] args) {
        // 12 / 5 = 2.4 但是运算结果只会保留整数部分，因此运算结果是2
        System.out.println("12 / 5 = " + (12 / 5));
        int left = 12;
        int right = 5;
        //将整数类型变量left提升为double类型后再进行运算，double和int运算结果的类型是double
        double result = (double) left / right;
        System.out.println("result = " + result);
        System.out.println("12 / (double)5= " + (12 / (double) 5));
        //将12*1.0再进行运算
        System.out.println("12 * 1.0 / 5 = " + (12 * 1.0 / 5));
    }
}
