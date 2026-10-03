package net.ittimeline.java.core.foundational.object;

/**
 * 打印个人信息
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/3 13:04
 * @since Java 25
 */
public class PrintlnPersonInfo {
    static void main() {
        IO.println("姓名：刘光磊");
        IO.println("年龄：25");
        IO.println("性别：男");
        IO.println("家庭住址：上海市浦东新区");
        IO.println("联系电话：18601767221");
    }
}

/*
    "C:\Program Files\Java\jdk-25.0.4.1\bin\java.exe"
    "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=5202"
    -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
    -classpath D:\projects\java\java-core\target\classes net.ittimeline.java.core.foundational.object.PrintlnPersonInfo

 */