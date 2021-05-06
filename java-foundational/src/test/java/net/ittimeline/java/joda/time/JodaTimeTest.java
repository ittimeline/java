package net.ittimeline.java.joda.time;

import net.ittimeline.java.api.util.DateTimeUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.testng.annotations.Test;

/**
 * Joda-Time常用API的方法使用测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/5 10:17
 * @since JDK11
 */
public class JodaTimeTest {


    @Test
    public  void testDateTime(){

        DateTime currentDateTime =DateTime.now();
        System.out.println("今天的日期时间信息:"+currentDateTime.toString(DateTimeUtils.STANDARD_DATE_TIME_FORMAT));

        DateTime tomorrowDateTime = currentDateTime.plusDays(1);
        System.out.println("明天的日期时间信息:"+tomorrowDateTime.toString(DateTimeUtils.STANDARD_DATE_TIME_FORMAT));

    }

    /**
     * LocalDate的日期计算
     */
    @Test
    public void testLocalDate(){
        LocalDate currentDate =LocalDate.now();
        System.out.println("当前日期信息:"+currentDate);
        //计算当前日期的3个月后的最后一天
        LocalDate threeMonthAfterLastDay = currentDate.plusMonths(3).dayOfMonth().withMaximumValue();
        System.out.println("计算当前日期的3个月后的最后一天日期信息"+threeMonthAfterLastDay);

        //计算当前日期的2个月前的第一天
        LocalDate twoMonthBeforeFirstDay = currentDate.minusMonths(2).dayOfMonth().withMinimumValue();
        System.out.println("计算当前日期的2个月前的第一天日期信息"+twoMonthBeforeFirstDay);

        // 计算当前日期3年前第五个月最后一天的日期 2018-05-31
        LocalDate resultDate = currentDate.minusYears(3).monthOfYear().setCopy(5).dayOfMonth().withMaximumValue();
        System.out.println("计算当前日期3年前第五个月最后一天的日期日期信息"+resultDate);


    }


}
