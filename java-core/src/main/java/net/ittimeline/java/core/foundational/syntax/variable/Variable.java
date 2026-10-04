package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * Java变量
 * 1. 什么是变量？
 * 变量就是内存当中的一块空间，这块空间中存储了字面量（值/数据）
 * 2. 为什么叫变量？ 变体现在哪里
 * 体现在：这个空间中的具体字面量是可以在同一种数据类型的取值范围内变化的
 * 3. 变量有三个要素
 * 变量类型：决定内存空间开辟几个字节
 * 变量名字：通过名字访问内存空间
 * 变量值：值是可变的
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/3 14:44
 * @since Java 25
 */
public class Variable {
    static void main() {

        // 声明变量，在内存种定义一个int类型的变量，起名age
        int age;

        // 给变量初始化赋值，通过=运算符赋值
        // = 表示赋值运算符，将右边的字面量值赋值给左边的变量
        // 赋值运算符有个特点：右侧优先级高
        age = 22;

        //变量的访问：①读取、②修改
        //读取变量的值，采用字符串拼接的方式
        System.out.println("age = " + age);

        //修改变量的值
        age = 23 + 1;
        System.out.println("age = " + age);
        // 一个变量插入到字符串中有什么技巧？？？

        // 先添加双引号，双引号中间加两个加号，在两个加号中间插入变量名
        int left = 22;
        int right = 33;
        System.out.println(left + " + " + right + " = " + (left + right));

        String name = "tony";
        System.out.println("登录成功，欢迎[" + name + "]回来");

        //变量的访问：

    }
}
