package net.ittimeline.java.web.foundational.bean.vo;

import java.io.Serializable;

/**
 * User View Obejct
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/21 11:02
 * @since JDK11
 */
public class UserVO  implements Serializable {


    /**
     * id
     */
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
     * 创建日期/时间
     */
    private String createDate;

    /**
     * 修改日期/时间
     */
    private String updateDate;

    public UserVO() {

    }

    public UserVO(Integer id, String name, String password, String createDate, String updateDate) {
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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", createDate='" + createDate + '\'' +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }
}
