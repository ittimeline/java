package net.ittimeline.java.api.time;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Java8时间API-LocalTime常用方法使用的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/4 15:13
 * @since JDK11
 */
public class LocalTimeTest {
    LocalTime now =null;

    @BeforeClass
    public void initLocalTime(){
        now=LocalTime.now();
        System.out.println("当前时间信息:"+now);
    }

    /**
     * 两种创建LocalTime对象的方法
     */
    @Test
    public void testLocalTimeInstance(){
        LocalTime now = LocalTime.now();
        System.out.println("当前时间信息:"+now);

        LocalTime customTime = LocalTime.of(15, 15, 15);
        System.out.println("自定义时间信息:"+customTime);
    }

    @Test
    public void testLocalTimeGetTimeInfo(){
        System.out.println("当前时间信息:"+now.getHour()+"时"+now.getMinute()+"分"+now.getSecond()+"秒"+now.getNano()+"纳秒");
    }

    @Test
    public void testLocalTimeUpdateTime(){
        LocalTime withOneHour = now.withHour(1);
        System.out.println("当前时间的小时部分改成1点之后的时间信息:"+withOneHour);

        LocalTime withTenMinutes = now.withMinute(10);
        System.out.println("当前时间的分钟部分改成10分钟之后的时间信息:"+withTenMinutes);

        LocalTime withTenSeconds = now.withSecond(10);
        System.out.println("当前时间的分钟部分改成10秒钟之后的时间信息:"+withTenSeconds);


    }


    @Test
    public void testLocalTimeIsBeforeIsAfter(){
        LocalTime withOneHour = now.withHour(1);
        System.out.println("当前时间的小时部分改成1点之后的时间信息:"+withOneHour);

        LocalTime withTenMinutes = now.withMinute(10);
        System.out.println("当前时间的分钟部分改成10分钟之后的时间信息:"+withTenMinutes);


        System.out.println("当前时间是否在1点之前:"+now.isBefore(withOneHour));
        System.out.println("当前时间是否在1点之后:"+now.isAfter(withOneHour));


    }


    @Test
    public void testLocalTimePlusMinus(){
        System.out.println("当前时间加1小时后的时间信息:"+now.plusHours(1));
        System.out.println("当前时间减1小时后的时间信息:"+now.minusHours(1));
        System.out.println("当前时间加10分钟后的时间信息:"+now.plusMinutes(10));
        System.out.println("当前时间减10分钟后的时间信息:"+now.minusMinutes(10));


    }


}
