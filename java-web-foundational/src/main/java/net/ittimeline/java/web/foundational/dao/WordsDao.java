package net.ittimeline.java.web.foundational.dao;

import net.ittimeline.java.web.foundational.bean.entity.Words;

import java.util.List;

/**
 * 关键字搜索DAO接口
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/7 14:52
 * @since JDK11
 */
public interface WordsDao {

    /**
     * 根据关键字搜索
     * @param word
     * @return 关键字匹配的文字列表
     * @throws Exception
     */
    List<Words> selectByWords(String word) throws Exception;
}
