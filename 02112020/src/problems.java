import java.util.Scanner;
import java.util.Random;
import javax.swing.*;


public class problems 
{

	public static void main(String[] args) throws StringIndexOutOfBoundsException
	{
		//Set up vars and dependecies 
		String name, upname, subname;
		String number, subnumber;
		Scanner sc = new Scanner(System.in);
		
		//Take in name and number
		System.out.println("Give me a username");
		System.out.print("> ");
		name = sc.nextLine();
		System.out.println("Give me a number");
		System.out.print("> ");
		number = sc.nextLine();

		//convert name to uppercase
		upname = name.toUpperCase();
		
		//Convert lengths with substrings
		subname = upname.substring(0,3);
		subnumber = number.substring(0,4);
		
		//Prints it all out
		System.out.println("Your username is: " + subname + subnumber);
		
		
		
	}

}
