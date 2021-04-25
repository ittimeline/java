package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 接口的案例：接口作为方法的形参
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 8:43
 * @since JDK11
 */
public class ComputerTest {

    public static void main(String[] args) {
        Computer computer=new Computer();

        USB usb1=new Mouse();
        USB usb2=new HardDisk();
        computer.showComputerUSBDeviceInfo(usb1,usb2);
    }
}
