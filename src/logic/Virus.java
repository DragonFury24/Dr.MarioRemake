package logic;

import java.awt.*;
import java.util.Random;

public class Virus extends Unit{

    public Virus() {
        chooseColor();
    }

    public Virus(Color color) {
        setColor(color);
    }
}
