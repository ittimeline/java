package net.ittimeline.java.web.foundational.dao.impl;

import net.ittimeline.java.web.foundational.bean.entity.Words;
import net.ittimeline.java.web.foundational.dao.WordsDao;
import net.ittimeline.java.web.foundational.util.CustomQueryRunner;
import net.ittimeline.java.web.foundational.util.DruidDataSourceUtil;

import java.util.List;

/**
 * 关键字搜索DAO实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/7 14:54
 * @since JDK11
 */
public class WordsDaoImpl implements WordsDao {
    CustomQueryRunner customQueryRunner=new CustomQueryRunner(DruidDataSourceUtil.getDataSource());

    @Override
    public List<Words> selectByWords(String word) throws Exception {
        String sql="select id,word from jdbc_words where word like ? limit 0,10";
        List<Words> wordsList = customQueryRunner.queryForList(sql, Words.class, "%" + word + "%");
        if (wordsList!=null&&wordsList.size()>0) {
            return wordsList;

        }
        return null;
    }
}
