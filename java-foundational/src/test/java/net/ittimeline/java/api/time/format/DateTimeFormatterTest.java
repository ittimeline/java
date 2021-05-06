package net.ittimeline.java.api.time.format;

import net.ittimeline.java.api.util.DateTimeUtils;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author tony 18601767221@163.com
 * @version 2021/5/4 16:14
 * @since JDK11
 */
public class DateTimeFormatterTest {

    LocalDate currentDate =LocalDate.now();

    LocalTime currentTime = LocalTime.now();

    LocalDateTime currentDateTime =LocalDateTime.now();


    @Test
    public void testLocalDateFormat(){
        System.out.println("标准日期格式格式化日期后的日期信息:"+currentDate.format(DateTimeFormatter.ISO_LOCAL_DATE));

        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_DATE_FORMAT);
        System.out.println("自定义日期格式格式化日期后的日期信息:"+currentDate.format(customDateTimeFormatter));

    }


    @Test
    public void testLocalDateParse(){
        System.out.println("日期字符串转换为LocalDate对象后日期信息:"+LocalDate.parse("2021-05-04"));
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_DATE_FORMAT);
        System.out.println("日期字符串转换为LocalDate对象后日期信息:"+LocalDate.parse("2021年05月04日",customDateTimeFormatter));

    }


    @Test
    public void testLocalTimeFormat(){
        System.out.println("标准时间格式格式化日期后的时间信息:"+currentTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_TIME_FORMAT);
        System.out.println("自定义日期格式格式化日期后的时间信息:"+currentTime.format(customDateTimeFormatter));

    }


    @Test
    public void testLocalTimeParse(){
        /**
         * 标准时间格式格式化日期后的日期信息:16:23:23.505807
         * 自定义日期格式格式化日期后的日期信息:16时23分23秒
         */
        System.out.println("时间字符串转换为LocalTime对象后时间信息:"+LocalTime.parse("16:23:23.505807"));
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_TIME_FORMAT);
        System.out.println("时间字符串转换为LocalTime对象后时间信息:"+LocalTime.parse("16时23分23秒",customDateTimeFormatter));

    }


    /**
     * LocalDateTime转字符串
     */

    @Test
    public void testLocalDateTimeFormat(){
        System.out.println("标准时间格式格式化日期后的日期时间信息:"+currentDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_DATE_T_TIME_FORMAT);
        System.out.println("自定义日期格式格式化日期后的日期时间信息:"+currentDateTime.format(customDateTimeFormatter));

    }


    /**
     * 字符串转LocalDateTime
     */
    @Test
    public void testLocalDateTimeParse(){
        /**
         * 标准时间格式格式化日期后的日期信息:2021-05-04T16:29:20.8807126
         * 自定义日期格式格式化日期后的日期信息:2021-05-04T16:29:20
         */
        System.out.println("日期时间字符串转换为LocalDateTime对象后日期时间信息:"+LocalDateTime.parse("2021-05-04T16:29:20.8807126"));
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_DATE_T_TIME_FORMAT);
        System.out.println("日期时间字符串转换为LocalTime对象后日期时间信息:"+LocalDateTime.parse("2021-05-04T16:29:20",customDateTimeFormatter));

         // 2021-05-04T16:29:20.123
        customDateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeUtils.STANDARD_DATE_T_TIME_MIL_FORMAT);
        System.out.println("日期时间字符串转换为LocalTime对象后日期时间信息:"+LocalDateTime.parse("2021-05-04T16:29:20.123",customDateTimeFormatter));

    }








}
