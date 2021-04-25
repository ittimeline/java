package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 回调接口测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 9:24
 * @since JDK11
 */
public class CustomerTest {

    public static void main(String[] args) {

        DownloadCompleteCallBack downloadCompleteCallBack=new BaiduDiskCallBack();

        Customer tony =new Customer(downloadCompleteCallBack);
        tony.downloadData("IDEA.exe");

        downloadCompleteCallBack=new InstallCallBack();
        tony=new Customer(downloadCompleteCallBack);
        tony.downloadData("IDEA.exe");
    }
}
