package net.ittimeline.java.web.foundational.service;

import net.ittimeline.java.web.foundational.bean.entity.Words;

import java.util.List;

/**
 * 关键字搜索业务接口
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/7 15:00
 * @since JDK11
 */
public interface WordsService {

    /**
     * 根据关键字搜索
     * @param keyword
     * @return
     */
    List<Words> searchWords(String keyword);
}
