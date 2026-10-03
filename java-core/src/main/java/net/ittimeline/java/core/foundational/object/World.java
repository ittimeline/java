package net.ittimeline.java.core.foundational.object;

/**
 * public class和class的区别
 * 1.一个源文件可以有多个class,一个class可以生成一个class文件
 * 2.public class 不是必须的
 * 3.public class对应的类名和Java源文件名保持一致
 * 4.public class 在源文件中只能有一个
 * 5.任何一个类中都可以有main方法，但是通常情况下一个Java程序只有一个main方法
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/3 12:31
 * @since Java 25
 */
public class World {
    void main(){
        System.out.println("This is my world");
    }
}

class Chinese{

}

class American{

}