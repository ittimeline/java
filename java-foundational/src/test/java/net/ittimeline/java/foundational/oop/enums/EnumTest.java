package net.ittimeline.java.foundational.oop.enums;

/**
 * 枚举的使用测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/25 7:28
 * @since JDK11
 */
public class EnumTest {

    public static void main(String[] args) {

        Season spring=Season.SPRING;
        System.out.println(spring);


        spring= Season.getSeasonByDescription("春天");

        System.out.println(spring.getDescription());
    }
}
