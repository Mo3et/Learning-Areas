import java.io.Console;
import java.util.*;
/*
 * Learning to Feb 16th 、Feb 17th
 */
public class Demo3 implements Scann {// implement 为接口关键字
    //Scanner 写了interface
    // public static void Scann() {
    //      Scanner Sc = new Scanner(System.in);
    //     String name = Sc.nextLine();
    //     int age = Sc.nextInt();
    //    Sc.close();
    // }

    /* 关于Console的代码 */
    public static void AboutConsole() {
         Console cons = System.console();// Console 采用了掩码来保障输入不可见
        // static char[] readPassword(String prompt,Object ..args)
        // static String readLine(String prompt,Object...args)
        // 显示字符串prompt并且读取用户输入，直到输入行结束。args参数可以用来提供输入格式。
        String username = cons.readLine("User Name:");
        char[] passwd = cons.readPassword("Password:");
        System.out.println(username + "\t");//+ String.format( passwd)
        System.out.println(passwd);
    }

    public static void AboutFormat()
     {
        int xa = 10;
        System.out.printf("%S", xa);// 使用printf还是可以像C一样可以输出指定位数的值，比如：%8.2f
        // 可以使用s转换符格式化任意的对象
        System.out.printf("%tc\n",new Date());//tc表示时间
         String message = String.format("Hello,%s.Next year,you'll be %d", name,age);
        //  使用静态的String.format方法创建一个格式化的字符串
        System.out.println(message);
    }

    public static void main(String[] args) {
            AboutFormat();
    }
}