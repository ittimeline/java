package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量的三种分类
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/3 17:40
 * @since Java 25
 */
public class VariableType {

    static void main() {
        // 3. 局部变量：属于方法，只在方法内有效
        int number = 29;
    }
}

class UserInfo {

    // 1. 实例变量：属于对象，每个对象各有一份
    //实例变量
    String name;

    //实例变量
    int age;

    // 2. 静态变量：属于类，所有对象共享
    static String country = "China";
}