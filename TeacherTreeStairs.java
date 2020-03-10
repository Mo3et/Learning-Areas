import java.util.Scanner;

/**
 * 爬楼梯
 * 树老师爬楼梯，他可以每次走1级或者2级，输入楼梯的级数，求不同的走法数。
 * 例如：
楼梯一共有3级，他可以每次都走一级，或者第一次走一级，第二次走两级，
也可以第一次走两级，第二次走一级，一共3种方法。
 */

/**
 * TeacherTreeStairs
 */
public class TeacherTreeStairs {
    private static int num=0;
    public static void main(String[] args) {
        
        Scanner scann=new Scanner(System.in);
        int x=scann.nextInt();
        scann.close();
        dg(x);
        System.out.println(num);
    }
    private static  void dg(int x){
        if(x<0)return;
        if (x==0) {
            num++;
            return;
        }
        dg(x-1);
        dg(x-2);
    }
}