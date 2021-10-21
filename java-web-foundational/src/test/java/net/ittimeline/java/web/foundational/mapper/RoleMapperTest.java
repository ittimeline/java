package net.ittimeline.java.web.foundational.mapper;

import net.ittimeline.java.web.foundational.bean.entity.Role;
import net.ittimeline.java.web.foundational.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

/**
 * 角色管理-基于MyBatis实现的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/9/6 17:56
 * @since JDK11
 */
public class RoleMapperTest {


    @Test
    public void testSelectRoleUserList(){

        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        Role role = roleMapper.selectRoleUserList(5L);
        System.out.println("查询指定角色ID的角色信息以及关联的用户列表"+role);


    }
}
