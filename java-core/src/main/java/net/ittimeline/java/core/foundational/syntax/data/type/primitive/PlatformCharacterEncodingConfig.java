package net.ittimeline.java.core.foundational.syntax.data.type.primitive;

import java.nio.charset.Charset;

/**
 * 获取平台编码
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 12:07
 * @since Java 25
 */
public class PlatformCharacterEncodingConfig {
    static void main() {
        // Java 25 默认字符编码：UTF-8
        System.out.println(Charset.defaultCharset());

        // 操作系统本地编码，可能是 GBK / Cp1252 等
        System.out.println(System.getProperty("native.encoding"));

        // 控制台输出编码，可能是 GBK、UTF-8 等
        System.out.println(System.getProperty("stdout.encoding"));
    }
}
