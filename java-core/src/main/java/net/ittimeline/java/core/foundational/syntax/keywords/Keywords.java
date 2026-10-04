package net.ittimeline.java.core.foundational.syntax.keywords;

/**
 * 关键字
 * 1. 什么是关键字
 *   Java语言体系中提前内置好的一些固定单词，每个单词都有特殊含义
 * 2. 关键字在IDEA中以橙色高亮显示
 * 3. 关键字不能做标识符
 * 4. 目前为止使用的关键字
 *      public:公开的
 *      class : 定义类
 *      static:静态的
 *      void：空
 * 5. 提醒：关键字不需要专门记忆，在使用中记忆即可
 *
 * 6.保留字：Java语言本身没占用这些单词，但是这些单词也不允许程序员使用，因为这些保留字将来可能会使用，例如goto、const
 * 7.所有的关键字都是小写单词
 * @author tony 18601767221@163.com
 * @version 2026/10/3 14:06
 * @since Java 25
 */
public class Keywords {
    static void main() {
        //在定义变量的时候指定变量类型，例如boolean 是关键字，但是String是标识符，即类名
        boolean flag = true;
        System.out.println("1.flag = " + flag);
        flag = false;
        System.out.println("2.flag = " + flag);
        String str = null;
        System.out.println("3.str = " + str);
    }
}
