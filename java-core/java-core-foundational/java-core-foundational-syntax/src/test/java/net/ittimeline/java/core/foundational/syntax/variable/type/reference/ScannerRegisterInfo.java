package net.ittimeline.java.core.foundational.syntax.variable.type.reference;

import java.util.Scanner;

/**
 * 用户注册
 * 需求：读取用户从键盘输入的交友网注册信息并输出，注册信息包括姓名、年龄、性别、身高、体重、婚姻状况
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 18:52
 * @since Java21
 */
public class ScannerRegisterInfo {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎访问交友网，请先注册！");
        System.out.println("请输入你的姓名");
        String name = scanner.next();
        System.out.println("请输入你的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入你的性别（男/女)");
        String genderStr = scanner.next();
        //获取键盘输入的第一个字符
        char gender = genderStr.charAt(0);

        System.out.println("请输入你的身高");
        double height = scanner.nextDouble();
        System.out.println("请输入你的体重");
        double weight = scanner.nextDouble();
        System.out.println("请输入你的婚姻状况(true:已婚\\false:未婚)");
        boolean isMarried = scanner.nextBoolean();
        System.out.println("用户注册成功");
        String userInfo = "用户姓名：" + name + " 年龄" + age + " 性别:" + gender + " 身高:" + height
                + " 体重：" + weight + " 婚姻状况：" + isMarried;
        System.out.println("交友网用户注册信息:" + userInfo);
        //关闭资源
        scanner.close();
    }
}
