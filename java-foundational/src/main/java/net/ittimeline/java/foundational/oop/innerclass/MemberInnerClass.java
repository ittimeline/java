package net.ittimeline.java.foundational.oop.innerclass;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 成员内部类
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 16:39
 * @since JDK11
 */
public class MemberInnerClass {

    private String name;

    public MemberInnerClass(String name){
        this.name=name;
    }

    class InnerClass  {


        private String name;

        public InnerClass(String name){
            this.name=name;
        }

        /**
         * 查看成员信息
         */
        public void showMemberInfo(String name){
            System.out.println("形参 name = "+name);
            System.out.println("内部类成员变量 name = "+this.name);
            //访问外部类的私有成员
            System.out.println("外部类成员变量 name = "+MemberInnerClass.this.name);

        }
    }

}
