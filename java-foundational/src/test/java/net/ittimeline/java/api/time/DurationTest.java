package net.ittimeline.java.api.time;

import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalTime;

/**
 * @author tony 18601767221@163.com
 * @version 2021/5/4 16:06
 * @since JDK11
 */
public class DurationTest {


    @Test
    public void testDurationBetween(){

        LocalTime startTime  = LocalTime.of(5,30,00);
        LocalTime endTime  = LocalTime.of(6,00,00);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("两个时间相隔了"+duration.getSeconds()+"秒");
    }
}
