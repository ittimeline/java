package net.ittimeline.java.core.foundational.operator.assignment;

/**
 * 赋值运算字节码指令
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 16:14
 * @since Java 25
 */
public class AssignmentOperatorByteCode {
    static void main() {
        int i = 10;
        int a = i;

    }
}

/*
   javap -c AssignmentOperatorByteCode 反编译字节码文件

    public class net.ittimeline.java.core.foundational.operator.assignment.AssignmentOperatorByteCode {
      public net.ittimeline.java.core.foundational.operator.assignment.AssignmentOperatorByteCode();
        Code:
             0: aload_0
             1: invokespecial #1                  // Method java/lang/Object."<init>":()V
             4: return

      static void main();
        Code:
             0: bipush        10
             2: istore_0
             3: iload_0
             4: istore_1
             5: return
   }


    bipush 10:将 int 类型常量 10 压入操作数栈
    istore_0:将操作数栈顶的 int 类型数据弹出，存入局部变量表的 0 号槽位，也就是变量 i
    iload_0: 从局部变量表的 0 号槽位读取 i 的值，  将这个值复制一份并压入操作数栈
              注意： iload_0 不会删除局部变量表中的 i，局部变量表 0 号槽位中的值仍然存在
    istore_1:将操作数栈顶的 int 类型数据弹出，存入局部变量表的 1 号槽位，也就是变量 a
    return: static void main() 方法执行结束

 */