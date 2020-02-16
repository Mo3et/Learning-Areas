package Java;

// import java.awt.*;
// public class demo2 {
//     public static void main(String[] args) {
//         String x = "hello";
//         System.out.println(x);
//     }
import java.time.LocalDateTime;
import java.time.LocalTime;

// }

/**
 * demo2
 */
public class demo2 {
    public static LocalTime T = LocalTime.now();
    public static LocalDateTime DT = LocalDateTime.now();

    public static void main(final String[] args) {
        System.out.println("Dt为" + DT.getDayOfMonth());
        System.out.println("Hello World!" + "\n" + T);
    }

}