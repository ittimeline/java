package net.ittimeline.java.web.foundational.mapper;

import net.ittimeline.java.web.foundational.bean.entity.Account;
import net.ittimeline.java.web.foundational.bean.entity.User;
import net.ittimeline.java.web.foundational.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

/**
 * MyBatis的延迟加载使用的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/9/7 19:08
 * @since JDK11
 */
public class MyBatisLazyLoadUsageTest {

    /**
     * 手动实现延迟加载
     * 需求：
     * 1. 根据账号ID查询账号信息
     * 2. 根据账号ID查询账号信息，以及账号关联的用户信息
     */
    @Test
    public void testManualLazyLoad() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        //第一次查询
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        Account account = accountMapper.selectById(37L);
        //这里只会执行一次查询,因为只需要获取账号信息，而不需要获取账号关联的用户信息
        System.out.println("根据账号ID查询账号信息"
                + account.getId() + ":" + account.getName() + ":" + account.getBalance() + ":" + account.getStatus());

        //第二次查询
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectById(account.getUserId());
        account.setUser(user);

        //这里会执行两次查询，因为需要获取账号信息以及关联的用户信息，所以会分别查询jdbc_account和jdbc_user这两张表
        System.out.println("根据账号ID查询账号信息，以及账号关联的用户信息" + account);


    }

    /**
     * MyBatis的一对一关联查询延迟加载
     */
    @Test
    public void testMyBatisAutoOneToOneLazyLoad() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        //第一次查询
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        Account account = accountMapper.selectAccountUserInfoLazyLoad(37L);
//这里只会执行一次查询,因为只需要获取账号信息，而不需要获取账号关联的用户信息
  /*      System.out.println("根据账号ID查询账号信息"
                + account.getId() + ":" + account.getName() + ":" + account.getBalance() + ":" + account.getStatus());
*/
        // 第二次查询由MyBatis自动调用
        //这里会执行两次查询，因为需要获取账号信息以及关联的用户信息，所以会分别查询jdbc_account和jdbc_user这两张表
        System.out.println("根据账号ID查询账号信息，以及账号关联的用户信息" + account);

    }

    /**
     * MyBatis的一对多关联查询延迟加载
     */
    @Test
    public void testMyBatisAutoOneToManyLazyLoad(){

        //第一次查询
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUserAccountListLazyLoad(1L);
        //此处查询只会查询一次，因为只需要获取用户相关的信息，不需要知道用户关联的账号列表
        System.out.println("根据ID获取用户信息:"+user.getId()+":"+user.getName()+":"+user.getPassword());


        // 第二次查询由MyBatis自动调用
        // 此处会执行两次两次 因为需要根据用户ID查询用户信息并且查询用户关联的账号列表
       // System.out.println("根据用户ID查询用户信息并且查询用户关联的账号列表:"+user);


    }


}
