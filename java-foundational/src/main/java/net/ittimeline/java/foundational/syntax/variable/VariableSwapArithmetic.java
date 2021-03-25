package net.ittimeline.java.foundational.syntax.variable;

/**
 * 通过算术运算实现变量交换
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/22 16:23
 * @since JDK11
 */
public class VariableSwapArithmetic {


    public static void main(String[] args) {
        int left =10;
        int right =20;
        System.out.println("交换之前:  left = "+left+" right = "+right);

        //缺点:数据会溢出，或者是损失精度
        left=left*right;
        right=left/right;
        left=left/right;

        System.out.println("交换之后:  left = "+left+" right = "+right);
    }
}
