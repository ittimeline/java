package net.ittimeline.java.web.foundational.util;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

/**
 * 自定义连接池的实现-高级版
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 18:38
 * @since JDK11
 */

public final class CustomDataSourceV2 implements DataSource {
    private static final LinkedList<Connection> connectionPool = new LinkedList<>();

    static {
        for (int i = 0; i < 5; i++) {
            Connection connection = JDBCUtil.getConnection();
            connectionPool.add(connection);
        }
        System.out.println("初始化连接池，当前连接池的可用连接数量是" + connectionPool.size());
    }
    @Override
    public Connection getConnection() throws SQLException {

        System.out.println("【高级版】从连接池获取连接之前当前连接池中可用的连接数量是"+connectionPool.size());
        Connection connection = null;
        //如果连接池中有可用连接
        if (connectionPool.size() > 0) {
            //直接返回
            connection = connectionPool.removeFirst();
            //创建Connection装饰类对象
            ConnectionDecorator connectionDecorator=new ConnectionDecorator(connection,connectionPool);
            System.out.println("【高级版】从连接池获取连接之后当前连接池中可用的连接数量是"+connectionPool.size());
            System.out.println("【高级版】从连接池获取连接之后当前连接的实现"+connectionDecorator.getClass());

            //此时返回的是增强的连接，就是将原有的Connection的close()方法改成归还连接
            return connectionDecorator;
        }else{
            connection = JDBCUtil.getConnection();
            System.out.println("【高级版】当前连接池中的可用连接数量是"+connectionPool.size()+"手动创建连接对象"+connection);
        }
        return connection;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
