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

    static public int totalScore() {
        return GameState.getTotalScore();
    }

    static public int numViruses() {
        return 0;
    }

    static public int numUnitsRemoved() {
        return 0;
    }

    static public boolean isRunning() {
        return GameState.isRunning();
    }

    static public boolean setRunning(boolean gameStatus) {
        GameState.setRunning(gameStatus);
        return isRunning();
    }
    //calculate total score to write to file, display high score
}
