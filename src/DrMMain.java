import logic.GameManager;
import ui.GameWindow;

public class DrMMain {
    private static boolean gameIsRunning = true;

    //possible split Window rendering and game engine onto 2 separate threads
    //Look into synchronizing if multithreaded
    public static void main(String[] args) {
        GameWindow  gw = new GameWindow();
        GameManager gm = new GameManager();

        gw.start();
        gm.start();

        while(true) {
            if (!gm.isRunning()) {
                gm.stop();
                gw.stop();
                break;
            }

        }
    }
}
