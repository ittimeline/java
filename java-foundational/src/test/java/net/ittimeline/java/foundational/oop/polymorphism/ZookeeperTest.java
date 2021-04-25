package net.ittimeline.java.foundational.oop.polymorphism;

/**
 * 多态的应用测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 17:53
 * @since JDK11
 */
public class ZookeeperTest {

    public static void main(String[] args) {
        Zookeeper zookeeper=new Zookeeper();

        Animal animal=new Monkey("金丝猴");

        //向下转型
        Monkey monkey=(Monkey)animal;
        monkey.play();


        if(animal instanceof Tiger){
            //解决类型转换异常
            Tiger tiger=(Tiger) animal;
        }





        Food food=new Banana("泰国香蕉");

        zookeeper.feed(animal,food);


        animal=new Tiger("东北虎");
        food=new Meat("野猪肉");
        zookeeper.feed(animal,food);

        animal=new Giraffe("非洲长颈鹿");
        food=new Grass("青草");

        zookeeper.feed(animal,food);

        //形参多态和返回值多态的使用

        Animal animalReturnValue=zookeeper.getAnimal(monkey);
        System.out.println("动物的信息:"+animalReturnValue.getName());



    }
}
