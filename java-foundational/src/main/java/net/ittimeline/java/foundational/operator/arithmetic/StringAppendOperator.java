package net.ittimeline.java.foundational.operator.arithmetic;

/**
 * 字符串拼接运算
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/13 16:12
 * @since JDK11
 */
public class StringAppendOperator {

    public static void main(String[] args) {

        //字符串常量拼接整数
        System.out.println("10 +10 = "+(10+10));

        //变量的定义格式  数据类型 变量名 = 变量值
        String str ="";
        String appendResult =str+10;
        System.out.println(appendResult);

        str="拼接结果:";
        appendResult=str+10;
        System.out.println(appendResult);

    }
}
