package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * @author tony 18601767221@163.com
 * @version 2021/4/23 9:02
 * @since JDK11
 */
public class SortByPrice implements Comparator{
    @Override
    public int compare(Cellphone source, Cellphone target) {
        return source.getPrice()- target.getPrice();
    }
}
