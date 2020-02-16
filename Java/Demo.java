package Java;

// public class Demo {
//     public static void main(final String[] args) {
//         int sum = 0;
//         for (int x = 0; x < 10; x++) {
//             sum += x;
//             if (x % 3 == 0) {
//                 break;
//             }
//         }
//         System.out.println(sum);
//     }

// }

//Subject 1
// public class Demo {
//     public static void main(String args[]) {
//         int num = 2147483647 ;
//         num += 2 ;
//         System.out.println(num) ;
//     }
// }

// //Subject 2
// public class Demo {
//     public static void main(String args[]) {
//         int num = 68 ;
//         char c = (char) num ;
//         System.out.println(c) ;
//     }
// }

// //Subject 3
// public class Demo {
//     public static void main(String args[]) {
//               long num = 100 ;
//               int x = num + 2 ; //程序错误 因为long到int不能自动转换
//               System.out.println(x) ;
//     }
// }

// //Subject 4
// public class Demo {
//     public static void main(String args[]) {
//         int x = 10 ;
//         double y = 20.2 ;
//         long z = 10L;
//         String str = "" + x + y * z ;
//         System.out.println(str) ;
//     }
// }

// //Subject 5
// public class Demo {
//     public static void main(String args[]) {
//         int num = 2147483647 ;
//         num += 2L ;
//         System.out.println(num) ;
//     }
// }
public class Demo{
    public static void main(final String[] args) {
        int num=50;
        num=num++*2;
        System.out.println(num);
    }

	public static void print(final String[] args) {
	
	    System.out.println("Hello World!"+"\n");
	}
}