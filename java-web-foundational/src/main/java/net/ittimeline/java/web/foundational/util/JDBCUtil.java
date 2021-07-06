package net.ittimeline.java.web.foundational.util;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC工具类
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/3 19:32
 * @since JDK11
 */

public final class JDBCUtil {

    private static String url;
    private static String name;
    private static String password;
    private static String driver;


    static {
        Properties properties = new Properties();
        try {
            //解析jdbc.properties
            //将解析的数据赋值给工具类的静态成员变量
            properties.load(JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            url = (String) properties.get("jdbc.url");
            name = (String) properties.get("jdbc.name");
            password = (String) properties.get("jdbc.password");
            driver = (String) properties.get("jdbc.driver");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //加载驱动
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取数据库的连接
     * @return
     */
    public static Connection getConnection(){
        Connection connection=null;
        try {
            connection = DriverManager.getConnection(url, name, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;

    }

    /**
     * 数据库操作释放资源
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static void release(ResultSet resultSet, Statement statement,Connection connection){
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
