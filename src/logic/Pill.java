package logic;

import java.awt.*;

public class Pill {


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
