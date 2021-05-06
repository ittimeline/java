package net.ittimeline.java.api.util;


import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

/**
 * 日期/时间工具类
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/26 15:43
 * @since JDK11
 */
public class DateTimeUtils {

    /**
     * 标准日期时间格式
     */
    public static final String STANDARD_DATE_TIME_FORMAT ="yyyy-MM-dd HH:mm:ss";

    /**
     * 标准时间格式
     */
    public static final String STANDARD_TIME_FORMAT ="HH时mm分ss秒";


    /**
     * 标准日期格式
     */
    public static final String STANDARD_DATE_FORMAT="yyyy年MM月dd日";

    /**
     *
     */
    public static final String  STANDARD_DATE_T_TIME_FORMAT="yyyy-MM-dd'T'HH:mm:ss";


    /**
     * 标准时间，精确到毫秒
     */
    public static final String  STANDARD_DATE_T_TIME_MIL_FORMAT="yyyy-MM-dd'T'HH:mm:ss.SSS";



    public static final String  STANDARD_UTC_DATE_T_TIME_MIL_FORMAT="yyyy-MM-dd'T'HH:mm:ss.SSSZ";



    /**
     * 计算两个时间的差
     * @param startTime
     * @param endTime
     * @return 耗时时间
     */
    public static long calculatorTime(long startTime,long endTime){
        if(startTime>endTime){
            throw new RuntimeException("参数非法");
        }
        long time=endTime-startTime;
        return time;
    }


    /**
     * 将指定的日期对象按照标准的日期格式转化成日期字符串
     * @param date
     * @return
     */
    public static String  date2Str(Date date){
        DateFormat dateFormat=new SimpleDateFormat(STANDARD_DATE_TIME_FORMAT);
        return dateFormat.format(date);

    }


    /**
     * 将指定的日期对象按照指定的的日期格式转化成日期字符串
     * @param date
     * @param pattern
     * @return
     */
    public static String  date2Str(Date date,String pattern){
        DateFormat dateFormat=new SimpleDateFormat(pattern);
        return dateFormat.format(date);

    }

    /**
     * 将日期字符串按照指定的日期格式转换为日期对象
     * @param source 日期字符串
     * @param pattern 日期格式
     * @return
     */
    public static Date str2Date(String source,String pattern) {
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Date parseDate = null;
        try {
            parseDate = dateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parseDate;


    }


    /**
     * 将UTC时间字符串转换为java.util.Date对象
     * @param utcTime
     * @return
     */
    public static Date utcTime2Date(String utcTime){
        DateTime dateTime = DateTime.parse(utcTime, DateTimeFormat.forPattern(STANDARD_UTC_DATE_T_TIME_MIL_FORMAT));
        Date date = dateTime.toDate();
        return date;
    }

    /**
     * 将Date转换为UTC时间
     * @param date
     * @return
     */
    public static String date2UtcTime(Date date ){
        DateTime dateTime=new DateTime(date, DateTimeZone.UTC);
        return dateTime.toString();

    }




}
