package net.ittimeline.java.web.foundational.dao;

import net.ittimeline.java.web.foundational.entity.User;

import java.util.List;

/**
 * 用户数据访问(对数据的增删改查)接口
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/3 16:05
 * @since JDK11
 */
public interface UserDao {




    /**
     * 单引号
     */
    String quotes = "'";

    /**
     * 新增用户
     * @param user
     * @return
     */
     int insert(User user);


    /**
     * 根据id或者是name删除用户
     * @param userCondition
     * @return
     */
     int delete(User userCondition);


    /**
     * 根据id修改用户名
     * 根据用户名修改密码
     * @param userCondition
     * @return
     */
     int update(User userCondition);


    /**
     * 查询用户
     * @param userCondition
     * @return
     */
     List<User> select(User userCondition);


     long count();


}
