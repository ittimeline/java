package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 电脑
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 8:40
 * @since JDK11
 */
public class Computer {


    public void showComputerUSBDeviceInfo(USB usb1,USB usb2){
        System.out.println("电脑的第一个USB接口连接的设备是"+usb1.getDeviceInfo());
        System.out.println("电脑的第二个USB接口连接的设备是"+usb2.getDeviceInfo());
    }


}
