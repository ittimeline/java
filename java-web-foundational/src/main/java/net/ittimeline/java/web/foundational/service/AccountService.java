package net.ittimeline.java.web.foundational.service;



import net.ittimeline.java.web.foundational.bean.entity.Account;
import net.ittimeline.java.web.foundational.bean.vo.AccountVO;
import net.ittimeline.java.web.foundational.bean.vo.PageBean;

import java.math.BigDecimal;
import java.util.List;


/**
 * 账户业务逻辑接口
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 9:20
 * @since JDK11
 */
public interface AccountService {


    /**
     * 转账业务
     * @param fromAccountName 转出账户名
     * @param toAccountName 转入账户名
     * @param amount 转账金额
     * @return
     */
     boolean transferAccounts(String fromAccountName,String toAccountName,BigDecimal amount);

    /**
     * 查询所有账户
     * @return
     */
     List<AccountVO> findAllAccount()throws Exception;

    /**
     * 添加账号
     * @param account
     * @return
     */
     boolean addAccount(Account account);

    /**
     * 根据ID删除账号
     * @param id
     * @return
     */
     boolean deleteAccountById(Long id);


    /**
     * 根据id查询账号信息
     * @param id
     * @return
     */
     Account findAccountById(Long id);


    /**
     * 修改账号
     * @param account
     * @return
     */
    boolean updateAccount(Account account);

    /**
     * 分页查询账号信息(不带查询条件)
     * @param pageNo
     * @param pageSize
     * @return
     */
    PageBean<AccountVO> findAccountByPage(Long pageNo,Integer pageSize);




}
