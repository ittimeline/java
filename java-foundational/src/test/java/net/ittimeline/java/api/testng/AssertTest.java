package net.ittimeline.java.api.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 断言使用的测试用例
 * @author tony 18601767221@163.com
 * @version 2021/4/25 15:28
 * @since JDK11
 */
public class AssertTest {


    @Test
    public void testAssert(){
        Assert.assertEquals(1,1);

    }

}
