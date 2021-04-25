package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 日志服务
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 8:46
 * @since JDK11
 */
public interface LogService {

    /**
     * 网站名称
     * 常量
     */
    String WEB_SITE_NAME="淘宝网";


    /**
     * 记录用户操作日志
     */
    void log();



}
