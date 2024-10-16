/****************包名的命名规则和命名规范****************/
package net.ittimeline.java.core.foundational.syntax;

/**
 * 标识符使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 6:37
 * @since Java21
 */
public class Identifier {
}

/****************类名的命名规则和命名规范****************/
class User {
    /****************常量名的命名规则和命名规范****************/
    public static final String DEFAULT_PASSWORD = "111111";

    /****************变量名的命名规则和命名规范****************/
    private String userName;

    private String password;

    /****************方法名的命名规则和命名规范****************/
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}