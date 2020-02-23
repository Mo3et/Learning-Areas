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
    public static void tripValue(double x) {//doesn't work
        x=3*x;
    }
    public static void main(String[] args) {
        // AboutFactoryMethod();
        double percent=10;
        tripValue(percent);//percent =10 x=30
    }
}
class ins{
public static void main(String[] args) {
    
}
}