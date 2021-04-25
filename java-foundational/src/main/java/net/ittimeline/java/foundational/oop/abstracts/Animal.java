package net.ittimeline.java.foundational.oop.abstracts;

/**
 * 动物(父类)
 * @author tony 18601767221@163.com
 * @version 2021/4/19 15:08
 * @since JDK11
 */
public abstract class Animal {


    /**
     * 国籍
     */
    private String nationality;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Animal() {
    }

    /**
     * 抽象类构造方法的作用：给子类继承父类的成员变量赋值
     * @param nationality
     */
    public Animal(String nationality) {
        this.nationality = nationality;
    }

    /**
     * 动物吃东西
     */
    public abstract void eat();


    public abstract void sleep(String nationality);

}
