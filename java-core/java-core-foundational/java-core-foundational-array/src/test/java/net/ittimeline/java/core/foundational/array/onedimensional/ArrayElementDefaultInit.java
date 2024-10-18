package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组元素默认初始化值
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 8:29
 * @since Java21
 */
public class ArrayElementDefaultInit {
    public static void main(String[] args) {
        // 数组的动态初始化的语法格式
        //数据类型[] 数组名=new 数据类型[数组的长度];
        //动态初始化numbers数组 数组的元素是整数
        int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++) {
            System.out.printf("numbers数组的下标为%d的元素值是%d\n", i, ints[i]);
        }

        //动态初始化了doubles数组 数组的元素都是小数
        double[] doubles = new double[3];
        for (int i = 0; i < doubles.length; i++) {
            System.out.printf("doubles数组的下标为%d的元素值是%.1f\n", i, doubles[i]);

        }
        //动态初始化了chars数组 数组的元素都是字符
        char[] chars = new char[3];

        for (int i = 0; i < chars.length; i++) {
            System.out.printf("chars数组的下标为%d的元素值是%c\n", i, chars[i]);
        }
        if (chars[0] == 0) {
            System.out.println("如果数组元素的数据类型是char，那么数组元素的默认值是整数0");
        }
        if (chars[0] == '\u0000') {
            System.out.println("如果数组元素的数据类型是char，那么数组元素的默认值是'\\u0000\'");

        }
        if (chars[0] == '0') {
            System.out.println("如果数组元素的数据类型是char，那么数组元素的默认值是整数0");
        }

        //动态初始化了booleans数组 数组的元素都是布尔值 默认值是false
        boolean[] booleans = new boolean[3];
        for (int i = 0; i < booleans.length; i++) {
            System.out.printf("booleans数组的下标为%d的元素值是%b\n", i, booleans[i]);

        }

        //动态初始化了string数组 数组的元素都是字符串 默认值是null

        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.printf("strings数组的下标为%d的元素值是%s\n", i, strings[i]);
        }

        if (strings[0] == null) {
            System.out.println("如果数组元素的数据类型是引用数据类型，那么数组元素的默认值是null");
        }
    }
}
