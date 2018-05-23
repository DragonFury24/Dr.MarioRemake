package logic;

import java.awt.*;
public class Virus {

    public enum Orientation {
        LEFT,
        RIGHT,
        UP,
        DOWN,
    }

    private Color myColor;
    private Shape myShape;
    private int row, col;

    public Virus(Color c, Orientation o) {
        if((int)Math.random()*3 == 0)
            myColor = Color.blue;
        else if((int)Math.random()*3 == 1)
            myColor = Color.red;
        else
            myColor = Color.yellow;
    }

    public Color getColor() {
        return myColor;
    }

    public Shape getShape() {
        return myShape;
    }

    public int getRow() {return row;}

    public int getCol() {return col;}
}
