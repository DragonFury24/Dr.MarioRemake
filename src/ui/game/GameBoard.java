package ui.game;

import logic.API;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    private GridLayout gridLayout = new GridLayout(17, 8);

    public GameBoard() {

    }

    private void configurePanel() {
        setLayout(gridLayout);

        for (int r = 0; r < API.getBoard().NUM_ROWS; r++) {
            for (int c = 0; c < API.getBoard().NUM_COLS; c++) {

            }
        }
    }
}
