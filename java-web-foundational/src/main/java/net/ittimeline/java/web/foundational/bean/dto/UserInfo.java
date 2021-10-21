package net.ittimeline.java.web.foundational.bean.dto;

import java.time.LocalDateTime;

/**
 * @author tony 18601767221@163.com
 * @version 2021/8/31 12:51
 * @since JDK11
 */
public class UserInfo {

    private Integer userId;

    private String userName;

    private String userPassword;

    private LocalDateTime userCreateDate;


    private LocalDateTime userUpdateDate;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public LocalDateTime getUserCreateDate() {
        return userCreateDate;
    }

    public void setUserCreateDate(LocalDateTime userCreateDate) {
        this.userCreateDate = userCreateDate;
    }

    public LocalDateTime getUserUpdateDate() {
        return userUpdateDate;
    }

    public void setUserUpdateDate(LocalDateTime userUpdateDate) {
        this.userUpdateDate = userUpdateDate;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userCreateDate=" + userCreateDate +
                ", userUpdateDate=" + userUpdateDate +
                '}';
    }
}
