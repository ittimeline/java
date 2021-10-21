package net.ittimeline.java.web.foundational.util;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

/**
 * 发送邮件工具类
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/23 18:04
 * @since JDK11
 */
public final class SendEmailUtil {

    private SendEmailUtil(){}

    private static final Properties properties;

    /**
     * 加载邮件的配置
     */
    static {
        properties=new Properties();
        InputStream inputStream = SendEmailUtil.class.getClassLoader().getResourceAsStream("email.properties");

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 发送纯文本邮件
     * @param sendAddress
     * @param subject
     * @param content
     * @param copySendAddressList
     * @throws Exception
     */
    public static void sendSimpleEmail(String sendAddress, String subject, String content, List<String> copySendAddressList)throws Exception{
        //创建客户端与邮箱服务器的Session对象
        Session session=Session.getInstance(properties);
        //开启session的debug模式，方便查看发送Email的状态
        session.setDebug(true);
        //通过session获取Transport
        Transport transport = session.getTransport();
        //使用用户名和密码连接上邮箱服务器，此处的密码(授权码)需要到邮箱服务器开启设置
        transport.connect((String)properties.get("mail.host"),"18601767221@163.com","EDJVZCOLNCXJIHFL");
        //创建邮件
        Message message=createSimpleMessage(session,sendAddress,subject,content,copySendAddressList);
        //发送邮件
        transport.sendMessage(message,message.getAllRecipients());
        transport.close();
    }


    /**
     * 发送图文+附件的邮件
     * @param fromAddress 发件人
     * @param recipientAddress 收件人
     * @param subject 主题
     * @param content 内容 文字+图片
     * @param attachment 附件
     * @param copySendAddressList 抄送列表
     * @throws Exception
     */
    public static void sendTextImageAttachmentEmail(String fromAddress,String recipientAddress, String subject, String content,String attachment, List<String> copySendAddressList)throws Exception{
        //创建客户端与邮箱服务器的Session对象
        Session session=Session.getInstance(properties);
        //开启session的debug模式，方便查看发送Email的状态
        session.setDebug(true);
        //通过session获取Transport
        Transport transport = session.getTransport();
        //使用用户名和密码连接上邮箱服务器，此处的密码(授权码)需要到邮箱服务器开启设置
        transport.connect((String)properties.get("mail.host"),"18601767221@163.com","EDJVZCOLNCXJIHFL");
        //创建邮件
        Message message=createMessage(session,fromAddress,recipientAddress,subject,content,attachment);
        //发送邮件
        transport.sendMessage(message,message.getAllRecipients());
        transport.close();
    }









    private static Message createMessage(Session session,String sendAddress,String subject,String content,List<String> copySendAddressList) throws MessagingException {
        Message message=new MimeMessage(session);
        //指定邮件的发件人
        message.setFrom(new InternetAddress("18601767221@163.com"));
        //指定邮件的收件人
        message.setRecipient(Message.RecipientType.TO,new InternetAddress(sendAddress));
        //指定邮件的主题
        message.setSubject(subject);
        //指定邮件的内容
        message.setContent(content,"text/html;charset=UTF-8");
        if (null!=copySendAddressList&&copySendAddressList.size()>0){
            Address[] addresses =new Address[copySendAddressList.size()];
            for (int i =0;i<copySendAddressList.size();i++) {
                Address address=new InternetAddress(copySendAddressList.get(i));
                addresses[i]=address;
            }
            //设置邮件抄送人
            message.setRecipients(Message.RecipientType.CC,addresses);

        }
        return message;
    }

    /**
     * 创建邮件
     * @param session
     * @param sendAddress
     * @param subject  邮件主题
     * @param content 邮件内容
     * @param copySendAddressList 抄送人
     * @return
     */
    private static Message createSimpleMessage(Session session,String sendAddress,String subject,String content,List<String> copySendAddressList) throws MessagingException {
        Message message=createMessage(session,sendAddress,subject,content,copySendAddressList);
        //指定邮件的发件人
        message.setFrom(new InternetAddress("18601767221@163.com"));
        //指定邮件的收件人
        message.setRecipient(Message.RecipientType.TO,new InternetAddress(sendAddress));
        //指定邮件的主题
        message.setSubject(subject);
        //指定邮件的内容
        message.setContent(content,"text/html;charset=UTF-8");
        if (null!=copySendAddressList&&copySendAddressList.size()>0){
            Address[] addresses =new Address[copySendAddressList.size()];
            for (int i =0;i<copySendAddressList.size();i++) {
                Address address=new InternetAddress(copySendAddressList.get(i));
                addresses[i]=address;
            }
            //设置邮件抄送人
            message.setRecipients(Message.RecipientType.CC,addresses);

        }
        return message;
    }











    public static Message createMessage(Session session,String fromAddress,
                                            String recipientAddress,String subject,String imageUrl,String attachment) throws  Exception{
        MimeMessage mimeMessage=new MimeMessage(session);
        //指定邮件的发件人
        mimeMessage.setFrom(new InternetAddress(fromAddress));
        //指定邮件的收件人
        mimeMessage.setRecipient(Message.RecipientType.TO,new InternetAddress(recipientAddress));

        //设置邮件的主题
        mimeMessage.setSubject(subject);

        //设置邮件正文

        //创建图片节点
        MimeBodyPart imageMimeBodyPart=new MimeBodyPart();
        //读取本地文件
        DataHandler imageDataHandler = new DataHandler(new FileDataSource(imageUrl));
        //将图片添加到节点
        imageMimeBodyPart.setDataHandler(imageDataHandler);

        //为图片节点设置一个唯一编号 在文本节点将引用该ID
        imageMimeBodyPart.setContentID(String.valueOf(System.currentTimeMillis()));

        //创建文本节点
        MimeBodyPart textMimeBodyPart=new MimeBodyPart();
        textMimeBodyPart.setContent("此处应该有一张图片","text/html;charset=UTF-8");



        // 设置文本和图片的关系  将文本和图片合成一个节点
        MimeMultipart textImageMimeMultipart=new MimeMultipart();
        textImageMimeMultipart.addBodyPart(textMimeBodyPart);
        textImageMimeMultipart.addBodyPart(imageMimeBodyPart);
        //关联关系
        textImageMimeMultipart.setSubType("related");

        //将文本和图片的混合节点装成一个普通节点
        //最终添加到邮件的Content 是由多个BodyPart组成的Multipart,因此需要的是BodyPart
        MimeBodyPart textImageMimeBodyPart=new MimeBodyPart();
        textImageMimeBodyPart.setContent(textImageMimeMultipart);

        //创建附件节点
        MimeBodyPart attachmentMimeBodyPart=new MimeBodyPart();
        File file=new File("D:\\workspace\\java\\ittimelinedotnet\\java\\java-web-foundational\\src\\main\\resources\\"+attachment);
        DataHandler  attachmentDataHandler=new DataHandler(new FileDataSource(file));
        attachmentMimeBodyPart.setDataHandler(attachmentDataHandler);
        //设置附件的文件名 需要编码
        attachmentMimeBodyPart.setFileName(MimeUtility.encodeText(attachmentDataHandler.getName()));

        // 设置(文本+图片)和附件的关系 合成一个大的混合节点
        MimeMultipart mimeMultipart=new MimeMultipart();
        mimeMultipart.addBodyPart(textImageMimeBodyPart);
        mimeMultipart.addBodyPart(attachmentMimeBodyPart);
        mimeMultipart.setSubType("mixed");

        //设置整个邮件的关系
        mimeMessage.setContent(mimeMultipart);
        return mimeMessage;


    }


    public static void main(String[] args) {
        try {
         //   sendSimpleEmail("18601767221@163.com","测试邮件","这是一封测试邮件",null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            sendTextImageAttachmentEmail("18601767221@163.com","18601767221@163.com"
                    ,"发送图片+文件+附件邮件","发送图片+文件+附件邮件","jdbc.properties",null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
