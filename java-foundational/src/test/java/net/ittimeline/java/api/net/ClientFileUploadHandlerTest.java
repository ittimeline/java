package net.ittimeline.java.api.net;

import org.testng.annotations.Test;

/**
 * 客户端上传文件的使用
 * @author tony 18601767221@163.com
 * @version 2021/6/3 14:34
 * @since JDK11
 */
public class ClientFileUploadHandlerTest {


    @Test
    public void testClientFileUploadHandlerDoFileUpload1(){
        ClientFileUploadHandler clientFileUploadHandler=new ClientFileUploadHandler();
        clientFileUploadHandler.doFileUpload("D:\\io\\writer.mp4");
    }

    @Test
    public void testClientFileUploadHandlerDoFileUpload2(){
        ClientFileUploadHandler clientFileUploadHandler=new ClientFileUploadHandler();
        clientFileUploadHandler.doFileUpload("D:\\io\\writer.mp4");
    }

    @Test
    public void testClientFileUploadHandlerDoFileUpload3(){
        ClientFileUploadHandler clientFileUploadHandler=new ClientFileUploadHandler();
        clientFileUploadHandler.doFileUpload("D:\\io\\writer.mp4");
    }
}
