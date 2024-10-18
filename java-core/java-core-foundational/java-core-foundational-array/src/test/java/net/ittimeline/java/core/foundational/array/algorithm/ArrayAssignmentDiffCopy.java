package net.ittimeline.java.core.foundational.array.algorithm;

/**
 * 数组复制算法-数值赋值与数组复制对比
 * ● 数组赋值：将array1赋值给array2，此时array1和array2地址相同，指向的是同一个堆内存的数组，如果修改array2,那么array1也会跟着修改。
 * ● 数组复制：将array1复制给array2，此时array1和array2地址不相同，因为array1和array2指向的不是同一个堆内存的数组。
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 12:58
 * @since Java21
 */
public class ArrayAssignmentDiffCopy {
    public static void main(String[] args) {
        {
            System.out.println("******************1.数组赋值******************");
            //数组赋值
            int[] array1 = {2, 3, 5, 7, 11};
            int[] array2 = array1;
            System.out.println("array1 = " + array1);
            System.out.println("array2 = " + array2);
            //修改array2元素的值
            for (int i = 0; i < array2.length; i++) {
                //将偶数索引的元素修改为索引值
                if (i % 2 == 0) {
                    array2[i] = i;
                }
            }
            System.out.println("遍历array1");
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + "\t");
            }
            //换行
            System.out.println();
        }

        {
            System.out.println("******************2.数组复制******************");
            int[] array1 = {2, 3, 5, 7, 11};
            //动态初始化数组array2，array2的长度和array1的长度相同
            int[] array2 = new int[array1.length];
            System.out.println("array1 = " + array1);
            System.out.println("array2 = " + array2);
            //将array1复制一份到array2
            //遍历array2
            for (int i = 0; i < array2.length; i++) {
                //将array1的元素赋值给array2
                array2[i] = array1[i];
            }
            //修改array2数组元素的值
            for (int i = 0; i < array2.length; i++) {
                if (i % 2 == 0) {
                    array2[i] = i;
                }
            }
            System.out.println("遍历array1");
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + "\t");
            }
            //换行
            System.out.println();
        }
    }
}
