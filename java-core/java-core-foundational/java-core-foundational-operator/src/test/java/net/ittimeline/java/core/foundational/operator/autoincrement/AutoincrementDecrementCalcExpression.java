package net.ittimeline.java.core.foundational.operator.autoincrement;

/**
 * 自增自减运算符案例1
 * 需求：根据指定表达式计算i、j的值
 * 指定表达式
 * int i = 5;
 * int j = i-- + --i * i--;
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 13:16
 * @since Java21
 */
public class AutoincrementDecrementCalcExpression {
    public static void main(String[] args) {
         /*
            分析
            ① i--的运算结果是5，i是4
            ②--i的运算结果是3 ，i是3
            ③i--的运算结果是3，i是2
            ④i-- + --i * i--就是5 +3 * 3的运算结果是14
            ⑤i的值是2，j的值是14
         */
        int i = 5;
        int j = i-- + --i * i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
