package net.ittimeline.java.foundational.oop.innerclass;

/**
 * 局部内部类测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 17:02
 * @since JDK11
 */
public class LocalInnerClassTest {


    public static void main(String[] args) {

         int number =10;

        class InnerClass{
            private String name;
            InnerClass(String name){
                this.name=name;
            }
            public void showLocalMemberInfo(){
                System.out.println(this.name);
                System.out.println("main()方法的局部变量 number = "+number);
            }
        }
        InnerClass innerClass=new InnerClass("局部内部类");
        innerClass.showLocalMemberInfo();





    }
}
