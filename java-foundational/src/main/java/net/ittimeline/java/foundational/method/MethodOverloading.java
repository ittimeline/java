package net.ittimeline.java.foundational.method;

/**
 * 方法重载
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/12 15:11
 * @since JDK11
 */
public class MethodOverloading {

    public static boolean compare(int left,int right){
        System.out.println("compare(int,int)");
        return left==right;
    }

    public static boolean compare(long left,long right){
        System.out.println("compare(long,long)");

        return left==right;
    }

    public static boolean compare(boolean left,boolean right){
        System.out.println("compare(boolean,boolean)");
        return left==right;
    }
}
