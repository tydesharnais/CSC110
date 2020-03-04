import java.util.Scanner;


public class problem1 {

	public static void main(String[] args)
	{
		//Take in the Vars
		Scanner sc = new Scanner(System.in);
		
		//Problem 1
		System.out.print("Hello! What is your name?: ");
		String problem = sc.nextLine();
		problem1(problem);
		
		//Problem 2
		System.out.print("First number to add: ");
		int num1 = sc.nextInt();
		System.out.print("\nSecond number to add: ");
		int num2 = sc.nextInt();
		int problem2ans = problem2(num1, num2);
		System.out.println("The Answer is: " + problem2ans);
		
		//Problem 3
		int m_ans = problem3.finalproblem(num1, num2);
		System.out.println("The Answer is Multiplied: " + m_ans);
		
		//Problem 4
		System.out.print("Enter a height: ");
		int t_height = sc.nextInt();
		double t_area = problem3.t_area(num1, num2, t_height);
		System.out.println("Trapaziod Area: " + t_area);
		
		
		
	}
	public static void problem1(String name)
	{
		System.out.println("Hello " + name.toUpperCase());
	}
	public static int problem2(int firstnum, int secondnum)
	{
		int answer2 = firstnum + secondnum;
		return answer2;
	}

}
