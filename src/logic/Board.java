package logic;

import utils.SparseMatrix;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Board implements KeyListener {

    public static void main(String args[]) {

        SparseMatrix<Pill> board = new SparseMatrix<>(16, 8);

        boolean playing = true;

        while (playing) {
            int randColor = (int) (Math.random() * 3);
            int randOrient = (int) (Math.random() * 4);

            //if()
            Pill curr = new Pill(Color.RED, Pill.Orientation.LEFT);


        }
    }

    public void moveLeft(SparseMatrix grid, Pill current) {
        if (grid[current.getRow()][current.getCol()- 1 ].isEmpty) {
            grid.add(current.getRow(), current.getCol() - 1);
            grid.remove(current.getRow(),current.getCol());
        }
    }

    public void moveRight(SparseMatrix grid, Pill current) {
        if (grid[current.getRow()][current.getCol()+ 1 ].isEmpty) {
            grid.add(current.getRow(), current.getCol() + 1);
            grid.remove(current.getRow(),current.getCol());
        }
    }

    public void moveDown(SparseMatrix grid, Pill current) {
        if (grid[current.getRow() + 1][current.getCol()].isEmpty) {
            grid.add(current.getRow() + 1, current.getCol() - 1);
            grid.remove(current.getRow(),current.getCol());
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
