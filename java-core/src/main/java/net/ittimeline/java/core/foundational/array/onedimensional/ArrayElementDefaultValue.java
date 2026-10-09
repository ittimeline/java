package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组动态初始化元素默认值
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/8 9:31
 * @since Java 25
 */
public class ArrayElementDefaultValue {
    static void main() {
        // 数组的动态初始化的语法格式:数据类型[] 数组名=new 数据类型[数组的长度];

        //动态初始化ints数组 数组的元素都是整数 默认值是0
        int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++) {
            System.out.printf("ints数组的下标为%d的元素值是%d\n", i, ints[i]);
        }

        //动态初始化doubles数组 数组的元素都是小数 默认值是0.0
        double[] doubles = new double[3];
        for (int i = 0; i < doubles.length; i++) {
            System.out.println("doubles数组的下标为" + i + "的元素值是" + doubles[i]);
        }

        //动态初始化chars数组 数组的元素都是字符 默认值是0或者'\u0000'
        char[] chars = new char[3];
        for (int i = 0; i < chars.length; i++) {
            System.out.printf("chars数组的下标为%d的元素值是%d（对应字符：%c）\n", i, (int) chars[i], chars[i]);
        }

        if (chars[0] == 0) {
            System.out.println("如果数组元素的数据类型是char，那么数组元素的默认值是0");
        }
        if (chars[0] == '\u0000') {
            System.out.println("如果数组元素的数据类型是char，那么数组元素的默认值是'\\u0000'");
        }

        //动态初始化booleans数组 数组的元素都是布尔值  默认值是false
        boolean[] booleans = new boolean[3];
        for (int i = 0; i < booleans.length; i++) {
            System.out.printf("booleans数组的下标为%d的元素值是%b\n", i, booleans[i]);
        }

        //动态初始化strings数组 数组的元素都是字符串  默认值是null
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.printf("strings数组的下标为%d的元素值是%s\n", i, strings[i]);
        }

        if (strings[0] == null) {
            System.out.println("如果数组元素的数据类型是引用数据类型，那么数组元素的默认值是null");
        }

    }
}
