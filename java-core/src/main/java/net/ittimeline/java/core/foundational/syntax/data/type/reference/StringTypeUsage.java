package net.ittimeline.java.core.foundational.syntax.data.type.reference;

/**
 * String类型基本使用
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 13:43
 * @since Java 25
 */
public class StringTypeUsage {
    static void main() {
        //1.两个特殊字符串：空白字符串和空格字符串
        //定义一个String类型的变量blank，包含一个空白字符串
        String blank = "";
        System.out.println("[" + blank + "]");


        //定义一个String类型的变量space，包含一个空格字符串
        String space = " ";
        System.out.println("Hello" + space + "World");


        //2.字符串应用场景
        String name = "tony";
        String gender = "男";
        String address = "上海市黄浦区人民广场";
        System.out.println("个人信息如下：");
        System.out.println("姓名：" + name);
        System.out.println("性别：" + gender);
        System.out.println("地址：" + address);


        //3.字符串字面量和字符字面量对比
        //字符字面量有且只有一个字符
        //java: 空字符文字
        //char ch = '';

        //字符串字面量有0到n个字符
        String str = "";
    }
}
