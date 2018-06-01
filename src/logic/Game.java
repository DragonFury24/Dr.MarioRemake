package logic;

import utils.SparseMatrix;

public class Game {
    private boolean reset = false;
    private boolean usingSparse;

    enum BACKING_CONTAINERS {
        SparseMatrix,
        Array
    }
    private SparseMatrix<Unit> sparseBoard = null;
    private Unit[][] arrayBoard = null;


    public Game(BACKING_CONTAINERS container) {
        usingSparse = container == BACKING_CONTAINERS.SparseMatrix;

        if (usingSparse)
            sparseBoard = new SparseMatrix<>(17, 8);
        else
            arrayBoard = new Unit[17][8];
    }

    public void update() {

    }

    public boolean reset() {
        return reset;
    }
}
