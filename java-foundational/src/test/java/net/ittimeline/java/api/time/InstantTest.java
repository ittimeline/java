package net.ittimeline.java.api.time;

import org.testng.annotations.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 时间戳的常用方法测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/5 7:10
 * @since JDK11
 */
public class InstantTest {


    @Test
    public void testInstantGetInstance(){
        Instant currentInstant = Instant.now();
        //比当前系统时间晚了八小时
        System.out.println("当前的时间戳 (UTC时间):"+currentInstant);

        // 1970-01-01T00:00:03Z 指的是不带时区的UTC时间
        Instant plusThreeSecondsInstant = Instant.ofEpochSecond(3);
        System.out.println("当前标准基准时间(UTC时间)加上3秒的时间戳:"+plusThreeSecondsInstant);

        //1秒=1_000_000_000纳秒
        Instant plusFourSecondsInstant = Instant.ofEpochSecond(3, 1_000_000_000);
        System.out.println("当前标准基准时间(UTC时间)加上4秒的时间戳:"+plusFourSecondsInstant);



    }

    @Test
    public void testInstant2ZonedDateTime(){
        Instant currentInstant = Instant.now();
        ZoneId shanghaiZonedId=ZoneId.of("Asia/Shanghai");
        ZonedDateTime shanghaiZoneDateTime = currentInstant.atZone(shanghaiZonedId);
        System.out.println("亚洲/上海时区的日期时间信息:"+shanghaiZoneDateTime);

        ZoneId tokyoZonedId=ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZoneDateTime = currentInstant.atZone(tokyoZonedId);
        System.out.println("亚洲/东京时区的日期时间信息:"+tokyoZoneDateTime);



    }


}
