package logic;

import java.awt.*;
import java.util.Random;

public class Unit {
    public static final Random RANDOM_GEN = new Random(9275);

    private Color color;

    public void chooseColor(){
        int rand = RANDOM_GEN.nextInt(3);

        switch (rand) {
            case 0:
                color = Color.blue;
                break;
            case 1:
                color = Color.red;
                break;
            case 2:
                color = Color.yellow;
            default:
                break;
        }
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
