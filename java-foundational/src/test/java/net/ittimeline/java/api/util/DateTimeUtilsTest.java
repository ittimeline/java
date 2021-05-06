package net.ittimeline.java.api.util;

import org.testng.annotations.Test;

import java.time.Instant;
import java.util.Date;

/**
 * 日期时间工具类常用方法的测试用例
 * @author tony 18601767221@163.com
 * @version 2021/5/5 10:38
 * @since JDK11
 */
public class DateTimeUtilsTest {


    @Test
    public void testUTCTime2Date(){
        Instant instant =Instant.now();
        System.out.println(instant);
        // 2021-05-05T02:40:17.113886300Z
        String utcTime ="2021-05-05T02:40:17.113Z";
        Date date = DateTimeUtils.utcTime2Date(utcTime);
        System.out.println("UTC时间"+utcTime+"转换成Date的结果是"+date);
    }

    @Test
    public void testDate2UTCTime(){
        Date date=new Date();
        String utcTime= DateTimeUtils.date2UtcTime(date);
        System.out.println("当前日期"+date+"转换为UTC时间的结果是"+utcTime);
    }
}
