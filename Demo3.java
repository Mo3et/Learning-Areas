import java.io.Console;
import java.util.*;
/**
 * Demo3
 */
/*
 * Learning to Feb 16th
 */
public class Demo3 {

    public static void main(final String[] args) {
        Console cons = System.console();//Console 采用了掩码来保障输入不可见
        String username = cons.readLine("User Name:");
       char[] passwd = cons.readPassword("Password:");
       System.out.println(username+"\t"+passwd);
       System.out.println(passwd);

    }
}