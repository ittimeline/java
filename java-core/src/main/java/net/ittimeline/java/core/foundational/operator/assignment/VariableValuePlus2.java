package net.ittimeline.java.core.foundational.operator.assignment;

/**
 * 赋值运算符案例2-实现变量值加2
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 15:15
 * @since Java 25
 */
public class VariableValuePlus2 {
    static void main() {
        //实现变量值加2有两种方式
        //方式1：
        int type1 = 1;
        type1 = type1 + 2;
        System.out.println("type1 = " + type1);

        //方式2：推荐
        int type2 = 1;
        type2 += 2;
        System.out.println("type2 = " + type2);

    }

}
