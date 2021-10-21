package net.ittimeline.java.web.foundational.dao;

import net.ittimeline.java.web.foundational.util.JDBCUtil;
import org.testng.annotations.Test;

import java.sql.*;

/**
 * 数据库元数据的获取
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/6 10:40
 * @since JDK11
 */

public class MetaDataTest {


    /**
     * 获取SQL参数元数据
     */
    @Test
    public void getParameterMetaData(){
        String sql="select id,name,password,create_date,update_date from jdbc_user where name = ? and password = ? ";
            try(
                    Connection connection = JDBCUtil.getConnection();
                    PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ){
                ParameterMetaData parameterMetaData = preparedStatement.getParameterMetaData();
                //获取SQL参数的个数
                int parameterCount = parameterMetaData.getParameterCount();
                System.out.println("获取SQL参数的个数是"+parameterCount);
                //MySQL不能获取SQL参数的类型
                //int parameterType = parameterMetaData.getParameterType(1);
                //System.out.println("获取SQL参数的类型"+parameterType);


            }catch(Exception ex){
              ex.printStackTrace();
            }


    }


    /**
     * 获取结果集的元数据
     */
    @Test
    public void getResultSetMetaData(){
        String sql="select id,name,password,create_date,update_date from jdbc_user where name = ? and password = ? ";
        try(
                Connection connection = JDBCUtil.getConnection();
                PreparedStatement preparedStatement=connection.prepareStatement(sql);
        ){
            ParameterMetaData parameterMetaData = preparedStatement.getParameterMetaData();
            //获取SQL参数的个数
            int parameterCount = parameterMetaData.getParameterCount();
            System.out.println("获取SQL参数的个数是"+parameterCount);

            preparedStatement.setString(1,"admin");
            preparedStatement.setString(2,"111111");

            ResultSet resultSet = preparedStatement.executeQuery();
            //获取结果集的元数据
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            //获取列的个数
            int columnCount = resultSetMetaData.getColumnCount();
            System.out.println("jdbc_user表的列的个数"+columnCount);

            for (int i =1; i <=columnCount ; i++) {
                System.out.println("获取结果集中的指定列的列名:"+resultSetMetaData.getColumnName(i));
                System.out.println("获取结果集中的指定列的MySQL数据类型名称:"+resultSetMetaData.getColumnTypeName(i));
                System.out.println("获取结果集中的指定列的MySQL数据类型对应的Java类型:"+resultSetMetaData.getColumnClassName(i));
                System.out.println("楚河************************************************************汉界");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
