package net.ittimeline.java.core.foundational.syntax.examples;

/**
 * 变量和数据类型案例3：使用变量存储学生信息
 * 需求：学生信息包括姓名、年龄、性别、成绩、地址，要求使用合适数据类型的变量存储并输出
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:02
 * @since Java 25
 */
public class StudentInfo {
    static void main() {
        String name = "tony";
        int age = 19;
        char gender = '男';
        double score = 89.0;
        String address = "北京市";
        System.out.println("*******************学生信息如下*******************");
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        System.out.println("成绩：" + score);
        System.out.println("家庭地址：" + address);
    }
}
