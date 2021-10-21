package net.ittimeline.java.web.foundational.dao;

import net.ittimeline.java.web.foundational.bean.entity.Account;

import java.math.BigDecimal;
import java.sql.SQLException;
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
     *根据转账金额更新指定账户的余额
     * @param accountName 指定账户
     * @param amount 转账金额
     * @return
     * @throws SQLException
     */
     boolean update(String accountName,BigDecimal amount) throws SQLException;

    /**
     * 根据账号名查询账户信息
     * @param accountName
     * @return
     */
    Account select(String accountName) throws Exception;

    /**
     * 查询所有账号
     * @return
     * @throws Exception
     */
    List<Account>selectAll()throws Exception;


    /**
     * 新增账号
     * @param account
     * @return
     * @throws SQLException
     */
    boolean insert(Account account) throws SQLException;

    /**
     * 根据条件查询账号信息
     * @param accountCondition 条件
     * @return Account
     * @throws Exception
     */
    Account selectOne(Account accountCondition) throws Exception;


    /**
     * 根据条件删除账号
     * @param accountCondition
     * @return
     * @throws SQLException
     */
    boolean delete(Account accountCondition) throws SQLException;


    /**
     * 修改账号
     * @param account
     * @return
     * @throws SQLException
     */
    boolean update(Account account) throws SQLException;


    /**
     * 查询账号的总数量
     * @return
     * @throws SQLException
     */
    Long selectAccountTotalCount() throws SQLException;

    /**
     * 分页查询账号信息
     * @param pageNo 页码(当前页)
     * @param pageSize 每页条数
     * @throws Exception
     * @return
     */
    List<Account> selectAccountByPage(Long pageNo,Integer pageSize) throws Exception;

    /**
     * 带条件的分页查询
     * @param pageNo
     * @param pageSize
     * @param accountCondition
     * @return
     * @throws Exception
     */
    List<Account> selectAccountByPage(Long pageNo,Integer pageSize,Account accountCondition) throws Exception;








}
