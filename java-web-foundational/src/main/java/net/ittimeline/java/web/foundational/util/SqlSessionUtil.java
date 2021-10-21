package net.ittimeline.java.web.foundational.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * SqlSession工具类
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/30 10:34
 * @since JDK11
 */
public class SqlSessionUtil {
    private static SqlSessionFactory sqlSessionFactory;

    /**
     * 静态代码看初始化sqlSessionFactory
     * 因为整个项目只能有一个SqlSessionFactory对象
     */
    static {
        try (
                InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        ) {
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 获取SqlSession
     * 此方法会关闭 自动开启事务和自动提交事务，需要手动提交
     * @return
     */
    public static SqlSession openSqlSession() {
        return sqlSessionFactory.openSession();
    }

    /**
     * 获取SqlSession
     * 此方法会自动提交事务
     * @param autoCommit true表示自动提交
     * @return
     */
    public static SqlSession openSqlSession(boolean autoCommit) {
        return sqlSessionFactory.openSession(autoCommit);
    }

    /**
     * 提交事务事务并且关闭SqlSession
     * @param sqlSession
     */
    public static void commitAndClose(SqlSession sqlSession){
        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }


    /**
     * 回滚事务事务并且关闭SqlSession
     * @param sqlSession
     */
    public static void rollbackAndClose(SqlSession sqlSession){
        //回滚事务
        sqlSession.rollback();
        //关闭资源
        sqlSession.close();
    }
}
