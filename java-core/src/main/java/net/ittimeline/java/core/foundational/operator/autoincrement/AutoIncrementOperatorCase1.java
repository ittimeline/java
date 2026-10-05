package net.ittimeline.java.core.foundational.operator.autoincrement;

/**
 * 自增运算符案例1
 * 需求：根据指定表达式计算i和j的值
 * ①
 * int i = 1;
 * i = i++;
 * ②
 * int j = 1;
 * j = ++j;
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:36
 * @since Java 25
 */
public class AutoIncrementOperatorCase1 {
    static void main() {
        /*
            分析int i = 1;i = i++; 的计算过程
            ① i = 1; //i赋值为1
            ② int temp = i; //先保存 i 自增之前的旧值 1, 为了方便理解，这里使用 temp 表示,实际上这个旧值保存在操作数栈中
            ③ i = i + 1; //i再自增，i等于2
            ④ i = temp; // 再将之前保存的旧值 1 赋值给 i
            i的计算结果是1
         */
        int i = 1;
        i = i++;
        System.out.println("i = " + i);
        /*
            分析int j = 1;j = ++j;的计算过程
            ① j = 1; //j赋值为1
            ② j = j+1;   // 将j的值自增1，j等于2
            ③ int temp = j; //  保存 j 自增之后的新值 2,为了方便理解，这里使用 temp 表示,  实际上这个新值保存在操作数栈中
            ④ j = temp; //再将新值 2 赋值给 j
            j的计算结果是2
         */
        int j = 1;
        j = ++j;
        System.out.println("j = " + j);
    }

    /*
    public class net.ittimeline.java.core.foundational.operator.autoincrement.AutoIncrementOperatorCase1 {
      public net.ittimeline.java.core.foundational.operator.autoincrement.AutoIncrementOperatorCase1();
        Code:
             0: aload_0
             1: invokespecial #1                  // Method java/lang/Object."<init>":()V
             4: return

      static void main();
        Code:
             0: iconst_1      将 int 常量 1 压入操作数栈。
             1: istore_0      将栈顶的 1 弹出，保存到局部变量表 0 号槽位，也就是：i = 1;
             2: iload_0       将局部变量表 0 号槽位中 i 的值 1 压入操作数栈，这个 1 是 i++ 表达式的结果值，也就是自增前的旧值。
             3: iinc          0, 1  将局部变量表 0 号槽位中的值直接加 1，也就是：i = 2; 但是操作数栈中的旧值 1 不受影响。
             6: istore_0      将操作数栈中的旧值 1 弹出，再保存回局部变量表 0 号槽位，也就是：i = 1;

             7: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
            10: iload_0       将 i 当前的值 1 压入操作数栈。
            11: invokedynamic #13,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
            16: invokevirtual #17                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V

            19: iconst_1      将 int 常量 1 压入操作数栈。
            20: istore_1      将栈顶的 1 弹出，保存到局部变量表 1 号槽位，也就是：j = 1;
            21: iinc          1, 1  将局部变量表 1 号槽位中的值直接加 1，也就是：j = 2;
            24: iload_1       将自增之后的新值 2 压入操作数栈。
            25: istore_1      将栈顶的 2 弹出，再保存到局部变量表 1 号槽位，也就是：j = 2;

            26: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
            29: iload_1       将 j 当前的值 2 压入操作数栈。
            30: invokedynamic #23,  0             // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
            35: invokevirtual #17                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
            38: return         main() 方法执行结束。
   }
*/
}
