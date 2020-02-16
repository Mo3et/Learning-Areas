
// import java.awt.*;
// public class demo2 {
//     public static void main(String[] args) {
//         String x = "hello";
//         System.out.println(x);
//     }
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// }

/**
 * demo2
 */
/* about LocalDateTime Test */
public class demo2 {
    public static LocalTime T = LocalTime.now();
    public static LocalDateTime DT = LocalDateTime.now();
    public static LocalDate LD=LocalDate.now();
    // public static LocalDateTime LDT=LocalTime.
    public static void main(final String[] args) {
        System.out.println("Dt为 year\n" + DT.getDayOfYear());
        System.out.println("Dt为 Week\n" + DT.getDayOfWeek());
        System.out.println("Dt为 DofMonth\n" + DT.getDayOfMonth());
        System.out.println("Dt为 Month\n" + DT.getMonth());
        System.out.println("Dt为 Year\n" + DT.getYear());
        System.out.println("日期为\t"+DT.getYear()+"/"+DT.getMonth()+"\t"+LD.getMonthValue()+"/"+DT.getDayOfYear()+"\n"+DT.getDayOfWeek());
        System.out.println(T);
        // System.out.println("Hello World!" + "\n" + T);
        //     final int a =100;
        //     final int b =100;
        //     final int c =100;
        //     final int d =100;
        //     System.out.println(a+b+c+d);
    }

}