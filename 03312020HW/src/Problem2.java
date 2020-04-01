
public class Problem2 {
	// Create a print method for printing 2x2 arrays.
	// I recommend repurposing  the PrintArray class from the notes.
	
	public static void main(String[] args) 
	{
	int[][] myArray = {    
				{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
	
	
	
	printMethod(myArray);
	

		
		
	}
	
	
	public static void printMethod(int[][] array)
	
	{
	//This is set up to first gather the number of rows and columns, then print the array using nested loops.
	int row = array.length;
	int col = array[0].length;
	int subrow;
	int subcol;
		
	//When row is less than the length of rows, do the interior and increment by one
	for(subrow=0; subrow<row; subrow++) 
	{
		//When column is less than the length of the column, do the interior and increment by one 
		for (subcol = 0; subcol < col; subcol++) 
		{
			System.out.print(array[subrow][subcol] + " ");
		}
		System.out.println();
		
		}
	
	}

}
