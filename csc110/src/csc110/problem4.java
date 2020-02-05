package csc110;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) 
	{
		//Take Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number: ");
		int num = sc.nextInt();
				
		//Test if number is positive or negative
				
		if (num < 0) 
			{
				System.out.println("Negative");
					 
			}
		else
			{
				System.out.println("Positive");
			}
	}

}
