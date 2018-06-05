package logic;

import utils.SparseMatrix;

public class Game {
    private Board board;
    int counter = 0;

    public Game(Board.BACKING_CONTAINERS container) {
        board = new Board(container);
    }

    public void update() {
//        System.out.print("Updating...");
//        System.out.print(counter);
//        System.out.println();
//        counter++;
    }
}
