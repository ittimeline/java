package net.ittimeline.java.web.foundational.mapper;

import net.ittimeline.java.web.foundational.bean.entity.Account;
import net.ittimeline.java.web.foundational.bean.vo.QueryVO;
import net.ittimeline.java.web.foundational.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.*;

/**
 * 账号管理-MyBatis实现的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/30 9:41
 * @since JDK11
 */
public class AccountMapperTest {



    @Test
    public void testSelectAccountById() {
        //一个测试方法一个SqlSession
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        Account account = accountMapper.selectById(37L);
        System.out.println("根据ID查询账号的结果" + account);
        //查询不会影响数据库的数据，可以不提交事务，也可以提交
        SqlSessionUtil.commitAndClose(sqlSession);
    }


    @Test
    public void testInsert() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        Account account = new Account("五娃", new BigDecimal("1000000.00"), 1,1L);
        int insertResult = accountMapper.insert(account);
        System.out.println("获取新增账号后的账号ID" + account.getId());
        Assert.assertEquals(insertResult, 1);
        SqlSessionUtil.commitAndClose(sqlSession);

    }

    @Test
    public void testUpdate() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        Account account = new Account(39L, "孙悟空", new BigDecimal("1111111"), 0);
        int updateRow = accountMapper.update(account);
        sqlSession.commit();
        Assert.assertEquals(updateRow, 1);

    }

    @Test
    public void testDeleteById() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        int deleteRow = accountMapper.deleteById(59L);
        sqlSession.commit();
        Assert.assertEquals(deleteRow, 1);

    }


    @Test
    public void testSelectAccountByPage() {
        Map<String, Long> map = new HashMap<>();
        //页码
        Long pageNo = 1L;
        //每页显示多少条
        Long pageSize = 2L;
        Long startIndex = (pageNo - 1) * pageSize;
        map.put("startIndex", startIndex);
        map.put("pageSize", pageSize);
        map.put("status", 0L);

        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accountList = accountMapper.selectAccountByPage(map);
        for (Account account : accountList) {
            System.out.println(account);
        }

    }


    @Test
    public void testSelectAccountByQueryVO() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        QueryVO<Account> queryVO = new QueryVO();
        Account accountCondition = new Account();
        accountCondition.setStatus(0);
        queryVO.setCondition(accountCondition);
        queryVO.setPageNo(1L);
        queryVO.setPageSize(2L);

        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accountList = accountMapper.selectAccountByQueryVO(queryVO);
        for (Account account : accountList) {
            System.out.println(account);
        }
    }


    @Test
    public void testSelectAccountListByStatus() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accountList = accountMapper.selectAccountListByStatus(null);
        System.out.println("账号状态为启用的用户数量是" + accountList.size());
    }

    @Test
    public void testSelectAccountListByStatusAndName() {
        Account accountCondition = new Account();
        accountCondition.setName("张飞");
        accountCondition.setStatus(1);

        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accountList = accountMapper.selectAccountListByStatusAndName(accountCondition);
        System.out.println("根据账号的名字和状态查询账号列表信息的结果是" + accountList);
    }


    @Test
    public void testDeleteByIds() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        // int deleteRows = accountMapper.deleteByIds(new ArrayList<>(Arrays.asList(21L, 23L, 24L)));
        // int deleteRows = accountMapper.deleteByIds(null);
        int deleteRows = accountMapper.deleteByIds(new ArrayList<>());
        sqlSession.commit();
        System.out.println("删除数据受影响的行数是" + deleteRows);
    }



    @Test
    public void testSelectAccountUserInfo(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        Account account = accountMapper.selectAccountUserInfo(37L);
        System.out.println("查询指定账号id的账号信息以及关联的用户信息 "+account);

    }


    @Test
    public void testSelectAccountListByUserId(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accountList = accountMapper.selectAccountListByUserId(1L);
        System.out.println("根据用户ID查询账号列表"+accountList);
    }


}
