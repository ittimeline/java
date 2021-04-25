package net.ittimeline.java.foundational.oop.enums;

/**
 * 注册来源
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/25 7:56
 * @since JDK11
 */
public enum RegisterSource {

    ANDROID_APP("安卓客户端"),IOS_APP("IOS客户端"),PC("PC端"),UNKONWN("未知客户端");


    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    RegisterSource(String description){
        this.description=description;
    }
}
