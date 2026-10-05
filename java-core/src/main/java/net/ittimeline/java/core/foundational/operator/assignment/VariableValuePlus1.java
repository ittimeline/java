package net.ittimeline.java.core.foundational.operator.assignment;

/**
 * 赋值运算符案例1-实现变量值加1
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 15:15
 * @since Java 25
 */
public class VariableValuePlus1 {
    static void main() {
        //实现变量值加1有四种方式

        //方式1：
        int type1 = 1;
        type1 = type1 + 1;
        System.out.println("type1 = " + type1);

        //方式2：
        int type2 = 1;
        ++type2;
        System.out.println("type2 = " + type2);

        //方式3：推荐
        int type3 = 1;
        type3++;
        System.out.println("type3 = " + type3);

        //方式4：
        int type4 = 1;
        type4 += 1;
        System.out.println("type4 = " + type4);
    }

}
