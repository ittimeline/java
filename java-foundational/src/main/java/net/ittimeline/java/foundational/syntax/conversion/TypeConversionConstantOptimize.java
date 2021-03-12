package net.ittimeline.java.foundational.syntax.conversion;

/**
 * 类型转换的常量优化机制
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/12 9:09
 * @since JDK11
 */
public class TypeConversionConstantOptimize {
    public static void main(String[] args) {
        // 1. 如果byte,short,char类型的变量在赋值的时候，赋值的是一个常量，例如100，那么我们的JVM自动将常量值转换为对应的数据类型
        byte byteVar=100;
        System.out.println("byteVar = "+byteVar);

        char charVar=97;
        System.out.println("charVar = "+charVar);

        // 2.如果运算符操作的是字面量常量，先进行运算操作，再将结果赋值后进行编译操作
        byte byteResult=3+4;
        System.out.println("byteResult = "+byteResult);





    }
}
