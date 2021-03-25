package net.ittimeline.java.foundational.syntax.variable;

/**
 * 变量交换使用异或运算实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/22 16:26
 * @since JDK11
 */
public class VariableSwapXor {
    public static void main(String[] args) {
        int left =10;
        int right =20;
        System.out.println("交换之前:  left = "+left+" right = "+right);

        //异或是最完美的解决访问，不需要使用额外的内存空间，也没有算术运算的溢出、精度损失问题
        left=left^right;
        right=left^right;
        left=left^right;


        System.out.println("交换之后:  left = "+left+" right = "+right);
    }
}
