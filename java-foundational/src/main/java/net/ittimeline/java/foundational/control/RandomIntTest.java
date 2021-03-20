package net.ittimeline.java.foundational.control;

import java.util.Random;

/**
 * 随机数测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/18 7:30
 * @since JDK11
 */
public class RandomIntTest {

    public static void main(String[] args) {

        Random random =new Random();
        // bound 是2的时候,产生的随机数就是0和1两个数字
        int value =random.nextInt(2);
        System.out.println("随机数是"+value);

        //产生1-100之间的随机数
        value=random.nextInt(100)+1;
        System.out.println("随机数是"+value);

    }
}
