package logic;

import java.awt.*;
import java.util.Random;

public class Virus {

    public enum Orientation {
        LEFT,
        RIGHT,
        UP,
        DOWN,
    }

    private Color       color;
    private Shape       shape;
    private Orientation orientation;

    private static final Random RANDOM_GEN = new Random(9275);

    public Virus() {
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
                break;
            default:
                break;
        }

        rand = RANDOM_GEN.nextInt(4);

        switch (rand) {
            case 0:
                orientation = Virus.Orientation.LEFT;
                break;
            case 1:
                orientation = Virus.Orientation.RIGHT;
                break;
            case 2:
                orientation = Virus.Orientation.UP;
                break;
            case 3:
                orientation = Virus.Orientation.DOWN;
                break;
            default:
                break;
        }
    }

    public Virus(Color color, Orientation orientation) {
        this.color = color;
        this.orientation = orientation;
    }

    public Color getColor() {
        return color;
    }

    public Shape getShape() {
        return shape;
    }
}
