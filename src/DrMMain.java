import logic.API;
import logic.GameManager;
import logic.GameState;
import ui.GameWindow;

public class DrMMain {
    private static boolean gameIsRunning = true;

    //possible split Window rendering and game engine onto 2 separate threads
    //Look into synchronizing if multithreaded
    public static void main(String[] args) {
        startGame();
    }

    static GameWindow  gw = new GameWindow();
    static GameManager gm = new GameManager();

    static Thread checkGameOver = new Thread(() -> {
        while (true) {
            if (!API.isRunning()) {
                try {
                    gw.getThread()
                      .interrupt();
                    Thread.sleep(1000);
                    gw.stop();
                    gm.getThread()
                      .interrupt();
                    Thread.sleep(1000);
                    gm.stop();

                    exit();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }
    });

    static void startGame() {
        gw.start();
        gm.start();

//        while(true) {
//            if (!API.isRunning()) {
//                gw.stop();
//                gm.stop();
//                break;
//            }
//
//        }



//        checkGameOver.start();
    }

    static void exit() {
        try {
            checkGameOver.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
