package net.ittimeline.java.web.foundational.service.impl;

import net.ittimeline.java.web.foundational.dao.UserDao;
import net.ittimeline.java.web.foundational.dao.impl.StatementUserDaoImpl;
import net.ittimeline.java.web.foundational.entity.User;
import net.ittimeline.java.web.foundational.service.UserService;

import java.util.List;

/**
 * 用户业务逻辑实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/3 17:23
 * @since JDK11
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao = new StatementUserDaoImpl();

    @Override
    public boolean login(User user) {
        if (null != user && user.getName() != null && user.getPassword() != null) {
            List<User> userList = userDao.select(user);
            if (null != userList && userList.size() == 1) {
                return true;
            }
        }
        return false;
    }
}
