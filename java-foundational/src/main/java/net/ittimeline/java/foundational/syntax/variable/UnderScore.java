package net.ittimeline.java.foundational.syntax.variable;

/**
 * Java7新特性之数值之间使用下划线
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/10 18:10
 * @since JDK11
 */
public class UnderScore {
    public static void main(String[] args) {
        long longVal=100_000_000_0000L;
        System.out.println(longVal);

        double dblVal=3.141_59_26;
        System.out.println(dblVal);


    }
}
