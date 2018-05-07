package logic;


// TODO: 5/6/2018 Look into multithreading
public class GameManager {
    private GameState gs;
    private API api;

    public GameManager() {
        gs = new GameState();
        api = new API(gs);
    }

    public void run() {

    }
}
