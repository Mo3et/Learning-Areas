import java.math.BigInteger;

/**
 * Learning to Feb 17th
 */
public class Demo0217 {

    public static void AboutBlock() {
        // 块(即复合语句)， 是由一对大括号括起来的若干条简单的Java语句。
        // 块确定了变量的作用域。一个块可以嵌套在另一个块里面。
        // 但是，不能在嵌套的两个块中声明同名变量。
    }

    public static void AboutCondition() {
        int i = 10;
        // if (condition) statement;
        if (i > 0)
            i += 10;
        // 要在判断条件为真时执行多条语句，应该使用块语句(block statement)
        // if (condition) statement1; else statement2;
        if (i >= 1)
            i -= 1;
        else
            i += 10;
        // else子句与最邻近的if构成一组。
        // 重复的交替出现if else if 是一种很常见的情况
    }

    public static void AboutWhile() {
        int i = 20;
        // 当条件为true时，while循环执行一条语句(也可以是语句块)。
        // while(condition) statement;
        while (i > 10)
            i--;
        // 如果开始循环条件的值就为false，则while循环体一次也不执行。

        // do statement while (condition);
        do
            i++;
        while (i > 100);
        // 这种循环语句先执行语句(通常是一个语句块)，再检测循环条件；再重复语句。
    }

    public static void AboutFor() {
        // for循环语句是支持迭代的一种 通用结构，
        // 利用每次迭代之后更新的计数器或类似的变量来控制迭代次数。
        for (int i = 10; i > 0; i--) // 应改为i>=0
            // for语句的第1部分通常用于对计数器初始化；
            // 第2部分给出每次新一轮循环执行前要检测的循环条件；
            // 第3部分指示如何更新计数器。
            System.out.println("Counting ..." + i);
        System.out.println("Blastoff!");
    }

    public static void AboutSwitch() { // 处理多个选项的时候可用switch语句
        // switch语句将从与选项相匹配的case标签处开始执行,
        // 直到遇到break语句，或者执行switch语句的结束处为止。
        // 如果没有相匹配的case标签，而有default子句，就执行这个子句。
        int sw = 10;
        switch (sw) {
        case 10:
            sw++;
            break;
        default:
            System.out.println(sw);
            break;
        }
    }

    public static void AboutTagBreak() {
        // Java提供了带标签的break(类似goto语句)，用于跳出多重嵌套的循环语句。
        // 注意标签必须放在希望跳出的最外层循环之前，并且必须紧跟一个冒号。
        // label:{
        // ...
        // if(condition) break label;//exits block
        // ....
        // }
        // //jumps here when the break statement executes
        // 另外要需要注意，只能跳出语句块，而不能跳入语句块。!!
        int b = 10;
        read_data: for (int i = 0; i < 100; i++) {
            if (i == 10) {
                break read_data;
            }
            b++;
        }
        System.out.println(b);
    }

    public static void AboutContinue() {
        // continue语句将控制转移到最内层循环的首部。
        // 如果用于for循环中，就可以跳到for循环的“更新”部分。如(i++)
        int a = 0;
        for (int b = 10; b < 20; b++) {
            if (b == 15) {
                continue;// 当b=15时跳过此次循环到b++(=16)
            }
            a++;
        }
        System.out.println(a);
    }

    public static void AboutBigNumber() {
        // 如果精度不能满足需求，
        // 那么可以使用java.math包中的两个类：BigInteger和BigDecimal。
        // BigInteger：实现了任意精度的浮点运算。
        // BigDecimal：实现了任意精度的浮点数运算。
        // 使用静态的valueOf方法也可以将普通的数值转换为大数值：
        BigInteger a = BigInteger.valueOf(100);
        // 处理大数值运算需要使用(大数值)类中的add和multiply方法。
        BigInteger b = BigInteger.valueOf(100);
        BigInteger c= a.add(b);//c=a+b
        BigInteger d=c.multiply(b.add(BigInteger.valueOf(2)));//d=c*(b+2)
        // subtract(减)、divide(除)、
        // BigInteger mod(BigInteger other);
        BigInteger e=d.mod(c);
        System.out.println(e);
        //返回这个大整数和另一个大整数的和、差、积、商以及余数
        // int compareTo(BigInteger other);
        //如果这个大整数与另一个大整数other相等，返回0，如果大整数小于other返回负数，否则返回正数。
        // BigDecimal divide(BigDecimal other RoundingMode mode)
        //返回这个大实数与另一个大实数other的和、差、积、商
        //要计算商，必须给出舍入方法(rounding mode)。RoundingMode。HALF_UP是四舍五入，使用于常规运算，更多的参考API文档
    }

    public static void main(String[] args) {
AboutBigNumber();
    }
}