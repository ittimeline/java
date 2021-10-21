package net.ittimeline.java.web.foundational.service;

import net.ittimeline.java.web.foundational.bean.vo.UserVO;
import net.ittimeline.java.web.foundational.bean.entity.User;

import java.util.List;


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
    public boolean login(User user) throws Exception;

    /**
     * 用户注册(需要用户名和密码)
     * @param user
     * @return
     */
    public boolean register(User user) throws Exception;

    /**
     * 查询所有用户(不带分页)
     * @return
     */
    public List<UserVO> findAllUsers() throws Exception;


    /**
     * 根据用户名查找用户
     * @param name
     * @return true表示存在，false表示不存在
     */
    boolean findByName(String name);



}
