package net.ittimeline.java.api.text;

import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化常用方法的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/2 17:16
 * @since JDK11
 */
public class DateFormatTest {


    /**
     * 日期对象转换为日期字符串
     */
    @Test
    public void testDateFormatFormat(){
        Date date =new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatDate = dateFormat.format(date);
        System.out.println("当前时间的默认格式:"+date);
        System.out.println("当前时间的格式化的结果:"+formatDate);


    }


    /**
     * 日期字符串 转换为 日期对象
     */
    @Test
    public void testDateFormatParse(){
        //日期字符串和日期格式一定要匹配，否则会出现解析异常
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date parseDate = dateFormat.parse("2021-05-02 17:20:27");
            System.out.println("日期字符串 转换为 日期对象的结果"+parseDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }











}
