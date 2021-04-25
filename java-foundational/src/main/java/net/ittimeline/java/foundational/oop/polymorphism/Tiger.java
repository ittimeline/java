package net.ittimeline.java.foundational.oop.polymorphism;

/**
 * 老虎
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 17:44
 * @since JDK11
 */
public class Tiger extends Animal{

    public Tiger(String name){
        super(name);
    }

    @Override
    public void eat(Food food){
        System.out.println(this.getName()+"正在吃"+food.getName());

    }
}
