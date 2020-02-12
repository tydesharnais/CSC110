import javax.swing.*;

public class classwork 
{

	public static void main(String[] args) 
	{
		String  string1, string2, string3, string4, string5, string6, string7;
        int x;
        //gathers string1 from user
        string1 = JOptionPane.showInputDialog(null,
                "Type a String");
        //gather string2 from user
        string2 = JOptionPane.showInputDialog(null,
                "Type a 2nd String");
        //tells user the strings it received
        System.out.println("The strings you gave are " + string1 + " and " + string2);
        //test if the strings are the same
        if(string1.equals(string2))
        {
            System.out.println(string1 + " equals " + string2);
        }
        //this else block only happens if .equals fails
        else

        {
            //tests is the strings are are the same, ignoring case
            if(string1.equalsIgnoreCase(string2))
            {
                System.out.println(string1 + " does not equal " + string2 +" unless you ignore the casing");
            }
            //only occurs is strings are still considered different
            else
            {
                System.out.println(string1 + " does not equal " + string2);
            }

        }
        System.out.println("string1 is " + string1.length() + " characters long");
        //converts string 1 to uppercase
        string3 = string1.toUpperCase();
        System.out.println("string1.toUpperCase() gives us " + string3);
        //converst string2 to lowercase
        string4 = string2.toLowerCase();
        System.out.println("string2.toLowerCase() gives us " + string4);

        // This is the 1st time the idea of computers counting at 0 is coming up in this course.
        // as a quick example, in the string "Cat" the length of the string is 3
        // However C is considered to be in the 0th position
        // a is in the 1st and t is in the 2nd.

        // Substring is an extra special case of this because the 1st argument
        // (string1.substring(argument1, argument2) (string1.substring(start, end)
        // Substring is an extra special case of this because the 1st argument starts 
        
        //counting at 0
        // but the 2nd argument starts counting at 1.
        // I believe this was decision so that a string could be split into multiple pieces
        // by using the same value for the 2nd argument and 1st argument in two consecutive substrings
        // It also gives us the benefit of allowing us to use .length() instead of .length()-1
        // to designate the end as the last character

        string5 = string1.substring(0, 2);
        System.out.println("The first two letters of string1 are " + string5);
        string6 = string1.substring(2, string1.length());
        System.out.println("The rest of the letters in string1 are " + string6);
        string7 = string1.substring(string1.length()-2, string1.length());
        System.out.println("The last two characters are " + string7);

        

	}

}
