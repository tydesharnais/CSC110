/*
Write a program that prompts the user to input a positive integer and then outputs the first 12 multiples of that number.

 */

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Gimme a number");
		System.out.print(">");
		int number = sc.nextInt();
		int multiple = number;
		for(int i = 0; i < 11; i++)
		{
			number = number + multiple;
			System.out.println(number);
		}

	}

}
