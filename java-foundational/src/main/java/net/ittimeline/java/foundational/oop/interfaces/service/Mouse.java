package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 鼠标
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 8:41
 * @since JDK11
 */
public class Mouse implements USB{

    @Override
    public String getDeviceInfo() {
        return "罗技鼠标";
    }
}
