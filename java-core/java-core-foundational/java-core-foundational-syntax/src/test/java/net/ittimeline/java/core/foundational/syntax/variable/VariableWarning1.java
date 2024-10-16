package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量使用注意事项1
 * 变量在使用之前必须要定义，也就是必须先要声明和赋值
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 6:13
 * @since Java21
 */
public class VariableWarning1 {
    public static void main(String[] args) {
        //1.编译错误：找不到符号
        //System.out.println("age = " + age);

        int age;
        //2.编译错误：可能尚未初始化变量age
        //System.out.println("age = " + age);
    }
}
