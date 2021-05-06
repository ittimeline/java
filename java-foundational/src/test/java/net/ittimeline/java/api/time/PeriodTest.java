package net.ittimeline.java.api.time;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.Period;

/**
 * Period常用方法的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/4 11:03
 * @since JDK11
 */
public class PeriodTest {
    
    
    @Test
    public void testPeriodBetween(){

        LocalDate startDate = LocalDate.of(2021, 05, 04);
        LocalDate endDate = LocalDate.of(2023, 05, 04);

        Period period = Period.between(startDate, endDate);

        System.out.println("两个日期相距的年份"+period.getYears());
        System.out.println("两个日期相距的月份"+period.getMonths());
        System.out.println("两个日期相距的天数"+period.getDays());


    }
}
