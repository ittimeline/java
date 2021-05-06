package net.ittimeline.java.api.text;

import net.ittimeline.java.api.util.DateTimeUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat的线程安全问题
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/4 10:04
 * @since JDK11
 */
public class SimpleDatFormatNotThreadSafe {


    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat(DateTimeUtils.STANDARD_DATE_FORMAT);

        for (int i = 0; i < 30; i++) {
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Date parseDate = dateFormat.parse("2021年05月04日");
                        System.out.println("将日期字符串转换为日期对象的结果"+parseDate);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }




    }
}
