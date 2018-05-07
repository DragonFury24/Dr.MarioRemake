package logic;

/*
API to allow game window to poll for data about game data and game state.
All information retrieved by the window should be done through the API to keep the main logic and graphics separated
 */
public class API {
    GameState gs;

    public API(GameState gameState) {
        gs = gameState;
    }

    public GameState gameState() {
        return gs;
    }

    public int totalScore() {
        return gs.getTotalScore();
    }
}
