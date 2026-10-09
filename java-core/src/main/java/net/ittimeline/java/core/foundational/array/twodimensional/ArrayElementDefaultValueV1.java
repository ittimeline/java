package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 二维数组动态初始化元素默认值
 * 二维数组动态初始化语法格式1
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:43
 * @since Java 25
 */
public class ArrayElementDefaultValueV1 {
    static void main() {
        System.out.println("********************************二维数组动态初始化语法格式1********************************");

        /*
            外层元素：默认存储一个数组对象引用（逻辑地址值），指向已初始化好的内层数组，外层数组的每个元素（即每一行）是一个一维数组引用
            内层元素：根据数据类型存储对应的默认值（如 int 为 0，boolean 为 false，引用类型为 null）。
         */
        //int 类型
        int[][] intData = new int[4][3];
        //intData[0] 在二维数组中代表第一行的引用
        System.out.println("intData[0] = " + intData[0]);        // 逻辑地址值
        //intData[0][0] 是第一行第一列的具体数值
        System.out.println("intData[0][0] = " + intData[0][0]);  // 0

        //double 类型
        double[][] doubleData = new double[4][3];
        //doubleData[0] 在二维数组中代表第一行的引用
        System.out.println("doubleData[0] = " + doubleData[0]);          // 逻辑地址值
        //doubleData[0][0] 是第一行第一列的具体数值
        System.out.println("doubleData[0][0] = " + doubleData[0][0]);    // 0.0

        // boolean 类型
        boolean[][] booleanData = new boolean[4][3];
        //booleanData[0] 在二维数组中代表第一行的引用
        System.out.println("booleanData[0] = " + booleanData[0]);        // 逻辑地址值
        //booleanData[0][0] 是第一行第一列的具体数值
        System.out.println("booleanData[0][0] = " + booleanData[0][0]);  // false

        // String 类型
        String[][] stringData = new String[4][3];
        //stringData[0] 在二维数组中代表第一行的引用
        System.out.println("stringData[0] = " + stringData[0]);          // 逻辑地址值
        //stringData[0][0] 是第一行第一列的具体数值
        System.out.println("stringData[0][0] = " + stringData[0][0]);    // null
    }
}
