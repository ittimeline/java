package net.ittimeline.java.web.foundational.dao.impl;

import net.ittimeline.java.web.foundational.dao.UserDao;
import net.ittimeline.java.web.foundational.bean.entity.User;
import net.ittimeline.java.web.foundational.util.CustomQueryRunner;
import net.ittimeline.java.web.foundational.util.DruidDataSourceUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 自定义QueryRunner实现用户的增删改查
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/6 11:08
 * @since JDK11
 */

public class CustomQueryRunnerUserDaoImpl implements UserDao {

    /**
     * 创建 CustomQueryRunner对象
     */
    private final CustomQueryRunner queryRunner = new CustomQueryRunner(DruidDataSourceUtil.getDataSource());


    @Override
    public int insert(User user) throws SQLException{
        if (user != null && user.getName() != null && user.getPassword() != null) {
            String sql = "insert into jdbc_user values(null,?,?,now(),now())";
            int row = queryRunner.update(sql, user.getName(), user.getPassword());
            return row;
        }
        return 0;
    }

    @Override
    public int delete(User userCondition)throws SQLException {
        String sql = null;

        //根据id删除
        if (null != userCondition && userCondition.getId() != null) {
            sql = "delete from jdbc_user where id =? ";
            int row = queryRunner.update(sql, userCondition.getId());
            return row;
        }
        //根据name删除
        else if (null != userCondition && userCondition.getName() != null) {
            sql = "delete from jdbc_user where name = ?";
            int row = queryRunner.update(sql, userCondition.getName());
            return row;
        }

        return 0;
    }

    @Override
    public int update(User userCondition)throws SQLException {
        String sql = null;
        //拼接SQL
        //根据id修改name
        if (null != userCondition && userCondition.getId() != null && userCondition.getName() != null) {
            sql = "update jdbc_user set name =? where id = ? ";
            int row = queryRunner.update(sql, userCondition.getName(), userCondition.getId());
            return row;
        }
        //根据用户名修改密码
        else if (null != userCondition && userCondition.getName() != null && userCondition.getPassword() != null) {
            sql = "update jdbc_user set password = ? where name = ?";
            int row = queryRunner.update(sql, userCondition.getPassword(), userCondition.getName());
            return row;
        }
        return 0;
    }

    @Override
    public List<User> select(User userCondition)throws Exception {
        String sql=null;

        //查询所有
        if (userCondition == null) {
            sql = "select id,name,password,create_date,update_date from jdbc_user where 1=1";
            List<User> userList = queryRunner.queryForList(sql, User.class);
            if (null!=userList&&userList.size()>0){
                return userList;
            }
        }

        //根据id查询
        else if (null != userCondition && userCondition.getId() != null) {
            sql = "select id,name,password,create_date,update_date from jdbc_user where id = ?" ;
            User user = queryRunner.queryForObject(sql, User.class,userCondition.getId());
            if (null!=user){
                List<User> userList=new ArrayList<>();
                userList.add(user);
                return userList;
            }
        }


        //根据用户名和密码查询
        else if (null != userCondition && userCondition.getName() != null && userCondition.getPassword() != null) {
            sql = "select id,name,password,create_date,update_date from jdbc_user " +
                    "where name = ? and password = ? " ;
            User user = queryRunner.queryForObject(sql, User.class, userCondition.getName(), userCondition.getPassword());
            if (null!=user){
                List<User> userList=new ArrayList<>();
                userList.add(user);
                return userList;

            }
        }

        //根据用户名查询
        else if (null != userCondition && userCondition.getName() != null) {
            sql = "select id,name,password,create_date,update_date from jdbc_user " +
                    "where name = ?" ;
            User user = queryRunner.queryForObject(sql, User.class, userCondition.getName());
            if (null!=user){
                List<User> userList=new ArrayList<>();
                userList.add(user);
                return userList;

            }
        }

        return null;
    }

    @Override
    public long count() throws SQLException {
        String sql="select count(*) from jdbc_user";
        return queryRunner.queryForType(sql,Long.class);
    }
}
