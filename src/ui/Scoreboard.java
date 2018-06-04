package ui;

import javax.swing.*;
import java.awt.*;

public class Scoreboard extends JPanel {

    private JLabel totalScoreLabel, topScoreLabel;
    private int totalScoreInt, topScoreInt;


    public Scoreboard() {
        setLayout(new BorderLayout());
        totalScoreLabel = new JLabel("Score: 0");
        totalScoreLabel.setFont(new Font("OCR A Extended", Font.BOLD, 14));
        add(totalScoreLabel, BorderLayout.SOUTH);
        topScoreLabel = new JLabel("Top: 0");
        topScoreLabel.setFont(new Font("OCR A Extended", Font.BOLD, 14));
        add(topScoreLabel, BorderLayout.NORTH);
    }

//    public void update(int numVirus, boolean combo){
//        int turnScore = 0;
//        if (numVirus == 1)
//            turnScore += 300;
//        else if (numVirus == 2)
//            turnScore += 900;
//        else
//            turnScore += 1800;
//        if(combo)
//            turnScore *= 2;
//        totalScoreLabel.setText("Score: " + turnScore);
//    }

    public void update() {
        totalScoreLabel.setText("Score:" + totalScoreInt);
        topScoreLabel.setText("Top:" + topScoreInt);
    }

    public void increaseScore() {
        totalScoreInt += 300;

        if (totalScoreInt > topScoreInt)
            topScoreInt = totalScoreInt;

        update();
    }

    public void resetTotal() {
        totalScoreInt = 0;
        update();
    }
}
