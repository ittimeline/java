package net.ittimeline.java.web.foundational.util;

/**
 * Cookie的配置
 * @author tony 18601767221@163.com
 * @version 2021/7/19 11:06
 * @since JDK11
 */
public class CookieConfig {

    /**
     * cookie的名称
     */
    private String cookieName;
    /**
     * Cookie的值
     */
    private String  cookieValue;

    /**
     * Cookie的有效期
     */
    private int maxAge=7*24*60*60;
    /**
     * 有效路径
     */
    private String path;


    public String getCookieName() {
        return cookieName;
    }

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    public String getCookieValue() {
        return cookieValue;
    }

    public void setCookieValue(String cookieValue) {
        this.cookieValue = cookieValue;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
