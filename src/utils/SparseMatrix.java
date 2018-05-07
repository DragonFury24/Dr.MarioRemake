package utils;

import java.util.ArrayList;

public class SparseMatrix<anyType> implements Matrixable<anyType>{

    private ArrayList<Cell<anyType>> list;
    private int numElements;
    private int numRows, numCols;

    public SparseMatrix (int r, int c)
    {
        list = new ArrayList();
        numElements = 0;
        numRows = r;
        numCols = c;

    }

    public int getKey(int r,int c)
    {

        return (r*numCols) + c;

    }

    public int getKey(int i)
    {
        return (list.get(i).getRow()*numCols) + list.get(i).getCol();
    }

    public anyType get(int r, int c)				//returns the element at row r, col c
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getRow() == r && list.get(i).getCol() == c)
            {
                return (anyType)list.get(i).getValue();
            }

        }
        return null;
    }
    public anyType set(int r, int c, anyType x)	//changes element at (r,c), returns old value
    {

        anyType oldValue;
        int tempKey = getKey(r,c);
        for(int i=0;i<list.size();i++)
        {
            if(getKey(i) == tempKey)
            {
                oldValue = list.get(i).getValue();
                list.get(i).setValue(x);
                return (anyType)oldValue;
            }

        }
        return null;

    }
    public void add(int r, int c, anyType x)	   //adds obj at row r, col c
    {

        numElements++;
        int tempKey = getKey(r,c);
        for(int i=0;i<list.size();i++)
        {
            if(getKey(i) > tempKey)
            {
                list.add(i,new Cell(r,c,x));
                return;
            }
        }
        list.add(new Cell(r,c,x));

    }
    public anyType remove(int r, int c)
    {
        numElements--;
        int tempKey = getKey(r,c);
        anyType oldValue;
        for(int i=0;i<list.size();i++)
        {
            if(getKey(i) == tempKey)
            {
                oldValue = list.get(i).getValue();
                list.remove(i);
                return (anyType) oldValue;
            }

        }
        return null;
    }
    public int size()			//returns # actual elements stored
    {
        return numElements;
    }
    public int numRows()		//returns # rows set in constructor
    {
        return numRows;
    }
    public int numColumns() //returns # cols set in constructor
    {
        return numCols;
    }
    public String toString()
    {
        String abc = "";
        for(int i = 0; i< numRows; i++)
        {
            for(int j = 0; j< numCols; j++)
            {
                anyType point = get(i,j);
                if(point == null)
                {
                    abc += "- ";
                }
                else
                {
                    abc += point + " ";
                }
            }
            abc += "\n";
        }
        return abc;
    }
}
