package net.ittimeline.java.api.lang;

import org.testng.annotations.Test;

/**
 * 错误
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/14 11:24
 * @since JDK11
 */
public class ErrorTest {



    public void createStackOverFlowError(){
        System.out.println("I'm StackOverFlowError ");
        createStackOverFlowError();
    }

    /**
     * 栈溢出错误
     */
    @Test
    public void testCreateStackOverFlowError(){
        createStackOverFlowError();

    }
}
