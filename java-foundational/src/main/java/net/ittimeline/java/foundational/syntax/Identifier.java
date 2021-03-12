package net.ittimeline.java.foundational.syntax;

/**
 * 标识符的命名规则和命名规范
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/9 13:54
 * @since JDK11
 */
public class Identifier {
}

/**
 * 类的命名规范
 */
class UserInfo{
    /**
     * 常量的命名规范
     */
    public static final String DEFAULT_PASSWORD="111111";



    /**
     * 变量名的命名规范
     */
    private Long id;
    /**
     * 变量名的命名规范
     */
    private String userName;


    /**
     * 方法名的命名规范
     * @return
     */
    public Long getId() {
        return id;
    }
    /**
     * 方法名的命名规范
     * @return
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 方法名的命名规范
     * @return
     */
    public String getUserName() {
        return userName;
    }
    /**
     * 方法名的命名规范
     * @return
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}