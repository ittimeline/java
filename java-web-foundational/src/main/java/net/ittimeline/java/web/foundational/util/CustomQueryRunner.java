package net.ittimeline.java.web.foundational.util;

import javax.sql.DataSource;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 自定义QueryRunner
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/6 11:00
 * @since JDK11
 */

public class CustomQueryRunner {
    private static final String UNDER_LINE = "_";
    final DataSource dataSource;
    public CustomQueryRunner(final DataSource dataSource) {
        this.dataSource = dataSource;
    }
    /**
     * 数据的增删改
     *
     * @param sql
     * @param params
     * @return
     */
    public int update(String sql, Object... params) throws SQLException {
        if (null != dataSource && sql != null && sql != "") {
            try (
                    Connection connection = dataSource.getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ) {
                //获取SQL参数的元数据
                ParameterMetaData parameterMetaData = preparedStatement.getParameterMetaData();
                int parameterCount = parameterMetaData.getParameterCount();

                //给占位的参数设值
                for (int i = 1; i <= parameterCount; i++) {
                    preparedStatement.setObject(i, params[i - 1]);
                }
                int row = preparedStatement.executeUpdate();
                return row;
            } catch (SQLException ex) {
                throw  new SQLException(ex.getMessage());
            }
        }
        return -1;
    }

    /**
     * 数据的增删改
     *
     * @param connection
     * @param sql
     * @param params
     * @return
     */
    public int update(Connection connection ,String sql, Object... params) throws SQLException {
        if (null != dataSource && sql != null && sql != "") {
            try (
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ) {
                //获取SQL参数的元数据
                ParameterMetaData parameterMetaData = preparedStatement.getParameterMetaData();
                int parameterCount = parameterMetaData.getParameterCount();

                //给占位的参数设值
                for (int i = 1; i <= parameterCount; i++) {
                    preparedStatement.setObject(i, params[i - 1]);
                }
                int row = preparedStatement.executeUpdate();
                return row;
            } catch (SQLException ex) {
                throw new SQLException(ex.getMessage());
            }
        }
        return -1;
    }

