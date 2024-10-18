package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组使用注意事项4
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 8:47
 * @since Java21
 */
public class ArrayWarning4 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        byte[] byteArray = new byte[10];
        //编译错误没因为int[]和byte[]是两种不同类型的引用变量
        //intArray = byteArray;
        /*
            byteArray = [B@b4c966a
            intArray = [I@21d81eb93
         */
        System.out.println("byteArray = " + byteArray);
        System.out.println("intArray = " + intArray);
        int[][] twoDimensionArray = new int[10][10];
        //编译错误，int[]和int[][]是两种不同类型的引用变量
        //intArray = twoDimensionArray;
        //intArray=和twoDimensionArray[0]是相同类型的引用变量int[]
        intArray = twoDimensionArray[0];
        //twoDimensionArray[0] = [I@7291c18f
        System.out.println("twoDimensionArray[0] = " + twoDimensionArray[0]);
    }
}
