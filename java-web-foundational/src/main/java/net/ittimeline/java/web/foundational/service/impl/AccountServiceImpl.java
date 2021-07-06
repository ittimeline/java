package net.ittimeline.java.web.foundational.service.impl;

import net.ittimeline.java.web.foundational.dao.AccountDao;
import net.ittimeline.java.web.foundational.dao.impl.AccountDaoImpl;
import net.ittimeline.java.web.foundational.entity.Account;
import net.ittimeline.java.web.foundational.bo.AccountBO;
import net.ittimeline.java.web.foundational.service.AccountService;

import java.math.BigDecimal;
import java.util.List;

/**
 * 账户业务逻辑实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 9:21
 * @since JDK11
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao = new AccountDaoImpl();


    @Override
    public boolean transferAccounts(AccountBO sourceAccountBO, AccountBO targetAccountBO) {
        //转账之前先查询借款人有没有钱，而且转账的金额不能大于(那就是小于等于)账户余额
        Account sourceAccount = getAccountByName(sourceAccountBO);
        Account targetAccount = getAccountByName(sourceAccountBO);
        if (null != sourceAccount && sourceAccount.getBalance() != null&&null!=targetAccount) {
            //账户余额不能小于0
            if (sourceAccount.getBalance().compareTo(BigDecimal.ZERO) == 1
                    //交易金额小于或者等于账户余额
                    && (targetAccountBO.getTransactionAmount().compareTo(sourceAccount.getBalance()) == -1
                    || targetAccountBO.getTransactionAmount().compareTo(sourceAccount.getBalance()) == 0)) {

                return accountDao.update(sourceAccountBO, targetAccountBO);
            } else {
                System.out.println("转账失败借款人的账户金额为0或者交易金额大于账户余额");
            }
        }
        return false;
    }

    @Override
    public Account getAccountByName(AccountBO accountBO) {
        Account accountCondition = new Account();
        accountCondition.setName(accountBO.getName());
        List<Account> accountList = accountDao.select(accountCondition);
        if (accountList != null && accountList.size() == 1) {
            Account account = accountList.get(0);
            return account;
        }
        return null;
    }
}
