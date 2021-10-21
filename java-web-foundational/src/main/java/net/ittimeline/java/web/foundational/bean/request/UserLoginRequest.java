package net.ittimeline.java.web.foundational.bean.request;

/**
 * 用户登录的请求数据封装
 * @author tony 18601767221@163.com
 * @version 2021/8/13 14:09
 * @since JDK11
 */
public class UserLoginRequest {

    private String name;
    private String password;

    public UserLoginRequest(String name, String password) {
        this.name=name;
        this.password=password;
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
}
