package net.ittimeline.java.web.foundational.bean.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 用户实体
 * 为什么要将基本数据类型替换为引用数据类型
 * 引用数据类型初始化值为null，而基本数据类型 例如int为0
 * 引用数据类型可以序列化，而基本数据类型不可以
 * @author tony 18601767221@163.com
 * @version 2021/7/3 16:07
 * @since JDK11
 */

public class User implements Serializable {

    /**
     * id
     */
    @JsonIgnore
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;



    /**
     * 创建日期时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("createDateTime")
    private LocalDateTime createDate;

    /**
     * 修改日期时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateDate;


    /**
     * 一个用户有多个账号
     */
    private List<Account> accountList;


    /**
     * 一个用户可以有多个角色
     */
    private List<Role> roleList;


    public User() {

    }

    public User(String name){
        this.name = name;
    }

    public User(Integer id, String name, String password, LocalDateTime createDate, LocalDateTime updateDate) {
        this.id = id;
        this.name = name;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", accountList=" + accountList +
                ", roleList=" + roleList +
                '}';
    }
}
