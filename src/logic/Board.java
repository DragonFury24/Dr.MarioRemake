package logic;

import utils.SparseMatrix;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board {
    private SparseMatrix<Unit> sparseBoard;
    private Unit[][] arrayBoard;
    private boolean usingSparse;

    public static final int NUM_ROWS = 17;
    public static final int NUM_COLS = 8;
    enum BACKING_CONTAINERS {
        SparseMatrix,
        Array
    }

    public Board(BACKING_CONTAINERS container) {
        usingSparse = container == BACKING_CONTAINERS.SparseMatrix;

        if (usingSparse)
            sparseBoard = new SparseMatrix<>(17, 8);
        else
            arrayBoard = new Unit[17][8];
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

    public void moveLeft(SparseMatrix grid, Pill current) {

    }

    public void moveRight(SparseMatrix grid, Pill current) {

    }

    public void moveDown(SparseMatrix grid, Pill current) {

    }


}
