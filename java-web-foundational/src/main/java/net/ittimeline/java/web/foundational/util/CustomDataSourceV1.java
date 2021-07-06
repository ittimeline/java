package net.ittimeline.java.web.foundational.util;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * 自定义连接池的实现-基础版
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 18:17
 * @since JDK11
 */

public final class CustomDataSourceV1 {


    private static final LinkedList<Connection> connectionPool = new LinkedList<>();

    static {
        for (int i = 0; i < 5; i++) {
            Connection connection = JDBCUtil.getConnection();
            connectionPool.add(connection);
        }
        System.out.println("初始化连接池，当前连接池的可用连接数量是" + connectionPool.size());
    }


    /**
     * 获得连接
     * 首先从连接池中获取
     * 如果连接池中没有可用连接，那么就自己手动创建连接
     *
     * @return
     */
    public Connection getConnection() {
        System.out.println("从连接池获取连接之前当前连接池中可用的连接数量是"+connectionPool.size());
        Connection connection = null;
        //如果连接池中有可用连接
        if (connectionPool.size() > 0) {
            //直接返回
            connection = connectionPool.removeFirst();
            System.out.println("从连接池获取连接之后当前连接池中可用的连接数量是"+connectionPool.size());

        }else{
            connection = JDBCUtil.getConnection();
            System.out.println("当前连接池中的可用连接数量是"+connectionPool.size()+"手动创建连接对象"+connection);
        }
        return connection;

    }

    /**
     * 归还连接
     * @param connection
     */
    public void giveBackConnection(Connection connection){
        connectionPool.addLast(connection);
        System.out.println("归还连接之后当前连接池中可用的连接数量是"+connectionPool.size());
    }


}
