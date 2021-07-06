package net.ittimeline.java.web.foundational.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 账户实体
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 8:38
 * @since JDK11
 */

public class Account {

    /**
     * id
     */
    private Integer id;
    /**
     * 账户名称
     */
    private String name;

    /**
     * 账户余额
     */
    private BigDecimal balance;



    /**
     * 创建日期时间
     */
    private Timestamp createDate;

    /**
     * 更新日期时间
     */
    private Timestamp updateDate;

    public Account() {


    }

    public Account(Integer id, String name, BigDecimal balance, Timestamp createDate, Timestamp updateDate) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }
}
