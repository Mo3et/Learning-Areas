

public class Dowork {
    public static void main(String[] args) {
       dowork(5,6,9);

    }

    public static void dowork(int x, int y, int z) {
        double k, j = 0;
        if (x > 3 && z < 10) {
            k = x * y - 1;
            j = Math.sqrt(k);
        }
        if (x == 4 || y > 5)
            j = x * y + 10;
        j = j % 3;
    }
}