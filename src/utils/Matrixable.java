package utils;

public interface Matrixable<anyType> {
    //returns the element at row r, col c
    anyType get(int r, int c);

    //changes element at (r,c), returns old value
    anyType set(int r, int c, anyType x);

    //adds obj at row r, col c
    void add(int r, int c, anyType x);

    anyType remove(int r, int c);

    //returns # actual elements stored
    int size();

    //returns # rows set in constructor
    int numRows();

    //returns # cols set in constructor
    int numColumns();

   	/*
      public boolean contains(anyType x);		//true if x exists in list
      public int[] getLocation(anyType x);	//returns location [r,c] of where x exists in list, null otherwise
      public Object[][] toArray();				//returns equivalent structure in 2-D array form
      public boolean isEmpty();					//returns true if there are no actual elements stored
      public void clear();							//clears all elements out of the list

		public void setBlank(char blank);		//allows the client to set the character that a blank spot in the array is
															//represented by in String toString()
   	*/
}
