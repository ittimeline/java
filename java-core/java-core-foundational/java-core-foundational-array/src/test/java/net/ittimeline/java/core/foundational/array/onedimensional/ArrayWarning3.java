package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组使用注意事项3
 * 数组索引越界，当通过数组名[索引]访问指定元素
 * 如果索引超过它的范围(0-数组长度减1)就会引发索引越界异常ArrayIndexOutOfBoundsException
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 8:41
 * @since Java21
 */
public class ArrayWarning3 {
    public static void main(String[] args) {
        //静态初始化整数数组
        int[] numbers = {10, 20, 30};
        //数组元素的下标范围是0到数组的长度减1

        //有效的索引范围
        System.out.println("numbers1数组的下标为0的元素值是" + numbers[0]);
        System.out.println("numbers1数组的下标为1的元素值是" + numbers[1]);
        System.out.println("numbers1数组的下标为2的元素值是" + numbers[2]);

        //无效的索引范围
        //System.out.println("numbers1数组的下标为3的元素值是" + numbers[3]);
        //System.out.println("numbers1数组的下标-1的元素值是" + numbers[-1]);
    }
}
