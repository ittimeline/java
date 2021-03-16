package net.ittimeline.java.foundational.operator.logic;

/**
 * 逻辑运算符的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/14 10:55
 * @since JDK11
 */
public class LogicBooleanConstantOperator {


    public static void main(String[] args) {
        // 逻辑与 运算规则: &左右两边只要有一个false,那么运算结果就是false, 例如 true & false =false
        System.out.println("逻辑与的使用");
        System.out.println("true & true = " + (true & true));
        System.out.println("true & false = " + (true & false));
        System.out.println("false & true = " + (false & true));
        System.out.println("false & false = " + (false & false));

        //逻辑或 运算规则: |左右两边只要有一个true,那么运算结果就是true ,例如 true | false =true
        System.out.println("逻辑或的使用");
        System.out.println("true | true = " + (true | true));
        System.out.println("true | false = " + (true | false));
        System.out.println("false | true = " + (false | true));
        System.out.println("false | false = " + (false | false));

        // 逻辑异或 运算规则: ^左右两边相同为false,不同为true,例如  true ^ true =false , true ^ false =true
        System.out.println("逻辑异或的使用");
        System.out.println("true ^ true = " + (true ^ true));
        System.out.println("true ^ false = " + (true ^ false));
        System.out.println("false ^ true = " + (false ^ true));
        System.out.println("false ^ false = " + (false ^ false));

        // 逻辑非 运算规则: 取反，!true=false, !false=true
        System.out.println("逻辑非的使用");
        System.out.println("!true = "+(!true));
        System.out.println("!!true = "+(!!true));
        System.out.println("!false = "+(!false));
        System.out.println("!!false = "+(!!false));

    }
}
