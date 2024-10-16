package net.ittimeline.java.core.foundational.operator.relation;

/**
 * 关系运算符使用注意事项3
 * 于（==）和不等于（!=）用于比较两个值是否相等或者不相等
 * ● 对于基本数据类型（int、long、double），==和!=比较的是它们的值
 * ● 对应引用数据类型（例如String，ArrayList），==和!=比较的是引用是否指向同一个对象，而不是对象的内容是否相同。
 * 要比较对象的内容是否相同，应该使用public boolean equals(Object obj)方法
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 13:28
 * @since Java21
 */
public class RelationOperatorWarning3 {
    public static void main(String[] args) {
        //基本数据类型相等性判断,==和!=比较的是它们的值
        int left = 10;
        int right = 20;
        //第一个%d会被left的值替换
        //第二个%d会被right的值替换
        //%b会被left==right的值替换
        System.out.printf("%d == %d 相等性比较的结果是 %b\n", left, right, (left == right));
        left = 20;
        System.out.printf("%d == %d 相等性比较的结果是 %b\n", left, right, (left == right));

        //引用数据类型相等性判断，==和!=比较的是引用是否指向同一个对象，而不是对象的内容是否相同。
        String str1 = new String("hello");
        String str2 = new String("hello");
        // 输出false，因为str1和str2是不同的对象
        System.out.println("str1 == str2 引用地址相等性比较结果是" + (str1 == str2));
        // 输出true，因为str1和str2的内容相同
        System.out.println("str1.equals(str2) 内容相等性比较结果是" + (str1.equals(str2)));
    }
}
