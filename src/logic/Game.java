package logic;

import utils.SparseMatrix;

public class Game {
    private boolean reset = false;

    private Board board;

    public Game(Board.BACKING_CONTAINERS container) {
        board = new Board(container);
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
