package net.ittimeline.java.web.foundational.dao;

import net.ittimeline.java.web.foundational.dao.impl.CustomQueryRunnerUserDaoImpl;
import net.ittimeline.java.web.foundational.bean.entity.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * 用户数据访问接口测试
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/3 16:32
 * @since JDK11
 */

public class UserDaoTest {

    private UserDao userDao = new CustomQueryRunnerUserDaoImpl();


    @BeforeClass
    public void getUserDaoImpl(){
        System.out.println("当前userDao的实现类是"+userDao.getClass());
    }



    /**
     * 测试新增用户
     */
    @Test
    public void testInsert() {
        User user = new User();
        user.setName("tom");
        user.setPassword("666666");
        int row = 0;
        try {
            row = userDao.insert(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(row == 1 ? "新增用户成功" : "新增用户失败");

    }

    /**
     * 测试根据id或者是name删除用户
     */
    @Test
    public void testDelete() {
        User userCondition = new User();
        userCondition.setId(19);

        int row = 0;
        try {
            row = userDao.delete(userCondition);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(row == 1 ? "根据id删除用户成功" : "根据id删除用户失败");

        userCondition = new User();
        userCondition.setName("tom");
        try {
            row = userDao.delete(userCondition);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(row >= 1 ? "根据name删除用户成功" : "根据name删除用户失败");
    }


    /**
     * 测试根据id修改用户名
     * 测试根据用户名修改密码
     */
    @Test
    public void testUpdate() {
        System.out.println("当前执行修改用户的实现类是"+userDao.getClass());
        User userCondition = new User();
        userCondition.setId(2);
        userCondition.setName("Tony_CTO");
        int row = 0;
        try {
            row = userDao.update(userCondition);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(row == 1 ? "根据id修改用户名成功" : "根据id修改用户名失败");

        userCondition = new User();
        userCondition.setName("Tony_CTO");
        userCondition.setPassword("111111");
        try {
            row = userDao.update(userCondition);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(row == 1 ? "根据用户名修改密码成功" : "根据id修改密码失败");

    }


    /**
     * 测试查询所用用户
     * 测试根据id查询用户
     * 测试根据用户名和密码查询用户
     */
    @Test
    public void testSelect() {
        List<User> userList = null;
        try {
            userList = userDao.select(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("需求1.查询所有用户*****************" + userList);

        User userCondition = new User();
        userCondition.setId(1);
        try {
            userList = userDao.select(userCondition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("需求2.根据id查询用户*****************" + userList);


        userCondition = new User();
        userCondition.setName("admin");
        userCondition.setPassword("111111");
        try {
            userList = userDao.select(userCondition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("需求3.根据用户名和密码查询用户*****************" + userList);


        userCondition = new User();
        userCondition.setName("admin");
        userCondition.setPassword("111 ' or ' 1=1");
        try {
            userList = userDao.select(userCondition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("SQL注入后的查询结果"+userList);

    }


    @Test
    public void testSelectByName(){
        try {
            List<User> userList = userDao.select(new User("Tony_CTO"));
            Assert.assertEquals(userList.size(),1);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    @Test
    public void testSelectCount(){
        long count = 0;
        try {
            count = userDao.count();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("当前用户的数量"+count);
    }






}
