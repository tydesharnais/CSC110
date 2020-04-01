import java.util.Arrays;

// Alter this to have the same output but have the print
// statement only written once in the code.
// While this can be done with creative use of loops it is
// intended that you create a print method that is called twice.



public class Problem1 {
	
    public static void main(String[] args)
    {
        int sub;
        //This creates our salaries array.
        double[] salaries = new double[10];
        //These lines put values in our array.
        salaries[0]=12.25;
        salaries[1]=13.55;
        salaries[2]=14.25;
        salaries[3]=16.85;
        salaries[4]=12.25;
        salaries[5]=13.55;
        salaries[6]=14.25;
        salaries[7]=16.85;
        salaries[8]=12.25;
        salaries[9]=13.55;

        
        
        
        printMethod(salaries);

        double increase = 5;

        //This for loop adds a value to each value in our array.
        for(sub=0; sub<10; sub++)
        {
            salaries[sub] = salaries[sub]+increase;

        }
        
        System.out.println("Increased Values are:");
        printMethod(salaries);
        
          
     
    }
    
    public static void printMethod(double[] array)
    {
    	int sub;
    	
    	for(sub=0; sub<10; sub++)
        {
            System.out.println(array[sub]);
        }
    }

}

