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
        checkGameOver.start();
    }

    static GameWindow  gw = new GameWindow();
    static GameManager gm = new GameManager();

    static Thread checkGameOver = new Thread(() -> {
        while (true) {
            if (!API.isRunning()) {
                gw.getThread()
                  .interrupt();
                gw.stop();
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
        gw.stop();
        gm.stop();
    }
}
