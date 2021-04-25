package net.ittimeline.java.foundational.oop.innerclass;

/**
 * 成员内部类测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 16:43
 * @since JDK11
 */
public class MemberInnerClassTest {

    public static void main(String[] args) {
        //创建外部类对象
        MemberInnerClass memberInnerClass=new MemberInnerClass("外部类");
        //通过外部类对象创建内部类对象
        MemberInnerClass.InnerClass innerClass =memberInnerClass.new InnerClass("内部类");
        innerClass.showMemberInfo("形参");

    }
}
