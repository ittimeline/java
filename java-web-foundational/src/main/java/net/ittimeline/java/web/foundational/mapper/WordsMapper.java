package net.ittimeline.java.web.foundational.mapper;

import net.ittimeline.java.web.foundational.bean.entity.Words;

import java.util.List;

/**
 * 关键字搜索(模糊查询)-基于Mybatis实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/30 12:21
 * @since JDK11
 */
public interface WordsMapper {

    /**
     * 根据关键字搜索
     * @param keyWord
     * @return 关键字匹配的文字列表
     */
    List<Words> selectByWords(String keyWord) ;
}
