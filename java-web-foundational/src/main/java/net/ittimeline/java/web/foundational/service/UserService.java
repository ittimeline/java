package net.ittimeline.java.web.foundational.service;

import net.ittimeline.java.web.foundational.entity.User;

/**
 * 用户业务逻辑
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/3 17:22
 * @since JDK11
 */
public interface UserService {
    /**
     * 根据用户名和密码登录
     * @param user
     * @return
     */
    public boolean login(User user);
}
