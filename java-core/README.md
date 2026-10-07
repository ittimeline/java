# 环境配置

| 软件  | 版本                   |
|-------|------------------------|
| OS    | Windows 11 2026 H2     |
| JDK   | Java 25.0.4.1          |
| IDE   | IntelliJ IDEA 2026.2.3 |
| Build | Maven 3.10             |
| VCS   | Git 2.56.0             |

***

## Java

### Java官网和官方文档

Java官网 https://www.oracle.com/java/

![Java官网](assets/images/Java官网.png)

https://docs.oracle.com/en/java/javase/25/

![Java 25 官方文档](assets/images/Java%2025%20官方文档.png)

### Java环境变量配置

1. JAVA_HOME环境变量配置

![JAVA_HOME环境变量](assets/images/JAVA_HOME环境变量.png)

2. PATH环境变量配置

![Java的PATH环境变量](assets/images/JAVA的PATH环境变量.png)

3. 验证Java环境

![验证Java环境](assets/images/验证Java环境.png)

## Maven

### Maven官网

![Maven官网](assets/images/Maven官网.png)

### Maven环境变量配置

1. MAVEN_HOME环境变量

   ![MAVEN_HOME环境变量](assets/images/MAVEN_HOME环境变量.png)

2. PATH环境变量配置

![Maven的PATH环境变量配置](assets/images/Maven的PATH环境变量配置.png)

3. 验证Maven环境

![验证Maven环境](assets/images/验证Maven环境.png)

### Maven设置

修改%MAVEN_HOME%\conf\settings.xml

1. 本地仓库配置

```xml

<localRepository>D:\soft\java\maven-repository</localRepository>

```

