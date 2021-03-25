package net.ittimeline.java.foundational.syntax.variable;

/**
 * 通过中间变量实现变量交换
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/22 16:22
 * @since JDK11
 */
public class VariableSwapTemp {

    public static void main(String[] args) {

        int left =10;
        int right =20;
        System.out.println("交换之前:  left = "+left+" right = "+right);

        //缺点:增加内存空间
        int temp=left;
        left=right;
        right=temp;
        System.out.println("交换之后:  left = "+left+" right = "+right);




    }
}
