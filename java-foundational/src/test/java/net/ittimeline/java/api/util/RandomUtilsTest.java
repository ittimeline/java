package net.ittimeline.java.api.util;

import org.testng.annotations.Test;

/**
 * 随机数工具类测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/26 11:16
 * @since JDK11
 */
public class RandomUtilsTest {


    @Test
    public void testVerificationCode(){
        for (int i = 0; i <10 ; i++) {
            System.out.println(RandomUtils.verificationCode(6));
        }
    }

    @Test
    public void testRandomPassword(){
        for (int i = 0; i < 10; i++) {
            System.out.println(RandomUtils.randomPassword(12));
        }
    }
}
