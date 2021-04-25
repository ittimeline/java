package net.ittimeline.java.foundational.oop.initialization;

/**
 * 父类的成员初始化机制
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/24 15:22
 * @since JDK11
 */
public class SuperClass {




    /**
     * 无参构造方法
     */
    public SuperClass(){
        System.out.println("7.父类执行无参的构造方法");


    }



    //静态代码块
    static {
        System.out.println("1.父类执行静态代码块");
    }

    /**
     * 显示初始化静态变量赋值
     */
    private static String staticVariable=initStaticVariable();


    //构造代码块
    {
        System.out.println("5.父类执行构造代码块");

    }


    /**
     * 显示初始化成员变量赋值
     *
     */
    private String memberVariable=initMemberVariable();




    private String initMemberVariable() {
        System.out.println("6.父类执行显示初始化成员变量赋值");
        return "我是一个成员变量";
    }



    private static String initStaticVariable() {
        System.out.println("2.父类执行显示初始化静态变量赋值");
        return "我是一个静态变量";
    }

    static class InnerClass{
        static{
            System.out.println("6.执行父类的静态内部类的静态代码块");
        }
    }

}
