package net.ittimeline.java.core.foundational.control.loop.whileloop;

/**
 * 打印折纸的次数
 * 需求：世界最高山峰是珠穆朗玛峰（8848.86米=8848860毫米）
 * 假如我有一张足够大的纸，它的厚度是0.1毫米，请问折叠多少次可以折成超过珠穆朗玛峰的高度？
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 19:40
 * @since Java21
 */
public class PaperFolding {
    public static void main(String[] args) {
        //珠穆朗玛峰的高度
        int qomolangmaHeight = 8844430;
        //纸张的初始厚度
        double paperThickness = 0.1;
        //折纸的次数
        int paperFoldingCount = 0;

        //当纸张的厚度小于珠穆朗玛峰的高度
        while (paperThickness < qomolangmaHeight) {
            //纸张的厚度乘以2
            paperThickness *= 2;
            //折纸的次数累加
            paperFoldingCount++;
        }
        System.out.printf("当前纸张的厚度是%.2f米，超过了珠穆朗玛峰的8844.43米，一共折叠了%d次",
                paperThickness / 1000, paperFoldingCount);
    }
}
