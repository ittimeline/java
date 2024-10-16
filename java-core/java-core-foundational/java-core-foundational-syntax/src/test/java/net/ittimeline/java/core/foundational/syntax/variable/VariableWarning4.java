package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量使用注意事项4
 * 变量值在赋值时，必须满足（兼容）变量的数据类型，并且在数据类型有效的范围内变化
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 6:21
 * @since Java21
 */
public class VariableWarning4 {
    public static void main(String[] args) {
         /*
            字符串字面量"18"是String类型，因此不能赋值给int类型变量age
         */
        //int age = "18";
        //整数字面量100 默认是int类型，因此可以赋值给int类型变量value
        int value = 100;

        /*
            兼容：整数字面量18是int类型，变量longValue是int类型
            int类型占据4个字节，long类型占据8个字节
            可以将4个字节类型的数值赋值给八个字节类型的变量

         */
        long longValue = 18;

        /*
            100L是long类型的字面量
            intValue是int类型
            不能将long类型的字面量赋值给int类型的变量
         */
        //int intValue = 100L;
    }
}
