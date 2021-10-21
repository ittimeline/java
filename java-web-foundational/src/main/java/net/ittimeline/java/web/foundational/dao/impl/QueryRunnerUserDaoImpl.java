package net.ittimeline.java.web.foundational.dao.impl;

import net.ittimeline.java.web.foundational.dao.UserDao;
import net.ittimeline.java.web.foundational.bean.entity.User;
import net.ittimeline.java.web.foundational.util.DruidDataSourceUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 基于DbUtils提供的QueryRunner实现的用户增删改查操作
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/6 8:30
 * @since JDK11
 */

public class QueryRunnerUserDaoImpl implements UserDao {
    /**
     * 创建QueryRunner对象
     */
    private final QueryRunner queryRunner = new QueryRunner(DruidDataSourceUtil.getDataSource());


    @Override
    public int insert(User user) {
        if (user != null && user.getName() != null && user.getPassword() != null) {
            String sql = "insert into jdbc_user values(null,?,?,now(),now())";
            try {
                int row = queryRunner.update(sql, user.getName(), user.getPassword());
                return row;
            } catch (SQLException e) {
                e.printStackTrace();
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
            try {
                int row = queryRunner.update(sql, userCondition.getId());
                return row;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //根据name删除
        else if (null != userCondition && userCondition.getName() != null) {
            sql = "delete from jdbc_user where name = ?";
            try {
                int row = queryRunner.update(sql, userCondition.getName());
                return row;
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
            int row = 0;
            try {
                row = queryRunner.update(sql, userCondition.getName(), userCondition.getId());
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return row;
        }
        //根据用户名修改密码
        else if (null != userCondition && userCondition.getName() != null && userCondition.getPassword() != null) {
            sql = "update jdbc_user set password = ? where name = ?";
            int row = 0;
            try {
                row = queryRunner.update(sql, userCondition.getPassword(), userCondition.getName());
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return row;
        }
        return 0;
    }

    @Override
    public List<User> select(User userCondition) {

        String sql=null;
        //查询所有
        if (userCondition == null) {
            sql = "select id,name,password,create_date,update_date from jdbc_user where 1=1";
            try {
                List<User> userList = queryRunner.query(sql, new BeanListHandler<User>(User.class));
                if (null!=userList&&userList.size()>0){
                    return userList;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        //根据id查询
        else if (null != userCondition && userCondition.getId() != null) {
            sql = "select id,name,password,create_date,update_date from jdbc_user where id = ?" ;
            try {
                User user = queryRunner.query(sql, new BeanHandler<User>(User.class),userCondition.getId());
                if (null!=user){
                    List<User> userList=new ArrayList<>();
                    userList.add(user);
                    return userList;
                    
                }
               
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        //根据用户名和密码查询
        else if (null != userCondition && userCondition.getName() != null && userCondition.getPassword() != null) {
            sql = "select id,name,password,create_date,update_date from jdbc_user " +
                    "where name = ? and password = ? " ;
            try {
                User user = queryRunner.query(sql, new BeanHandler<User>(User.class), userCondition.getName(), userCondition.getPassword());
                if (null!=user){
                    List<User> userList=new ArrayList<>();
                    userList.add(user);
                    return userList;

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        
        return null;
    }

    @Override
    public long count() {
        String sql="select count(*) from jdbc_user";
        try {
            Long count = queryRunner.query(sql, new ScalarHandler<>());
            return count;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
