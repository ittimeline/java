package net.ittimeline.java.web.foundational.dao.impl;

import net.ittimeline.java.web.foundational.dao.UserDao;
import net.ittimeline.java.web.foundational.bean.entity.User;
import net.ittimeline.java.web.foundational.util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 基于Statement实现用户的增删改查操作
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/3 16:13
 * @since JDK11
 */

public class StatementUserDaoImpl implements UserDao {

    @Override
    public int insert(User user) {
        if (user != null && user.getName() != null && user.getPassword() != null) {
            String name = user.getName();
            String password = user.getPassword();

            String comma = ",";

            String sql = "insert into jdbc_user values(null," + quotes + name + quotes + comma + quotes + password + quotes + ",now(),now())";
            //2. 获得连接
            try (
                    Connection connection = JDBCUtil.getConnection();
                    //3. 获取执行SQL的Statement对象
                    Statement statement = connection.createStatement();
            ) {
                System.out.println("新增用户执行的SQL语句是" + sql);
                //4. 执行SQL并获取返回结果
                int row = statement.executeUpdate(sql);
                //5.处理结果
                return row;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        //6.释放资源
        return 0;
    }

    @Override
    public int delete(User userCondition) {
        String sql = null;
        //根据id删除
        if (null != userCondition && userCondition.getId() != null) {
            sql = "delete from jdbc_user where id = " + userCondition.getId();
        }
        //根据name删除
        else if (null != userCondition && userCondition.getName() != null) {
            sql = "delete from jdbc_user where name = " + quotes + userCondition.getName() + quotes;
        }
        try (
                Connection connection = JDBCUtil.getConnection();
                Statement statement = connection.createStatement();
        ) {
            if (sql != null && sql != "") {
                System.out.println("删除用户执行的SQL语句是" + sql);
                int row = statement.executeUpdate(sql);
                return row;

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(User userCondition) {
        String sql = null;
        //拼接SQL
        //根据id修改name
        if (null != userCondition && userCondition.getId() != null && userCondition.getName() != null) {
            sql = "update jdbc_user set name =" + quotes + userCondition.getName() + quotes +
                    " where id =" + userCondition.getId();
        }
        //根据用户名修改密码
        else if (null != userCondition && userCondition.getName() != null && userCondition.getPassword() != null) {
            sql = "update jdbc_user set password = " + quotes + userCondition.getPassword() + quotes +
                    "where name = " + quotes + userCondition.getName() + quotes;
        }
        try (
                Connection connection = JDBCUtil.getConnection();
                Statement statement = connection.createStatement()
        ) {
            if (sql != null && sql != "") {
                System.out.println("执行修改用户的SQL语句是" + sql);
                int row = statement.executeUpdate(sql);
                return row;

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return 0;
    }


    @Override
    public List<User> select(User userCondition) {
        String sql = "";
        /**************************拼接SQL*****************************************/
        //查询所有
        if (userCondition == null) {
            sql = "select id,name,password,create_date,update_date from jdbc_user where 1=1";
        }
        //根据id查询
        else if (null != userCondition && userCondition.getId() != null) {
            sql = "select id,name,password,create_date,update_date from jdbc_user where id =" + userCondition.getId();
        }
        //根据用户名和密码查询
        else if (null != userCondition && userCondition.getName() != null && userCondition.getPassword() != null) {
            sql = "select id,name,password,create_date,update_date from jdbc_user " +
                    "where name =" + quotes + userCondition.getName() + quotes +
                    "and password = " + quotes + userCondition.getPassword() + quotes;
        }

        try (
                Connection connection = JDBCUtil.getConnection();
                Statement statement = connection.createStatement()
        ) {
            if (sql != null && sql != "") {
                System.out.println("执行查询用户的SQL是" + sql);
                ResultSet resultSet = statement.executeQuery(sql);
                List<User> userList = new ArrayList<>();
                while (resultSet.next()) {
                    User user = new User();

                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String password = resultSet.getString("password");
                    Timestamp createDate = resultSet.getTimestamp("create_date");
                    Timestamp updateDate = resultSet.getTimestamp("update_date");
                    user.setId(id);
                    user.setName(name);
                    user.setPassword(password);
                    user.setUpdateDate(createDate.toLocalDateTime());
                    user.setUpdateDate(updateDate.toLocalDateTime());

                    userList.add(user);

                }
                return userList;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public long count() {
        String sql = "select count(*) from jdbc_user";

        try (
                Connection connection = JDBCUtil.getConnection();
                Statement statement = connection.createStatement();
        ) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                long count = resultSet.getLong(1);
                return count;

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
