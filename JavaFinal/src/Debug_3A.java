
public class Debug_3A {

	public static void main(String[] args) 
	{
		System.out.println("Runs!");
	 int a = 1;
	 int b = -6;
	 int c = 8;
	 int[] solutions = new int[2];
	 solutions = Debug_3B.quadraticFormula(a, b, c);
	 System.out.println("The solutions are " + solutions[0] + " and " + solutions[1]);
	 System.out.println("Runs!");
	}

}
