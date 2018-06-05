package logic;

public class GameState {
    static private int totalScore;
    static private int numViruses;
    static private boolean running = true;
    static private boolean reset = false;
    static private Board board = new Board(Board.BACKING_CONTAINERS.SparseMatrix);

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

    static boolean getReset() {
        return reset;
    }

    static boolean setReset(boolean resetGame) {
        reset = resetGame;
        return reset;
    }

    static Board getBoard() {
        return board;
    }
}
