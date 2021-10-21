package net.ittimeline.java.web.foundational.cache;

import net.ittimeline.java.web.foundational.bean.entity.User;
import net.ittimeline.java.web.foundational.mapper.UserMapper;
import net.ittimeline.java.web.foundational.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

/**
 * MyBatis一级缓存和二级缓存的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/9/3 10:55
 * @since JDK11
 */
public class MyBatisCacheTest {

    /**
     * MyBatis一级缓存的使用
     * 同一个SqlSession对象可以使用一级缓存
     * 程序运行结果只查了一次数据库
     */
    @Test
    public void testMyBatisFirstLevelCacheUsed() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println("1.第一次使用userMapper查询所有用户信息");
        List<User> userList = userMapper.selectAll();
        for (User user : userList) {
            System.out.println(user);
        }

        System.out.println("2.第二次使用userMapper查询所有用户信息");
        userList = userMapper.selectAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    /**
     * MyBatis一级缓存的使用
     * 不同的SqlSession不能使用一级缓存
     * 程序运行结果查询两次数据库
     */
    @Test
    public void testMyBatisFirstLevelCacheUsedDifferentSqlSession() {
        SqlSession sqlSession1 = SqlSessionUtil.openSqlSession();
        SqlSession sqlSession2 = SqlSessionUtil.openSqlSession();
        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        System.out.println("1.第一次使用userMapper1查询所有用户信息");
        List<User> userList = userMapper1.selectAll();
        for (User user : userList) {
            System.out.println(user);
        }
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        System.out.println("2.第二次使用userMapper2查询所有用户信息");
        userList = userMapper2.selectAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    /**
     * MyBatis一级缓存的失效(清除)的场景
     * 1.调用了SqlSession对象的clearCache()方法
     * 2.数据发生了增删改
     * 缓存失效之后程序运行结果还是会执行两次SQL
     */
    @Test
    public void testMyBatisFirstLevelCacheInvalid(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println("1.第一次使用userMapper查询所有用户信息");
        List<User> userList = userMapper.selectAll();
        //清除一级缓存
     //   sqlSession.clearCache();
     //   System.out.println("调用了SqlSession的clearCache方法");

        System.out.println(userList);
        userMapper.deleteById(52L);
        sqlSession.commit();


        System.out.println("userMapper调用了deleteById方法");

        System.out.println("2.第二次使用userMapper查询所有用户信息");
        userList = userMapper.selectAll();
        System.out.println(userList);

    }


    /**
     * 二级缓存的使用
     * 二级缓存可以在同一个SqlSessionFactory下的多个SqlSession之间共享数据
     * 查询数据以后必须要关闭SqlSession，否则不会有二级缓存的效果
     * 程序运行结果显示只会查询一次数据库
     */
    @Test
    public void testMyBatisSecondLevelCacheUsed(){
        SqlSession sqlSession1=SqlSessionUtil.openSqlSession();
        SqlSession sqlSession2=SqlSessionUtil.openSqlSession();
        SqlSession sqlSession3=SqlSessionUtil.openSqlSession();

        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);

        System.out.println("使用userMapper1查询所有用户信息");
        System.out.println(userMapper1.selectAll());
        //二级缓存必须关闭SqlSession
        sqlSession1.close();

        System.out.println("使用userMapper2查询所有用户信息");
        System.out.println(userMapper2.selectAll());
        sqlSession2.close();


        System.out.println("使用userMapper3查询所有用户信息");
        System.out.println(userMapper3.selectAll());
        sqlSession3.close();

    }


    /**
     * 二级缓存的删除(失效)
     * 在数据发生增删改的时候二级缓存会失效
     * 程序运行结果表示 使用userMapper3查询所有用户信息会查询数据库，因为在执行之前数据发生了增删改操作
     */
    @Test
    public void testMyBatisSecondLevelCacheInvalid(){
        SqlSession sqlSession1=SqlSessionUtil.openSqlSession();
        SqlSession sqlSession2=SqlSessionUtil.openSqlSession();
        SqlSession sqlSession3=SqlSessionUtil.openSqlSession();

        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);

        System.out.println("使用userMapper1查询所有用户信息");
        System.out.println(userMapper1.selectAll());
        //二级缓存必须关闭SqlSession
        sqlSession1.close();

        System.out.println("使用userMapper2查询所有用户信息");
        System.out.println(userMapper2.selectAll());
        userMapper2.deleteById(49L);
        System.out.println("使用userMapper2删除了ID为49的用户信息");
        sqlSession2.commit();
        sqlSession2.close();

        System.out.println("使用userMapper3查询所有用户信息");
        System.out.println(userMapper3.selectAll());
        sqlSession3.close();

    }



}
