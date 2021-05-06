package net.ittimeline.java.api.util;

import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日历的常用方法测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/2 17:41
 * @since JDK11
 */
public class CalendarTest {

    /**
     * 获取Calendar的实例的两种方式
     */
    public void testCalendarInstance(){
        Calendar gregorianCalendar =new GregorianCalendar();

        Calendar calendar= Calendar.getInstance();

    }

    /**
     * 通过Calendar获取日历相关的日期、时间信息
     */
    @Test
    public void testCalendarGet(){

        Calendar calendar= Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        //月份是从0开始的
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("日历的日期时间信息: %d年  %d月 %d日 %d时 %d分 %d秒 \n",year,month,day,hour,minute,second);


        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("本周是今年的第"+weekOfYear+"周");

        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("今天是今年的第"+dayOfYear+"天");


        /**
         * 老外的一周从周日开始
         * 国内的一周从周一开始
         */
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("今天是这周的第"+dayOfWeek+"天");

    }


    /**
     * 日历的修改
     */
    @Test
    public void testCalendarSetAdd(){

        //以当前系统时间创建日历对象
        Calendar calendar= Calendar.getInstance();
        System.out.println("日历对象修改之前的年份是"+calendar.get(Calendar.YEAR));

        calendar.set(Calendar.YEAR,1999);

        System.out.println("日历对象修改之后的年份是"+calendar.get(Calendar.YEAR));

        calendar.add(Calendar.YEAR,22);

        System.out.println("日历对象添加22年后的年份是"+calendar.get(Calendar.YEAR));


    }

    /**
     * Date转换为Calendar
     */
    @Test
    public  void testCalendarSetTime(){
        Date currentDate =new Date();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(currentDate);
        int year = calendar.get(Calendar.YEAR);
        //月份是从0开始的
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("日历的日期时间信息: %d年  %d月 %d日 %d时 %d分 %d秒 \n",year,month,day,hour,minute,second);
    }


    /**
     * 两个日历对象的比较
     */
    @Test
    public void testCalendarBeforeAfter(){

        Calendar calendar1=Calendar.getInstance();

        Date offsetDate =new Date(2000);

        Calendar calendar2=Calendar.getInstance();
        calendar2.setTime(offsetDate);

        System.out.println("calendar1 日历对象对应的年份"+calendar1.get(Calendar.YEAR));
        System.out.println("calendar2 日历对象对应的年份"+calendar2.get(Calendar.YEAR));

        System.out.println("calendar1.before(calendar2) = "+calendar1.before(calendar2));
        System.out.println("calendar1.after(calendar2) = "+calendar1.after(calendar2));


    }












}
