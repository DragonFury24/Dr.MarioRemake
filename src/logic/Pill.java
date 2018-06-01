package logic;

import java.awt.*;
import java.util.Random;

public class Pill extends Unit{
    //add return methods for row and col, a pill is one block on the grid instead of two, randomize the color and orientation in the constructor
    public enum Orientation {
        LEFT,
        RIGHT,
        UP,
        DOWN,
    }

    private Orientation orientation;

    public Pill() {
        chooseColor();

        int rand = RANDOM_GEN.nextInt(4);

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
        setColor(color);
        this.orientation = orientation;
    }

    public Orientation getOrientation() {
        return orientation;
    }
}
