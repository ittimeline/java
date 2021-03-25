package net.ittimeline.java.foundational.array;

/**
 * 数组空指针
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/22 13:45
 * @since JDK11
 */
public class ArrayNullPointer {
    public static void main(String[] args) {
        int[] numbers =new int []{1,2,3};

        System.out.println("访问整数数组的第0个元素的结果"+numbers[0]);
        System.out.println("访问整数数组的第1个元素的结果"+numbers[1]);
        System.out.println("访问整数数组的第2个元素的结果"+numbers[2]);

        numbers=null;
        System.out.println("数组信息:"+numbers);

        // 通过null 访问堆内存的数据

        if(null!=numbers){
            System.out.println("访问整数数组的第0个元素的结果"+numbers[0]);

        }

    }
}
