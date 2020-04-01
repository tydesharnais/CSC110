//Write a program to ask a user how many rows
// and columns should be in a two dimensional
// array, then take in and print those values.
//(Use the print method from problem 2)
import java.util.Scanner;



public class Problem5 {

	public static void main(String[] args) 
	{
		//declare and init scanner 
		Scanner sc = new Scanner(System.in);
		
		//Take in rows and columns for 2D Array
		System.out.print("How many rows for Array: ");
		int rows = sc.nextInt();
		System.out.print("How many columns for Array: ");
		int columns = sc.nextInt();
		
		//Declare and init 2D Array
		int[][] Myarray = new int[rows][columns];
		System.out.println("Created a " + rows + " x " + columns + " array");
		
		
		
		for (int rCounter = 0; rCounter < Myarray.length; rCounter++)
		{
			for (int cCounter = 0; cCounter < Myarray[0].length; cCounter++)
			{
				System.out.println("Cell ["+rCounter+"]["+cCounter+"]");
				System.out.print("Value: ");
				int input = sc.nextInt();
				Myarray[rCounter][cCounter] = input;
			}
		}
		
		printMethod(Myarray);
				

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
