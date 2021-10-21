package net.ittimeline.java.web.foundational.util;

import org.testng.annotations.Test;

import java.sql.Connection;

/**
 * Druid数据源工具类测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/21 14:16
 * @since JDK11
 */
public class DruidDataSourceUtilTest {


    /**
     * 由于getConnection()方法它是从Druid连接池中获取的Connection，如果多次调用该方法，返回的肯定不是同一个连接。
     */
    @Test
    public void testGetConnectionFromDruidDataSource() {

        Connection connection1 = null;
        try {
            connection1 = DruidDataSourceUtil.getConnection();
            System.out.println(connection1);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Connection connection2 = null;
        try {
            connection2 = DruidDataSourceUtil.getConnection();
            System.out.println(connection2);

        } catch (Exception ex) {
            ex.printStackTrace();
        }    }

    /**
     * 使用ThreadLocal存取Connection
     */
    @Test
    public void testThreadLocalSetGetConnection() {
        ThreadLocal<Connection> threadLocal = new ThreadLocal<>();
        Connection connection = null;
        try {
            connection = DruidDataSourceUtil.getConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        threadLocal.set(connection);
        System.out.println(Thread.currentThread().getName() + " ---> " + threadLocal.get());

        //在main线程中创建一个线程
        new Thread(() -> {
            //在Thread-0中将ThreadLocal对象的值改成Java
            Connection connectionThread0 = null;
            try {
                connectionThread0 = DruidDataSourceUtil.getConnection();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            threadLocal.set(connectionThread0);
            System.out.println(Thread.currentThread().getName() + " ---> " + threadLocal.get());

        }).start();

        System.out.println(Thread.currentThread().getName() + " ---> " + threadLocal.get());

    }


}
