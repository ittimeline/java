package net.ittimeline.java.web.foundational.mapper;

import net.ittimeline.java.web.foundational.bean.entity.Role;

/**
 * 角色管理-基于Mybatis实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/9/6 17:42
 * @since JDK11
 */
public interface RoleMapper {

    /**
     * 查询指定角色ID的角色信息以及关联的用户列表
     * @param roleId
     * @return
     */
    Role selectRoleUserList(Long roleId);
}
