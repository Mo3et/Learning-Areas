import java.util.Scanner;

/**
 * This program demonstrates enumerated types.
 */
//TODO  关于枚举的知识还是不太理解 得加点课外复习了解
public class EnumTest {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input=in.next().toUpperCase();
        in.close();
        Size size=Enum.valueOf(Size.class, input);
        System.out.println("size="+size);
        System.out.println("abbreviation="+size.getAbbreviation());
        if(size== Size.EXTRA_LARGE)
        System.out.println("Good job--you paid attention to the _.");
    }
}

enum Size{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private Size(String abbreviation){  this.abbreviation=abbreviation;}
    public String getAbbreviation(){return abbreviation;}

    private String abbreviation;
}

