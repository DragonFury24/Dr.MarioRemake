package logic;

public class GameState {
    static private int totalScore;
    static private int numViruses;
    static private boolean running;

    static int getTotalScore() {
        return totalScore;
    }

    static int getNumViruses() {
        return numViruses;
    }

    static void setNumViruses(int viruses) {
        numViruses = viruses;
    }

    static boolean isRunning() {
        return running;
    }

    static boolean setRunning(boolean gameStatus) {
        running = gameStatus;
        return running;
    }
}
