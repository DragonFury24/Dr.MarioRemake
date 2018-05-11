package logic;

import java.awt.*;

public class Pill {

    private Color myColor;
    private Shape myShape;

    public Pill(Color c, Shape s) {
        myColor = c;
        myShape = s;
    }

    public Color getColor() {
        return myColor;
    }

    public Shape getShape() {
        return myShape;
    }

}
