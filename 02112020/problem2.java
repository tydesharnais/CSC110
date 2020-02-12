import java.util.Scanner;

public class problem2 
{

	public static void main(String[] args) 
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
				
		//Convert lengths with substrings to last 
		subname = upname.substring(0,3);
		subnumber = number.substring(number.length()-4,number.length());
				
		//Prints it all out
		System.out.println("Your username is: " + subname + subnumber);
				

	}

}
