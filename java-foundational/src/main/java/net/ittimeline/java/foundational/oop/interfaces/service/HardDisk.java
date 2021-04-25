package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 硬盘
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 8:44
 * @since JDK11
 */
public class HardDisk implements USB{

    @Override
    public String getDeviceInfo() {
        return "希捷4T硬盘";
    }
}
