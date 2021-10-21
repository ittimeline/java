package net.ittimeline.java.web.foundational.mapper;

import net.ittimeline.java.web.foundational.bean.entity.Account;
import net.ittimeline.java.web.foundational.bean.vo.QueryVO;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * 账号管理-基于Mybatis实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/30 9:34
 * @since JDK11
 */
public interface AccountMapper {

    /**
     * 根据ID查询账号
     * @param id
     * @return
     */
    Account selectById(Long id);

    /**
     * 增加账号
     * @param account
     * @return
     */

    int insert(Account account);

    /**
     * 修改账号
     * @param account
     * @return
     */
    int update(Account account);

    /**
     * 根据id删除账号
     * @param id
     * @return
     */
    @Delete("delete from jdbc_account where id=#{id}")
    int deleteById(Long id);

    /**
     * 分页查询账号列表(有条件)
     * @param hashMap
     * @return
     */
    List<Account> selectAccountByPage(Map<String,Long> hashMap);


    /**
     * 分页查询账号列表(有条件)
     * @param queryVO
     * @return
     */
    List<Account> selectAccountByQueryVO( QueryVO queryVO);

    /**
     * 根据账号的状态查询账号列表
     * @param status
     * @return
     */
    List<Account> selectAccountListByStatus(Integer status);


    /**
     * 根据账号的状态和账号名称查询账号列表
     * @param account
     * @return
     */
    List<Account> selectAccountListByStatusAndName(Account account);

    /**
     * 根据传入的id列表批量删除多个账号
     * 如果不传id 那么就删除所有账号
     * @param ids
     * @return 受影响的行数
     */
    int deleteByIds(List<Long> ids);


    /**
     * 根据指定的账号ID查询账号信息以及关联的用户信息
     * @param accountId
     * @return
     */
    Account selectAccountUserInfo(Long accountId);


    /**
     * 根据指定的账号ID查询账号信息以及关联的用户信息 支持延迟加载
     * @param accountId
     * @return
     */

    Account selectAccountUserInfoLazyLoad(Long accountId);


    /**
     * 根据用户ID查询账号列表
     * @param userId
     * @return
     */
    List<Account> selectAccountListByUserId(Long userId);


}
