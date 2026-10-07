package net.ittimeline.java.core.foundational.control.loop.whileloop;

/**
 * while循环案例1-折纸
 * 需求：世界最高山峰是珠穆朗玛峰（8848.86米=8848860毫米），
 * 假如我有一张足够大的纸，它的厚度是0.1毫米，请问折叠多少次可以折成超过珠穆朗玛峰的高度？
 * 分析：折纸一次，就乘以2，直到结果大于8848860就超过珠穆朗玛峰
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:16
 * @since Java 25
 */
public class PaperFolding {

    static void main() {
        //珠穆朗玛峰的高度
        int qomolangmaHeight = 8848860;
        //纸张初始的厚度
        double paperThickness = 0.1;
        //折纸的次数
        int paperFoldCount = 0;

        //当纸张的厚度小于等于珠穆朗玛峰的高度
        //循环条件判断语句
        while (paperThickness <= qomolangmaHeight) {
            //循环体语句
            //纸张的厚度乘以2
            paperThickness *= 2;
            //折纸的次数累加
            paperFoldCount++;
        }
        System.out.printf("当前纸张的厚度是%.2f米，超过了珠穆朗玛峰的8848.86米，一共折叠了%d次\n", paperThickness / 1000, paperFoldCount);

    }

}
