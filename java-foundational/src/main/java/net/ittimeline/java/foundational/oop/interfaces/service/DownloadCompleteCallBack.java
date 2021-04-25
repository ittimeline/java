package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 下载完成回调
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 9:15
 * @since JDK11
 */
public interface DownloadCompleteCallBack {
    /**
     * 迅雷下载完成后相关处理(回调)
     * @param data 下载的数据
     */
    void doCompleteCallBack(String data);
}
