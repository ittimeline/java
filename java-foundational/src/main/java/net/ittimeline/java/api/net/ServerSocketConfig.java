package net.ittimeline.java.api.net;

/**
 * 服务器的配置
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/2 16:41
 * @since JDK11
 */
public class ServerSocketConfig {

    public ServerSocketConfig(){}

    private Integer port=8888;

    private String ip="127.0.0.1";

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
