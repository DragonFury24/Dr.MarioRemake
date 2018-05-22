package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameWindow extends JFrame implements KeyListener, Runnable {
    private JPanel    gameArea;
    private Dimension screenSize = Toolkit.getDefaultToolkit()
                                          .getScreenSize();


    private Thread thread;

    public GameWindow() {
        thread = new Thread(this);
    }

    private void configureFrame() {

        setTitle("Mancala");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(screenSize.width / 2, screenSize.height / 2);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createUI() {

    }

    public void refresh() {

    }

    public synchronized void start() {
        configureFrame();
        createUI();
        run();
    }

    public synchronized void stop() {

    }

    @Override
    public void run() {

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
