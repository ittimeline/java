package net.ittimeline.java.api.io.designpattern;

import net.ittimeline.java.foundational.oop.Cellphone;

/**
 * 装饰者模式的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/30 13:55
 * @since JDK11
 */
public class DecoratorTest {

    public static void main(String[] args) {

        Cellphone cellphone = new Cellphone();
        cellphone.setColor("黑色");
        cellphone.setPrice(10999);
        cellphone.setModel("华为P50 pro plus");
        cellphone.setBrand("华为");
        BaseDao<Cellphone> baseDao = new DefaultBaseDaoImpl<>();
        //没有增强 直接从数据库获取
        System.out.println("**********************没有增强 直接从数据库获取**********************");
        Cellphone formDBCellphone = baseDao.get(cellphone);
        System.out.println(formDBCellphone);

        System.out.println("**********************增强的 先查缓存有就直接返回，否则查数据库**********************");

        //增强的 先查缓存有就直接返回，否则查数据库
        BaseDao<Cellphone> cacheDao=new CacheDaoImpl<>(baseDao);
        Cellphone fromCacheCellphone = cacheDao.get(cellphone);
        System.out.println(fromCacheCellphone);


    }
}
