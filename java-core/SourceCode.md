# Java语言核心技术

## 第01章 Java概述与集成开发环境搭建

包名 net.ittimeline.java.core.foundational.object

| 编号 | 源文件               | 功能说明                  |
| ---- | -------------------- | ------------------------- |
| 1    | HelloWorld           | 我的第一个Java程序        |
| 2    | Java25HelloWorld     | Java 25 版Java入门程序    |
| 3    | PrintData            | print和println的区别      |
| 4    | World                | public class和class的区别 |
| 5    | PrintRhombus         | 打印菱形                  |
| 6    | PrintlnPersonInfo    | 打印个人信息              |
| 7    | PrintProductListInfo | 打印商品列表信息          |

## 第02章 Java变量和数据类型

| 编号 | 源文件                          | 功能说明                                                     |
| ---- | ------------------------------- | ------------------------------------------------------------ |
| 1    | Comments                        | Java三种注释的使用                                           |
| 2    | Identifier                      | Java标识符                                                   |
| 3    | Keywords                        | Java关键字                                                   |
| 4    | Literals                        | Java字面量                                                   |
| 5    | VariableDefinition              | 变量的声明、赋值和定义                                       |
| 6    | VariableType                    | 变量的三种分类                                               |
| 7    | VariableUsage                   | 变量使用的三种方式                                           |
| 8    | VariableWarning1                | 变量使用注意事项1：变量在使用前必须要定义，也就是必须要声明和赋值 |
| 9    | VariableWarning2                | 变量使用注意事项2：同一个作用域范围内的变量不能重复定义，例如main方法中不能定义同名的变量 |
| 10   | VariableWarning3                | 变量使用注意事项3：变量只能在定义的作用域范围内使用          |
| 11   | VariableWarning4                | 变量的使用注意事项4：变量在赋值时，必须满足或者兼容变量的数据类型，并且在数据类型的取值范围内变化 |
| 12   | VariableWarning5                | 变量使用注意事项5：一条语句可以定义多个数据类型相同的变量，但是不推荐使用 |
| 13   | VariablePrinciple               | 变量内存原理                                                 |
| 14   | IntTypeUsage                    | 四种整数类型使用                                             |
| 15   | IntTypeNumberSystem             | Java中整数的四种进制表示方式                                 |
| 16   | NumberSystem                    | 计算机中二进制的三种表示方式                                 |
| 17   | IntTypeStorage                  | 不同类型整数在内存中的存储                                   |
| 18   | IntTypeOverFlow                 | 整数溢出内存原理                                             |
| 19   | FloatTypeUsage                  | 浮点类型使用                                                 |
| 20   | FloatTypePrecision              | 单精度浮点类型float精度问题                                  |
| 21   | DoubleTypePrecision             | 双精度浮点类型double精度问题                                 |
| 22   | FloatTypeStorage                | 单精度浮点类型在内存中的存储                                 |
| 23   | CharTypeASCIIUsage              | ASCII字符集使用                                              |
| 24   | CharTypeUnicodeUsage            | Unicode字符集使用                                            |
| 25   | CharTypeEscapeUsage             | 转义字符使用                                                 |
| 26   | CharTypeTab                     | 转义字符-制表符                                              |
| 27   | CharTypeStorage                 | 字符在内存中的存储                                           |
| 28   | PlatformCharacterEncodingConfig | 获取平台编码                                                 |
| 29   | BooleanTypeUsage                | boolean类型使用                                              |
| 30   | StringTypeUsage                 | String类型基本使用                                           |
| 31   | StringTypeConcat                | 字符串拼接运算                                               |
| 32   | ScannerFavoriteNumber           | Scanner案例-读取从键盘输入喜欢的数字                         |
| 33   | ScannerGetSum                   | Scanner案例-求和                                             |
| 35   | ScannerRegisterInfo             | Scanner案例-用户注册                                         |
| 34   | ScannerInputMismatchException   | Scanner注意事项：数据类型不匹配问题                          |
| 36   | ScannerNext                     | next()和nextLine()的区别                                     |
| 37   | ScannerNextLine                 | next()和nextLine()的区别                                     |
| 38   | ScannerNextIntNextLine          | nextInt()和nextLine()混合使用问题                            |
| 39   | ImplicitTypeConversion          | 自动类型转换使用                                             |
| 40   | ImplicitTypeConversionWarning1  | 自动类型转换注意事项1 byte,short和char之间不会进行自动类型转换，  当byte,short,char类型的变量之间进行运算时，都会先提升为 int 类型再进行处理，运算结果也是int类型 |
| 41   | ImplicitTypeConversionWarning2  | 自动类型转换注意事项2 有多种类型的数据混合运算时，系统首先自动将所有数据转换为取值范围最大的数据类型再进行计算，运算结果的数据类型也是所有数据中取值范围最大的数据类型 |
| 43   | ImplicitTypeConversionPrinciple | 自动类型转换内存原理                                         |
| 44   | ExplicitTypeConversion          | 强制类型转换使用                                             |
| 45   | ExplicitTypeConversionWarning   | 强制类型转换使用注意事项 强制类型转换可能会发生精度损失或者溢出 |
| 46   | ExplicitTypeConversionPrinciple | 强制类型转换内存原理                                         |
| 47   | MovieInfo                       | 变量和数据类型案例1：使用变量存储电影信息                    |
| 48   | ProductInfo                     | 变量和数据类型案例2：使用变量存储商品信息                    |
| 49   | StudentInfo                     | 变量和数据类型案例3：使用变量存储学生信息                    |

