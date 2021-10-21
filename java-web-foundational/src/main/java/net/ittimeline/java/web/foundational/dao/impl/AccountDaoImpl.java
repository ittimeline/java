package net.ittimeline.java.web.foundational.dao.impl;

import net.ittimeline.java.web.foundational.dao.AccountDao;
import net.ittimeline.java.web.foundational.bean.entity.Account;
import net.ittimeline.java.web.foundational.util.CustomQueryRunner;
import net.ittimeline.java.web.foundational.util.DruidDataSourceUtil;


import java.math.BigDecimal;
import java.sql.*;
import java.util.List;

/**
 * 账户的数据访问接口实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 8:44
 * @since JDK11
 */

public class AccountDaoImpl implements AccountDao {


    /**
     * 根据指定到的数据源创建QueryRunner对象
     */
    private static final CustomQueryRunner queryRunner = new CustomQueryRunner(DruidDataSourceUtil.getDataSource());


    @Override
    public boolean update(String accountName, BigDecimal amount) throws SQLException {
        System.out.println("当前执行处理请求的线程名称是 ---> " + Thread.currentThread().getName());

        //使用Dbutils实现数据的修改
        String sql = "update jdbc_account set balance =balance - ? , update_date=now() where name = ?";
        Connection connection = DruidDataSourceUtil.getConnection();
        int row = queryRunner.update(connection, sql, amount, accountName);
        return row == 1 ? true : false;
    }

    @Override
    public Account select(String accountName) throws Exception {
        if (null!=accountName&&accountName!=""){
            String sql="select id,name,balance from jdbc_account where name = ?";
            return queryRunner.queryForObject(sql, Account.class, accountName);

        }

        return null;
    }


    @Override
    public List<Account> selectAll() throws Exception {
        String sql="select id,name,balance,status,create_date,update_date from jdbc_account";
        List<Account> accountList = queryRunner.queryForList(sql, Account.class);
        if (null!=accountList&& accountList.size()>0){
            return accountList;
        }

        return null;
    }

    @Override
    public boolean insert(Account account) throws SQLException {
        String sql="insert into jdbc_account values(null,?,?,?,now(),now())";
        int row = queryRunner.update(sql, account.getName(), account.getBalance(),account.getStatus());
        return row==1?true:false;
    }

    @Override
    public Account selectOne(Account accountCondition) throws Exception {
        if (null!=accountCondition&&accountCondition.getName()!=null&& accountCondition.getName()!=""){
            String sql="select id,name,balance,status,create_date,update_date from jdbc_account where name = ? ";
            Account account = queryRunner.queryForObject(sql, Account.class, accountCondition.getName());
            if (null!=account){
                return account;
            }
        }else if (null!=accountCondition&&accountCondition.getId()!=null){
            String sql="select id,name,balance,status,create_date,update_date from jdbc_account where id = ? ";
            Account account = queryRunner.queryForObject(sql, Account.class, accountCondition.getId());
            if (null!=account){
                return account;
            }
        }

        return null;
    }

    @Override
    public boolean delete(Account accountCondition) throws SQLException {
        if (null!=accountCondition&&accountCondition.getId()!=null){
            String sql="delete from jdbc_account where id = ?";
            int row = queryRunner.update(sql, accountCondition.getId());
            return row==1?true:false;

        }
        return false;
    }

    @Override
    public boolean update(Account account) throws SQLException {
        String sql="update jdbc_account set name =? , balance= ?, status=?,update_date=now() where id =?";
        int row = queryRunner.update(sql, account.getName(), account.getBalance(), account.getStatus(), account.getId());
        return row==1?true:false;
    }


    @Override
    public Long selectAccountTotalCount() throws SQLException{
        String sql="select count(*) from jdbc_account";
        Long totalCount = queryRunner.queryForType(sql, Long.class);
        if (null!=totalCount){
            return totalCount;
        }

        return null;
    }

    @Override
    public List<Account> selectAccountByPage(Long pageNo, Integer pageSize) throws Exception {
        // select 列名 from 表名 [where 条件] limit (pageNo-1)*pageSize,pageSize
        String sql="select id,name,balance,status,create_date,update_date from jdbc_account limit ?,?";
        List<Account> accountList = queryRunner.queryForList(sql, Account.class,
                (pageNo - 1) * pageSize, pageSize);
        if (null!=accountList&&accountList.size()>0){
            return accountList;
        }
        return null;
    }

    @Override
    public List<Account> selectAccountByPage(Long pageNo, Integer pageSize, Account accountCondition) throws Exception {
       if (accountCondition!=null&& accountCondition.getStatus()!=null){
           String sql="select id,name,balance,status,create_date,update_date " +
                   "from jdbc_account where status = ? limit ?,?";
           List<Account> accountList = queryRunner.queryForList(sql, Account.class,
                   accountCondition.getStatus(),
                   (pageNo - 1) * pageSize, pageSize);
           if (null!=accountList&&accountList.size()>0){
               return accountList;
           }
       }
        return null;
    }
}
