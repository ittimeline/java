package net.ittimeline.java.web.foundational.mapper;

import net.ittimeline.java.web.foundational.bean.entity.Words;
import net.ittimeline.java.web.foundational.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

/**
 * 关键字搜索(模糊查询)-Mybatis实现的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/30 12:27
 * @since JDK11
 */
public class WordMapperTest {

    @Test
    public void testSelectByWords(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        WordsMapper wordsMapper = sqlSession.getMapper(WordsMapper.class);
        List<Words> wordList= wordsMapper.selectByWords("iphone");
        for (Words word : wordList) {
            System.out.println(word);
        }
    }
}
