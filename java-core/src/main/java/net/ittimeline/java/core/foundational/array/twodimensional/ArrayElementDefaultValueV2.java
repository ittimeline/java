package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 二维数组动态初始化元素默认值
 * 二维数组动态初始化语法格式2
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:43
 * @since Java 25
 */
public class ArrayElementDefaultValueV2 {
    static void main() {

        System.out.println("********************************二维数组动态初始化语法格式2（内层数组尚未初始化）********************************");

        /*
            外层元素：默认存储 null（因为内层数组尚未初始化）。
            内层元素：此时不存在，直接访问会抛出 NullPointerException。
        */


        int[][] intData = new int[4][];
        //intData[0] 在二维数组中代表第一行的引用（目前为 null，因为内层数组未初始化）
        System.out.println("intData = " + intData);
        System.out.println("intData[0] = " + intData[0]);    // null

        // 下面这行会抛出 NullPointerException
        System.out.println("intData[0][1] = " + intData[0][1]);

        //stringData[0] 在二维数组中代表第一行的引用（目前为 null，因为内层数组未初始化）
        String[][] stringData = new String[4][];
        System.out.println("stringData[0] = " + stringData[0]); // null
        // 同样，访问内层会异常
        System.out.println("stringData[0][1] = " + stringData[0][1]);

    }
}
