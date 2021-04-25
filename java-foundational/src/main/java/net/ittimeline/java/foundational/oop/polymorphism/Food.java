package net.ittimeline.java.foundational.oop.polymorphism;

/**
 * 食物
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 17:48
 * @since JDK11
 */
public class Food {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food() {

    }

    public Food(String name) {
        this.name = name;
    }

}