## 第03章 Java运算符

| 编号 | 源文件                               | 功能说明                                                     |
| ---- | ------------------------------------ | ------------------------------------------------------------ |
| 1    | PrintData                            | System.out.printf格式化输出数据                              |
| 2    | ArithmeticOperator                   | 算术运算符使用                                               |
| 3    | CharTypeArithmetic                   | 字符类型与算术运算                                           |
| 4    | ArithmeticOperatorWarning1           | **算术运算符使用注意事项1** 在使用加法（+）时可能会遇到以下三种情况 |
| 5    | ArithmeticOperatorWarning2           | **算术运算符使用注意事项2** 两个整数相加、相乘，结果超过了该类型的表示范围，就会发生溢出，导致结果不正确。在处理大数值时，可以考虑使用long类型 |
| 6    | ArithmeticOperatorWarning3           | **算术运算符使用注意事项3**  当两个整数进行除法运算的时候运算结果只会保留整数部分，丢弃小数部分，如果想要保留除法运算结果的小数部分，有如下两种方式①可以使用强制类型转换将其中一个操作数转成double②将其中一个操作数乘以1.0后再进行运算 |
| 7    | ArithmeticOperatorWarning4           | **算术运算符使用注意事项4** 只要有小数参与算术运算，那么运算的结果可能是不精确的 |
| 8    | ArithmeticOperatorWarning5           | **算术运算符使用注意事项5** 除法运算时除数不能是0，否则会发生ArithmeticException算术异常 |
| 9    | ArithmeticOperatorWarning6           | **算术运算符使用注意事项6** 除法运算：被除数/除数，如果是小数，那么除数为0，结果是无穷（Infinity） |
| 10   | ArithmeticOperatorWarning7           | **算术运算符使用注意事项7** 取余运算结果的符号（正号、负号）与被除数相同 |
| 11   | NumericalSplit                       | 算术运算符案例1-数值拆分                                     |
| 12   | NumericalReversal                    | 算术运算符案例2-整数反转                                     |
| 13   | Fahrenheit2CentigradeDegree          | 算术运算符案例3：温度转换                                    |
| 14   | DaysConversionWeek                   | 算术运算符案例4：天数换算                                    |
| 15   | HoursConversionDays                  | 算术运算符案例5-小时换算                                     |
| 16   | SecondConversionTime                 | 算术运算符案例6-秒数换算                                     |
| 17   | CalculateArea                        | 算术运算符案例7-计算圆的面积                                 |
| 18   | AutoIncrementOperator                | 自增运算符使用                                               |
| 19   | AutoDecrementOperator                | 自减运算符使用                                               |
| 20   | AutoIncrementOperatorWarning         | 自增运算符使用注意事项 自增运算符和操作数（通常是变量）组成自增表达式参与运算时 前置++是先自增1，后参与运算 后置++是先参与运算，后自增1 |
| 21   | DecrementOperatorWarning             | **自减运算符使用注意事项** 自减运算符和操作数（通常是变量）组成自减表达式参与运算时，● 前置--是先自减1，后参与运算 ● 后置--是先参与运算，后自减1 |
| 22   | AutoIncrementDiffArithmetic          | 自增1和加1有什么区别 自增运算符的自增1不会改变变量原有的数据类型，推荐使用，算术运算符的加1可能会改变变量原有数据类型 |
| 23   | AutoIncrementOperatorCase1           | 自增运算符案例1-根据指定表达式计算i和j的值                   |
| 24   | AutoIncrementOperatorCase2           | 自增运算符案例2-根据指定表达式计算i和j的值                   |
| 25   | AutoIncrementDecrementOperatorCase   | 自增自减运算符案例-根据指定表达式计算i和j的值                |
| 26   | RelationOperator                     | 关系运算符使用                                               |
| 27   | RelationOperatorWarning1             | **关系运算符使用注意事项1** Java语言中的 == 表示是否相等，=表示赋值，千万不要把==误写成= |
| 28   | RelationOperatorWarning2             | **关系运算符使用注意事项2** ● 大于（>）、大于或者等于（>=）、小于（<）、小于或者等于（<=）用于比较两个数值的大小，这些运算符只能用于基本数据类型，不能用于引用数据类型  ●对于浮点数比较（float和double），由于精度问题，可能会出现预期之外的结果。例如，0.1 + 0.2 != 0.3。因此，在比较浮点数时，通常需要考虑一个误差范围。 |
| 29   | RelationOperatorWarning3             | **关系运算符使用注意事项3**  等于（==）和不等于（!=）用于比较两个值是否相等或者不相等 ● 对于基本数据类型（int、long、double），==和!=比较的是它们的值 ● 对应引用数据类型（例如String，ArrayList），==和!=比较的是引用是否指向同一个对象，而不是对象的内容是否相同。要比较对象的内容是否相同，应该使用public boolean equals(Object obj)方法 |
| 30   | TernaryOperator                      | 三元运算符使用                                               |
| 31   | GetMaxValue                          | 三元运算符案例1-求最大值                                     |
| 32   | GetMinValue                          | 三元运算符案例2-求最小值                                     |
| 33   | JudgeScore                           | 三元运算符案例3-判断成绩                                     |
| 34   | JudgeEvenOdd                         | 三元运算符案例4-判断奇偶数                                   |
| 35   | LogicalOperator                      | 逻辑运算符使用                                               |
| 36   | LogicalAndDiffShortCircuitAnd        | 逻辑与和短路与的区别                                         |
| 37   | LogicalOrDiffShortCircuitOr          | 逻辑或与短路或的区别                                         |
| 38   | VIPFreeShipping                      | 逻辑运算符案例1-VIP客户免运费                                |
| 39   | EmployeeSalaryAdjustment             | 逻辑运算符案例2-员工薪资调整                                 |
| 40   | BitwiseAndOperatorPositiveNumber1    | **按位与运算符操作正整数之5 & 2**                            |
| 41   | BitwiseAndOperatorPositiveNumber2    | **按位与运算符操作正整数之5 & 3**                            |
| 42   | BitwiseAndOperatorNegativeNumber1    | **按位与运算符操作负整数之 -5 & -3**                         |
| 43   | BitwiseAndOperatorNegativeNumber2    | **按位与运算符操作负整数之 -5 & -10**                        |
| 44   | BitwiseAndOperatorNegativeNumber3    | **按位与运算符操作负整数之5 & -10**                          |
| 45   | JudgeOddEvenNumber                   | 按位与应用案例：按位与判断某个数字是否为奇数或者偶数         |
| 46   | BitwiseOrOperatorPositiveNumber1     | **按位或运算符操作正整数之 5 \| 2**                          |
| 47   | BitwiseOrOperatorPositiveNumber2     | **按位或运算符操作正整数之 5 \| 3**                          |
| 48   | BitwiseOrOperatorNegativeNumber1     | **按位或运算符操作负整数之 -5 \|-3**                         |
| 49   | BitwiseOrOperatorNegativeNumber2     | **按位或运算符操作负整数之 -5 \|-10**                        |
| 50   | BitwiseOrOperatorNegativeNumber3     | **按位或运算符操作负整数之 5 \|-10**                         |
| 51   | FlagBit                              | 按位或应用案例：标志位设置                                   |
| 52   | BitwiseXorOperatorNegativeNumber1    | 按位异或运算符操作正整数之 5 ^ 2                             |
| 53   | BitwiseXorOperatorNegativeNumber2    | 按位异或运算符操作正整数之 5 ^ 3                             |
| 54   | BitwiseXorOperatorNegativeNumber1    | **按位异或运算符操作负整数之 -5 ^ -3**                       |
| 55   | BitwiseXorOperatorNegativeNumber2    | **按位异或运算符操作负整数之 -5 ^ -10**                      |
| 56   | BitwiseXorOperatorNegativeNumber3    | **按位异或运算符操作负整数之 5 ^ -10**                       |
| 57   | BitwiseNotOperatorPositiveNumber1    | **按位取反运算符操作正整数之~5**                             |
| 58   | BitwiseNotOperatorPositiveNumber2    | **按位取反运算符操作正整数之~10**                            |
| 59   | BitClear                             | 按位取反运算符案例：位清除                                   |
| 60   | LeftShiftPositiveNumber1             | 左移运算符操作正整数之8 << 1                                 |
| 61   | LeftShiftPositiveNumber2             | **左移运算符操作正整数之8 << 2**                             |
| 62   | LeftShiftPositiveNumber3             | **左移运算符操作正整数之8 << 28**                            |
| 63   | LeftShiftNegativeNumber1             | 左移运算符操作负整数之-8 << 1                                |
| 64   | LeftShiftNegativeNumber2             | 左移运算符操作负整数之-8 << 2                                |
| 65   | LeftShiftNegativeNumber3             | 左移运算符操作负整数之-8 << 28                               |
| 66   | RightShiftPositiveNumber1            | **右移运算符操作正整数之8 >> 1**                             |
| 67   | RightShiftPositiveNumber2            | **右移运算符操作正整数之8 >> 2**                             |
| 68   | RightShiftPositiveNumber3            | **右移运算符操作正整数之8 >> 4**                             |
| 69   | RightShiftNegativeNumber1            | **右移运算符操作负整数之-8 >> 1**                            |
| 70   | RightShiftNegativeNumber2            | **右移运算符操作负整数之-8 >> 2**                            |
| 71   | RightShiftNegativeNumber4            | **右移运算符操作负整数之-8 >> 4**                            |
| 72   | UnsignedRightShiftPositiveNumber1    | **无符号右移运算符操作正整数之8 >>> 1**                      |
| 73   | UnsignedRightShiftPositiveNumber2    | **无符号右移运算符操作正整数之8 >>> 2**                      |
| 74   | UnsignedRightShiftPositiveNumber3    | **无符号右移运算符操作正整数之8 >>> 4**                      |
| 75   | UnsignedRightShiftNegativeNumber1    | **无符号右移运算符操作负整数之-8 >>> 1**                     |
| 76   | UnsignedRightShiftNegativeNumber2    | **无符号右移运算符操作负整数之-8 >>> 2**                     |
| 77   | AssignmentOperator                   | 赋值运算符使用                                               |
| 78   | AssignmentOperatorWarning1           | **赋值运算符使用注意事项1**赋值运算符是右结合的，即先计算右边的表达式，再赋给左边 |
| 79   | AssignmentOperatorWarning2           | **赋值运算符使用注意事项2**赋值运算符的左边只能是变量，右边可以是字面量、变量或者表达式 |
| 80   | VariableValuePlus1                   | 赋值运算符案例1-实现变量值加1                                |
| 81   | VariableValuePlus2                   | 赋值运算符案例2-实现变量值加2                                |
| 82   | ArithmeticAssignmentOperator         | 算术复合赋值运算符使用                                       |
| 83   | BitwiseAssignmentOperator            | 位运算复合赋值运算符使用                                     |
| 84   | ArithmeticAssignmentOperatorWarning1 | **扩展赋值运算符使用注意事项1**扩展赋值运算符会自动进行强制类型转换，将结果转换为左侧变量的类型。 |
| 85   | ArithmeticAssignmentOperatorWarning2 | **扩展赋值运算符使用注意事项2**扩展赋值运算符的优先级非常低，仅高于逗号运算符，因此右边的表达式总是先被完整计算。 |
| 86   | DataExchangeWithTemp                 | 使用临时变量实现数据交换                                     |
| 87   | DataExchangeWithArithmeticOperator   | 使用算术运算实现数据交换                                     |
| 88   | DataExchangeWithXorOperator          | 使用按位异或运算实现数据交换                                 |

