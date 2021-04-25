package net.ittimeline.java.foundational.method;

/**
 * 方法重载与基本数据类型的自动类型转换
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/12 15:18
 * @since JDK11
 */
public class MethodOverloadingPrimitiveTypeAutoConversion {




    public static void invoke(short var){
        System.out.println("invoke(short)");
    }

    public static void invoke(int var){
        System.out.println("invoke(int)");
    }
    public static void invoke(double var1,int var2){
        System.out.println("invoke(double,int)");
    }

    public static void invoke(int var1,double var2){
        System.out.println("invoke(int,double)");
    }

    public static void invoke(long var){
        System.out.println("invoke(long)");
    }
}
