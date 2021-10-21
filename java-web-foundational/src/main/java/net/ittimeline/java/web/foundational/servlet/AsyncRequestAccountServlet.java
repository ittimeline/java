package net.ittimeline.java.web.foundational.servlet;


import com.alibaba.fastjson.JSON;
import net.ittimeline.java.web.foundational.bean.entity.Account;
import net.ittimeline.java.web.foundational.bean.response.ResponseBean;
import net.ittimeline.java.web.foundational.bean.vo.AccountVO;
import net.ittimeline.java.web.foundational.bean.vo.PageBean;
import net.ittimeline.java.web.foundational.exception.BusinessException;
import net.ittimeline.java.web.foundational.service.AccountService;
import net.ittimeline.java.web.foundational.service.impl.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;


/**
 * 处理客户端的账户管理异步请求的Servlet
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/7 17:12
 * @since JDK11
 */
@WebServlet("/async/account")
public class AsyncRequestAccountServlet extends BaseServlet {

    private AccountService accountService = new AccountServiceImpl();


    /**
     * 查询所有账号
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void findAllAccount(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ResponseBean<List<AccountVO>> responseBean = new ResponseBean<>(Boolean.TRUE);

        try {

            List<AccountVO> accountVOList = accountService.findAllAccount();
            if (null != accountVOList) {
                responseBean.setData(accountVOList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            responseBean.setFlag(Boolean.FALSE);
            responseBean.setErrorMessage("查询所有账号失败");
        }

        String responseJSONString = JSON.toJSONString(responseBean);
        System.out.println("【查询所有账户列表】的JSON字符串的结果是" + responseJSONString);

        //将所有账号列表的JSON字符串写给浏览器
        response.getWriter().write(responseJSONString);


    }


    /**
     * 添加账号
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void addAccount(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ResponseBean<Boolean> responseBean = new ResponseBean<>(Boolean.TRUE);
        String errorMessage = null;

        Account account = null;
        //客户端的请求参数是JSON
        if ("application/json;charset=UTF-8".equals(request.getContentType())) {
            account = JSON.parseObject(request.getInputStream(), Account.class);
        } else {
            //客户端请求参数不是JSON
            String name = request.getParameter("name");
            String balance = request.getParameter("balance");
            String status = request.getParameter("status");
            account = new Account(name, new BigDecimal(balance), Integer.valueOf(status),1L);
        }

        try {
            errorMessage = validation(account.getName(), account.getBalance().toString(), account.getStatus().toString());
            //校验通过
            if (errorMessage == null) {
                boolean addAccountResult = accountService.addAccount(account);
                //添加成功
                if (addAccountResult) {
                    responseBean.setData(Boolean.TRUE);
                }
            } else {
                responseBean.setFlag(Boolean.FALSE);
                responseBean.setErrorMessage(errorMessage);
            }
        } catch (BusinessException e) {
            e.printStackTrace();
            //账号已经存在，返回添加账号的页面并且给出相应的提示信息
            errorMessage = e.getMessage();
            responseBean.setErrorMessage(errorMessage);
            responseBean.setFlag(Boolean.FALSE);
        } catch (Exception e) {
            e.printStackTrace();
            responseBean.setErrorMessage("服务器异常");
            responseBean.setFlag(Boolean.FALSE);
        }


        //将服务器返回的数据转换为JSON字符串
        String responseJSONString = JSON.toJSONString(responseBean);
        //将账号添加的结果写给浏览器
        response.getWriter().write(responseJSONString);


    }

    /**
     * 校验请求参数
     *
     * @param name
     * @param balance
     * @return
     */
    private String validation(String name, String balance, String status) {
        String errorMessage = null;
        if (name == null || name == "") {
            errorMessage = "账号名不能为空";
        } else if (status == null || status == "") {
            errorMessage = "状态不能为空";
        } else if (balance == null || balance == "") {
            errorMessage = "账号余额不能为空";
        } else if (new BigDecimal(balance).compareTo(BigDecimal.ZERO) == -1) {
            errorMessage = "账号余额不能是负数";
        }
        return errorMessage;

    }


