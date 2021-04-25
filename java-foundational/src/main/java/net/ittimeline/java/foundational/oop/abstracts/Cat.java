package net.ittimeline.java.foundational.oop.abstracts;

/**
 * 猫(子类)
 * @author tony 18601767221@163.com
 * @version 2021/4/19 15:11
 * @since JDK11
 */
public class Cat extends Animal{


    public Cat(){}

    public Cat(String nationality){
        super(nationality);
    }


    /**
     * 动物吃东西
     * 子类重写父类的抽象方法
     */
    @Override
    public void eat() {
        System.out.println("小猫吃鱼");
    }

    @Override
    public void sleep(String nationality) {
        System.out.println(nationality+"小猫正在睡觉");
    }
}
