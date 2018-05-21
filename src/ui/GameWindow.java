package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameWindow extends JFrame implements MouseListener {
    private JPanel    gameArea;
    private Dimension screenSize = Toolkit.getDefaultToolkit()
                                          .getScreenSize();


    private final int TICK_RATE = 30;

    public GameWindow() {
        setTitle("Dr. Mario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Window size for screens with 16:9 aspect ratio
        if (screenSize.width / screenSize.height == 16 / 9)
            setSize(screenSize.width / 2, screenSize.height * 2 / 3);

        /// TODO: 5/6/2018 Test different ways of setting window size or hard code screen ratios e.g. 21:9, 4:3, 18:9

        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void createGameArea() {

    }

    public void display() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
