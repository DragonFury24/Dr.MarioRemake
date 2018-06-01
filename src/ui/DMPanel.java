package ui;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;

public class DMPanel extends JPanel {
    private Scoreboard left;
    public DMPanel(){
        setLayout(new BorderLayout());

        left = new Scoreboard();
        add(left, BorderLayout.WEST);
    }
}
