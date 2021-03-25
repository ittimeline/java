package net.ittimeline.java.foundational.array;

/**
 * 数组的静态初始化
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/20 13:00
 * @since JDK11
 */
public class ArrayStaticInit {
    public static void main(String[] args) {
        // 标准语法格式
        //数据类型[] 数组名  =new 数据类型[] {元素1,元素2,元素3};
        int[] numbers =new int[] {10,20,30};
        System.out.println(numbers);


        System.out.println("访问整数数组的第0个元素的结果是"+numbers[0]);
        System.out.println("访问整数数组的第1个元素的结果是"+numbers[1]);
        System.out.println("访问整数数组的第2个元素的结果是"+numbers[2]);



        //简化语法格式
       // 数据类型[] 数组名  =  {元素1,元素2,元素3};
        char[]  chars ={'a','b','c'};

        System.out.println("访问字符数组的第0个元素的结果是"+chars[0]);
        System.out.println("访问字符数组的第1个元素的结果是"+chars[1]);
        System.out.println("访问字符数组的第2个元素的结果是"+chars[2]);

    }
}
