package net.ittimeline.java.api.util;

import org.testng.annotations.Test;

import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 日期时间常用方法的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/2 16:54
 * @since JDK11
 */
public class DateTimeTest {



    /**
     * 创建Date对象的几种方式
     */
    @Test
    public void testDateConstructor(){
        Date currentDate = new Date();
        System.out.println("当前日期时间:"+currentDate);


        /**
         * 标准基准时间  1970年01月01日 00:00:00
         * 中国标准基准时间  1970年01月01日 08:00:00
         * 2000毫秒 换算成秒 2
         * 1970年01月01日 08:00:02
         */
        Date offsetDate =new Date(2000);
        System.out.println("offsetDate = "+offsetDate);


    }


    /**
     * 获取时间
     * 设置时间
     * @see Date#getTime()
     * @see Date#setTime(long)
     */
    @Test
    public void setDateGetTimeSetTime(){
        Date currentDate =new Date();
        System.out.println("当前时间距离标准基准时间的毫秒数"+currentDate.getTime());
        System.out.println("当前时间距离标准基准时间的毫秒数"+System.currentTimeMillis());

        Date offsetDate =new Date();
        offsetDate.setTime(2000);
        System.out.println("offsetDate = "+offsetDate);

    }


    /**
     * 日期的比较
     */
    @Test
    public void testDateBeforeAfter(){
        Date date1=new Date();
        date1.setTime(2000);

        Date date2=new Date();

        System.out.println("date1 = "+date1);
        System.out.println("date2 = "+date2);
        System.out.println("date1.before(date2) = "+date1.before(date2));
        System.out.println("date1.after(date2) = "+date1.after(date2));


    }















}
