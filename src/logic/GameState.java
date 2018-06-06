package logic;

public class GameState {
    private static int totalScore;
    private static int topScore;
    private static int numViruses;
    private static boolean running = true;
    private static boolean reset = false;
    private static Board board = new Board(Board.BACKING_CONTAINERS.SparseMatrix);

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

    static int getTopScore() {
        return topScore;
    }

    static void setTotalScore(int score) {
        totalScore = score;
    }

    static void setTopScore(int score) {
        topScore = score;
    }

    static Board getBoard() {
        return board;
    }
}
