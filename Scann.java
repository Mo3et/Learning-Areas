import java.util.Scanner;
// import java.util.*;

public interface Scann {
   
    Scanner Sc = new Scanner(System.in);
    // System.out.println("Name：");
    String name = Sc.nextLine();
    // System.out.println("age：");
    int age = Sc.nextInt();
    // Sc.close();
}
