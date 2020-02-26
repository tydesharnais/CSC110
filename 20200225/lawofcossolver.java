import java.util.Scanner;

public class question1 
{

	public static void main(String[] args) 
	{
		//Declare the vars
		
		
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		double a_convert, b_convert, c_convert, answer, s_answer;
		System.out.println("Enter Side Length A");
		System.out.print(">");
		a = sc.nextFloat();
		a_convert = Math.pow(a,2);
		System.out.println("Enter Side Length B");
		b = sc.nextFloat();
		System.out.print(">");
		b_convert = Math.pow(b, 2);
		System.out.println("Enter Angle C");
		c = sc.nextFloat();
		System.out.print(">");
		c_convert = Math.cos(c/180*3.14);
		
		answer = a_convert + b_convert - 2*a*b *c_convert;
		s_answer = Math.sqrt(answer);
		System.out.println("The Answer is: " + s_answer);
	}

}
