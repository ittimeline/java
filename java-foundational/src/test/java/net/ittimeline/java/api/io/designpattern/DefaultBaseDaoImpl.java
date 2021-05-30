package net.ittimeline.java.api.io.designpattern;

/**
 * 被装饰类
 * 统一数据访问接口的默认实现，所有的操作直接操作数据
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/30 13:58
 * @since JDK11
 */
public class DefaultBaseDaoImpl<T> implements BaseDao<T> {
    @Override
    public int add(T element) {
        if(null!=element){
            System.out.println("数据库新增数据成功");
            return 1;
        }
        return 0;
    }

    @Override
    public int delete(T element) {
        if(null!=element){
            System.out.println("数据库删除数据成功");
            return 1;
        }
        return 0;
    }

    @Override
    public T get(T element) {
        System.out.println("数据库查询数据成功");
        return element;
    }
}
