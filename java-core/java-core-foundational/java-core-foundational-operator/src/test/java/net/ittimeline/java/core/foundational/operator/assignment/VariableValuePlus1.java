package net.ittimeline.java.core.foundational.operator.assignment;

/**
 * 实现变量值加1
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 21:19
 * @since Java21
 */
public class VariableValuePlus1 {
    public static void main(String[] args) {
        //实现变量值加1有四种方式
        //方式1：
        int type1 = 1;
        type1 += 1;
        System.out.println("type1 = " + type1);

        //方式2：
        int type2 = 1;
        type2 = type2 + 1;
        System.out.println("type2 = " + type2);

        //方式3：推荐
        int type3 = 1;
        type3++;
        System.out.println("type3 = " + type3);
        //方式4：
        int type4 = 1;
        ++type4;
        System.out.println("type4 = " + type4);
    }
}
