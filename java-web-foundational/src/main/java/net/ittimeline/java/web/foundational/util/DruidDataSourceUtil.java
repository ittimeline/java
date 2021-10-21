package net.ittimeline.java.web.foundational.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Druid连接池工具类
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/5 10:17
 * @since JDK11
 */

public class DruidDataSourceUtil {

    /**
     * 连接池
     */
    private static DataSource dataSource;

    /**
     * 创建一个 ThreadLocal 对象用于存储Connection
     */
    private static final  ThreadLocal<Connection> THREAD_LOCAL_CONNECTION=new ThreadLocal<>();




    /**
     * 读取druid.properties
     */
    static {
        Properties properties=new Properties();
        try {
            properties.load(DruidDataSourceUtil.class.getClassLoader().getResourceAsStream("druid.properties"));
            //创建DruidDataSource
            dataSource= DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static DataSource getDataSource(){
        return dataSource;
    }

    /**
     * 获取连接的方法
     * 能够保证在同一个线程下获取的是同一个Connection
     * @return
     */
    public static Connection getConnection() throws SQLException {
        //首先从THREAD_LOCAL_CONNECTION中获取
        Connection connection = THREAD_LOCAL_CONNECTION.get();
        //如果没有就将Druid的连接放到THREAD_LOCAL_CONNECTION容器中
        if (null==connection){
            THREAD_LOCAL_CONNECTION.set(getDataSource().getConnection());
        }
        return THREAD_LOCAL_CONNECTION.get();
    }

    /**
     * 数据库操作释放资源
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static void release(ResultSet resultSet, Statement statement, Connection connection){
        if (resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



}
