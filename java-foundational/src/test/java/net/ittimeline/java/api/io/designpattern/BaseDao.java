package net.ittimeline.java.api.io.designpattern;

/**
 * 统一数据访问接口
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/30 13:56
 * @since JDK11
 */
public interface BaseDao<T> {

    /**
     * 添加元素
     * @param element
     * @return 受影响的行数
     */
    int add(T element);

    /**
     * 删除数据
     * @param element
     * @return 受影响的行数
     */
    int delete(T element);

    /**
     * 获取元素
     * @param element
     * @return
     */
    T get(T element);


}
