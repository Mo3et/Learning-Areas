import java.io.Console;
import java.io.IOException;//TODO:what is it?
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;

/*
 * Learning to Feb 16th 、Feb 17th
 */
public class Demo3 implements Scann {// implement 为接口关键字
    // Scanner 写了interface
    // public static void Scann() {
    // Scanner Sc = new Scanner(System.in);
    // String name = Sc.nextLine();
    // int age = Sc.nextInt();
    // Sc.close();
    // }

    /* 关于Console的代码 */
    public static void AboutConsole() {
        Console cons = System.console();// Console 采用了掩码来保障输入不可见
        // static char[] readPassword(String prompt,Object ..args)
        // static String readLine(String prompt,Object...args)
        // 显示字符串prompt并且读取用户输入，直到输入行结束。args参数可以用来提供输入格式。
        String username = cons.readLine("User Name:");
        char[] passwd = cons.readPassword("Password:");
        System.out.println(username + "\t");// + String.format( passwd)
        System.out.println(passwd);
    }

    public static void AboutFormat() {
        int xa = 10;
        System.out.printf("%S", xa);// 使用printf还是可以像C一样可以输出指定位数的值，比如：%8.2f
        // 可以使用s转换符格式化任意的对象
        System.out.printf("%tc\n", new Date());// tc表示时间
        String message = String.format("Hello,%s.Next year,you'll be %d", name, age);
        // 使用静态的String.format方法创建一个格式化的字符串
        System.out.println(message);
    }
    public static void AboutFileIO() throws IOException {
        // 如果用一个不存在的文件构造一个Scanner，或用一个不能被创建的文件名构造一个PrintWriter，就会发生异常
        //已知会出现“输入\输出”异常 就在main方法用throws IOException标记
        Scanner ScFile;
        try {
            ScFile = new Scanner(Paths.get("testFile.txt"), "UTF-8");
            // 要想对文件进行读取，就需要一个用File对象构造一个Scanner对象
            // 如果包含反斜杠符号，就要额外加一个反斜杠，
            // 如："C:\\Users\\Monet\\Desktop\\Learning Areas\\testFile.txt"
            System.out.println(ScFile.nextLine());
            ScFile.close();
            PrintWriter pWriter= new PrintWriter("testFile.txt", "UTF-8");
            //   如果要写入文件，就需要构造一个PrintWriter对象。在构造中只需提供文件名
            pWriter.println("If you see to this words.");
            pWriter.println("The PrintWriter is using");
            System.out.println("Over.");
            pWriter.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        // AboutFormat();
        AboutFileIO();
    }
}