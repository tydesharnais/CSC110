package csc110;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) 
	{
		//Take Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number: ");
		int num = sc.nextInt();
				
		//Test if is odd or even
				
		if (num % 2 == 0) 
			{
				System.out.println("Even");
					 
			}
		else
			{
				System.out.println("Odd");
			}
					

	}

}
