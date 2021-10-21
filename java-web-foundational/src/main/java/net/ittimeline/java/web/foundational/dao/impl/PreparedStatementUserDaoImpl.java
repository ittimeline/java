package net.ittimeline.java.web.foundational.dao.impl;

import net.ittimeline.java.web.foundational.dao.UserDao;
import net.ittimeline.java.web.foundational.bean.entity.User;
import net.ittimeline.java.web.foundational.util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 基于PreparedStatement实现的用户的增删改查，使用JDBC工具类
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/3 21:05
 * @since JDK11
 */

public class PreparedStatementUserDaoImpl implements UserDao {
    @Override
    public int insert(User user) {
        if (user != null && user.getName() != null && user.getPassword() != null) {
            //sql表示预编译的sql语句，如果sql语句有参数需要使用?来占位
            String sql = "insert into jdbc_user values(null,?,?,now(),now())";

            try (
                    Connection connection = JDBCUtil.getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ) {
                //给占位的参数设值
                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, user.getPassword());

                int row = preparedStatement.executeUpdate();
                return row;

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }


        return 0;
    }

    @Override
    public int delete(User userCondition) {
        String sql = null;

        //根据id删除
        if (null != userCondition && userCondition.getId() != null) {
            sql = "delete from jdbc_user where id =? ";
        }
        //根据name删除
        else if (null != userCondition && userCondition.getName() != null) {
            sql = "delete from jdbc_user where name = ?";
        }

        try (
                Connection connection = JDBCUtil.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            if (sql != null && sql != "") {

                if (null != userCondition && userCondition.getId() != null) {
                    preparedStatement.setInt(1, userCondition.getId());
                } else if (null != userCondition && userCondition.getName() != null) {
                    preparedStatement.setString(1, userCondition.getName());
                }
                System.out.println("删除用户执行的SQL语句是" + sql);
                int row = preparedStatement.executeUpdate();
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
            sql = "update jdbc_user set name =? where id = ? ";
        }
        //根据用户名修改密码
        else if (null != userCondition && userCondition.getName() != null && userCondition.getPassword() != null) {
            sql = "update jdbc_user set password = ? where name = ?";
        }
        try (
                Connection connection = JDBCUtil.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            if (sql != null && sql != "") {
                if (null != userCondition && userCondition.getId() != null && userCondition.getName() != null) {
                    preparedStatement.setString(1, userCondition.getName());
                    preparedStatement.setInt(2, userCondition.getId());

                } else if (null != userCondition && userCondition.getName() != null && userCondition.getPassword() != null) {
                    preparedStatement.setString(1, userCondition.getPassword());
                    preparedStatement.setString(2, userCondition.getName());
                }
                int row = preparedStatement.executeUpdate();
                return row;

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return 0;
    }

    @Override
    public List<User> select(User userCondition) {
        String sql = null;
        //查询所有
        if (userCondition == null) {
            sql = "select id,name,password,create_date,update_date from jdbc_user where 1=1";
        }

        //根据id查询
        else if (null != userCondition && userCondition.getId() != null) {
            sql = "select id,name,password,create_date,update_date from jdbc_user where id = ?";
        }

        //根据用户名和密码查询
        else if (null != userCondition && userCondition.getName() != null && userCondition.getPassword() != null) {
            sql = "select id,name,password,create_date,update_date from jdbc_user " +
                    "where name = ? and password = ? ";
        }

        try (
                Connection connection = JDBCUtil.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {

            if (sql != null && sql != "") {
                if (null != userCondition && userCondition.getId() != null) {
                    preparedStatement.setInt(1, userCondition.getId());

                } else if (null != userCondition && userCondition.getName() != null && userCondition.getPassword() != null) {
                    preparedStatement.setString(1, userCondition.getName());
                    preparedStatement.setString(2, userCondition.getPassword());
                }
            }
            System.out.println("查询用户执行的sql是" + sql);
            ResultSet resultSet = preparedStatement.executeQuery();
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
                user.setCreateDate(createDate.toLocalDateTime());
                user.setUpdateDate(updateDate.toLocalDateTime());

                userList.add(user);

            }
            return userList;


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
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {

            ResultSet resultSet = preparedStatement.executeQuery();
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
