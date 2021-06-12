package net.ittimeline.java.api.lang.reflect;

import net.ittimeline.java.jdk.feature.java5.annotation.OrderHandler;
import org.testng.annotations.Test;

/**
 * 反射工具类的使用
 * @author tony 18601767221@163.com
 * @version 2021/6/12 20:32:18
 * @description
 * @since JDK11
 */

public class ReflectUtilsTest {


    @Test
    public void testReflectUtilsMockTest(){

        ReflectUtils.mockTest(OrderHandler.class);
    }
}
