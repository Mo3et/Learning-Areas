import java.util.Scanner;

public class arraayModify {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // 第一组输入
        int[] arr1 = new int[a];
        for (int i = 0; i <arr1.length; i++)
            arr1[i] = sc.nextInt();
        // 第二组输入
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        for (int x = 0; x < arr2.length; x++)
            arr2[x] = sc.nextInt();
        sc.close();

        for (int j =arr1.length-1; j >= 0; j--)
            System.out.print(arr1[j] + " ");
        System.out.println();

        for (int x = arr2.length - 1; x >=0; x--) {
            System.out.print(arr2[x] + " ");
        }
    }

}
