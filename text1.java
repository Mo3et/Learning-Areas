/**
 * text
 */
public class text1{

    public static void main(String args[]) {
        int i = 1;
        int j = i++;
        if (i == (++j) && ((i++) == j)) {
            i+=j;//i=i+j
        }
        System.out.println("i="+i);
    }
}
