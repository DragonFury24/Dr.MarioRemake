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
    private Unit[][]           arrayBoard  = null;


    public Game(BACKING_CONTAINERS container) {
        usingSparse = container == BACKING_CONTAINERS.SparseMatrix;

        if (usingSparse)
            sparseBoard = new SparseMatrix<>(17, 8);
        else
            arrayBoard = new Unit[17][8];
    }

    public void update() {

    }

    public void changeContainer() {
        if (usingSparse)
            changeToArray();
        else
            changeToSparseMatrix();
    }

    private void changeToArray() {
        arrayBoard = sparseBoard.toArray();
        sparseBoard = null;
        usingSparse = false;
    }

    private void changeToSparseMatrix() {
        sparseBoard = new SparseMatrix<>(17, 8);

        for (int r = 0; r < arrayBoard.length; r++) {
            for (int c = 0; c < arrayBoard[r].length; c++) {
                sparseBoard.add(r, c, arrayBoard[r][c]);
            }
        }

        arrayBoard = null;
        usingSparse = false;
    }

    public void setReset(boolean reset) {
        this.reset = reset;
    }

    public boolean reset() {
        return reset;
    }
}
