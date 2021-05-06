package net.ittimeline.java.api.util;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 随机数的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/26 11:00
 * @since JDK11
 */
public class RandomTest {

    @Test
    public void testRandomDefaultConstructor(){
        //产生10个随机整数，随机数的取值范围是int的取值范围
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt()+" ");
        }
    }

    /**
     * 产生指定范围的随机数
     */
    @Test
    public void testRandomBound(){

        //产生30个0-9之间的随机数
        Random random=new Random();
        for (int i = 0; i < 30; i++) {
            System.out.print(random.nextInt(10)+" ");
        }
    }




    @Test
    public void testRandomSeed(){
        Random random=new Random(88);
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt()+" ");
        }
        // -1177030515 -441328586 -1138069217 2008506121 -1829342380 134862877 1538110139 1980847304 1414505319 -785916362
    }


    @Test
    public void testThreadLocalRandom(){
        ThreadLocalRandom threadLocalRandom=ThreadLocalRandom.current();
        //产生10个0.0-100.0之间的小数，不包括100.0
        for (int i = 0; i < 10; i++) {
            System.out.println(threadLocalRandom.nextDouble(100.0)+" ");
        }
    }
}
