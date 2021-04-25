package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * @author tony 18601767221@163.com
 * @version 2021/4/23 9:28
 * @since JDK11
 */
public class BaiduDiskCallBack  implements  DownloadCompleteCallBack{
    @Override
    public void doCompleteCallBack(String data) {
        System.out.println("迅雷下载到的数据是"+data);
        System.out.println("用户存储"+data+"到百度网盘");
    }
}
