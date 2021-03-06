import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


/**
 * This program demonstrates the use of lambda expressions.
 */

 /**
  *显示了如何在一个比较器(sort)和一个动作监听器(Timer)中使用Lambda表达式
  */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
                "Neptune" };
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());// lambda
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event -> System.out.println("The time is" + new Date()));
        t.start();

        // keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
/*
 * 在MapReduce中 
 * System.exit(job.waitForCompletion(true)?0:1); 
 * 可以判短程序是否正常退出
 */