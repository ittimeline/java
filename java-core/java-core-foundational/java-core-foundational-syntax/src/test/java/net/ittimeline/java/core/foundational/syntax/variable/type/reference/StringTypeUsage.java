package net.ittimeline.java.core.foundational.syntax.variable.type.reference;

/**
 * String基本使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 9:55
 * @since Java21
 */
public class StringTypeUsage {
    public static void main(String[] args) {
        //1.两个特殊的字符串
        //定义一个String类型的变量empty，包含一个空字符串
        String empty = "";
        System.out.println("[" + empty + "]");

        //定义一个String类型的变量blank，包含一个空格
        String blank = " ";
        System.out.println("Hello" + blank + "World");

        //2.字符串的应用场景
        String name = "tony";
        String gender = "男";
        String address = "上海市";
        System.out.println("个人信息如下：");
        System.out.println("姓名：" + name);
        System.out.println("性别：" + gender);
        System.out.println("地址：" + address);
        //3.字符串字面量和字符字面量对比
        //字符字面量有且只有一个字符
        //此处编译错误
        //char ch = '';
        //字符串字面量有0到多个字符
        String str = "";
    }
}
