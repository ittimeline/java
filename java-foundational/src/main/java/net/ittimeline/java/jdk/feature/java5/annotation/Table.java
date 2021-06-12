package net.ittimeline.java.jdk.feature.java5.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解-带有属性
 * @author tony 18601767221@163.com
 * @version 2021/6/12 20:32:18
 * @description
 * @since JDK11
 */
@Target(ElementType.TYPE) //注解只能使用在类上
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    /**
     * 表的编号
     * @return
     */
    long id();
    /**
     * 表名
     * @return
     */
    String name();

    /**
     * 表名的前缀
     * @return
     */
    String prefix() default "tbl_";

    /**
     * 支持的数据库
     * @return
     */
    String[] databases();
}
