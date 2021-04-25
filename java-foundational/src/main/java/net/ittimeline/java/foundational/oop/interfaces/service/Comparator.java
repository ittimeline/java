package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 比较器
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 9:00
 * @since JDK11
 */
public interface Comparator {
    /**
     * 两个对象的比较
     *  如果source 大于target 返回1
     *  如果source 小于target 返回-1
     *  如果source 等于target 返回0
     * @param source
     * @param target
     * @return
     */
    int compare(Cellphone source,Cellphone target);
}
