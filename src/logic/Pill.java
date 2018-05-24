package logic;

import java.awt.*;
import java.util.Random;

public class Pill {
    //add return methods for row and col, a pill is one block on the grid instead of two, randomize the color and orientation in the constructor
    public enum Orientation {
        LEFT,
        RIGHT,
        UP,
        DOWN,
    }

    private Color       color;
    private Shape       shape;
    private Orientation orientation;

    private static final Random RANDOM_GEN = new Random(9525);

    public Pill() {
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
                orientation = Orientation.LEFT;
                break;
            case 1:
                orientation = Orientation.RIGHT;
                break;
            case 2:
                orientation = Orientation.UP;
                break;
            case 3:
                orientation = Orientation.DOWN;
                break;
            default:
                break;
        }
    }

    public Pill(Color color, Orientation orientation) {
        this.color = color;
        this.orientation = orientation;
    }

    public Color getColor() {
        return color;
    }

    public Orientation getOrientation() {
        return orientation;
    }
}
