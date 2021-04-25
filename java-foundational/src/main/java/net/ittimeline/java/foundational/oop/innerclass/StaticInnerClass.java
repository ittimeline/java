package net.ittimeline.java.foundational.oop.innerclass;

/**
 * 静态内部类
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 16:51
 * @since JDK11
 */
public class StaticInnerClass {
    static int count =10;

    static class InnerClass{

        static int count =20;

        public void showStaticMemberInfo(int count){
            System.out.println("形参 count ="+count);
            System.out.println("内部类的静态成员 count ="+InnerClass.count);
            System.out.println("外部类的静态成员 count ="+StaticInnerClass.count);

        }
    }


}
