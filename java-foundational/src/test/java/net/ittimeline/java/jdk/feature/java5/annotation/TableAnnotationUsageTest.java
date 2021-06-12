package net.ittimeline.java.jdk.feature.java5.annotation;

/**
 * 自定义注解的使用-带属性
 * @author tony 18601767221@163.com
 * @version 2021/6/12 20:32:18
 * @description
 * @since JDK11
 */

public class TableAnnotationUsageTest {
}

@Table(id=1,name="employee",prefix = "tbl_",databases = "MySQL")
class Employee{

    @Column(name = "name")
    String name;

}