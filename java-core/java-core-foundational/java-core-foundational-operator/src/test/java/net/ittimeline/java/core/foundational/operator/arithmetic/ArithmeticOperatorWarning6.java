package net.ittimeline.java.core.foundational.operator.arithmetic;

/**
 * 算术运算符使用注意事项6
 * 取余运算结果的符号（正号、负号）与被除数相同
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 9:52
 * @since Java21
 */
public class ArithmeticOperatorWarning6 {
    public static void main(String[] args) {
        //被除数 / 除数 = 商数...余数
        //取余（求余数）的结果正负号和被除数（被模数）是一样的
        System.out.println("1.取余运算,被除数的符号是负号");
        int left = -12;
        int right = 5;
        int result = left % right;
        //格式化输出算术运算计算结果
        //第一个%d会被left的值替换
        //第二个%d会被right的值替换
        //第三个%d会被result的值替换
        //%%表示%
        System.out.printf("%d %% %d = %d\n", left, right, result);

        System.out.println("2.取余运算,被除数的符号是正号");
        left = 12;
        right = -5;
        result = left % right;
        //%%表示%
        System.out.printf("%d %% %d = %d\n", left, right, result);

        System.out.println("3.取余运算,被除数的符号是负号");
        left = -12;
        right = -5;
        result = left % right;
        //%%表示%
        System.out.printf("%d %% %d = %d\n", left, right, result);
    }
}
