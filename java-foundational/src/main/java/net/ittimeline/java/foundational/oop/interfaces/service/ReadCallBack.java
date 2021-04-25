package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 读取文件回调
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 9:21
 * @since JDK11
 */
public class ReadCallBack implements DownloadCompleteCallBack{
    @Override
    public void doCompleteCallBack(String data) {
        System.out.println("下载的数据是"+data);
        System.out.println("用户正在使用PDF工具阅读"+data);
    }
}
