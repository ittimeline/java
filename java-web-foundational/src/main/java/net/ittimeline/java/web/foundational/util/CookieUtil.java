package net.ittimeline.java.web.foundational.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Cookie工具类
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/19 11:05
 * @since JDK11
 */
public class CookieUtil {


    /**
     * 添加Cookie
     * @param cookieConfig
     * @param response
     */
    public static void addCookie(CookieConfig cookieConfig, HttpServletResponse response){

        Cookie cookie=new Cookie(cookieConfig.getCookieName(), cookieConfig.getCookieValue());
        cookie.setPath(cookieConfig.getPath());
        cookie.setMaxAge(cookieConfig.getMaxAge());
        response.addCookie(cookie);

    }

    /**
     * 根据cookieName获取Cookie信息
     * @param request
     * @param cookieName
     * @return
     */
    public static Cookie getCookie(HttpServletRequest request,String cookieName){
        Cookie[] cookies = request.getCookies();
        if (cookies!=null&&cookies.length>0) {
            for (Cookie cookie : cookies) {
                if (cookieName.equals(cookie.getName())){
                    return cookie;
                }
            }
        }

        return  null;
    }

    /**
     * 删除Cookie
     * @param cookieConfig
     * @param response
     */
    public static void removeCookie(CookieConfig cookieConfig,HttpServletResponse response){

        Cookie cookie= new Cookie(cookieConfig.getCookieName(), cookieConfig.getCookieValue());
        cookie.setMaxAge(0);
        cookie.setPath(cookieConfig.getPath());
        response.addCookie(cookie);
    }
}
