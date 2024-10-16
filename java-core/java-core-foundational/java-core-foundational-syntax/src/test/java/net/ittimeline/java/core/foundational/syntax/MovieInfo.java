package net.ittimeline.java.core.foundational.syntax;

/**
 * 使用变量存储电影信息
 * 需求：电影信息包括电影名称、导演、主演、地区、上映时间、评分，要求使用合适数据类型的变量存储并输出
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 22:22
 * @since Java21
 */
public class MovieInfo {
    public static void main(String[] args) {
        String name = "红海行动";
        String director = "林超贤";
        String major = "张译/黄景瑜/海清/杜江";
        String area = "华语";
        String datetime = "2018-02-16";
        double score = 9.3;
        System.out.println("******************电影信息如下******************");
        System.out.println("电影名称：" + name);
        System.out.println("导演：" + director);
        System.out.println("主演：" + major);
        System.out.println("地区：" + area);
        System.out.println("上映时间：" + datetime);
        System.out.println("评分：" + score);
    }
}
