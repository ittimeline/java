package net.ittimeline.java.foundational.array;

/**
 * 二维数组的静态初始化
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/25 7:17
 * @since JDK11
 */
public class ArrayArrayStaticInit {

    public static void main(String[] args) {
        // 数据类型[][] 数组名 =new 数据类型[][]{{元素1,元素2,元素3},{元素4,元素5},{元素6,元素7,元素8}}
        int[][] numbers =new int[][]{{1,2,3},{4,5},{6,7,8}};
        /*
            [[I@6cd8737
         */
        System.out.println("二维数组的数组信息:"+numbers);
        /*
            [I@13969fbe
         */
        System.out.println("二维数组的第0个元素"+numbers[0]);

        System.out.println("二维数组的第0个数组的第0个元素"+numbers[0][0]);
        System.out.println("二维数组的第2个数组的第2个元素"+numbers[2][2]);

    }
}
