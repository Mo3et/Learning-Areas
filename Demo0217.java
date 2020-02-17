/**
 *  Learning to Feb 17th
 */
public class Demo0217 {

    public static void Aboutblock() {
        // 块(即复合语句)， 是由一对大括号括起来的若干条简单的Java语句。
        // 块确定了变量的作用域。一个块可以嵌套在另一个块里面。
        // 但是，不能在嵌套的两个块中声明同名变量。
    }
    public static void AboutCondition() {
        
    }
    public static void Aboutif() {
        
    }
    public static void AboutFor() {
        for (int i = 10; i >0; i--) //应改为i>=0
        System.out.println("Counting ..."+i);
        System.out.println("Blastoff!");
    }

    public static void main(String[] args) {
        int b=10; 
        read_data:
         for (int i=0;i<100;i++) {
            if (i==10) {
                 break read_data;
             }
              b++;
         }
            System.out.println(b);
    }
    
}