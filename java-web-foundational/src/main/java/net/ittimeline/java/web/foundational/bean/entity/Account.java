package net.ittimeline.java.web.foundational.bean.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
    private Long id;
    /**
     * 账户名称
     */
    private String name;

    /**
     * 账户余额
     */
    private BigDecimal balance;

    /**
     * 状态
     * 1 启用 0禁用
     */
    private Integer status;


    /**
     * 创建日期时间
     */
    private LocalDateTime createDate;

    /**
     * 更新日期时间
     */
    private LocalDateTime updateDate;





    /**
     * 一个账号只会属于一个用户
     */
    private User user;


    /**
     * 用户id
     */
    private Long userId;


    public Account() {


    }

    public Account(Long id){
        this.id=id;
    }

    public Account(String name){
        this.name = name;
    }

    public Account(Long id,String name){
        this(id);
       this.name = name;
    }

    public Account(Long id, String name, BigDecimal balance, Integer status){
        this.id=id;
        this.name = name;
        this.balance=balance;
        this.status=status;
    }

    public Account(Long id, String name, BigDecimal balance, Integer status, LocalDateTime createDate, LocalDateTime updateDate) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.status = status;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Account(String name, BigDecimal balance, int status,Long userId) {
        this.name = name;
        this.balance=balance;
        this.status=status;
        this.userId=userId;
    }

    public Account(String name, BigDecimal balance) {
        this.name = name;
        this.balance=balance;
    }

    public  Account(Integer status){
        this.status=status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", status=" + status +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", user=" + user +
                ", userId=" + userId +
                '}';
    }
}
