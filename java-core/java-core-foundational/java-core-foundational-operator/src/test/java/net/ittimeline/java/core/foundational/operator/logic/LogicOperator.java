package net.ittimeline.java.core.foundational.operator.logic;

/**
 * 逻辑运算符使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 15:09
 * @since Java21
 */
public class LogicOperator {
    public static void main(String[] args) {
        //逻辑运算符操作的都是boolean类型的数据
        //逻辑运算符的运算结果也是boolean类型
        //逻辑与（&）：表示并且关系，运算符左右两边的操作数都必须是true，运算结果返回true，否则返回false
        System.out.println("1.逻辑与的使用");
        System.out.println("true & true = " + (true & true));
        System.out.println("true & false = " + (true & false));
        System.out.println("false & true = " + (false & true));
        System.out.println("false & false = " + (false & false));

        //短路与（&&）：表示并且关系，运算符左右两边的操作数都必须是true，运算结果返回true，否则返回false,增加了短路特性
        System.out.println("2.短路与的使用");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (true && false));

        //逻辑或（|）：表示或者关系，运算符左右两边的操作数只要有一个为true,运算结果返回true,否则返回false
        System.out.println("3.逻辑或的使用");
        System.out.println("true | true = " + (true | true));
        System.out.println("true | false = " + (true | false));
        System.out.println("false | true = " + (false | true));
        System.out.println("false | false = " + (false | false));

        //短路或（||）：表示或者关系，运算符左右两边的操作数只要有一个为true,运算结果返回true,否则返回false,增加了短路特性
        System.out.println("4.逻辑或的使用");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        //逻辑非（!）：取反，操作数为true时逻辑非的运算结果为false,逻辑非只有一个操作数
        System.out.println("5.逻辑非的使用");
        System.out.println("!true = " + !true);
        System.out.println("!!true = " + !!true);
        System.out.println("!false = " + !false);
        System.out.println("!!false = " + !!false);
        System.out.println("( 60 > 30) = " + (60 > 30));
        System.out.println("!( 60 > 30) = " + !(60 > 30));

        //逻辑异或（^）：当两个操作数不同的时候返回true,当两个操作数相同的时候返回false
        System.out.println("6.逻辑异或的使用");
        System.out.println("true ^ true = " + (true ^ true));
        System.out.println("true ^ false = " + (true ^ false));
        System.out.println("false ^ true = " + (false ^ true));
        System.out.println("false ^ false = " + (false ^ false));
        //true ^ true = false
        boolean result = (10 > 1) ^ (3 < 5);
        System.out.println("result = " + result);
        // true ^ false = true
        result = (10 > 1) ^ (3 > 5);
        System.out.println("result = " + result);
    }
}
