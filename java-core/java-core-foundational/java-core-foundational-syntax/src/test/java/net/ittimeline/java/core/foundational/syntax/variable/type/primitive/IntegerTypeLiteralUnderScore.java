package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 整数类型字面量之间使用下划线
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 7:26
 * @since Java21
 */
public class IntegerTypeLiteralUnderScore {
    public static void main(String[] args) {
        long quantity = 103_0000_0000L;
        System.out.println("2080年世界人口总数可能将达到" + quantity + "人");
    }
}
