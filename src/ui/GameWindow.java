package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameWindow extends JFrame implements KeyListener {
    private JPanel    gameArea;
    private Dimension screenSize = Toolkit.getDefaultToolkit()
                                          .getScreenSize();

    // TODO: 5/6/2018 Test different TICK_RATEs later
    /*
    Implement constant TICK with variable, maximum frame times
    http://www.koonsolo.com/news/dewitters-gameloop/
     */
    private final int TICK_RATE = 30;

    public GameWindow() {
        setTitle("Dr. Mario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Window size for screens with 16:9 aspect ratio
        if (screenSize.width / screenSize.height == 16 / 9)
            setSize(screenSize.width / 2, screenSize.height * 2 / 3);

        /// TODO: 5/6/2018 Test different ways of setting window size or hard code screen ratios e.g. 21:9, 4:3, 18:9

        setLocation(screenSize.width / 2, screenSize.height / 2);
        setResizable(false);
        setVisible(true);
    }

    private void createGameArea() {

    }

    public void display() {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //if (e.getKeyCode() == KeyEvent.VK_DOWN);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
