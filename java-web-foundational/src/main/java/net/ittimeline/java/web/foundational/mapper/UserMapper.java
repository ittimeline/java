package net.ittimeline.java.web.foundational.mapper;

import net.ittimeline.java.web.foundational.bean.dto.UserInfo;
import net.ittimeline.java.web.foundational.bean.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;
import java.util.Map;

/**
 * 基于Mybatis实现的用户接口
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/27 18:13
 * @since JDK11
 */
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAll();

    /**
     * 根据用户名和密码查找用户
     * @param userName
     * @param password
     * @return
     */
    User findUserByUserNamePassword(@Param("name")String userName,@Param("pwd") String password);


    /**
     * 统计用户人数
     * @return
     */
    Long userTotalCount();


    /**
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    UserInfo selectUserInfoById(Long id);


    /**
     * 根据用户ID查询用户信息
     * @param userId
     * @return
     */
    User selectById(Long userId);


    /**
     * 根据用户名查询用户
     * @param name
     * @return
     */
    Map selectByName(String name);


    /**
     * 根据ID商户删除用户
     * @param id
     * @return
     */
    int deleteById(Long id);


    /**
     * 查询指定用户ID的用户信息以及关联的账号列表
     * @param userId
     * @return
     */
    User selectUserAccountList(Long userId);

    /**
     * 查询指定用户ID的用户信息以及关联的账号列表 支持延迟加载
     * @param userId
     * @return
     */
    User selectUserAccountListLazyLoad(Long userId);





    /**
     * 根据用户ID查询用户信息以及关联的账号列表
     * @param userId
     * @return
     */
    User selectUserRoleList(Long userId);

}
