import logic.API;
import logic.GameManager;
import logic.GameState;
import ui.GameWindow;

public class DrMMain {
    private static boolean gameIsRunning = true;

    //possible split Window rendering and game engine onto 2 separate threads
    //Look into synchronizing if multithreaded
    public static void main(String[] args) {
        new DrMMain();
    }

    GameWindow  gw = new GameWindow();
    GameManager gm = new GameManager();

    public DrMMain() {
        gw.start();
        gm.start();

        while(true) {
            if (!API.isRunning()) {
                gw.stop();
                gm.stop();
                break;
            }

        }
    }
}
