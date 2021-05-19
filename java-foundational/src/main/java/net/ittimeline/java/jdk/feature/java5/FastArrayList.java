package net.ittimeline.java.jdk.feature.java5;

import java.util.ArrayList;

/**
 * 泛型类的定义
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/13 17:46
 * @since JDK11
 */
public class FastArrayList<E> extends ArrayList<E> implements FastList<E> {


    public  boolean addElement(E element){
        return add(element);
    }

}
