package net.ittimeline.java.web.foundational.service;


import net.ittimeline.java.web.foundational.bean.entity.Account;
import net.ittimeline.java.web.foundational.bean.vo.AccountVO;
import net.ittimeline.java.web.foundational.bean.vo.PageBean;
import net.ittimeline.java.web.foundational.service.impl.AccountServiceImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * 账户业务逻辑测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 9:23
 * @since JDK11
 */

public class AccountServiceTest {

    private AccountService accountService=new AccountServiceImpl();


    /**
     * 测试事务能否正常提交和回滚
     */
    @Test
    public void testTransferAccounts(){
        String fromAccountName="tony";
        String toAccountName="jack";
        BigDecimal amount=new BigDecimal("500");

        boolean transferResult = accountService.transferAccounts(fromAccountName, toAccountName, amount);
        System.out.println("业务层的转账结果:"+transferResult);

    }


    @Test
    public void testFindAllAccount(){
        try {
            List<AccountVO> accountVOList = accountService.findAllAccount();
            if(null!=accountVOList){
                for (AccountVO accountVO : accountVOList) {
                    System.out.println(accountVO);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public void testAddAccount(){
        boolean addAccountResult = accountService.addAccount(new Account("王宝强", new BigDecimal("1100000.00")));
        Assert.assertEquals(addAccountResult,true);


    }

    @Test
    public void testDeleteAccountById(){

        boolean deleteAccountByIdResult = accountService.deleteAccountById(11L);
        Assert.assertEquals(deleteAccountByIdResult,true);
        System.out.println("删除账号的结果:"+deleteAccountByIdResult);
    }




    @Test
    public void testFindAccountById(){
        Account account = accountService.findAccountById(8L);
        Assert.assertNotNull(account);

    }

    @Test
    public void testUpdateAccount(){
        boolean updateAccountResult = accountService.updateAccount(new Account(8L, "huangbo", new BigDecimal("11111111"), 1));
        Assert.assertEquals(updateAccountResult,true);

        updateAccountResult =accountService.updateAccount(new Account(88L, "huangbo", new BigDecimal("11111111"), 1));

    }


    @Test
    public void testFindAccountByPage(){
        PageBean<AccountVO> pageBean = accountService.findAccountByPage(1L, 2);
        System.out.println(pageBean);

    }



}
