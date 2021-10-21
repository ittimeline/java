package net.ittimeline.java.web.foundational.servlet;

import net.ittimeline.java.web.foundational.service.AccountService;
import net.ittimeline.java.web.foundational.service.impl.AccountServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * 用户转账
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/21 12:28
 * @since JDK11
 */
@WebServlet("/transfer")
public class TransferServlet extends HttpServlet {

    /**
     * Servlet依赖Service
     */
    private AccountService accountService = new AccountServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("当前执行处理请求的线程名称是 ---> "+Thread.currentThread().getName());

        //获取请求参数 页面过来的参数类型都是字符串
        String fromAccountName = request.getParameter("fromAccountName");
        String toAccountName = request.getParameter("toAccountName");
        String amount = request.getParameter("amount");

        String transferMessage = validation(fromAccountName, toAccountName, amount);
        if (null == transferMessage) {
            try {
                boolean transferResult = accountService.transferAccounts(fromAccountName, toAccountName, new BigDecimal(amount));
                if (transferResult) {
                    transferMessage = "转账成功";
                }
            } catch (Exception e) {
                e.printStackTrace();

                transferMessage =e.getMessage();
            }
        }
        request.setAttribute("transferMessage", transferMessage);
        request.getRequestDispatcher("/pages/transfer.jsp").forward(request, response);
    }


    private String validation(String fromAccountName, String toAccountName, String amount) {
        String transferMessage = null;
        if (null == fromAccountName || fromAccountName == "") {
            transferMessage = "转出账户名不能为空";
        } else if (null == toAccountName || toAccountName == "") {
            transferMessage = "转入账户名不能为空";
        } else if (null == amount || amount == "" || !(new BigDecimal(amount).compareTo(BigDecimal.ZERO) == 1)) {
            transferMessage = "转账金额不能为空 或者转账金额不能小于0";
        }
        return transferMessage;

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
