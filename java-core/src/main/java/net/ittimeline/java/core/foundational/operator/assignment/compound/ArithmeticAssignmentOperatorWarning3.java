package net.ittimeline.java.core.foundational.operator.assignment.compound;

/**
 * 扩展赋值运算符使用注意事项3
 * 复合赋值中，左边的变量只被读取一次；普通赋值中，左右操作数分别计算。
 * 通过等价表达式和详细步骤对比两者差异。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 15:18
 * @since Java 25
 */
public class ArithmeticAssignmentOperatorWarning3 {
    static void main() {
        int[] arr1 = {1, 2, 3};
        int i = 0;

        // ========== 复合赋值 +=：左操作数只计算一次 ==========
        // 原语句：arr1[i++] += 10;
        // 等价于：
        // int tempIndex = i++;          // 保存左操作数的索引，i自增
        // arr1[tempIndex] = (int)(arr1[tempIndex] + 10);
        //
        // 详细步骤：
        // 1. 计算左操作数 arr1[i++]：先求 i++ 的值（当前 i=0 作为数组下标），然后 i 自增为 1。
        //    此时确定要修改的元素是 arr1[0]。
        // 2. 读取 arr1[0] 的当前值 1。
        // 3. 计算 1 + 10 = 11。
        // 4. 将结果 11 赋值给 arr1[0]（自动强制类型转换，但此处类型一致）。
        // 最终：arr1[0] = 11, arr1[1] 不变 = 2, i = 1
        arr1[i++] += 10;
        System.out.println("arr1[0]=" + arr1[0] + ", arr1[1]=" + arr1[1] + ", i=" + i);
        // 输出：arr1[0]=11, arr1[1]=2, i=1

        // 重置数组和索引
        int[] arr2 = {1, 2, 3};
        int j = 0;

        // ========== 普通赋值 =：左右操作数分别计算 ==========
        // 原语句：arr2[j++] = arr2[j++] + 10;
        // 等价于：
        // int leftIndex = j++;           // 计算左操作数的索引，j变为1
        // int rightIndex = j++;          // 计算右操作数的索引，j变为2
        // arr2[leftIndex] = arr2[rightIndex] + 10;  // arr2[0] = arr2[1] + 10
        //
        // 详细步骤：
        // 1. 计算左操作数 arr2[j++]：取当前 j=0 作为下标，然后 j 自增为 1。此时确定赋值目标为 arr2[0]。
        // 2. 计算右操作数 arr2[j++] + 10：此时 j=1，先计算 arr2[j++]：取当前 j=1 作为下标（arr2[1] 值为 2），然后 j 自增为 2。
        //    然后计算 2 + 10 = 12。
        // 3. 将右操作数的结果 12 赋值给左操作数确定的变量 arr2[0]。
        // 最终：arr2[0] = 12, arr2[1] 仍为 2, j = 2
        arr2[j++] = arr2[j++] + 10;
        System.out.println("arr2[0]=" + arr2[0] + ", arr2[1]=" + arr2[1] + ", j=" + j);
        // 输出：arr2[0]=12, arr2[1]=2, j=2
    }
}