    /**
     * 根据ID删除账户
     *
     * @param request
     * @param response
     */
    public void deleteAccountById(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ResponseBean<Boolean> responseBean = new ResponseBean<>(Boolean.TRUE);
        String id = request.getParameter("id");
        String errorMessage = null;

        if (null == id || id == "") {
            errorMessage = "id不能为空";
            responseBean.setErrorMessage(errorMessage);
            responseBean.setFlag(Boolean.FALSE);
        } else {
            try {
                boolean deleteAccountByIdResult = accountService.deleteAccountById(Long.valueOf(id));
                if (deleteAccountByIdResult) {
                    responseBean.setData(Boolean.TRUE);
                }
            } catch (Exception e) {
                e.printStackTrace();
                //删除失败
                errorMessage = "删除失败";
                responseBean.setErrorMessage(errorMessage);
                responseBean.setFlag(Boolean.FALSE);
            }
        }


        //将服务器返回的数据转换为JSON字符串
        String responseJSONString = JSON.toJSONString(responseBean);
        //将账号删除的结果写给浏览器
        response.getWriter().write(responseJSONString);

    }

    /**
     * 回显账号数据
     *
     * @param request
     * @param response
     */
    public void toUpdateAccountPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        ResponseBean<Account> responseBean = new ResponseBean<>(Boolean.TRUE);

        try {
            Account account = accountService.findAccountById(Long.valueOf(id));
            if (account != null) {
                responseBean.setData(account);
            }
        } catch (Exception e) {
            e.printStackTrace();
            responseBean.setFlag(Boolean.FALSE);
            responseBean.setErrorMessage("回显账号信息失败");

        }

        //将服务器返回的数据转换为JSON字符串
        String responseJSONString = JSON.toJSONString(responseBean);
        //将回显的账号数据写给浏览器
        response.getWriter().write(responseJSONString);


    }


    /**
     * 修改账号
     *
     * @param request
     * @param response
     */
    public void updateAccount(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ResponseBean<Boolean> responseBean = new ResponseBean<>(Boolean.TRUE);

        Account account = null;
        String errorMessage = null;

        //客户端的请求参数是JSON
        if ("application/json;charset=UTF-8".equals(request.getContentType())) {
            account = JSON.parseObject(request.getInputStream(), Account.class);
        } else {
            //客户端的请求参数不是JSON
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String balance = request.getParameter("balance");
            String status = request.getParameter("status");
            account = new Account(Long.valueOf(id), name, new BigDecimal(balance), Integer.valueOf(status));
        }
        try {
            errorMessage = validation(account.getName(), account.getBalance().toString(), account.getStatus().toString());
            //校验通过
            if (null == errorMessage) {
                boolean updateAccountResult = accountService.updateAccount(account);
                //修改成功
                if (updateAccountResult) {
                    responseBean.setData(Boolean.TRUE);
                }
            } //校验失败
            else {
                responseBean.setFlag(Boolean.FALSE);
                responseBean.setErrorMessage(errorMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
            responseBean.setFlag(Boolean.FALSE);
            responseBean.setErrorMessage("修改账号失败");
        }

        //将服务器返回的修改账号的数据转换为JSON字符串
        String responseJSONString = JSON.toJSONString(responseBean);
        //将账号修改的的结果写给浏览器
        response.getWriter().write(responseJSONString);

    }


    /**
     * 分页查询所有账号信息
     *
     * @param request
     * @param response
     */
    public void findAccountByPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ResponseBean<PageBean<AccountVO>> responseBean = new ResponseBean<>(Boolean.TRUE);

        try {
            //获取页页码
            Long pageNo = Long.valueOf(request.getParameter("pageNo"));

            //获取每页的条数
            Integer pageSize = Integer.valueOf(request.getParameter("pageSize"));

            PageBean<AccountVO> pageBean = accountService.findAccountByPage(pageNo, pageSize);

            if (null != pageBean && null != pageBean.getDataList() && pageBean.getDataList().size() > 0) {
                responseBean.setData(pageBean);
            } else {
                responseBean.setFlag(false);
                responseBean.setErrorMessage("没有查询到数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            responseBean.setFlag(false);
            responseBean.setErrorMessage("分页查询账号信息异常");
        }

        //将服务器返回的分页查询账号的数据转换为JSON字符串
        String responseJSONString = JSON.toJSONString(responseBean);
        System.out.println("【分页查询所有账号信息】分页查询结果的JSON字符串是" + responseJSONString);
        //将分页查询账号的JSON字符串写给浏览器
        response.getWriter().write(responseJSONString);


    }


}
