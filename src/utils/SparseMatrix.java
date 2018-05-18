package utils;

import java.util.ArrayList;

public class SparseMatrix<anyType> implements Matrixable<anyType> {

    private ArrayList<Cell<anyType>> list        = new ArrayList<>();
    private int                      numElements = 0;
    private int                      numRows, numCols;

    public SparseMatrix(int r, int c) {
        numRows = r;
        numCols = c;
    }

    public int getKey(int r, int c) {
        return (r * numCols) + c;
    }

    public int getKey(int i) {
        return (list.get(i).getRow() * numCols) + list.get(i).getCol();
    }


    // TODO: 5/11/2018
    /*
      public boolean contains(anyType x);		//true if x exists in list
      public int[] getLocation(anyType x);	//returns location [r,c] of where x exists in list, null otherwise
      public Object[][] toArray();				//returns equivalent structure in 2-D array form
      public boolean isEmpty();					//returns true if there are no actual elements stored
      public void clear();							//clears all elements out of the list

		public void setBlank(char blank);		//allows the client to set the character that a blank spot in the array is
															//represented by in String toString()
   	*/

    public boolean isEmpty() {
        return numElements == 0;
    }


    //returns the element at row r, col c
    public anyType get(int r, int c) {
        for (Cell e : list) {
            if (e.getRow() == r && e.getCol() == c) {
                return (anyType) e.getValue();
            }
        }

        return null;
    }

    //changes element at (r,c), returns old value
    public anyType set(int r, int c, anyType x) {
        anyType oldValue;
        int     tempKey = getKey(r, c);

        for (int i = 0; i < list.size(); i++) {
            if (getKey(i) == tempKey) {
                oldValue = list.get(i).getValue();
                list.get(i).setValue(x);

                return oldValue;
            }
        }

        return null;
    }

    //adds obj at row r, col c
    public void add(int r, int c, anyType x) {
        numElements++;
        int tempKey = getKey(r, c);

        for (int i = 0; i < list.size(); i++) {
            if (getKey(i) > tempKey) {
                list.add(i, new Cell(r, c, x));

                return;
            }
        }

        list.add(new Cell(r, c, x));
    }

    public anyType remove(int r, int c) {
        numElements--;
        int     tempKey = getKey(r, c);
        anyType oldValue;

        for (int i = 0; i < list.size(); i++) {
            if (getKey(i) == tempKey) {
                oldValue = list.get(i).getValue();
                list.remove(i);

                return oldValue;
            }

        }
        return null;
    }

    //returns # actual elements stored
    public int size() {
        return numElements;
    }

    //returns # rows set in constructor
    public int numRows() {
        return numRows;
    }

    //returns # cols set in constructor
    public int numColumns() {
        return numCols;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                anyType point = get(row, col);

                if (point == null) {
                    sb.append("- ");
                } else {
                    sb.append(point).append(" ");
                }
            }

            sb.append("\n");
        }

        return sb.toString();
    }
}
