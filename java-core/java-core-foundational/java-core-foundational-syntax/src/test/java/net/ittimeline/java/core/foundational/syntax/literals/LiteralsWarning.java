package net.ittimeline.java.core.foundational.syntax.literals;

/**
 * 字面量使用注意事项
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 6:05
 * @since Java21
 */
public class LiteralsWarning {
    public static void main(String[] args) {
        //打印输出null
        //编译错误 java: 对println的引用不明确
        //System.out.println(null);

         /*
            null的使用场景：给引用类型赋值
            String是一个Java类，类是引用数据类型
            str是变量名，或者更具体说是对象名
            = 表示将右边的null 赋值给左边的变量str
         */
        String str = null;
        System.out.println(str);
        //如果要打印null，那么只能使用字符串类型打印输出
        System.out.println("null");
    }
}
