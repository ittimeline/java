package net.ittimeline.java.foundational.oop.abstracts;

/**
 * 熊猫(子类)
 * @author tony 18601767221@163.com
 * @version 2021/4/19 15:12
 * @since JDK11
 */
public class Panda extends Animal{


    public Panda(){}

    public Panda(String nationality){
        super(nationality);
    }


    @Override
    public void eat() {
        System.out.println("熊猫吃竹子");
    }

    @Override
    public void sleep(String nationality) {
        System.out.println(nationality+"熊猫正在睡觉");
    }
}
