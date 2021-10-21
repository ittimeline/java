package net.ittimeline.java.web.foundational.mapper;

import net.ittimeline.java.web.foundational.bean.dto.UserInfo;
import net.ittimeline.java.web.foundational.bean.entity.User;
import net.ittimeline.java.web.foundational.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * 基于MyBatis的增删改查操作
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/27 18:22
 * @since JDK11
 */
public class UserMapperTest {


    @Test
    public void testSelectAll() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.selectAll();
        System.out.println("获取所有用户信息:" + userList);
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void testFindUserByUserNamePassword() {

        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserByUserNamePassword("admin", "111111");
        System.out.println("用户登录信息:" + user);

    }

    @Test
    public void testUserTotalCount() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Long count = userMapper.userTotalCount();
        System.out.println("统计用户的总数是" + count);

    }


    @Test
    public void testSelectUserInfoById() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserInfo userInfo = userMapper.selectUserInfoById(1L);
        System.out.println("根据ID获取用户信息的结果是" + userInfo);


    }


    @Test
    public void testSelectByName() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map map = userMapper.selectByName(null);
        System.out.println("根据用户名查询用户的结果是" + map);
    }


    @Test
    public void testSelectUserAccountList() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.selectUserAccountList(1L);
        System.out.println("查询指定账号id的账号信息以及关联的用户信息" + user);

    }

    @Test
    public void testSelectUserRoleList() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.selectUserRoleList(2L);
        System.out.println("查询指定用户ID的用户信息以及关联的角色列表" + user);

    }


    @Test
    public void testSelectUserById() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectById(1L);
        System.out.println("根据ID获取用户信息"+user);


    }


}