## 第04章 Java程序流程控制

| 编号 | 源文件                          | 功能说明                                                     |
| ---- | ------------------------------- | ------------------------------------------------------------ |
| 1    | IfStatement                     | 单分支结构if语句使用                                         |
| 2    | IfStatementWarning1             | **单分支结构if语句使用注意事项1**如果if语句的语句块{}只有一条语句，那么if语句的语句块{}可以省略，但是不建议省略，因为会降低代码的可读性。<br/>而且如果if语句的语句块{}省略不写，那么if语句只能控制距离它最近的一条语句。 |
| 3    | IfStatementWarning2             | **单分支结构if语句使用注意事项2**如果对布尔类型的变量进行判断，可以直接将这个变量写在括号()中，默认会判断布尔变量是否为true，但是需要注意区分==和=，==表示判断是否相等，=表示赋值。 |
| 4    | GetMaxValue                     | 单分支结构if语句案例1-求最大值                               |
| 5    | GetMinValue                     | 单分支结构if语句案例2-求最小值                               |
| 6    | JudgeHeartBeats                 | 单分支结构if语句案例3-体检                                   |
| 7    | JudgeLeapYear                   | 单分支结构if语句案例4-闰年                                   |
| 8    | IfElseStatement                 | 双分支结构if else语句使用                                    |
| 9    | EatSomething                    | 双分支结构if else语句案例1-吃米其林餐厅还是沙县小吃          |
| 10   | Payment                         | 双分支结构if else语句案例2-商品付款                          |
| 11   | IfElseIfElseStatement           | 多分支结构if else if else 语句使用                           |
| 12   | MathGeneratorRandomTest         | 使用Math类生成随机数                                         |
| 13   | RandomTest                      | Random类生成随机数使用                                       |
| 14   | RollTheDice                     | 多分支结构 if else if else语句案例1-掷骰子                   |
| 15   | HighSpeedRailBillingSystem      | 多分支结构 if else if else语句案例2-高铁计费系统             |
| 16   | TaxiBillingSystem               | 多分支结构 if else if else语句案例3-出租车计费系统           |
| 17   | LetterCaseConverter             | 多分支结构if else if else 语句案例4-大小写字母转换           |
| 18   | EmployeeSalaryAdjustment        | 多分支结构 if else if else语句案例5-员工薪资调整             |
| 19   | Lottery                         | 多分支结构if else if else语句案例6-彩票                      |
| 20   | PersonalIncomeTaxCalculator     | 多分支结构 if else if else语句案例7-个税计算器               |
| 21   | CinemaSeatSelection             | if else语句嵌套if else语句案例-电影院选座                    |
| 22   | NumericSortingDesc              | if else语句嵌套if else if else语句案例：数字降序排序         |
| 23   | SwitchStatement                 | 分支结构switch语句使用                                       |
| 24   | SwitchIfElseIfElseStatement     | 分支结构switch语句和if else if else语句对比                  |
| 25   | GetSeasonByMonth                | 分支结构switch语句案例1-根据月份获取季节                     |
| 26   | GetDaysByDateV1                 | 分支结构switch语句案例2-根据日期计算天数                     |
| 27   | GetDaysByDateV2                 | 分支结构switch语句案例2-根据日期计算天数                     |
| 28   | GetZodiacByYear                 | 分支结构switch语句案例3-根据年份查找生肖                     |
| 29   | ForLoop                         | for循环使用                                                  |
| 30   | ForLoopWarning1                 | **for循环使用注意事项1**for循环中循环条件判断左边的初始化语句和循环条件判断的右边的循环迭代语句可以写到其他地方，但是两边的分号不能省略 |
| 31   | ForLoopWarning2                 | **for循环使用注意事项2**循环的初始化语句可以有多条初始化语句，但是要求数据类型一样，并且中间使用逗号隔开，循环迭代语句也可以有多条语句，多条语句中间使用逗号(,)隔开。 |
| 32   | PrintLowercaseLetters           | for循环案例1-打印输出26个小写字母                            |
| 33   | PrintNumbers                    | for循环案例2-打印输出1到100和100到1                          |
| 34   | PrintEvenNumbers                | for循环案例3-打印偶数并统计                                  |
| 35   | PrintOddNumbers                 | for循环案例4：打印奇数并统计                                 |
| 36   | PrintMultiplesOfNine            | for循环案例5-打印满足条件整数并统计                          |
| 37   | PrintSpecifiedExpression        | for循环案例6-打印指定的表达式                                |
| 38   | PrintFooBizBaz                  | for循环案例7-打印满足条件的字符串                            |
| 39   | CountMultiplesOfThreeAndFive    | for循环案例8-统计满足条件的数字                              |
| 40   | CalculateAlternatingHarmonicSum | for循环案例9-计算指定表达式的值                              |
| 41   | PrintNarcissisticNumbers        | for循环案例10-求三位数水仙花数                               |
| 42   | GetGreatestCommonDivisor        | for循环案例11：求最大公约数                                  |
| 43   | GetLeastCommonMultiple          | for循环案例12- 求最小公倍数                                  |
| 44   | PrintFiveDigitPalindromes       | for循环案例13：求五位数的回文数                              |
| 45   | PrintDaysOfYear                 | for循环案例14-打印年份每月天数                               |
| 46   | WhileLoop                       | while循环使用                                                |
| 47   | WhileLoopWarning1               | **while循环使用注意事项1**for循环和while循环的区别：初始化循环条件的作用范围不同<br/>● while循环中的初始化循环条件在while循环结束后依然有效<br/>● for循环的初始化循环条件只在for循环内有效 |
| 48   | WhileLoopWarning2               | while循环使用时特别容易忘记写 ④循环迭代语句，这样会造成死循环 |
| 49   | PaperFolding                    | while循环案例1-折纸                                          |
| 50   | GuessNumber                     | while循环案例2-猜数字                                        |
| 51   | DecimalToBinary                 | while循环案例3-十进制转二进制                                |
| 52   | Factorial                       | while循环案例4-n的阶乘                                       |
| 53   | DoWhileLoop                     | do while循环使用                                             |
| 54   | ATM                             | do while循环案例1-ATM                                        |
| 55   | ReverseInteger                  | do while循环案例2-整数反转                                   |
| 56   | PalindromeNumber                | do while循环案例3-回文数                                     |
| 57   | ForLoopWhileLoopDoWhileLoop     | 三种循环结构对比                                             |
| 58   | BreakStatement                  | break语句使用                                                |
| 59   | SumFirstOverFifty               | break语句案例1-求和                                          |
| 60   | RandomUntil88                   | break语句案例2-生成指定随机数并统计次数                      |
| 61   | IntegerSquareRoot               | break语句案例3-求平方根                                      |
| 62   | CheckPrimeNumberV1              | break语句案例4-判断质数                                      |
| 63   | CheckPrimeNumberV2              | break语句案例4-判断质数                                      |
| 64   | LoginSystem                     | break语句案例5-淘宝登录                                      |
| 65   | ContinueStatement               | continue语句使用                                             |
| 66   | ElevatorSimulation              | continue语句案例1-模拟电梯升降                               |
| 67   | PrintNonMultiplesOfThree        | continue语句案例2-输出满足条件的数据                         |
| 68   | PassSevenGame                   | continue语句案例3-逢7过                                      |
| 69   | ForInfiniteLoop                 | for循环死循环使用                                            |
| 70   | WhileInfiniteLoop               | while循环死循环使用                                          |
| 71   | CountPositiveNegative           | 死循环案例1-统计整数                                         |
| 72   | WeChat                          | 死循环案例2-模拟用户聊天                                     |
| 73   | NestedLoopFlow                  | 嵌套循环执行流程                                             |
| 74   | PrintRectangle                  | 嵌套循环案例1-打印矩形                                       |
| 75   | PrintAllTimes                   | 嵌套循环案例2-打印时间                                       |
| 76   | PrintRightTriangle              | 嵌套循环案例3-打印直角三角形                                 |
| 77   | PrintCheckerboardV1             | 嵌套循环案例4-打印复杂图形                                   |
| 78   | PrintCheckerboardV2             | 嵌套循环案例4-打印复杂图形                                   |
| 79   | PrintMultiplicationTable        | 嵌套循环案例5-九九乘法表                                     |
| 80   | SumOfTriangularNumbersV1        | 嵌套循环案例6-计算指定表达式                                 |
| 81   | SumOfTriangularNumbersV2        | 嵌套循环案例6-计算指定表达式                                 |
| 82   | HundredChickens                 | 嵌套循环案例7-百鸡百钱                                       |
| 83   | GradeStatistics                 | 嵌套循环案例8-统计学校班级成绩                               |
| 84   | PrimeCountWithTime              | 嵌套循环案例9-统计质数                                       |
| 85   | PerfectNumberFinder             | 嵌套循环案例10-完数                                          |
| 86   | PrintSolidDiamond               | 嵌套循环案例11-打印实心菱形                                  |
| 87   | PrintHollowDiamond              | 嵌套循环案例12-打印空心菱形                                  |
| 88   | PrintHourglass                  | 嵌套循环案例13-打印沙漏形状                                  |
| 89   | PrintPalindromeNumberPyramid    | 嵌套循环案例14-打印回文数字金字塔                            |
| 90   | LabelNestedForLoopBreak         | break跳出外层循环                                            |
| 91   | LabelNestedForLoopContinue      | continue跳到外层下一轮                                       |

