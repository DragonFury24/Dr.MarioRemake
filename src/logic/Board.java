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

    public void moveLeft(SparseMatrix<Unit> grid, Pill curr) {
        int[] currLoc;
        currLoc = getLocation(curr);
        Pill other = (Pill) (curr);
        if (currLoc[1] != 0) {
            if (!(grid.get(currLoc[0], currLoc[1] - 1).contains(Pill other))) {
                grid.add(currLoc[0], currLoc[1] - 1, curr);
                grid.remove(currLoc[0], currLoc[1]);
            }
        }
    }

    public void moveRight(SparseMatrix<Unit> grid, Pill curr) {
        int[] currLoc;
        currLoc = getLocation(curr);
        Pill other = (Pill) (curr);
        if (currLoc[1] != NUM_COLS) {
            if (!(grid.get(currLoc[0], currLoc[1] + 1).contains((Pill other)))){
                grid.add(currLoc[0], currLoc[1] + 1, curr);
                grid.remove(currLoc[0], currLoc[1]);
            }
        }
    }


    public void moveDown(SparseMatrix<Unit> grid, Pill curr) {
        int[] currLoc;
        currLoc = getLocation(curr);
        Pill other = (Pill) (curr);
        if(currLoc[0] != NUM_ROWS) {
            if (!(grid.get(currLoc[0] + 1, currLoc[1]).contains(Pill other))) {
                grid.add(currLoc[0] + 1, currLoc[1], curr);
                grid.remove(currLoc[0], currLoc[1]);
            }
        }
    }


}
