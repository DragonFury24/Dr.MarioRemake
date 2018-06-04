package logic;

import utils.SparseMatrix;

public class Game {
    private boolean reset = false;


    private SparseMatrix<Unit> sparseBoard = null;
    private Unit[][]           arrayBoard  = null;
    private Board board = new Board();

    public Game() {

    }

    public void update() {

    }

    public void setReset(boolean reset) {
        this.reset = reset;
    }

    public boolean reset() {
        return reset;
    }
}
