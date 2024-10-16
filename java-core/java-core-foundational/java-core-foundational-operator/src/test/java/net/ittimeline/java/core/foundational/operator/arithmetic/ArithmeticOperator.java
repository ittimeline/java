package net.ittimeline.java.core.foundational.operator.arithmetic;

/**
 * 算术运算符使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 9:17
 * @since Java21
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println("1.算术运算符操作整数字面量");
        System.out.println("3 + 5 = " + (3 + 5));
        System.out.println("20 - 12 = " + (20 - 12));
        System.out.println("2 * 4 = " + (2 * 4));
        //被除数 / 除数 = 商数
        System.out.println("80 / 10 = " + (80 / 10));
        //操作数可以有多个
        System.out.println("12 / 5 * 5 = " + (12 / 5 * 5));
        //取余的公式： a % b = a - (a / b )* b
        //12 -(12 / 5) *5 =12 - 2 * 5 =12 - 10 = 2
        System.out.println("12 % 5 = " + (12 % 5));

        System.out.println("2. 算术运算符操作整数变量");
        int left = 20;
        int right = 3;
        //第一个%d会被left替换
        //第二个%d会被right替换
        //第三个%d会被left + right的结果替换
        System.out.printf("%d + %d = %d\n", left, right, (left + right));
        System.out.printf("%d - %d = %d\n", left, right, (left - right));
        System.out.printf("%d * %d = %d\n", left, right, (left * right));
        //被除数 / 除数 = 商数
        System.out.printf("%d / %d = %d\n", left, right, (left / right));
        System.out.printf("%d / %d * %d = %d\n", left, right, right, (left / right * right));
        //被除数 / 除数 = 商数...余数 求余数
        // %%表示%
        System.out.printf("%d %% %d = %d\n", left, right, (left % right));
    }
}
