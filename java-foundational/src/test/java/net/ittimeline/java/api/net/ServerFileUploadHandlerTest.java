package net.ittimeline.java.api.net;

import org.testng.annotations.Test;

/**
 * @author tony 18601767221@163.com
 * @version 2021/6/3 14:16
 * @since JDK11
 */
public class ServerFileUploadHandlerTest {




    @Test
    public void testServerFileUploadHandlerDoFileUpload(){
        ServerFileUploadHandler serverFileUploadHandler=new ServerFileUploadHandler();
        serverFileUploadHandler.doFileUpload();

    }




}
