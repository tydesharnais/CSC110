package csc110;

import java.util.Scanner;

public class problem8 
{

	public static void main(String[] args)
	{
		// Take Input
		Scanner sc = new Scanner(System.in);
		
		// Take word
		System.out.println("Give me a word: ");
		String word = sc.nextLine();
		
		// Take Numbers
		System.out.println("Give me a row number: ");
		int row = sc.nextInt();
		System.out.println("Give me a column number: ");
		int column = sc.nextInt();
		//Nested loops
		
		int x = 0;
		
		while(x < row)
		{
			int y = 0;
			while(y < column)
			{
				System.out.print(word + " ");
				y++;
			}
		System.out.println("");
		x++;
		
		}
		
						
		
	}
}
