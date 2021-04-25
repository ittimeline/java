package net.ittimeline.java.foundational.oop.interfaces.service;

import java.util.Arrays;

/**
 * 接口的案例：接口作为方法的形参->对象数组排序
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 8:50
 * @since JDK11
 */
public class SortTest {

    public static void main(String[] args) {

        //创建对象数组，对象的类型是Cellphone
        Cellphone[] cellphones={
                new Cellphone("小米11Ultra","小米",6999,"黑色",228),
                new Cellphone("三星21Ultra","三星",10999,"黑色",198),
                new Cellphone("华为Mate40 Pro+","小米",8999,"黑色",200),
        };

        //增强for循环
        System.out.println("排序之前");

        for (Cellphone cellphone : cellphones) {
            System.out.println(cellphone);
        }


        //匿名内部类和接口结合使用
        sort(cellphones, new Comparator() {
            @Override
            public int compare(Cellphone source, Cellphone target) {
                return source.getPrice()- target.getPrice();
            }
        });

        System.out.println("排序之后");
        for (Cellphone cellphone : cellphones) {
            System.out.println(cellphone);
        }

    }


    public static void sort(Cellphone[] cellphones,Comparator comparator){

        for (int i = 0; i < cellphones.length-1; i++) {
            for (int j = 0; j < cellphones.length-1-i; j++) {
                if(comparator.compare(cellphones[j],cellphones[j+1])>0){
                    Cellphone temp=cellphones[j];
                    cellphones[j]=cellphones[j+1];
                    cellphones[j+1]=temp;
                }
            }

        }
    }
}
