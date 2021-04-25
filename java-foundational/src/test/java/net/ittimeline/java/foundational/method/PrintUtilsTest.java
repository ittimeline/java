package net.ittimeline.java.foundational.method;

/**
 * 打印工具类测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/11 16:33
 * @since JDK11
 */
public class PrintUtilsTest {

    public static void main(String[] args) {
        //PrintUtils.printContent(3,"跟光磊学Java");
        String[]books={"OnJava8","Java核心技术第十一版","Java编程的逻辑"};
       // PrintUtils.printContent(books);

        PrintUtils.printContent("OnJava8","Java核心技术第十一版");

    }
}
