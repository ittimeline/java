package net.ittimeline.java.web.foundational.dao;

import net.ittimeline.java.web.foundational.bean.entity.Words;
import net.ittimeline.java.web.foundational.dao.impl.WordsDaoImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * 关键字搜索测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/7 14:57
 * @since JDK11
 */
public class WordsDaoTest {
    private WordsDao wordsDao=new WordsDaoImpl();


    @Test
    public void testSelectByWord(){
        try {
            List<Words> wordsList = wordsDao.selectByWords("iphone");
            Assert.assertEquals(wordsList.size(),8);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
