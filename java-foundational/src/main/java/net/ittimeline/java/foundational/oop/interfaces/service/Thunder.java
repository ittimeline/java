package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 迅雷
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 9:13
 * @since JDK11
 */
public class Thunder {

    /**
     * 根据用户传递的URL下载数据
     * @param url
     */
    public void handleDownloadData(String url,DownloadCompleteCallBack downloadCompleteCallBack){
        System.out.println("解析地址"+url);
        System.out.println("正在下载数据...");
        String data=url;
        System.out.println(data+"已经下载完成");
        //回调
        downloadCompleteCallBack.doCompleteCallBack(data);

    }
}
