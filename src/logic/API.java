package logic;

import java.util.EventListener;

/*
API to allow game window to poll for data about game data and game state.
All information retrieved by the window should be done through the API to keep the main logic and graphics separated
 */
public class API implements EventListener {
//    public GameState gameState() {
//        return gs;
//    }

    public static int totalScore() {
        return GameState.getTotalScore();
    }

    public static int numViruses() {
        return 0;
    }

    public static int numUnitsRemoved() {
        return 0;
    }

    public static boolean isRunning() {
        return GameState.isRunning();
    }

    public static boolean setRunning(boolean gameStatus) {
        GameState.setRunning(gameStatus);
        return isRunning();
    }

    public static void reset() {
        System.out.println("Resetting...");
        GameState.setReset(true);
    }
    //calculate total score to write to file, display high score
}
