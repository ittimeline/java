package net.ittimeline.java.foundational.oop.polymorphism;

/**
 * 猴子
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 17:41
 * @since JDK11
 */
public class Monkey extends Animal{

    public Monkey(String name){
        super(name);
    }


    @Override
    public void eat(Food food){
        System.out.println(this.getName()+"正在吃"+food.getName());
    }


    public void play(){
        System.out.println(this.getName()+"正在玩杂耍");
    }
}
