package net.ittimeline.java.web.foundational.service;

import net.ittimeline.java.web.foundational.bo.AccountBO;
import net.ittimeline.java.web.foundational.service.impl.AccountServiceImpl;
import org.testng.annotations.Test;

import java.math.BigDecimal;

/**
 * 账户业务逻辑测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 9:23
 * @since JDK11
 */

public class AccountServiceTest {

    private AccountService accountService=new AccountServiceImpl();

    @Test
    public void testTransferAccounts(){
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

        boolean transactionResult = accountService.transferAccounts(sourceAccount, targetAccount);
        System.out.println(transactionResult==true?"转账成功":"转账失败");

    }
}
