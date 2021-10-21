package net.ittimeline.java.web.foundational.dao;

import net.ittimeline.java.web.foundational.dao.impl.AccountDaoImpl;
import net.ittimeline.java.web.foundational.bean.entity.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

/**
 * 账户数据访问测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 9:01
 * @since JDK11
 */

public class AccountDaoTest {

    private AccountDao accountDao = new AccountDaoImpl();


    @Test
    public void testUpdate() throws SQLException {
        boolean transferResult = accountDao.update("tony", new BigDecimal("500"));
        System.out.println("更新账户余额的结果" + transferResult);
    }


    @Test
    public void testSelectAll() {
        try {
            List<Account> accountList = accountDao.selectAll();
            Assert.assertEquals(accountList.size(), 7);
            if (null != accountList && accountList.size() > 0) {
                for (Account account : accountList) {
                    System.out.println(account);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testInsert() {
        try {
            boolean insertResult = accountDao.insert(new Account("黄渤", new BigDecimal("1000000.00")));
            Assert.assertEquals(insertResult, true);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testSelectOneByName() {
        try {
            Account account = accountDao.selectOne(new Account("tony"));
            System.out.println(account);
            Assert.assertEquals(account.getName(), "tony");

            account = accountDao.selectOne(new Account("王宝强"));
            Assert.assertEquals(account, null);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public void testDelete(){
        try {
            boolean deleteResult = accountDao.delete(new Account(12L));
            Assert.assertEquals(deleteResult,true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectOneById(){
        try {
            Account account = accountDao.selectOne(new Account(8L));
            Assert.assertNotNull(account);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testUpdateAccount(){
        try {
            boolean updateResult = accountDao.update(new Account(8L, "黄渤", new BigDecimal("88888888"), 0));
            Assert.assertEquals(updateResult,true);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    
    @Test
    public void testSelectAccountTotalCount(){
        try {
            Long totalCount = accountDao.selectAccountTotalCount();
            Assert.assertEquals(totalCount.longValue(),9);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testSelectAccountByPage(){
        try {
            List<Account> accountList = accountDao.selectAccountByPage(1L, 2,new Account(0));
            Assert.assertEquals(accountList.size(),2);
            //遍历分页的列表数据
            for (Account account : accountList) {
                System.out.println(account);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
