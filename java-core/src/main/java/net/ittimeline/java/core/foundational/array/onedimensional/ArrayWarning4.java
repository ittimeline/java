package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组使用注意事项4
 * 数组赋值成功的前提条件是类型必须一致
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/8 9:33
 * @since Java 25
 */
public class ArrayWarning4 {
    static void main() {
        int[] intArray = new int[10];
        byte[] byteArray = new byte[10];
        //编译错误：因为int[]和byte[]是两种不同类型的引用变量
        //intArray = byteArray;
        /*
            byteArray = [B@27716f4
            intArray = [I@8efb846
         */
        System.out.println("byteArray = " + byteArray);
        System.out.println("intArray = " + intArray);
        int[][] twoDimensionArray = new int[10][10];
        //编译错误：int[]和int[][]是两种不同类型的引用变量
        //intArray = twoDimensionArray;
        //intArray=和twoDimensionArray[0]是相同类型的引用变量int[]
        intArray = twoDimensionArray[0];
        //twoDimensionArray[0] = [I@2a84aee7
        System.out.println("twoDimensionArray[0] = " + twoDimensionArray[0]);
    }
}
