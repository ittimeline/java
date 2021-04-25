package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 客户
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 9:12
 * @since JDK11
 */
public class Customer {

    private final DownloadCompleteCallBack downloadCompleteCallBack;

    public Customer(DownloadCompleteCallBack downloadCompleteCallBack){
        this.downloadCompleteCallBack=downloadCompleteCallBack;
    }


    /**
     * 根据指定的URL下载数据
     * @param url
     */
    public void downloadData(String url){
        Thunder thunder=new Thunder();
        thunder.handleDownloadData(url,downloadCompleteCallBack);
    }
}
