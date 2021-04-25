package net.ittimeline.java.foundational.oop.polymorphism;

/**
 * 动物管理员
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 17:42
 * @since JDK11
 */
public class Zookeeper {

    /**
     * 动物管理员喂食物
     * @param animal
     * @param food
     */
    public void feed(Animal animal,Food food){
        animal.eat(food);
    }


    /**
     * 获取动物信息
     * @param animal
     * @return
     */
    public Animal getAnimal(Animal animal){
        return animal;
    }



}
