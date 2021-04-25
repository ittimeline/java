package net.ittimeline.java.foundational.oop.innerclass;

import net.ittimeline.java.foundational.oop.abstracts.Animal;

/**
 * 匿名内部类的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 17:14
 * @since JDK11
 */
public class AnonymousInnerClassTest {


    public static void main(String[] args) {

        //匿名内部类  没有名字的局部内部类
      Animal animal=  new Animal(){
            @Override
            public void eat() {
                System.out.println("大熊猫在吃竹子");
            }

            @Override
            public void sleep(String nationality) {
                System.out.println(nationality+"大熊猫正在睡觉");
            }
        };

      animal.eat();
      animal.sleep("中国四川");
    }
}
