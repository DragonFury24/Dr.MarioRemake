package ui;

import logic.API;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameWindow extends JFrame implements KeyListener, MouseListener, Runnable {
    private JPanel    gameArea;
    private BorderLayout borderLayout = new BorderLayout();
    private Scoreboard scoreboard = new Scoreboard();
    private Dimension screenSize = Toolkit.getDefaultToolkit()
                                          .getScreenSize();

    private Thread thread;

    public GameWindow() {
        thread = new Thread(this);
    }

    private void configureFrame() {
        setVisible(true);
        setTitle("Dr. Mario");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(screenSize.width / 2, screenSize.height / 2);
        setLocationRelativeTo(null);
        addKeyListener(this);

        setLayout(borderLayout);
        add(scoreboard, BorderLayout.PAGE_START);
    }

    private void createUI() {

    }

    public void refresh() {

    }

    public synchronized void start() {
        configureFrame();
        createUI();
    }

    public synchronized void stop() {
        try {
            thread.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    @Override
    public void run() {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int event = e.getKeyCode();

        switch (event) {
            case KeyEvent.VK_LEFT:
//                moveLeft();
                scoreboard.increaseScore();
                break;
            case KeyEvent.VK_RIGHT:
//                moveRight();
                scoreboard.increaseScore();
                break;
                case KeyEvent.VK_UP:
                    scoreboard.resetTotal();
                    break;
            case KeyEvent.VK_DOWN:
//                moveDown();
                scoreboard.increaseScore();
                break;
            case KeyEvent.VK_ESCAPE:
                System.exit(0);
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

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
