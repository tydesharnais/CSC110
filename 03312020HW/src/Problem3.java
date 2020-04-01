import java.util.Arrays;
//Make and fill a cubic 3-dimensional array (all 3 dimensions the same).
// Print the values along the primary diagonal. ([0][0][0],[1][1][1], etc).
public class Problem3 {

	public static void main(String[] args) 
	{
		int[][][] Array = {
				{
					{0,0,0}, {1,1,1}, {2,2,2}, {3,3,3}
				}
				
				};
		System.out.println(Arrays.deepToString(Array));

	}

}
