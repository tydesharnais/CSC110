import java.util.Scanner;

public class question2 {

	
	public static void main(String[] args) 
	{
		//Declare the vars
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.println("Enter A");
		System.out.print(">");
		a = sc.nextDouble();
		System.out.println("Enter B");
		System.out.print(">");
		b = sc.nextDouble();
		System.out.println("Enter C");
		c = sc.nextDouble();
		System.out.print(">");
		System.out.println((-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a));
		System.out.println((-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a));
		
	}

}
