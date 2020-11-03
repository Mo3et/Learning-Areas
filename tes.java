public class tes {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
       game.index= -1;
        System.out.println("change.....");
    }
}


class Game extends Thread {
    public int index = 0;

    @Override
    public void run() {
        System.out.println("Game Start");
        while (true) {
            if (index == -1) {
                break;
            }
        }
        System.out.println("Game End");
    }
}
