package net.ittimeline.java.api.time;

import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 查找并修改成特殊的日期API测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/5 7:23
 * @since JDK11
 */
public class TemporalAdjustersTest {

    /**
     * 测试TemporalAdjusters的常用方法
     */
    @Test
    public void testTemporalAdjusters(){

        LocalDate currentDate = LocalDate.now();
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.firstDayOfMonth();
        // 2021年5月1号
        System.out.println("将当前日期改成这个月的第一天的日期信息"+currentDate.with(temporalAdjuster));
        //2021年6月1号
        System.out.println("将当前日期改成下个月的第一天的日期信息"+currentDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        // 2021年1月1号
        System.out.println("将当前日期改成今年的第一天的日期信息"+currentDate.with(TemporalAdjusters.firstDayOfYear()));

        //2021-05-02
        System.out.println("将当前日期改成这个月的第一个星期天的日期信息"+currentDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)));
        // 2021-05-30
        System.out.println("将当前日期改成这个月的最后一个星期天的日期信息"+currentDate.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)));
       // 2022年1月1号
        System.out.println("将当前日期改成明年的第一天的日期信息"+currentDate.with(TemporalAdjusters.firstDayOfNextYear()));

        // 2021年5月31号
        System.out.println("将当前日期改成这个月的最后一天的日期信息"+currentDate.with(TemporalAdjusters.lastDayOfMonth()));
        // 2021年12月31号
        System.out.println("将当前日期改成今年的最后一天的日期信息"+currentDate.with(TemporalAdjusters.lastDayOfYear()));


    }
}
