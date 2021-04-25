package net.ittimeline.java.foundational.oop;

/**
 * 成员变量的默认初始化机制
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/16 7:53
 * @since JDK11
 */
public class DefaultInitialization {

    public static void main(String[] args) {
        Data data=new Data();
        System.out.println("long类型的默认值"+data.lng);
        System.out.println("double类型的默认值"+data.dbl);
        //char类型的默认值是\u0000 不可见字符
        System.out.println("char类型的默认值"+data.ch);
        System.out.println("boolean类型的默认值"+data.bl);
        System.out.println("数组类型的默认值"+data.array);
        System.out.println("自定义类Data类型的默认值"+data.reference);
    }

}


class Data{
    /***********基本数据类型的成员变量**************/
    long lng;
    double dbl;
    char ch;
    boolean bl;


    /***********引用数据类型的成员变量**************/
    int[] array;
    Data reference;


}

