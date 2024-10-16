package net.ittimeline.java.core.foundational.syntax;

/**
 * 使用变量存储学生信息
 * 需求：学生信息包括姓名、年龄、性别、成绩、地址，要求使用合理的数据类型存储并打印输出
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 22:30
 * @since Java21
 */
public class StudentInfo {
    public static void main(String[] args) {
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
