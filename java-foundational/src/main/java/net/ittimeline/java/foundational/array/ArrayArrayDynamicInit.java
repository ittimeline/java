package net.ittimeline.java.foundational.array;

/**
 * 二维数组的动态初始化
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/25 7:21
 * @since JDK11
 */
public class ArrayArrayDynamicInit {

    public static void main(String[] args) {
        // 数据类型[][]数组名=new 数据类型 [一维数组的个数][一维数组中元素的个数];

        int[][] numbers=new int[3][2];
        /*
            [[I 表示整数的二维数组
            [[I@6cd8737
         */
        System.out.println("二维数组的数组信息:"+numbers);
        /*
            [I@13969fbe
         */
        System.out.println("二维数组的第0个元素:"+numbers[0]);
        System.out.println("二维数组的第0个数组的第0个元素:"+numbers[0][0]);

        numbers[0][0]=100;

        System.out.println("二维数组的第0个数组的第0个元素:"+numbers[0][0]);


    }
}
