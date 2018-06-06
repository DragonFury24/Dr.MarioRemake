package ui;

import ui.game.GameBoard;

import javax.swing.*;
import java.awt.*;

public class Center extends JPanel {
    private GameBoard gameBoard = new GameBoard();
    private GridLayout gridLayout = new GridLayout();

    Center() {
        setLayout(gridLayout);
        add(gameBoard);
    }
}
