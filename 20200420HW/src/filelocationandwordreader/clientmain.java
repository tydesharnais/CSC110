package filelocationandwordreader;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class clientmain {

	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in); //New scanner object
		String[] words = null; //String array
		String stringoperator; //String for array
		int count = 0; //Declare counter vars 
		int correctWord = 0; //Declare correctWord 
		
		System.out.println("Please specifiy a file and path to read from:");
		String location = scan.nextLine(); //taking in location of file
		File fl; //Declare File
		FileReader fr=null; //Declare FIleReader 
		BufferedReader br=null; //Declare BufferedReader
		boolean truth = false;
		
		try {  //Try to find and associate file
			fl = new File(location);
			fr = new FileReader(fl);
			br = new BufferedReader(fr);
			System.out.println("File found!");
			truth = true; //boolean
			}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex.toString());
		}
		
		if (truth != true)
		{
			System.out.println("File not found. Exiting.");
			System.exit(0);
		}
			
		System.out.println("What word are you searching for? (Not Case-Sensitive)");
		System.out.print("The word: ");
		
		String uInput = scan.nextLine();
		String formatInput = uInput.toLowerCase(); //to lower-case 
		
		
		
		while((stringoperator = br.readLine())!=null) //While read lines is not none 
		{
			words = stringoperator.split(" "); //Setting the array equal to the reader at the split point of space
			
			
			for(String word : words) //Searching the array
			{
			
				++count;
				if (word.equals(formatInput)) //if it equals the formatted input
				{
					++correctWord;
				}
			}
			
			
			
		}
		
		System.out.println("Total # of Words: " + count);
		System.out.println("Your word " + formatInput + " appeared "
				 + correctWord + " times.");
		
		
		
		
		
		
		


	}

}
