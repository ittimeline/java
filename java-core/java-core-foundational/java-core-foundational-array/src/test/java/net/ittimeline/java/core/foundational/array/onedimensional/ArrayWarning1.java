package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组使用注意事项1
 * 数组是多个相同类型的数据集合，实现对这些数据的统一管理，
 * 数组中的元素可以是任意数据类型，包括基本数据类型和引用数据类型，但是不能混用，即类型一致。
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 8:31
 * @since Java21
 */
public class ArrayWarning1 {
    public static void main(String[] args) {
        //编译错误 数组元素的类型必须一致
        //int[] numbers = {1, 2, 3, 4, 5, 6, "hello"};
        //int可以自动提升为double
        double[] doubles = {10, 20, 30, 40, 50, 60};
        System.out.println("遍历doubles数组");
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }

        //数组中的元素可以是任意数据类型，包括基本数据类型和引用数据类型，但是不能混用，即类型一致
        //定义一个String数组 数组元素的数据类型是引用类型
        String[] cities = {"北京", "上海", "广州", "深圳"};
        System.out.println("遍历cities数组");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
    }
}
