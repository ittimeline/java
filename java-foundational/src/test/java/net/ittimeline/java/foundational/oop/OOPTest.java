package net.ittimeline.java.foundational.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 面向对象思想测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/15 6:48
 * @since JDK11
 */
public class OOPTest {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println("初始化:"+list);

        list.add(4);
        System.out.println("添加之后:"+list);




    }
}
