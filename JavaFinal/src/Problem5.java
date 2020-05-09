
public class Problem5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 1;
		int b = -6;
		int c = 8;
		 int[] solutions = new int[2];
		 solutions = Problem5B.quadraticFormula(a, b, c);
		 System.out.println("The solutions are " + solutions[0] + " and " + solutions[1]);
	}

}
