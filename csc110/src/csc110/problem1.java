package csc110;
import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) 
	{
		// Take Input
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number: ");
		int num = sc.nextInt();
		
		// Checks if even or odd
		
		if (num % 2 == 0) 
		{
			System.out.println("This is an Even number. Getting the next 5 even digits in " + num);
			
			// For-Loop for numbers even
			
			for (int i=0; i <= 5; i++)
			{
				num = num + 2;
				System.out.println(num);
			}
			 
		}
		else
		{
			System.out.println("This is an Odd number. Getting the next 5 odd digits in " + num);
			
			for (int i=0; i <= 5; i++)
			{
				num = num + 2;
				System.out.println(num);
			}
		}
				

	}

}
