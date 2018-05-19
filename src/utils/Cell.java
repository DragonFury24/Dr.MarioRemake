package utils;

public class Cell<anyType> {
    //the actual Object that the Cell stores <can be any type>
    private anyType value;
    private int     row;        //the row value it is simulated to be stored at
    private int     col;        //the column value it is simulated to be stored at

    public Cell(int r, int c, anyType v) {
        value = v;
        row = r;
        col = c;
    }

    public void setValue(anyType v) {
        value = v;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public anyType getValue() {
        return value;
    }
}
