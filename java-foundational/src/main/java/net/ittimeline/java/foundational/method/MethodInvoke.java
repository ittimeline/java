package net.ittimeline.java.foundational.method;

/**
 * 有返回值的方法的定义和使用
 * @author tony 18601767221@163.com
 * @version 2021/3/25 16:21
 * @since JDK11
 */
public class MethodInvoke {


    public static void main(String[] args) {
        //局部变量
        int left=10;
        int right=20;
        //单独调用
        add(left,right);

        //输出调用
        System.out.println("输出调用完成两个整数相加的结果"+add(left,right));

        //赋值调用
        int result =add(left,right);
        System.out.println("赋值调用完成两个整数相加的结果"+result);


    }


    /**
     * 实现两个整数相加
     * @param left 第一个操作数(形参)
     * @param right 第二个操作数(形参)
     * @return 两个整数相加的结果
     */
    public static int add(int left,int right){
        return left+right;
    }

}
