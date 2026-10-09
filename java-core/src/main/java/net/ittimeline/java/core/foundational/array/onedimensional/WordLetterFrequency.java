package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组案例5-统计字符次数
 * 需求：
 * 英语中最长的单词是：pneumonoultramicroscopicsilicovolcanoconiosis，共45个英文字母。
 * ● 统计该单词中出现了哪些字母
 * ● 统计每个字母出现的次数
 * ● 找出出现次数最多的字母
 * 分析：
 * 1. 英文小写字母一共26个，因此可以创建一个长度为26的int数组用于计数。数组下标 0~25依次对应字母 a~z。
 * 2. 遍历单词的每一个字符，将字符转换为数组下标：下标 = 当前字符 - 'a'。每遍历到一个字符，对应数组位置的计数 +1。
 * 3. 遍历计数数组，输出出现过的字母及次数。
 * 4. 遍历计数数组，找出最大值，即为出现次数最多的字母。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:07
 * @since Java 25
 */
public class WordLetterFrequency {
    static void main() {
        // 要统计的最长单词
        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";

        // count[0] = a 的次数，count[1] = b 的次数，...，count[25] = z 的次数
        int[] count = new int[26];

        // 遍历字符串，统计每个字母出现次数
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            // 将字符转换为数组下标：'a'-'a'=0，'b'-'a'=1，...
            int index = ch - 'a';
            count[index]++;
        }

        System.out.printf("单词：%s%n", word);
        System.out.printf("长度：%d 个字母%n%n", word.length());

        // ========== 1. 出现过的字母 ==========
        System.out.println("========== 1. 出现过的字母 ==========");
        System.out.print("出现过的字母有：");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.print((char) ('a' + i) + " ");
            }
        }
        System.out.println();

        // ========== 2. 每个字母出现次数 ==========
        System.out.println("\n========== 2. 每个字母出现次数 ==========");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.printf("%c: %d 次%n", (char) ('a' + i), count[i]);
            }
        }

        // ========== 3. 出现次数最多的字母 ==========
        System.out.println("\n========== 3. 出现次数最多的字母 ==========");

        // 第一步：先求出最大次数
        int maxCount = 0;
        for (int c : count) {
            if (c > maxCount) {
                maxCount = c;
            }
        }

        // 第二步：输出所有达到最大次数的字母（处理并列）
        System.out.print("出现次数最多的字母是：");
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount) {
                System.out.print((char) ('a' + i) + " ");
            }
        }
        System.out.printf("，一共出现 %d 次。%n", maxCount);
    }
}
