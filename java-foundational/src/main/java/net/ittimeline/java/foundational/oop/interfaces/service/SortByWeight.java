package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 按照重量排序
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 9:05
 * @since JDK11
 */
public class SortByWeight implements Comparator{
    @Override
    public int compare(Cellphone source, Cellphone target) {
        return source.getWeight()- target.getWeight();
    }
}
