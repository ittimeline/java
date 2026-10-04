package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量的使用注意事项4：变量在赋值时，必须满足或者兼容变量的数据类型，并且在数据类型的取值范围内变化
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/3 17:17
 * @since Java 25
 */
public class VariableWarning4 {
    static void main() {
         /*
            满足变量的数据类型案例
            整数字面量100默认是int类型，因此可以赋值给int类型的变量value
         */
        int value = 100;

        /*
            兼容变量的数据类型案例
            整数字面量100000是int类型，变量longValue是long类型
            int类型占据4个字节，long占据8个字节
            可以将4个字节类型整数字面量赋值给8个字节的整数变量
         */
        long longValue = 100000;

        /*
            不满足变量的数据类型案例
            字符串字面量"18"是String类型，因此不能赋给int类型的变量age
         */
        //java: 不兼容的类型: java.lang.String无法转换为int
        //int age = "18";

        /*
            整数字面量100L是long类型,占据8个字节，
            intValue是int类型，占据4个字节
            不能将8个字节的整数字面量赋值给4个字节的整数变量
         */
        //java: 不兼容的类型: 从long转换到int可能会有损失
        //int intValue = 100L;
    }
}
