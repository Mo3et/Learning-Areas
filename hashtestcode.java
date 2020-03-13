/**
 * hashtestcode
 */
public class hashtestcode {

    // public int hashCode(String s) {
    //     return 7 * hashCode(s);
    // }

    public static void main(String[] args) {
        String s = "OK";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());
        String t = new String("OK");
        StringBuilder tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());

        String d = "OK";
        StringBuilder db = new StringBuilder(d);
        System.out.println(d.equals(s));
        System.out.println(sb.equals(db));
    }

}