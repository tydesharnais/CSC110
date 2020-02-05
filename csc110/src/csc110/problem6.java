package csc110;

import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) 
	{
		//Take Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number: ");
		int num = sc.nextInt();
		
		// Factorial for loop
		
		for (int i = num - 1; i != 0; i--)
		{
			num = num * i;
			
		}
		
		// Factorial answer 
		
		System.out.println("Factiorial! " + num );

	}

}
