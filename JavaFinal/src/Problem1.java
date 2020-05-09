/*Write a program that takes in a users full name as one string and separates into two strings based on the space
		For example: Full name: James Fanning
		                String1: James
		                String2: Fanning
		Test where the space is in the string and divide the string into two substrings.
		Output the message: "Hello [first name]. How are you and the rest of the [last name] Family doing?

		 */
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your full name? (First and Last no Middle)");
		String fullstring = sc.nextLine();
		String[] array = fullstring.split(" ");
		System.out.println("Hello " + array[0] + ". How are you and the rest of the " + array[1] + " Family doing?");
	}

}
