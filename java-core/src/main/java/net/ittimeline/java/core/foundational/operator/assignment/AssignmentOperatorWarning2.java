package net.ittimeline.java.core.foundational.operator.assignment;

/**
 * 赋值运算符使用注意事项2
 * 赋值运算符的左边只能是变量，右边可以是字面量、变量或者表达式
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 15:14
 * @since Java 25
 */
public class AssignmentOperatorWarning2 {
    static void main() {
        //赋值运算符的左边只能是变量，右边可以是字面量、变量或者表达式
        int number = 10;
        System.out.println("赋值的时候右边是字面量 number = " + number);
        // 赋值的时候左边必须是变量 否则编译错误
        //java: 意外的类型 需要：变量 找到：值
        //10 = 10;
        //10 = number;

        //赋值的时候右边必须是字面值、变量、表达式
        int value = 20;
        number = value;
        System.out.println("赋值的时候右边是变量 number = " + number);
        number = value / 2;
        System.out.println("赋值的时候右边是算术表达式 number = " + number);
    }

}
