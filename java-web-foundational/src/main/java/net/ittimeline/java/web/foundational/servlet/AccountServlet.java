package net.ittimeline.java.web.foundational.servlet;

import net.ittimeline.java.web.foundational.bean.entity.Account;
import net.ittimeline.java.web.foundational.bean.vo.AccountVO;
import net.ittimeline.java.web.foundational.bean.vo.PageBean;
import net.ittimeline.java.web.foundational.service.AccountService;
import net.ittimeline.java.web.foundational.service.impl.AccountServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import java.math.BigDecimal;
import java.util.List;

/**
 * AccountServlet负责处理以下请求
 * 号管理之查询所有账号
 * 账号管理之添加账号
 * 账号管理之删除账号
 * 账号管理之修改账号
 * 账号管理之分页查询账号
 * 账号管理之转账
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/26 13:52
 * @since JDK11
 */
@WebServlet("/account")
public class AccountServlet extends BaseServlet {

    private AccountService accountService = new AccountServiceImpl();


    /**
     * 查询所有账号
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void findAllAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<AccountVO> accountVOList = accountService.findAllAccount();
            if (null != accountVOList) {
                //将账户列表存储到域对象中
                request.setAttribute("accountList", accountVOList);
                //请求转发跳转到account_list.jsp
                request.getRequestDispatcher("pages/account/account_list.jsp").forward(request, response);
            } else {
                //没有查询到数据就返回首页
                request.getRequestDispatcher("index.html").forward(request, response);

            }
        } catch (Exception e) {

            e.printStackTrace();
            //遇到异常之后返回首页
            request.getRequestDispatcher("index.html").forward(request, response);


        }


    }


    /**
     * 添加账号
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void addAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String balance = request.getParameter("balance");
        String status = request.getParameter("status");
        String errorMessage = null;

        try {
            errorMessage = validation(name, balance, status);
            //校验通过
            if (errorMessage == null) {
                boolean addAccountResult = accountService.addAccount(new Account(name, new BigDecimal(balance), Integer.valueOf(status),1L));
                //添加成功
                if (addAccountResult) {
                    //跳转到查询所有账号列表页面
                    response.sendRedirect("account?method=findAllAccount");
                }
            } else {
                request.setAttribute("errorMessage", errorMessage);
                request.getRequestDispatcher("pages/account/account_add.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            //账号已经存在，返回添加账号的页面并且给出相应的提示信息
            errorMessage = e.getMessage();
            request.setAttribute("errorMessage", errorMessage);
            request.getRequestDispatcher("pages/account/account_add.jsp").forward(request, response);
        }




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
        Long id = Long.valueOf(request.getParameter("id"));
        String errorMessage = null;
        try {
            boolean deleteAccountByIdResult = accountService.deleteAccountById(id);

            if (deleteAccountByIdResult) {
                //删除成功之后跳转到显示所有账号列表页面
                response.sendRedirect("account?method=findAllAccount");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //删除失败跳转到显示所有账号列表页面，并且提示删除失败
            errorMessage = "删除失败";
            request.setAttribute("errorMessage", errorMessage);
            request.getRequestDispatcher("account?method=findAllAccount").forward(request, response);

        }
    }

    /**
     * 跳转到修改账号的页面
     * 回显账号信息
     *
     * @param request
     * @param response
     */
    public void toUpdateAccountPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.valueOf(request.getParameter("id"));
        Account account = accountService.findAccountById(id);
        if (null != account) {
            request.setAttribute("account", account);
            request.getRequestDispatcher("pages/account/account_update.jsp").forward(request, response);
        } else {
            //没有查询到就回到查询所有账号列表页面
            response.sendRedirect("account?method=findAllAccount");
        }

    }

    /**
     * 修改账号
     *
     * @param request
     * @param response
     */
    public void updateAccount(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String balance = request.getParameter("balance");
        String status = request.getParameter("status");
        String errorMessage = null;

        try {
            errorMessage = validation(name, balance, status);
            //校验通过
            if (null == errorMessage) {
                boolean updateAccountResult = accountService.updateAccount(new Account(Long.valueOf(id), name, new BigDecimal(balance), Integer.valueOf(status)));
                //修改成功
                if (updateAccountResult) {
                    //跳转到查询所有账号列表页面
                    response.sendRedirect("account?method=findAllAccount");
                }
            } //校验失败
            else {
                request.setAttribute("errorMessage", errorMessage);
                request.getRequestDispatcher("account?method=toUpdateAccountPage&id=" + id).forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            errorMessage = e.getMessage();
            //修改异常
            request.setAttribute("errorMessage", errorMessage);
            //修改异常跳转到查询所有账号列表页面
            request.getRequestDispatcher("account?method=findAllAccount").forward(request, response);

        }

    }


    /**
     * 分页查询所有账号信息
     *
     * @param request
     * @param response
     */
    public void findAccountByPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取页页码
        Long pageNo = Long.valueOf(request.getParameter("pageNo"));

        //获取每页的条数
        Integer pageSize = Integer.valueOf(request.getParameter("pageSize"));

        PageBean<AccountVO> pageBean = accountService.findAccountByPage(pageNo, pageSize);

        if (null != pageBean && null != pageBean.getDataList() && pageBean.getDataList().size() > 0) {
            request.setAttribute("pageBean", pageBean);
            //请求转发跳转到account_list_page.jsp
            request.getRequestDispatcher("pages/account/account_list_page.jsp").forward(request, response);

        }


    }


}
