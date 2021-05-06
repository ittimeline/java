package net.ittimeline.java.api.time;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Java8日期API-本地日期常用方法的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/4 10:22
 * @since JDK11
 */
public class LocalDateTest {

    LocalDate now = LocalDate.now();


    @BeforeClass
    public void initLocalDate(){
        System.out.println("当前的日期信息:"+now);
    }

    /**
     * 获取LocalDate对象的两种方式
     */
    @Test
    public void testLocalDateInstance(){

        LocalDate now = LocalDate.now();
        System.out.println("当前的日期信息:"+now);

        LocalDate currentDate = LocalDate.of(2021, 05, 04);
        System.out.println("当前的日期信息:"+currentDate);

    }

    /**
     * 通过LocalDate获取日期相关的信息
     */
    @Test
    public void testLocalDateGetDateInfo(){
        int year = now.getYear();
        Month month = now.getMonth();
        int dayOfMonth = now.getDayOfMonth();

        System.out.println("当前的日期信息:"+year+"年"+month.getValue()+"月"+dayOfMonth+"日");

        boolean leapYear = now.isLeapYear();
        System.out.println("2021年是否是闰年:"+leapYear);

        LocalDate customDate=LocalDate.of(2016,02,02);
        System.out.println("2016年是否是闰年:"+customDate.isLeapYear());

        System.out.println("今年有"+now.lengthOfYear()+"天");
        System.out.println("这个月有"+now.lengthOfMonth()+"天");

        System.out.println("今天是这周的第"+now.getDayOfWeek().getValue()+"天");
        System.out.println("今天是今年的第"+now.getDayOfYear()+"天");


    }


    /**
     * LocalDate的日期的修改
     */
    @Test
    public void testLocalDateUpdate(){
        LocalDate withYearDate = now.withYear(2018);
        System.out.println("将当前日期的年份改成2018年后的日期信息:"+withYearDate);

        LocalDate withMonthDate = now.withMonth(4);
        System.out.println("将当前日期的月份改成4月后的日期信息:"+withMonthDate);

        LocalDate withDayOfMonthDate = now.withDayOfMonth(28);
        System.out.println("将当前日期的日期改成28号后的日期信息:"+withDayOfMonthDate);

        //链式编程 将当前日期改成2018年4月28号
        LocalDate finalDate = now.withYear(2018).withMonth(4).withDayOfMonth(28);
        System.out.println("将当前日期改成2018年4月28号的日期信息"+finalDate);

        LocalDate withDate = now.with(ChronoField.YEAR, 2019);
        System.out.println("修改当前日期年份为2019后的日期信息:"+withDate);


    }

    /**
     * 日期的算术运算
     */
    @Test
    public void testLocalDatePlusMinus(){


        //日期加法
        LocalDate oneYearAfterDate = now.plusYears(1);
        System.out.println("一年以后的日期信息:"+oneYearAfterDate);

        LocalDate threeMonthAfterDate = now.plusMonths(3);
        System.out.println("3个月以后的日期信息:"+threeMonthAfterDate);

        LocalDate tenDaysAfterDate = now.plusDays(10);
        System.out.println("10天以后的日期信息:"+tenDaysAfterDate);


        //日期的减法
        LocalDate fiveYearBeforeDate = now.minusYears(5);
        System.out.println("5年以前的日期信息:"+fiveYearBeforeDate);

        LocalDate fiveDaysBeforeDate = now.minus(5, ChronoUnit.DAYS);
        System.out.println("5天以前的日期信息:"+fiveDaysBeforeDate);
    }


    /**
     * 日期的判断
     */
    @Test
    public void testLocalDateIsBeforeIsAfter(){
        //日期加法
        LocalDate oneYearAfterDate = now.plusYears(1);
        System.out.println("一年以后的日期信息:"+oneYearAfterDate);

        //日期的减法
        LocalDate fiveYearBeforeDate = now.minusYears(5);
        System.out.println("5年以前的日期信息:"+fiveYearBeforeDate);

        boolean before = now.isBefore(fiveYearBeforeDate);
        System.out.println("当前日期是否在5年以前的日期之前"+before);

        boolean after = now.isAfter(fiveYearBeforeDate);
        System.out.println("当前日期是否在5年以前的日期之后"+after);

    }














}
