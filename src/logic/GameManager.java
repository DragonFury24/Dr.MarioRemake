package logic;


// TODO: 5/6/2018 Look into multithreading

import java.awt.event.ActionListener;

// TODO: 5/6/2018 Test different TICK_RATEs later
    /*
    Implement constant TICK with variable, maximum frame times
    http://www.koonsolo.com/news/dewitters-gameloop/
     */
public class GameManager implements Runnable {
    private Thread thread;

    private final int TICKS_PER_SECOND = 15;
    private final int TICK_SKIP = 1000 / TICKS_PER_SECOND;
    private final int MAX_FRAME_SKIP = 5;

    private final long START_TIME = System.currentTimeMillis();

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        try {
            thread.join();
        }catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("GAME IS NOW OVER!! SHUTTING DOWN GAME THREAD!!");
    }

    public void run() {
        System.out.println("Game Manager running...");
        Game game = new Game(Board.BACKING_CONTAINERS.SparseMatrix);

        while (GameState.isRunning()) {
            game.update();

            if (GameState.getReset()) {
                game = new Game(Board.BACKING_CONTAINERS.SparseMatrix);
                GameState.setReset(false);
                continue;
            }
        }

        GameState.setRunning(false);
    }

    private long getRunningTime() {
        return System.currentTimeMillis() - START_TIME;
    }
}
