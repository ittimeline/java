package net.ittimeline.java.foundational.oop.polymorphism;

import net.ittimeline.java.foundational.oop.abstracts.Animal;
import net.ittimeline.java.foundational.oop.abstracts.Cat;
import net.ittimeline.java.foundational.oop.abstracts.Panda;

/**
 * 多态的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 17:36
 * @since JDK11
 */
public class PolymorphismTest {

    public static void main(String[] args) {
        // 父类的引用指向子类的对象
        Animal animal= new Cat();
        animal.eat();

        animal=new Panda();
        animal.eat();



    }
}
