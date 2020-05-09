
public class Debug_3B {

	public static int[] quadraticFormula(int a, int b, int c)
    {
        int one= (int)Math.round((-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
        int two= (int)Math.round((-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
        int[] array={one,two};
        return (array);
    }

}
