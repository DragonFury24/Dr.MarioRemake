package ui;

import logic.API;
import ui.game.GameBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameWindow extends JFrame implements KeyListener, MouseListener, Runnable {
    private JPanel       gameArea;
    private BorderLayout borderLayout;

    private Left       left;
    private Scoreboard scoreboard;

    private Right right;

    private Top top;

    private Bottom  bottom;
    private JButton exit;
    private JButton reset;

    private Center  center;
    private GameBoard gameBoard = new GameBoard();

    private Dimension screenSize = Toolkit.getDefaultToolkit()
                                          .getScreenSize();

    private Thread thread;

    private Timer timer = new Timer(1, update -> update());

    public GameWindow() {

    }

    private void configureFrame() {
        setVisible(true);
        setTitle("Dr. Mario");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(screenSize.width / 2, screenSize.height / 2);
        setLocationRelativeTo(null);
        addKeyListener(this);
        setContentPane(gameArea);
    }

    private void initializeAll() {
        gameArea = new JPanel();
        borderLayout = new BorderLayout();

        left = new Left();
        scoreboard = new Scoreboard();

        right = new Right();

        top = new Top();

        bottom = new Bottom();
        exit = new JButton("Exit");
        reset = new JButton("Reset");

        center = new Center();
    }

    private void configureGameArea() {
        gameArea.setLayout(borderLayout);
        gameArea.add(left, BorderLayout.LINE_START);
        gameArea.add(right, BorderLayout.LINE_END);
        gameArea.add(top, BorderLayout.PAGE_START);
        gameArea.add(bottom, BorderLayout.PAGE_END);
        gameArea.add(center, BorderLayout.CENTER);
    }

    private void configureLeft() {
        left.add(scoreboard);
    }

    private void configureRight() {

    }

    private void configureTop() {

    }

    private void configureBottom() {
        bottom.add(exit);
        bottom.add(reset);

        exit.addActionListener(action -> API.setRunning(false));
        reset.addActionListener(action -> API.reset());
    }

    private void configureCenter() {
        add(gameBoard);
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        initializeAll();
        configureFrame();
        configureGameArea();
        configureLeft();
        configureRight();
        configureTop();
        configureBottom();
        configureCenter();
    }

    public synchronized void stop() {
        try {
            thread.interrupt();
            thread.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("GAME IS NOW OVER!! CLOSING WINDOW!!");
    }

    public Thread getThread() {
        return thread;
    }
    public void update() {
        scoreboard.update();
        requestFocus();
    }

    @Override
    public void run() {
        System.out.println("Game Window running..");
        timer.start();
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
                API.increaseScore();
                System.out.println("LeftArrow");
                break;
            case KeyEvent.VK_RIGHT:
//                moveRight();
                API.increaseScore();
                System.out.println("RightArrow");
                break;
            case KeyEvent.VK_UP:
                API.resetTotal();
                System.out.println("ArrowUp");
                break;
            case KeyEvent.VK_DOWN:
//                moveDown();
                API.increaseScore();
                System.out.println("ArrowDown");
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
