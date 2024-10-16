package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量的声明、赋值和定义
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 6:11
 * @since Java21
 */
public class VariableDefinition {
    public static void main(String[] args) {
        /******************1.变量的声明、赋值******************/
         /*
            变量的声明语法格式：数据类型 变量名;
            数据类型：限制变量存储的数据类型，例如int表示整数，double表示浮点数（小数）
            变量名：表示存储空间的名字，根据变量名找到存储空间以及对应的值
         */
        int age;
        /*
            变量赋值的语法格式：变量名 = 变量值;
            等号(=):赋值运算符，将右边的值赋值给左边的变量
         */
        age = 19;

        /******************2.变量的定义******************/
        //变量在赋值的时候除了可以赋数据类型对应的字面值
        int value = 10;
        //还可以将另外一个变量（例如value）赋值给该变量（copyValue）
        int copyValue = value;
        double height = 180.0;
    }
}