## 第05章 Java数组

| 编号 | 源文件                     | 功能说明                                                     |
| ---- | -------------------------- | ------------------------------------------------------------ |
| 1    | ArrayDeclaration           | 一维数组声明                                                 |
| 2    | ArrayStaticInit            | 一维数组静态初始化                                           |
| 3    | ArrayDynamicInit           | ArrayDynamicInit                                             |
| 4    | ArrayElementGetSet         | ArrayElementGetSet                                           |
| 5    | ArrayTraversal             | 一维数组遍历                                                 |
| 6    | ArrayElementDefaultValue   | 一维数组动态初始化元素默认值                                 |
| 7    | ArrayWarning1              | **一维数组使用注意事项1** 数组是多个相同类型的数据集合，实现对这些数据的统一管理，数组中的元素可以是任意数据类型，包括基本数据类型和引用数据类型，但是不能混用，即类型必须一致。 |
| 8    | ArrayWarning2              | **一维数组使用注意事项2 **如果数组没有初始化，访问数组中的元素就会引发空指针异常（NullPointerException)，简称NPE |
| 9    | ArrayWarning3              | **一维数组使用注意事项3** 数组索引越界，当通过数组名[索引]访问指定元素，如果索引超过它的范围(0-数组长度减1)就会引发索引越界异常 ArrayIndexOutOfBoundsException |
| 10   | ArrayWarning4              | **一维数组使用注意事项4** 数组赋值成功的前提条件是类型必须一致 |
| 11   | CountDivisibleByThree      | 一维数组案例1-统计个数                                       |
| 12   | ModifyArrayByParity        | 一维数组案例2-变化数据                                       |
| 13   | WeekdayLookup              | 一维数组案例3-星期几                                         |
| 14   | AlphabetCasePrinter        | 一维数组案例4-26个字母                                       |
| 15   | WordLetterFrequency        | 一维数组案例5-统计字符次数                                   |
| 16   | OneArrayMemory             | 一维数组内存分析案例1-一个一维数组内存分析                   |
| 17   | TwoArrayMemory             | 一维数组内存分析案例2-两个一维数组的内存分析                 |
| 18   | SharedArrayMemory          | 一维数组内存分析案例3-两个引用指向同一个一维数组             |
| 19   | ReassignedArrayMemory      | 一维数组内存分析案例4-一个引用先后指向两个数组内存分析       |
| 20   | ArrayDeclaration           | 二维数组声明                                                 |
| 21   | ArrayStaticInit            | 二维数组静态初始化                                           |
| 22   | ArrayDynamicInit           | 二维数组动态初始化                                           |
| 23   | ArrayElementGetSet         | 二维数组元素访问                                             |
| 24   | ArrayTraversal             | 二维数组遍历                                                 |
| 25   | ArrayElementDefaultValueV1 | 二维数组动态初始化元素默认值 二维数组动态初始化语法格式1     |
| 26   | ArrayElementDefaultValueV2 | 二维数组动态初始化元素默认值 二维数组动态初始化语法格式2 **内层数组尚未初始化** |
| 27   | StatisticsFullYearSales    | 二维数组案例1-求全年的总销售额                               |
| 28   | Triangle                   | 二维数组案例2-数字图形                                       |
| 29   | YangHuiTriangle            | 二维数组案例3-杨辉三角                                       |
| 30   | RandomArrayStatistics      | 数组常见算法-数值型数组特征值统计-随机两位数                 |
| 31   | RandomUniqueArrayV1        | 数组常见算法-数组元素赋值-生成不重复元素 实现方式1           |
| 32   | RandomUniqueArrayV2        | 数组常见算法-数组元素赋值-生成不重复元素 实现方式2           |
| 33   | PokerGenerator             | 数组常见算法-数组元素赋值-生成扑克牌                         |
| 34   | ArrayAssignmentVsCopy      | 数组常见算法-数组复制-数组赋值与复制对比                     |
| 35   | ArrayReverseV1             | 数组常见算法-数组反转-反转整数数组 实现方式1                 |
| 36   | ArrayReverseV2             | 数组常见算法-数组反转-反转整数数组 实现方式2                 |
| 37   | SymmetricArrayV1           | 数组常见算法-判断对称数组 实现方式1                          |
| 38   | SymmetricArrayV2           | 数组常见算法-判断对称数组 实现方式2                          |
| 39   | ShuffleArray               | 数组常见算法-数组打乱元素顺序-打乱整数数组                   |
| 40   | ShufflePoker               | 数组常见算法-数组打乱元素顺序-扑克牌洗牌                     |
| 41   | ArrayExpand                | 数组常见算法-数组扩容-扩容整数数组                           |
| 42   | DynamicArrayExpansion      | 数组常见算法-数组扩容-扩容整数数组                           |
| 43   | InsertElement              | 数组常见算法-数组插入元素                                    |
| 44   | DeleteElement              | 数组常见算法-数组删除元素                                    |
| 45   | LinearSearch               | 数组常见算法-数组元素查找-线性查找                           |
| 46   | BinarySearch               | 数组常见算法-数组元素查找-二分法查找                         |
| 47   | BubbleSortBasic            | 数组常见算法-数组排序-冒泡排序-基础版                        |
| 48   | BubbleSortOptimized        | 数组常见算法-数组排序-冒泡排序-优化版                        |
| 49   | SelectionSort              | 数组常见算法-数组排序-选择排序                               |







