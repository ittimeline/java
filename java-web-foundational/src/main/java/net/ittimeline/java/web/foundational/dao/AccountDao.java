package net.ittimeline.java.web.foundational.dao;

import net.ittimeline.java.web.foundational.entity.Account;
import net.ittimeline.java.web.foundational.bo.AccountBO;

import java.util.List;

/**
 * 账户的数据访问接口
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 8:41
 * @since JDK11
 */
public interface AccountDao {

    /**
     * 更新转账的两个账户
     * @param sourceAccount 借款人
     * @param targetAccount 收款人
     * @return
     */
     boolean update(AccountBO sourceAccount, AccountBO targetAccount);

    /**
     * 根据账户信息查询账户
     * @param accountCondition 账户信息
     * @return
     */
     List<Account> select(Account accountCondition);
}
