public class Debug_1 {

    public static void main(String[] args) {
        int[][] myArray = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        int row = myArray.length;
        int col = myArray[0].length;
        int subrow;
        int subcol;
        for  (subrow = 0; subrow < row; subrow++){
            for (subcol = 0; subcol < col; subcol++)
                System.out.print(myArray[subrow][subcol] + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Debugged");
    }

}
// The output for the above code should be
//  1 2 3 4
//  5 6 7 8
//  9 10 11 12