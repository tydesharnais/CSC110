package csc110;

import java.util.Scanner;

public class problem5 
{

	public static void main(String[] args) 
	{
		//Take Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number: ");
		int num = sc.nextInt();
				
		//While loop for multiples of 12
				
		for (int i = 1; i < 12 ; i++)
		{
			int num2 = num * i;
			System.out.println(num2);
					
		}
}
}