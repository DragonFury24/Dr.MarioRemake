package logic;

public class GameState {
    private int totalScore;
    private int numViruses;

    public int getTotalScore() {
        return totalScore;
    }

    public int getNumViruses() {
        return numViruses;
    }

    public void setNumViruses(int viruses) {
        numViruses = viruses;
    }
}
