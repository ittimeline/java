package net.ittimeline.java.foundational.oop.polymorphism;

/**
 * 长颈鹿
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 18:03
 * @since JDK11
 */
public class Giraffe extends Animal{

    public Giraffe(String name){
        super(name);
    }

    @Override
    public void eat(Food food) {
        System.out.println(this.getName()+"正在吃"+food.getName());
    }
}
