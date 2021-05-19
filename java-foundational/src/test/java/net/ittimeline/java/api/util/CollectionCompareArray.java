package net.ittimeline.java.api.util;

import net.ittimeline.java.foundational.oop.Cellphone;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 集合和数组的对比
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/6 8:49
 * @since JDK11
 */
public class CollectionCompareArray {


    public static void main(String[] args) {
        //数组存储基本数据类型
        int[] numbers={1,2,3};

        //数组存储引用数据类型
        Cellphone[] cellphones={new Cellphone("iphone12")};

        //单列集合  添加的是对象
        Collection container=new ArrayList();
        container.add(1);
        container.add("tony");
        container.add(3.14);
        container.add(true);
        container.add(new Cellphone("iphone12"));


        //双列集合 添加的都是key-value键值对形式的对象
        Map<String,String>  map =new HashMap<>();
        map.put("姓名","tony");
        map.put("年龄","19");








    }
}
