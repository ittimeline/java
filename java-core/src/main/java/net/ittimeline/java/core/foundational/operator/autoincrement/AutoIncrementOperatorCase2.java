package net.ittimeline.java.core.foundational.operator.autoincrement;

/**
 * 自增运算符案例2
 * 需求：根据指定表达式计算i、j的值
 * int i = 1;
 * int j = i++ + ++i * ++i;
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:36
 * @since Java 25
 */
public class AutoIncrementOperatorCase2 {
    static void main() {
        /*
            分析
            ① i分别被自增了三次，也就是加三次1，结果就是4
            ② i++的计算结果是1，i是2
            ③ ++i的计算结果是3，i是3
            ④ ++i的计算结果是4，i是4
            ⑤ ++i * ++i 的计算结果是3 * 4 也就是12
            ⑥ i++ + ++i * ++i;的计算结果就是1+12，计算结果就是13
            ⑦ 因此i的值是4，j的值就是13
        */
        int i = 1;
        int j = i++ + ++i * ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