    /**
     * 查询结果是单行单列的
     *
     * @param sql
     * @param clazz
     * @param params
     * @param <T>
     * @return
     */
    public <T> T queryForType(String sql, Class<T> clazz, Object... params) throws SQLException {
        if (null != dataSource && sql != null && sql != "") {
            try (
                    Connection connection = dataSource.getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ) {
                //获取SQL参数的元数据
                ParameterMetaData parameterMetaData = preparedStatement.getParameterMetaData();
                //给占位的参数设值
                for (int i = 1; i <= parameterMetaData.getParameterCount(); i++) {
                    preparedStatement.setObject(i, params[i - 1]);
                }
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    T result = resultSet.getObject(1, clazz);
                    return result;
                }
            } catch (SQLException ex) {
                throw new SQLException(ex.getMessage());
            }
        }
        return null;

    }
    /**
     * 查询结果是一条记录(单行多列)
     * 一条记录对应Java中的一个对象
     *
     * @param sql
     * @param clazz  对象类型
     * @param params 查询条件的参数
     * @param <T>    泛型类型
     * @return 返回类型是一个泛型类型
     * @throws Exception
     */
    public <T> T queryForObject(String sql, Class<T> clazz, Object... params) throws Exception {
        if (null != dataSource && null != sql && sql != "") {
            try (
                    Connection connection = dataSource.getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ) {
                //获取SQL参数的元数据
                ParameterMetaData parameterMetaData = preparedStatement.getParameterMetaData();
                //给占位的参数设值
                for (int i = 1; i <= parameterMetaData.getParameterCount(); i++) {
                    preparedStatement.setObject(i, params[i - 1]);
                }
                ResultSet resultSet = preparedStatement.executeQuery();
                T instance = null;
                while (resultSet.next()) {
                    instance = clazz.newInstance();
                    //获取结果集元数据
                    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                    //获取列的数量
                    int columnCount = resultSetMetaData.getColumnCount();
                    //遍历每个列
                    for (int i = 1; i <= columnCount; i++) {
                        // 属性名和表中的列名的名字要一致，才能保证结果集正确封装
                        String originColumnName = resultSetMetaData.getColumnName(i);
                        //属性就是去掉get/set并且首字母小写,例如setUpdateDate去掉set之后UpdateDate后首字母小写就是updateDate
                        Method[] allPublicMethod = clazz.getMethods();
                        for (Method publicMethod : allPublicMethod) {
                            String publicMethodName = publicMethod.getName();
                            if (publicMethodName.startsWith("set")) {
                                //去掉set
                                String publicMethodNameWithoutSet = publicMethodName.substring(3);
                                //获取去掉set之后的第一个字符
                                char firstChar = publicMethodNameWithoutSet.charAt(0);
                                //将第一个字符变成小写
                                char firstCharLowerCase = Character.toLowerCase(firstChar);
                                //获取属性名
                                String filedName = publicMethodNameWithoutSet.replace(firstChar, firstCharLowerCase);
                                //如果列名和属性名相等，那么就给属性赋值
                                if (compareColumnNameFiledName(originColumnName, filedName)) {
                                    publicMethod.invoke(instance, resultSet.getObject(i));
                                }
                            }
                        }
                    }
                }
                return instance;
            } catch (Exception ex) {
                throw new Exception(ex.getMessage());
            }
        }
        return null;
    }
    /**
     * 比较列名和属性名是否相等
     *
     * @param originColumnName 数据库的原列名
     * @param filedName        属性名
     * @return
     */
    private static boolean compareColumnNameFiledName(String originColumnName, String filedName) {
        //列名不包含下划线并且列名和属性名一致
        if (!originColumnName.contains(UNDER_LINE) && originColumnName.equals(filedName)) {
            return true;
        } else if (originColumnName.contains(UNDER_LINE)) {
            //由update_date_time转成updateDateTime
            String[] splitColumnWordNames = originColumnName.split(UNDER_LINE);
            StringBuffer columnNameAppender = new StringBuffer(splitColumnWordNames[0]);
            for (int i = 1; i < splitColumnWordNames.length; i++) {
                String splitColumnWordName = splitColumnWordNames[i];
                char firstCharLower = splitColumnWordName.charAt(0);
                char firstCharUpper = Character.toUpperCase(firstCharLower);
                String splitColumnWordNameFirstLetterUpper = splitColumnWordName.replace(firstCharLower, firstCharUpper);
                columnNameAppender.append(splitColumnWordNameFirstLetterUpper);
            }
            //由于StringBuffer没有重写toString()方法，因此需要转成String之后再做判断
            String columnName = columnNameAppender.toString();
            return columnName.equals(filedName);
        }
        return false;
    }
    /**     * 查询结果是多条记录(多行多列)

     *
     * @param sql
     * @param clazz  对象类型
     * @param params 查询条件的参数
     * @param <T>    泛型类型
     * @return 返回类型是一个泛型类型
     * @return
     */
    public <T> List<T> queryForList(String sql, Class<T> clazz, Object... params) throws Exception{
        if (null != dataSource && null != sql && sql != "") {
            try (
                    Connection connection = dataSource.getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ) {
                //获取SQL参数的元数据
                ParameterMetaData parameterMetaData = preparedStatement.getParameterMetaData();
                //给占位的参数设值
                for (int i = 1; i <= parameterMetaData.getParameterCount(); i++) {
                    preparedStatement.setObject(i, params[i - 1]);
                }
                ResultSet resultSet = preparedStatement.executeQuery();
                List<T> result = new ArrayList<>();

                while (resultSet.next()) {
                    T instance = clazz.newInstance();
                    //获取结果集元数据
                    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                    //获取列的数量
                    int columnCount = resultSetMetaData.getColumnCount();
                    //遍历每个列
                    for (int i = 1; i <= columnCount; i++) {
                        // 属性名和表中的列名的名字要一致，才能保证结果集正确封装
                        String originColumnName = resultSetMetaData.getColumnName(i);
                        //属性就是去掉get/set并且首字母小写,例如setUpdateDate去掉set之后UpdateDate后首字母小写就是updateDate
                        Method[] allPublicMethod = clazz.getMethods();
                        for (Method publicMethod : allPublicMethod) {
                            String publicMethodName = publicMethod.getName();
                            if (publicMethodName.startsWith("set")) {
                                //去掉set
                                String publicMethodNameWithoutSet = publicMethodName.substring(3);
                                //获取去掉set之后的第一个字符
                                char firstChar = publicMethodNameWithoutSet.charAt(0);
                                //将第一个字符变成小写
                                char firstCharLowerCase = Character.toLowerCase(firstChar);
                                //获取属性名
                                String filedName = publicMethodNameWithoutSet.replace(firstChar, firstCharLowerCase);
                                //如果列名和属性名相等，那么就给属性赋值
                                if (compareColumnNameFiledName(originColumnName, filedName)) {
                                    publicMethod.invoke(instance, resultSet.getObject(i));
                                }
                            }
                        }
                    }
                    if (instance != null) {
                        result.add(instance);
                    }
                }
                if (result!=null&&result.size()>0){
                    return result;
                }
            } catch (Exception ex) {
                throw new Exception(ex.getMessage());
            }
        }
        return null;
    }
}
