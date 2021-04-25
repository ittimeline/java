package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 校验服务
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 8:39
 * @since JDK11
 */
public interface ValidationService {

    /**
     * 校验注册的用户名是否存在
     * @param userName
     * @return
     */
    boolean validation(String userName);
}
