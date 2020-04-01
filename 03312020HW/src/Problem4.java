//Write a program to ask a user how many values
// should be in a one dimensional array,
// then take in, and print those values.
// (You should be able to use the print
// method you made for problem 1)
import java.util.Scanner;


public class Problem4 {

	public static void main(String[] args) 
	{
		//Import the scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values would you like to add?");
		int value = sc.nextInt();
		int[] array = new int[value];
		System.out.println("Creating a 1D " + value + " value array.");
		for (int counter = 0; counter<value; counter++)
		{
			System.out.println("Cell: " + counter);
			System.out.print("Value: ");
			int input = sc.nextInt();
			array[counter] = input;
		}
		printMethod(array, value);
		

	}
	public static void printMethod(int[] array, int length)
    {
    	int sub;
    	
    	for(sub=0; sub<length; sub++)
        {
            System.out.println(array[sub]);
        }
    }

}
