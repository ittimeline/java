package net.ittimeline.java.core.foundational.operator.autoincrement;

/**
 * 前置++字节码指令
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 17:06
 * @since Java 25
 */
public class BeforeIncrementByteCode {
    static void main() {
        int i = 10;
        int k = ++i;
    }

    /*
        public class net.ittimeline.java.core.foundational.operator.autoincrement.BeforeIncrementByteCode {
          public net.ittimeline.java.core.foundational.operator.autoincrement.BeforeIncrementByteCode();
            Code:
                 0: aload_0
                 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
                 4: return

          static void main();
            Code:
                 0: bipush        10
                 2: istore_0
                 3: iinc          0, 1
                 6: iload_0
                 7: istore_1
                 8: return
        }

        0: bipush 10
        将 int 常量 10 压入操作数栈。

        2: istore_0
        将操作数栈顶的 10 弹出，保存到局部变量表 0 号槽位，也就是变量 i。

        3: iinc 0, 1
        将局部变量表 0 号槽位中的值直接加 1。
        此时 i 从 10 变成 11。
        这条指令不会操作操作数栈。

        6: iload_0
        从局部变量表 0 号槽位读取 i 当前的值 11，压入操作数栈。

        此时操作数栈中的值是 11，也就是 ++i 自增之后的新值。

        7: istore_1
        将操作数栈顶的 11 弹出，保存到局部变量表 1 号槽位，也就是变量 a。

        8: return
        main() 方法执行结束。
     */
}
