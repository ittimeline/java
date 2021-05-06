package net.ittimeline.java.api.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

/**
 * Objects常用方法的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/25 18:47
 * @since JDK11
 */
public class ObjectsTest {


    /**
     * 测试用String类的equals()方法，体会啥叫空指针异常
     * @see String#equals(Object)
     */
    @Test
    public void testStringEquals(){
        String str1=null;
        String str2="tony";
        System.out.println(str1.equals(str2));
    }

    /**
     * 测试用Objects类的equals()方法，体会如何解决空指针异常
     * @see java.util.Objects#equals(Object, Object)
     */
    @Test
    public void testObjectsEquals(){

        String str1=null;
        String str2="tony";
        boolean result=Objects.equals(str1, str2);
        //断言结果成立不报错
        Assert.assertEquals(result,false);

    }

    /**
     * 测试Objects类的nonNull()方法
     * @see Objects#nonNull(Object)
     */
    @Test
    public void testObjectsNonNull(){
        String str="";
        Assert.assertEquals(Objects.nonNull(str),true);

        str=null;
        Assert.assertEquals(Objects.nonNull(str),false);

    }



    /**
     * 测试Objects类的requireNonNull()方法
     * @see Objects#requireNonNull(Object)
     */
    @Test
    public void testObjectsRequiredNonNull(){

        String str=null;
        Objects.requireNonNull(str);

    }




}
