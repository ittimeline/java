package net.ittimeline.java.web.foundational.service.impl;

import net.ittimeline.java.web.foundational.bean.vo.UserVO;
import net.ittimeline.java.web.foundational.dao.UserDao;
import net.ittimeline.java.web.foundational.dao.impl.CustomQueryRunnerUserDaoImpl;
import net.ittimeline.java.web.foundational.bean.entity.User;
import net.ittimeline.java.web.foundational.exception.BusinessException;
import net.ittimeline.java.web.foundational.service.UserService;


import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户业务逻辑实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/3 17:23
 * @since JDK11
 */

public class UserServiceImpl implements UserService {

    /**
     * Service依赖DAO
     */
    private UserDao userDao = new CustomQueryRunnerUserDaoImpl();

    @Override
    public boolean login(User user) throws Exception {
        if (null != user && user.getName() != null && user.getPassword() != null) {
            List<User> userList = userDao.select(user);
            if (null != userList && userList.size() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean register(User user) throws Exception{
        int row = userDao.insert(user);
        if (row==1){
            return true;
        }
        return false;
    }

    @Override
    public List<UserVO> findAllUsers()throws Exception {
        List<UserVO> userVOList=null;
        List<User> userList = userDao.select(null);
        if (null!=userList&&userList.size()>0){
            userVOList=new ArrayList<>();
            for (User user : userList) {
                //将User对象转换成UserVO对象
                UserVO userVO=new UserVO();
                userVO.setId(user.getId());
                userVO.setName(user.getName());
                userVO.setPassword(user.getPassword());
                userVO.setCreateDate(user.getCreateDate().format(DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss")));
                userVO.setUpdateDate(user.getUpdateDate().format(DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss")));
                userVOList.add(userVO);
            }
        }
        return userVOList;
    }

    @Override
    public boolean findByName(String name) {
        try {
            List<User> userList = userDao.select(new User(name));
            if (userList==null){
                return false;
            }else{
                throw new BusinessException("用户名已经存在");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }


}
