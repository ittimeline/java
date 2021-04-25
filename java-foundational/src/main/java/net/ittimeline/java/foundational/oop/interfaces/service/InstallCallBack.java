package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * 安装回调
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 9:17
 * @since JDK11
 */
public class InstallCallBack implements DownloadCompleteCallBack {

    private static final String soft="IDEA.exe";
    @Override
    public void doCompleteCallBack(String data) {
        System.out.println("迅雷下载到的数据是"+data);
        if(soft.equals(data)){
            System.out.println("用户执行安装"+data);
        }
    }
}
