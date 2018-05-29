package logic;

import utils.SparseMatrix;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board implements KeyListener {
    private static final SparseMatrix<Pill> board = new SparseMatrix<>(16, 8);

    public void moveLeft(SparseMatrix grid, Pill current) {

    }

    public void moveRight(SparseMatrix grid, Pill current) {

    }

    public void moveDown(SparseMatrix grid, Pill current) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int event = e.getKeyCode();

        switch (event) {
            case KeyEvent.VK_LEFT:
                moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                moveRight();
                break;
            case KeyEvent.VK_DOWN:
                moveDown();
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
