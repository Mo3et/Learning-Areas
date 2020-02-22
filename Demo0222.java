import java.text.NumberFormat;

/**
 * Demo0222
 */
public class Demo0222 {

    public static void AboutFactoryMethod() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double  x =0.1;
        System.out.println(currencyFormatter.format(x));//prints $0.10
        System.out.println(percentFormatter.format(x));// prints 10%
    }

    public static void main(String[] args) {
        AboutFactoryMethod();
    }
}