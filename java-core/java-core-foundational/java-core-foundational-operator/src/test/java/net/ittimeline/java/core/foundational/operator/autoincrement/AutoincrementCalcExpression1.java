package net.ittimeline.java.core.foundational.operator.autoincrement;

/**
 * 自增运算符案例1
 * 需求：根据指定表达式计算i、j的值
 * ①
 * int i = 1;
 * i = i++;
 * ②
 * int j = 1;
 * j = ++j;
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 12:56
 * @since Java21
 */
public class AutoincrementCalcExpression1 {
    public static void main(String[] args) {
        /*
            分析int i = 1;i = i++; 的计算过程
            ① i = 1; //i赋值为1
            ① int temp = i; //先把i的取值1放在操作数栈
            ② i = i + 1; //i再自增，i等于2
            ③ i = temp; //再把操作数栈中的1赋值给i，i等于1
            i的计算结果是1
         */
        int i = 1;
        i = i++;
        System.out.println("i = " + i);
        /*
            分析int j = 1;j = ++j;的计算过程
            ① j = 1;
            ② j = j+1;   // 将j的值自增1，j等于2
            ③ int temp =j; //将j的值2放在操作数栈
            ④ j = temp; //将操作数栈的值2赋值给j
            j的计算结果是2
         */
        int j = 1;
        j = ++j;
        System.out.println("j = " + j);
    }
}
