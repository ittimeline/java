package net.ittimeline.java.web.foundational.dao.impl;

import net.ittimeline.java.web.foundational.dao.AccountDao;
import net.ittimeline.java.web.foundational.entity.Account;
import net.ittimeline.java.web.foundational.bo.AccountBO;
import net.ittimeline.java.web.foundational.util.DruidDataSourceUtil;
import net.ittimeline.java.web.foundational.util.JDBCUtil;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 账户的数据访问接口实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 8:44
 * @since JDK11
 */

public class AccountDaoImpl implements AccountDao {
    @Override
    public boolean update(AccountBO sourceAccount, AccountBO targetAccount) {
        // 使用自定义连接池
        // CustomDataSourceV2 customDataSourceV2=new CustomDataSourceV2();

        Connection connection = null;
        PreparedStatement sourcePreparedStatement = null;
        PreparedStatement targetPreparedStatement = null;

        String sourceSql = null;
        String targetSql = null;
        //拼接sql
        if (sourceAccount != null && sourceAccount.getTransactionAmount() != null && sourceAccount.getName() != null) {
            sourceSql = "update jdbc_account set balance=balance - ? where name = ?";
        }
        if (targetAccount != null && targetAccount.getTransactionAmount() != null && targetAccount.getName() != null) {
            targetSql = "update jdbc_account set balance=balance + ? where name = ?";

        }
        try {
            //获取连接
            // connection= JDBCUtil.getConnection();
            connection = DruidDataSourceUtil.getConnection();
            //获取执行SQL的对象
            sourcePreparedStatement = connection.prepareStatement(sourceSql);
            targetPreparedStatement = connection.prepareStatement(targetSql);
            //关闭事务的自动提交
            connection.setAutoCommit(false);
            if ((sourceSql != null && sourceSql != "")) {
                if (sourceAccount != null && sourceAccount.getTransactionAmount() != null && sourceAccount.getName() != null) {

                    sourcePreparedStatement.setBigDecimal(1, sourceAccount.getTransactionAmount());
                    sourcePreparedStatement.setString(2, sourceAccount.getName());

                    int row = sourcePreparedStatement.executeUpdate();
                    if (row == 1) {
                        if ((targetSql != null && targetSql != "")) {

                            if (targetAccount != null && targetAccount.getTransactionAmount() != null && targetAccount.getName() != null) {
                                targetPreparedStatement.setBigDecimal(1, targetAccount.getTransactionAmount());
                                targetPreparedStatement.setString(2, targetAccount.getName());

                                row = targetPreparedStatement.executeUpdate();
                                if (row == 1) {
                                    //提交事务
                                    connection.commit();
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {

            // ex.printStackTrace();
            try {

                connection.rollback();
                //遇到异常回滚事务
                System.out.println("转账异常,事务回滚");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } finally {
            DruidDataSourceUtil.release(null, sourcePreparedStatement, connection);
            DruidDataSourceUtil.release(null, targetPreparedStatement, connection);
            System.out.println("释放数据库资源成功");
        }
        return false;
    }

    @Override
    public List<Account> select(Account accountCondition) {
        String sql = null;
        if (accountCondition != null && accountCondition.getName() != null) {
            sql = "select id,name,balance,create_date,update_date from jdbc_account where name = ?";
        }
        try (
                Connection connection = JDBCUtil.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setString(1, accountCondition.getName());
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Account> accountList = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                BigDecimal balance = resultSet.getBigDecimal("balance");
                Timestamp createDate = resultSet.getTimestamp("create_date");
                Timestamp updateDate = resultSet.getTimestamp("update_date");

                Account account = new Account();
                account.setId(id);
                account.setName(name);
                account.setBalance(balance);
                account.setCreateDate(createDate);
                account.setUpdateDate(updateDate);
                accountList.add(account);
            }

            if (accountList != null && accountList.size() > 0) {
                return accountList;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
