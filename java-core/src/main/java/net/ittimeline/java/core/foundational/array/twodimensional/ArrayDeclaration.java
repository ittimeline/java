package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 二维数组声明
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:39
 * @since Java 25
 */
public class ArrayDeclaration {
    static void main() {
        //二维数组声明的语法格式： 数据类型[][] 数组名;
        int[][] intData;
        double[][] doubleData;
        String[][] stringData;

        // 声明后尚未初始化，无法直接使用
        //java: 可能尚未初始化变量intData
        //System.out.println(intData[0][0]);
    }
}
