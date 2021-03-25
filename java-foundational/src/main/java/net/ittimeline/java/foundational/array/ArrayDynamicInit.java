package net.ittimeline.java.foundational.array;

/**
 * 数组的动态初始化
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/20 15:22
 * @since JDK11
 */
public class ArrayDynamicInit {

    public static void main(String[] args) {
       // 数组动态初始化语法格式

       // 数据类型[] 数组名 = new 数据类型[长度];
        int[] numbers =new int[3];

        /*
           [I@7c30a502
           [I 表示整数数组
           @ 分隔符
           7c30a502 十六进制的哈希值
         */
        System.out.println(numbers);

        //使用数组名[下标]访问数组的元素
        System.out.println("访问整数数组第0个元素的初始值"+numbers[0]);
        System.out.println("访问整数数组第1个元素的初始值"+numbers[1]);
        System.out.println("访问整数数组第2个元素的初始值"+numbers[2]);

        //给数组的第0个元素赋值100
        numbers[0]=100;
        numbers[1]=200;
        numbers[2]=300;
        System.out.println("访问整数数组赋值后第0个元素的初始值"+numbers[0]);
        System.out.println("访问整数数组赋值后第1个元素的初始值"+numbers[1]);
        System.out.println("访问整数数组赋值后第2个元素的初始值"+numbers[2]);



        //动态初始化一个字符数组，可以存放3个字符
        char[] chars =new char[3];

        System.out.println("访问字符数组第0个元素的初始值"+chars[0]);
        System.out.println("访问字符数组第1个元素的初始值"+chars[1]);
        System.out.println("访问字符数组第2个元素的初始值"+chars[2]);

        //动态初始化一个浮点数数组，可以存放3个浮点数
        double[] doubles =new double[3];

        System.out.println("访问浮点数数组第0个元素的初始值"+doubles[0]);
        System.out.println("访问浮点数数组第1个元素的初始值"+doubles[1]);
        System.out.println("访问浮点数组第2个元素的初始值"+doubles[2]);

        //动态初始化一个布尔型数组，可以存放3个布尔值
        boolean[] booleans =new boolean[3];
        System.out.println("访问布尔数组第0个元素的初始值"+booleans[0]);
        System.out.println("访问布尔数数组第1个元素的初始值"+booleans[1]);
        System.out.println("访问布尔数组第2个元素的初始值"+booleans[2]);







    }
}
