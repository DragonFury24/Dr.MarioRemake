package logic;

import java.awt.*;

public class Pill {

//add return methods for row and col, a pill is one block on the grid instead of two, randomize the color and orientation in the constructor
    public enum Orientation {
        LEFT,
        RIGHT,
        UP,
        DOWN,
    }

    private Color myColor;
    private Shape myShape;

    public Pill(Color c, Orientation o) {
        myColor = c;
    }

    public Color getColor() {
        return myColor;
    }

    public Shape getShape() {
        return myShape;
    }


}
