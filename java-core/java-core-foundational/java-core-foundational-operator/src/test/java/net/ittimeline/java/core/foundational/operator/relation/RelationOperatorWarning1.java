package net.ittimeline.java.core.foundational.operator.relation;

/**
 * 关系运算符使用注意事项1
 * Java语言中的 == 表示是否相等，=表示赋值，千万不要把==误写成=
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 13:23
 * @since Java21
 */
public class RelationOperatorWarning1 {
    public static void main(String[] args) {
        int left = 10;
        int right = 20;
        //==表示判断两个整数类型变量是否相等
        System.out.println("left == right 运算结果是" + (left == right));
        //=表示表示将right赋值给left
        //left = right;是一个赋值表达式， 赋值表达式本身也是有值，其值就是给变量赋的值，即right的值
        System.out.println("left = right 运算结果是 " + (left = right));
        boolean flag1 = false;
        boolean flag2 = true;
        //==判断两个布尔类型变量是否相等
        System.out.println("flag1 == flag2 运算结果是" + (flag1 == flag2));
        //=表示将flag2的值赋值给flag1
        //flag1 = flag2;是一个赋值表达式， 赋值表达式本身也是有值，其值就是给变量赋的值，即flag2的值
        System.out.println("flag1 = flag2 运算结果是" + (flag1 = flag2));
    }
}
