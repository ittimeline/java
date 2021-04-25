package net.ittimeline.java.foundational.oop.initialization;

/**
 * 子类成员的初始化机制
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/24 14:56
 * @since JDK11
 */
public class SubClass extends SuperClass {



    /**
     * 无参构造方法
     */
    public SubClass(){
        System.out.println("10.子类执行无参的构造方法");



    }



    //静态代码块
    static{
        System.out.println("3.子类执行静态代码块");

    }

    /**
     * 显示初始化静态变量赋值
     */
    private static String staticVariable=initStaticVariable();


    //构造代码块
    {
        System.out.println("8.子类执行构造代码块");

    }


    /**
     * 显示初始化成员变量赋值
     *
     */
    private String memberVariable=initMemberVariable();




    private String initMemberVariable() {
        System.out.println("9.子类执行显示初始化成员变量赋值");
        return "我是一个成员变量";
    }



    private static String initStaticVariable() {
        System.out.println("4.子类执行显示初始化静态变量赋值");
        return "我是一个静态变量";
    }

    static class InnerClass{
        static{
            System.out.println("11.执行子类的静态内部类的静态代码块");
        }
    }


}
