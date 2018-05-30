package ui;

import javax.swing.*;
import java.awt.*;

public class Scoreboard extends JPanel {

    private JLabel totalScore, topScore;
    //private int turnScore;
    public Scoreboard() {
        setLayout(new BorderLayout());
        totalScore = new JLabel("Score: 0");
        totalScore.setFont(new Font("OCR A Extended", Font.BOLD, 14));
        add(totalScore, BorderLayout.SOUTH);
        topScore = new JLabel("Top: 0");
        topScore.setFont(new Font("OCR A Extended",Font.BOLD,14));
        add(topScore, BorderLayout.NORTH);
    }

    public void update(int numVirus, boolean combo){
        int turnScore = 0;
        if (numVirus == 1)
            turnScore += 300;
        else if (numVirus == 2)
            turnScore += 900;
        else
            turnScore += 1800;
        if(combo)
            turnScore *= 2;
        totalScore.setText("Score: " + turnScore);
    }
}
