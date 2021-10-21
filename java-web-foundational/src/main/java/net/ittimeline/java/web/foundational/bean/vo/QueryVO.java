package net.ittimeline.java.web.foundational.bean.vo;

import net.ittimeline.java.web.foundational.bean.entity.Account;

/**
 * POJO包装对象
 * QueryVO Query View Object
 * @author tony 18601767221@163.com
 * @version 2021/8/30 17:45
 * @since JDK11
 */
public class QueryVO<T> {


    /**
     * 页码(当前页)
     */
    private Long pageNo;

    /**
     * 每页条数
     */
    private Long pageSize;

    /**
     * 偏移量
     */
    private Long offSet;

    /**
     * 查询条件
     */
    private T condition;


    public Long getPageNo() {
        return pageNo;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getOffSet() {
        return (pageNo-1)*pageSize;
    }



    public T getCondition() {
        return condition;
    }

    public void setCondition(T condition) {
        this.condition = condition;
    }
}
