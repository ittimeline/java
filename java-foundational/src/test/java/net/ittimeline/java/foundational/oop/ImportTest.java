package net.ittimeline.java.foundational.oop;

import java.util.Date;

/**
 * 包导入语句的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/16 20:17
 * @since JDK11
 */
public class ImportTest {

    public static void main(String[] args) {
        Date date =new Date();
        java.sql.Date sqlDate =new java.sql.Date(System.currentTimeMillis());
    }
}
