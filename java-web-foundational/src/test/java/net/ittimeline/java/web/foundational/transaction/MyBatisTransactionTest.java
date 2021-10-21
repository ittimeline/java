package net.ittimeline.java.web.foundational.transaction;

import net.ittimeline.java.web.foundational.bean.entity.Account;
import net.ittimeline.java.web.foundational.mapper.AccountMapper;
import net.ittimeline.java.web.foundational.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

/**
 * MyBatis事务管理测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/9/2 19:24
 * @since JDK11
 */
public class MyBatisTransactionTest {


    /**
     * 测试事务一般使用增删改操作
     */
    @Test
    public void testMyBatisManualCommitTransaction() {
        //获取SqlSession并且关闭 事务的自动开启和提交
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        Account account = new Account("二郎神", new BigDecimal("1000000.00"), 1,1L);
        int insertResult = accountMapper.insert(account);
        System.out.println("获取新增账号后的账号ID" + account.getId());
        Assert.assertEquals(insertResult, 1);
        //手动提交事务并且关闭SqlSession
        SqlSessionUtil.commitAndClose(sqlSession);
    }

    /**
     * MyBatis的自动提交事务
     */
    @Test
    public void testMyBatisAutoCommitTransaction() {
        //获取SqlSession并且自动开启和提交事务
        SqlSession sqlSession = SqlSessionUtil.openSqlSession(true);
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        Account account = new Account("东海龙王", new BigDecimal("1000000.00"), 1,1L);
        int insertResult = accountMapper.insert(account);
        System.out.println("获取新增账号后的账号ID" + account.getId());
        Assert.assertEquals(insertResult, 1);
        //手动提交事务并且关闭SqlSession
        //SqlSessionUtil.commitAndClose(sqlSession);
    }

    /**
     * MyBatis手动开启、提交事务和回滚事务
     */
    @Test
    public void testMyBatisManuallyCommitRollbackTransaction() {
        //获取SqlSession并且关闭 事务的自动开启和提交
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        try {
            Account account = new Account("水德星君", new BigDecimal("1000000.00"), 1,1L);
            int insertResult = accountMapper.insert(account);
            System.out.println("获取新增账号后的账号ID" + account.getId());
            Assert.assertEquals(insertResult, 1);
         //   System.out.println(1/0);
            account = new Account("火德星君", new BigDecimal("1000000.00"), 1,1L);
            insertResult = accountMapper.insert(account);
            System.out.println("获取新增账号后的账号ID" + account.getId());
            Assert.assertEquals(insertResult, 1);
            //手动提交事务并且关闭SqlSession
            SqlSessionUtil.commitAndClose(sqlSession);
        } catch (Exception e) {
            System.out.println("程序遇到异常，事务回滚");
            SqlSessionUtil.rollbackAndClose(sqlSession);
        }

    }


}
