package net.ittimeline.java.web.foundational.service;

import net.ittimeline.java.web.foundational.entity.Account;
import net.ittimeline.java.web.foundational.bo.AccountBO;

/**
 * 账户业务逻辑接口
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 9:20
 * @since JDK11
 */
public interface AccountService {

    /**
     * 转账
     * @param sourceAccount
     * @param targetAccount
     * @return
     */
     boolean transferAccounts(AccountBO sourceAccount, AccountBO targetAccount);

    /**
     * 根据名字获取账户信息
     * @param accountCondition
     * @return
     */
     Account getAccountByName(AccountBO accountCondition);


}
