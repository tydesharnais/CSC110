
public class Problem5B {

	public static int[] quadraticFormula(int a, int b, int c)
    {
        int one= (int)Math.round((2*c)/(-b+Math.sqrt(Math.pow(b,2)-4*a*c)));
        int two= (int)Math.round((2*c)/(-b-Math.sqrt(Math.pow(b,2)-4*a*c)));
        int[] array={one,two};
        return (array);
    }


}
