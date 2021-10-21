package net.ittimeline.java.web.foundational.service.impl;

import net.ittimeline.java.web.foundational.bean.entity.Words;
import net.ittimeline.java.web.foundational.dao.WordsDao;
import net.ittimeline.java.web.foundational.dao.impl.WordsDaoImpl;
import net.ittimeline.java.web.foundational.service.WordsService;

import java.util.List;

/**
 * 关键字搜索业务实现类
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/7 15:01
 * @since JDK11
 */
public class WordsServiceImpl implements WordsService {

    private WordsDao wordsDao=new WordsDaoImpl();

    @Override
    public List<Words> searchWords(String keyword) {
        try {
            return wordsDao.selectByWords(keyword);
        } catch (Exception e) {
           throw new RuntimeException(e.getMessage());
        }
    }
}
