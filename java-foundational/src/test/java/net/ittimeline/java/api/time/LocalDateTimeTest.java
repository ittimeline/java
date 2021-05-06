package net.ittimeline.java.api.time;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Java8日期时间API-LocalDateTime常用方法的测试用例
 * @author tony 18601767221@163.com
 * @version 2021/5/4 15:55
 * @since JDK11
 */
public class LocalDateTimeTest {


    @Test
    public void testLocalDateTimeInstance(){
        LocalDateTime currentDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("当前日期时间信息:"+currentDateTime);
        LocalDateTime customDateTime = LocalDateTime.of(2021, 05, 04, 15, 58, 58);
        System.out.println("自定义日期时间信息:"+customDateTime);
    }

    @Test
    public void testLocalDateTimeGetLocalDateLocalTime(){
        LocalDateTime currentDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        LocalDate currentDate = currentDateTime.toLocalDate();
        LocalTime currentTime = currentDateTime.toLocalTime();
        System.out.println("当前日期信息:"+currentDate);
        System.out.println("当前时间信息:"+currentTime);



    }

}
