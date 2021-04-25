package net.ittimeline.java.foundational.oop.abstracts;

/**
 * 抽象类以及抽象方法的使用
 * @author tony 18601767221@163.com
 * @version 2021/4/19 15:13
 * @since JDK11
 */
public class AbstractClassTest {

    public static void main(String[] args) {
        //抽象类不能实例化
        //Animal animal= new Animal();

        Cat cat=new Cat();
        cat.eat();

        Panda panda=new Panda();
        panda.eat();


        Panda china =new Panda("中国");
        china.sleep(china.getNationality());

        Cat iran=new Cat("伊朗");
        iran.sleep(iran.getNationality());


    }
}
