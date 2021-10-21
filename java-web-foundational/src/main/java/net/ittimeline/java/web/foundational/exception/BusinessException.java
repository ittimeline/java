package net.ittimeline.java.web.foundational.exception;

/**
 * 业务异常
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/7 13:47
 * @since JDK11
 */
public class BusinessException extends RuntimeException{

    public BusinessException(){}

    public BusinessException(String message){
        super(message);
    }

}
