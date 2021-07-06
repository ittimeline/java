package net.ittimeline.java.web.foundational.bo;

import java.math.BigDecimal;

/**
 * 账户业务实体
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/4 9:54
 * @since JDK11
 */

public class AccountBO {
    /**
     * 账户名称
     */
    private String name;

    /**
     * 交易金额
     */
    private BigDecimal transactionAmount;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