2. 阿里云镜像仓库[配置](https://maven.aliyun.com/mvn/guide)

```xml

<mirror>
    <id>aliyunmaven</id>
    <mirrorOf>*</mirrorOf>
    <name>阿里云公共仓库</name>
    <url>https://maven.aliyun.com/repository/public</url>
</mirror>
```

## Git

### Git官网和官方文档

Git官网 https://git-scm.com/

![Git官网](assets/images/Git官网.png)

Git官方文档 https://git-scm.com/docs

![Git官方文档](assets/images/Git官方文档.png)

### 配置用户名

```shell
git config --global user.name "ittimeline"
```

### 配置邮箱

```shell
git config --global user.email "ittimelinedotnet@gmail.com"
```

### 配置换行符

```shell
git config --global core.autocrlf true
```

![配置Git的用户名、邮箱和换行符](assets/images/配置Git的用户名、邮箱和换行符.png)

## 配置全局代理

```shell
git config --global http.proxy http://127.0.0.1:7899
git config --global https.proxy https://127.0.0.1:7899
```

![image-20261005165829385](assets/images/Git配置全局代理.png)

## IntelliJ IDEA

### IntelliJ IDEA 官网和官方文档

IntelliJ IDEA 官网 https://www.jetbrains.com/idea/

![IntelliJ IDEA 官网](assets/images/IntelliJ%20IDEA官网.png)

IntelliJ IDEA 官方文档 https://www.jetbrains.com/help/idea/getting-started.html

![IntelliJ IDEA 官方文档 ](assets/images/IntelliJ%20IDEA官方文档.png)

### IntelliJ IDEA VMOptions 设置

修改C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.3\bin目录下的idea64.exe.vmoptions

- 默认设置

  ```properties
  -Xms128m
  -Xmx2048m
  -XX:JbrShrinkingGcMaxHeapFreeRatio=40
  -XX:ReservedCodeCacheSize=512m
  -XX:+HeapDumpOnOutOfMemoryError
  -XX:-OmitStackTraceInFastThrow
  -XX:CICompilerCount=2
  -XX:+IgnoreUnrecognizedVMOptions
  -XX:+UnlockDiagnosticVMOptions
  -XX:TieredOldPercentage=100000
  -XX:+UseCompactObjectHeaders
  --sun-misc-unsafe-memory-access=allow
  -ea
  -Dsun.io.useCanonCaches=false
  -Dsun.java2d.metal=true
  -Djbr.catch.SIGABRT=true
  -Djdk.http.auth.tunneling.disabledSchemes=""
  -Djdk.attach.allowAttachSelf=true
  -Djdk.module.illegalAccess.silent=true
  -Djdk.nio.maxCachedBufferSize=2097152
  -Djava.util.zip.use.nio.for.zip.file.access=true
  -Dkotlinx.coroutines.debug=off
  -Dskiko.rendering.useScreenMenuBar=false
  -Djava.nio.file.spi.DefaultFileSystemProvider=com.intellij.platform.core.nio.fs.MultiRoutingFileSystemProvider
  -javaagent:C:/Users/Public/.jb_run/ja-netfilter.jar
  ```

- 32G内存参考设置

```properties
-Xms4096m
-Xmx4096m
-XX:JbrShrinkingGcMaxHeapFreeRatio=80
-XX:ReservedCodeCacheSize=2048m
-XX:+HeapDumpOnOutOfMemoryError
-XX:-OmitStackTraceInFastThrow
-XX:CICompilerCount=8
-XX:+IgnoreUnrecognizedVMOptions
-XX:+UnlockDiagnosticVMOptions
-XX:TieredOldPercentage=100000
-XX:+UseCompactObjectHeaders
--sun-misc-unsafe-memory-access=allow
-ea
-Dsun.io.useCanonCaches=false
-Dsun.java2d.metal=true
-Djbr.catch.SIGABRT=true
-Djdk.http.auth.tunneling.disabledSchemes=""
-Djdk.attach.allowAttachSelf=true
-Djdk.module.illegalAccess.silent=true
-Djdk.nio.maxCachedBufferSize=2097152
-Djava.util.zip.use.nio.for.zip.file.access=true
-Dkotlinx.coroutines.debug=off
-Dskiko.rendering.useScreenMenuBar=false
-Djava.nio.file.spi.DefaultFileSystemProvider=com.intellij.platform.core.nio.fs.MultiRoutingFileSystemProvider
-javaagent:C:/Users/Public/.jb_run/ja-netfilter.jar

```

### IntelliJ IDEA 激活

https://ckey.run/

- Windows版IntelliJ IDEA

```shell
irm ckey.run|iex
```

按 Win + X，选择 Windows PowerShell（管理员）运行即可。

![Windows版IntelliJ IDEA激活](assets/images/Windows版IntelliJ%20IDEA激活.png)

### IntelliJ IDEA 常用设置

1. 外观字体

![外观字体](assets/images/IntelliJ%20IDEA%20外观字体.png)

2. 编辑器字体

![编辑器字体](assets/images/IntelliJ%20IDEA%20编辑器字体.png)

3. 自动导包

![自动导包](assets/images/IntelliJ%20IDEA自动导包.png)

4. 控制台设置

![控制台设置](assets/images/IntelliJ%20IDEA控制台设置.png)

5. 文件和代码模板设置

```java
/**
 * ${description}
 *
 * @author tony 18601767221@163.com
 * @version ${DATE} ${TIME}
 * @since Java 25
 */
```

![文件和代码模板设置](assets/images/IntelliJ%20IDEA文件和代码模板设置.png)

6. 保存操作

![保存操作](assets/images/保存操作.png)

### IntelliJ IDEA 集成Maven

![IntelliJ IDEA 集成Maven](assets/images/IntelliJ%20IDEA集成Maven.png)

### IntelliJ IDEA 集成GitHub

![IntelliJ IDEA 集成GitHub](assets/images/IntelliJ%20IDEA集成GitHub.png)

### IntelliJ IDEA 常用插件

- [Statistics](https://plugins.jetbrains.com/plugin/4509-statistic)
- [Translation](https://plugins.jetbrains.com/plugin/8579-translation)
- [Grep Console](https://plugins.jetbrains.com/plugin/7125-grep-console)
- [XCodeMap](https://plugins.jetbrains.com/plugin/24648-xcodemap)



