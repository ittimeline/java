package net.ittimeline.java.foundational.oop.polymorphism;

/**
 * 动物类
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 17:46
 * @since JDK11
 */
public abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat(Food food);
}
