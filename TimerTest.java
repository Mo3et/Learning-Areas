import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
//to resolve conflict with java.util.Timer

/**
 * 源自Java核心技术P223 程序清单6-3 
 * 给出一个定时器和监听器的操作行为
 * 在定时器启动以后，程序弹出一个消息对话框，并等待用户点击OK按钮来终止程序的执行。
 * 在程序等待用户操作的同时，每隔10秒显示异常当前的时间。
 */
public class TimerTest {
public static void main(String[] args) {
    ActionListener listener=new TimePrinter();
    
    //construct a timer that calls the listener
    //once every 10 seconds
    Timer t=new Timer(10000, listener);//构造一个定时器 每隔interval毫秒通告listener一次
    t.start();
    JOptionPane.showMessageDialog(null, "Quit program?");//显示一个包含消息和OK按钮的对话框。  调用Swing
    System.exit(0);
}
}
     class TimePrinter implements ActionListener
     {
         public void actionPerformed(ActionEvent event){
             System.out.println("At the tine,the time is "+new Date());
             Toolkit.getDefaultToolkit().beep();
             //Toolkit getDefaultToolkit(); 获得默认的工具箱。工具箱包含有关GUI环境的信息。
         }
     }