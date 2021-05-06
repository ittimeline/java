package net.ittimeline.java.api.time;

import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TreeSet;

/**
 * 带时区的日期时间API常用方法测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/5 6:51
 * @since JDK11
 */
public class ZonedDateTimeTest {

    @Test
    public void testGetZoneInfo() {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        TreeSet<String> availableZoneIdsTreeSet = new TreeSet<>(availableZoneIds);
        //将可用的时区信息变成有序并且打印输出在控制台，每行打印一个时区
        // availableZoneIdsTreeSet.forEach(System.out::println);

        ZoneId zoneId = ZoneId.of("Asia/Tokyo");

        System.out.println("东京的时区信息:" + zoneId);

        ZoneId defaultZoneId = ZoneId.systemDefault();

        System.out.println("系统默认的时区信息:" + defaultZoneId);


    }


    @Test
    public void testZonedDateTimeGetInstance() {

        ZonedDateTime defaultZoneDateTime = ZonedDateTime.now();
        System.out.println("系统默认时区的日期时间信息:" + defaultZoneDateTime);
        ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZoneDateTime = ZonedDateTime.now(tokyoZoneId);
        System.out.println("亚洲/东京时区的日期时间信息:" + tokyoZoneDateTime);


        LocalDateTime currentDateTime =LocalDateTime.now();
        ZonedDateTime wrapperCurrentDateTimeToTokyoZoneDateTime = ZonedDateTime.of(currentDateTime, tokyoZoneId);
        System.out.println("将当前日期时间包装成亚洲/东京时区的日期时间:"+wrapperCurrentDateTimeToTokyoZoneDateTime);


    }
}
