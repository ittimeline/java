package net.ittimeline.java.web.foundational.dao;

import com.mysql.cj.jdbc.Driver;
import org.testng.annotations.Test;

import java.sql.*;


/**
 * JDBC编程
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/1 15:30
 * @since JDK11
 */

public class JDBCTest {


    /**
     * 使用 JDBC API 查询jdbc_user表的数据
     */
    @Test
    public  void testSelectJDBCUserTableData(){

        String url="jdbc:mysql://127.0.0.1:3306/jdbc";
        String userName="root";
        String userPassword="Guanglei888..";

        try {
            //1.注册驱动
            DriverManager.registerDriver( new Driver());
            //2. 获得连接
            Connection connection = DriverManager.getConnection(url, userName, userPassword);
            //3.获取执行SQL语句的对象
            Statement statement = connection.createStatement();
            //4.执行SQL获取返回结果得到结果集
            ResultSet resultSet = statement.executeQuery("select * from jdbc_user");
            //5.处理结果
            while(resultSet.next()){
                //获取表中的记录 循环一次就是获取一条记录
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                Timestamp createDate = resultSet.getTimestamp("create_date");
                Timestamp updateDate = resultSet.getTimestamp("update_date");
                //打印查询jdbc_user表中的数据
                System.out.println("id :"+id +" name :"+name+"password: "
                        +password+"createDate :"+createDate+"updateDate :"+updateDate);
            }

            // 6.关闭资源
            if (resultSet!=null){
                resultSet.close();
            }
            if (statement!=null){
                statement.close();
            }

            if (connection!=null){
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    /**
     *  使用 JDBC API 查询jdbc_user表的数据
     * 使用try-with-resources自动关闭资源
     */
    @Test
    public void testSelectJDBCUserTableDataTryWithResourceV1(){
        String url="jdbc:mysql://127.0.0.1:3306/jdbc";
        String userName="root";
        String userPassword="Guanglei888..";
        try(
                //2. 获得连接
                Connection connection = DriverManager.getConnection(url, userName, userPassword);
                //3.获取执行SQL语句的对象
                Statement statement = connection.createStatement();

                //4.执行SQL获取返回结果得到结果集
                ResultSet resultSet = statement.executeQuery("select * from jdbc_user");
        ){
            //1.注册驱动
            DriverManager.registerDriver( new Driver());

            //5.处理结果
            while(resultSet.next()){
                //获取表中的记录 循环一次就是获取一条记录
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                Timestamp createDate = resultSet.getTimestamp("create_date");
                Timestamp updateDate = resultSet.getTimestamp("update_date");


                //打印查询jdbc_user表中的数据
                System.out.println("id :"+id +" name :"+name+"password: "
                        +password+"createDate :"+createDate+"updateDate :"+updateDate);
            }

        }catch(Exception ex){
          ex.printStackTrace();
        }
    }


    /**
     *  使用 JDBC API 查询jdbc_user表的数据
     * 使用try-with-resources自动关闭资源
     */
    @Test
    public void testSelectJDBCUserTableDataTryWithResourceV2(){
        String url="jdbc:mysql://127.0.0.1:3306/jdbc";
        String userName="root";
        String userPassword="Guanglei888..";
        try(
                //2. 获得连接
                Connection connection = DriverManager.getConnection(url, userName, userPassword);

                //3.获取执行SQL语句的对象
                Statement statement = connection.createStatement();

                //4.执行SQL获取返回结果得到结果集
                ResultSet resultSet = statement.executeQuery("select * from jdbc_user");
        ){
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println(connection.getClass());

            //5.处理结果
            while(resultSet.next()){
                //获取表中的记录 循环一次就是获取一条记录
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                Timestamp createDate = resultSet.getTimestamp("create_date");
                Timestamp updateDate = resultSet.getTimestamp("update_date");
                //打印查询jdbc_user表中的数据
                System.out.println("id :"+id +" name :"+name+"password: "
                        +password+"createDate :"+createDate+"updateDate :"+updateDate);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }



}
