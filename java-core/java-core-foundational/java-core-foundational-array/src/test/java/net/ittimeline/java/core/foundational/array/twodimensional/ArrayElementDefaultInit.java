package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 二维数组元素初始化默认值
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 10:38
 * @since Java21
 */
public class ArrayElementDefaultInit {
    public static void main(String[] args) {
        System.out.println("******************二维数组动态初始化语法格式1******************");
        /*
            二维数组动态初始化语法格式1：二维数组元素初始化默认值
            外层元素默认存储地址值
            内层元素根据不同数据类型存储不同的默认值
         */
        int[][] intData1 = new int[4][3];
        //外层元素默认值 地址值
        System.out.println("intData1[0] = " + intData1[0]);
        System.out.println("intData1[1] = " + intData1[1]);

        //内层元素默认值 0
        System.out.println("intData1[0][0] = " + intData1[0][0]);
        System.out.println("intData1[1][0] = " + intData1[1][0]);

        double[][] doubleData1 = new double[4][3];
        //外层元素默认值 地址值
        System.out.println("doubleData1[0] = " + doubleData1[0]);
        System.out.println("doubleData1[1] = " + doubleData1[1]);

        //内层元素默认值 0.0
        System.out.println("doubleData1[0][0] = " + doubleData1[0][0]);
        System.out.println("doubleData1[1][0] = " + doubleData1[1][0]);

        boolean[][] booleanData1 = new boolean[4][3];
        //外层元素默认值 地址值
        System.out.println("booleanData1[0] = " + booleanData1[0]);
        //内层元素默认值 false
        System.out.println("booleanData1[0][0] = " + booleanData1[0][0]);
        System.out.println("booleanData1[1][1] = " + booleanData1[1][1]);


        String[][] stringData1 = new String[4][3];
        //外层元素默认值 地址值
        System.out.println("stringData1[0] = " + stringData1[0]);
        System.out.println("stringData1[1] = " + stringData1[1]);

        //内层元素默认值 null
        System.out.println("stringData1[0][0] = " + stringData1[0][0]);
        System.out.println("stringData1[1][0] = " + stringData1[1][0]);
        System.out.println("******************二维数组动态初始化语法格式2******************");

         /*
            二维数组动态初始化语法格式2：二维数组元素初始化默认值
            外层元素默认存储null
            内层元素此时不存在，如果访问会引发NullPointerException
         */

        int[][] intData2 = new int[4][];
        System.out.println("intData2 = " + intData2);
        //外层元素默认值 null
        System.out.println("intData2[0] = " + intData2[0]);
        //非空判断解决空指针异常
        if (null != intData2[0] && intData2[0].length > 1) {
            System.out.println("intData2[0][1]= " + intData2[0][1]);
        }


        String[][] stringData2 = new String[4][];
        System.out.println("stringData2 = " + stringData2);
        //外层元素默认值 null
        System.out.println("stringData2[0] = " + stringData2[0]);
        //非空判断解决空指针异常
        if (null != stringData2[0] && stringData2.length > 1) {
            System.out.println("stringData2[0][1]= " + stringData2[0][1]);
        }
    }
}
