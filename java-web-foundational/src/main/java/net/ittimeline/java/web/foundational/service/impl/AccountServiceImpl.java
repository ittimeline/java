package net.ittimeline.java.web.foundational.service.impl;

import net.ittimeline.java.web.foundational.bean.vo.AccountVO;
import net.ittimeline.java.web.foundational.bean.vo.PageBean;
import net.ittimeline.java.web.foundational.dao.AccountDao;
import net.ittimeline.java.web.foundational.dao.impl.AccountDaoImpl;
import net.ittimeline.java.web.foundational.bean.entity.Account;
import net.ittimeline.java.web.foundational.exception.BusinessException;
import net.ittimeline.java.web.foundational.service.AccountService;
import net.ittimeline.java.web.foundational.util.DruidDataSourceUtil;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
    public boolean transferAccounts(String fromAccountName, String toAccountName, BigDecimal amount) {
        System.out.println("当前执行处理请求的线程名称是 ---> " + Thread.currentThread().getName());

        String transferMessage = "";
        boolean result = false;
        //使用事务保持业务数据的一致性
        Connection connection = null;
        try {
            connection = DruidDataSourceUtil.getConnection();
            //业务校验 开始
            // 判断用户是否在用户中存在
            Account fromAccount = accountDao.select(fromAccountName);
            Account toAccount = accountDao.select(fromAccountName);
            if (null != fromAccount && null != toAccount) {
                //如果转出账户的余额大于0
                if (fromAccount.getBalance().compareTo(BigDecimal.ZERO) == 1) {
                    // 转出账户的余额大于或者等于转账的金额
                    if (fromAccount.getBalance().compareTo(amount) == 1 || fromAccount.getBalance().compareTo(amount) == 0) {
                        //业务校验 结束
                        //开启事务
                        connection.setAutoCommit(false);
                        //执行业务操作
                        //1. 转出账户减去交易金额
                        boolean updateResult = accountDao.update(fromAccountName, amount);
                        if (updateResult) {
                            //2. 转入账户加上交易金额
                            updateResult = accountDao.update(toAccountName, amount.negate());
                            if (updateResult) {
                                //模拟异常回滚事务
                                // System.out.println(1/0);

                                //转账成功提交事务
                                connection.commit();
                                result = true;
                            }
                        }
                    } else {
                        transferMessage = "转出账户的余额必须大于或者等于转账的金额";
                    }
                } else {
                    transferMessage = "转出账户的余额必须大于0";
                }

            } else {
                transferMessage = "转出账户或者是转入账户不能为空";
            }

            if (transferMessage != "") {
                throw new RuntimeException(transferMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
            //回滚事务
            try {
                connection.rollback();
                throw new RuntimeException(e.getMessage());
            } catch (SQLException sql) {
                sql.printStackTrace();
            }
        }


        return result;
    }

    @Override
    public List<AccountVO> findAllAccount() throws Exception {
        List<Account> accountList = accountDao.selectAll();
        return accountList2AccountVOList(accountList);
    }

    private  List<AccountVO> accountList2AccountVOList(List<Account> accountList){
        if (null!=accountList&&accountList.size()>0){
            List<AccountVO> accountVOList=new ArrayList<>();
            for (Account account : accountList) {
                AccountVO accountVO=new AccountVO(account.getId(),account.getName()
                        ,account.getBalance(),account.getStatus(),
                        account.getCreateDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
                        account.getUpdateDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                accountVOList.add(accountVO);
            }
            return accountVOList;
        }
        return null;
    }

    @Override
    public boolean addAccount(Account account) {
        try {
            Account accountCheck = accountDao.selectOne(new Account(account.getName()));
            //账号名不存在
            if (accountCheck==null){
                boolean insertResult = accountDao.insert(account);
                if (insertResult){
                    return true;
                }

            }else{
                throw  new BusinessException("账号名已经存在");
            }
        } catch (Exception e) {
           throw new RuntimeException(e.getMessage());
        }


        return false;
    }

    @Override
    public boolean deleteAccountById(Long id)  {
        //删除之前判断id对应的Account是否存在
        Account accountCheck = null;
        try {
            accountCheck = accountDao.selectOne(new Account(id));
            //账号在数据库中存在
            if (null!=accountCheck){
               return  accountDao.delete(new Account(id));
            }else{
                throw new RuntimeException("删除失败，账号不存在");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }


    @Override
    public Account findAccountById(Long id) {
        try {
            Account account = accountDao.selectOne(new Account(id));
            if (null!=account){
                return account;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public boolean updateAccount(Account account) {
        //检查账号是否存在
        try {
            Account accountCheck = this.findAccountById(account.getId());
            if (null!=accountCheck){
                return accountDao.update(account);
            }else{
                throw new RuntimeException("账号信息不存在");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public PageBean<AccountVO> findAccountByPage(Long pageNo, Integer pageSize) {
        PageBean<AccountVO> pageBean=new PageBean<>();
        try {
            //获取总记录条数
            Long totalCount = accountDao.selectAccountTotalCount();
            pageBean.setTotalCount(totalCount);

            //获取分页数据列表
            List<Account> accountList = accountDao.selectAccountByPage(pageNo, pageSize);
            List<AccountVO> accountVOList = accountList2AccountVOList(accountList);
            if (null!=accountVOList&&accountVOList.size()>0){
                pageBean.setDataList(accountVOList);
            }


            //计算总页数
           Long totalPage= totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
           pageBean.setTotalPage(totalPage);
           //设置页码(当前页)
           pageBean.setPageNo(pageNo);

           //设置每页的条数
            pageBean.setPageSize(pageSize);

        } catch (Exception e) {
           throw  new RuntimeException(e.getMessage());
        }


        return pageBean;
    }
}
