package net.ittimeline.java.core.foundational.syntax.data.type.reference;

import java.util.Scanner; //① 导包

/**
 * Scanner案例-读取从键盘输入喜欢的数字
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 13:45
 * @since Java 25
 */
public class ScannerFavoriteNumber {
    static void main() {
        //②创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        //③提示用户输入数据
        System.out.println("请输入你喜欢的数字");

        //④接收数据
        //接收用户从键盘输入喜欢的数字，并且赋值给favoriteNumber
        int favoriteNumber = scanner.nextInt();

        System.out.println("你喜欢的数字是" + favoriteNumber);

        //⑤关闭资源
        scanner.close();


    }
}
