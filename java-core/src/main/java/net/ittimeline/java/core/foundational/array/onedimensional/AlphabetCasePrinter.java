package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组案例4-26个字母
 * 需求：
 * 1. 使用一个数组存储 26 个英文字母的小写形式（a 到 z）。
 * 2. 正序遍历数组，输出每个小写字母及其对应的大写字母，格式如：a->A, b->B, c->C
 * 3. 逆序遍历数组，输出每个大写字母及其对应的小写字母，格式如：Z->z, Y->y, X->x
 * 分析：
 * 1. 小写字母a到z与大写字母A到Z在 ASCII 编码中一一对应。例如小写字母a对应ASCII编码是97，大写字母A对应ASCII编码是65
 * 2. 每一对大小写字母的 ASCII 码值相差 32（即十六进制0x20）。
 * 3. 通过该差值，可以在已知小写字母的情况下计算对应的大写字母，反之亦然。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:05
 * @since Java 25
 */
public class AlphabetCasePrinter {
    static void main() {
        //定义一个字符数组，用来存储26个英文字母的小写形式a-z
        char[] lowercases = new char[26];
        for (int i = 0; i < lowercases.length; i++) {
            lowercases[i] = (char) ('a' + i);
        }
        System.out.println("正序遍历输出小写字母以及它对应的大写字母，例如：a->A, b->B, c->C");
        for (int i = 0; i < lowercases.length; i++) {
            char lowercase = lowercases[i];
            //小写字母转大写字母
            char uppercase = (char) (lowercase - 32);
            if (i == lowercases.length - 1) {
                System.out.print(lowercase + "->" + uppercase);
            } else {
                System.out.print(lowercase + "->" + uppercase + ", ");
            }

        }
        //换行
        System.out.println();
        System.out.println("逆序遍历输出大写字母以及它对应的小写字母，例如Z->z, Y->y, X->x");
        for (int i = lowercases.length - 1; i >= 0; i--) {
            char lowercase = lowercases[i];
            //小写字母转大写字母
            char uppercase = (char) (lowercase - 0x20);
            System.out.print(uppercase + "->" + lowercase);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
}
