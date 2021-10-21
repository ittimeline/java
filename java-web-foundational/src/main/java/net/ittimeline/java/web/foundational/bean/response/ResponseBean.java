package net.ittimeline.java.web.foundational.bean.response;


import java.io.Serializable;

/**
 * 服务端返回给客户端的统一数据封装ResponseBean
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/7 9:45
 * @since JDK11
 */
public class ResponseBean<T> implements Serializable {

    /**
     * 标识服务器是否有异常
     */
    private Boolean flag;

    /**
     * 服务器响应的数据
     */
    private T data;

    /**
     * 服务器端响应的错误消息
     */
    private String errorMessage;


    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ResponseBean(){}

    public ResponseBean(Boolean flag){
        this.flag=flag;
    }

    public ResponseBean(T data) {
        this.data = data;
    }


    public ResponseBean(T data, String errorMessage) {
        this.data = data;
        this.errorMessage = errorMessage;
    }

    public ResponseBean(Boolean flag, T data, String errorMessage) {
        this.flag = flag;
        this.data = data;
        this.errorMessage = errorMessage;
    }



    @Override
    public String toString() {
        return "ResponseBean{" +
                "flag=" + flag +
                ", data=" + data +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
