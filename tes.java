
// public class tes {
//     public static void main(String[] args) {
//     Game game = new Game();
//     game.start();
//     try {
//     Thread.sleep(1000);
//     } catch (Exception e) {

//     }
//     game.index= -1;
//     System.out.println("change.....");
//     }
// }
    
//     class Game extends Thread {
//         public volatile int index = 0;
        
//         @Override
//         public void run() {
//             System.out.println("Game Start");
//             while (true) {
//                 if (index == -1) {
//                     break;
//                 }
//             }
//             System.out.println("Game End");
//         }
//     }

    // ==========================================

//     public static void main(String[] args) {
//         Gas G=new Gas();
//         G.start();
//         G.inx=1;
//         int j =G.inx;
//         System.out.println(j);

//     }

//     class Gas extends Thread {
// public  int inx =0;
// @Override
// public void run(){
//     System.out.println("Game Start");
// }
//     }

/**
 * 
 */
/**
 * tes
 */
public class tes {
public static void main(String[] args) {
    Gms G=new Gms();
    int inx=0;
    G.start();
inx=10;
System.out.println(G.inx+"GG11");//First
System.out.println(G.j+"GG22");//Third
System.out.println(inx+"GG33");//Fourth
}

}
class Gms extends Thread{
    public int inx=1;
    int j=inx;
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        System.out.println(j+"TT1");//second
    }
}