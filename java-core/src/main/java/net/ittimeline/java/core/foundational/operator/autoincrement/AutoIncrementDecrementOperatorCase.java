package net.ittimeline.java.core.foundational.operator.autoincrement;

/**
 * 自增自减运算符案例
 * 需求：根据指定表达式计算i和j的值
 * 指定表达式
 * int i = 5;
 * int j = i-- + --i * i--;
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:37
 * @since Java 25
 */
public class AutoIncrementDecrementOperatorCase {
    static void main() {
        /*
            分析
            ① i--的运算结果是5，i是4
            ② --i的运算结果是3 ，i是3
            ③ i--的运算结果是3，i是2
            ④ i-- + --i * i--就是5 +3 * 3的运算结果是14
            ⑤ i的值是2，j的值是14
         */
        int i = 5;
        int j = i-- + --i * i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
