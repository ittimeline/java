package net.ittimeline.java.web.foundational.dao;

import net.ittimeline.java.web.foundational.dao.impl.AccountDaoImpl;
import net.ittimeline.java.web.foundational.bo.AccountBO;
import org.testng.annotations.Test;

import java.math.BigDecimal;

/**
 * 账户数据访问测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 9:01
 * @since JDK11
 */

public class AccountDaoTest {

    private AccountDao accountDao=new AccountDaoImpl();

   @Test
   public void testUpdate(){
       //交易金额100000块钱
       BigDecimal amount=new BigDecimal("100000.00");
       //借款人
       AccountBO sourceAccount =new AccountBO();
       sourceAccount.setName("tony");
       sourceAccount.setTransactionAmount(amount);

       //收款人
       AccountBO targetAccount =new AccountBO();
       targetAccount.setName("jack");
       targetAccount.setTransactionAmount(amount);
       boolean transactionResult = accountDao.update(sourceAccount, targetAccount);
       System.out.println(transactionResult==true?"转账成功":"转账失败");


   }



}
