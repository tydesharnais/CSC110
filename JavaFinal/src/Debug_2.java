import javax.swing.*;
public class Debug_2
{
    public static void main(String args[])
    {
        String word;
        word=JOptionPane.showInputDialog("Please enter your word.");
        word=word.toLowerCase();
        String piglatin="";
        int vowel =0;
        for(int i=0;i<word.length();i++)
        {
            char x=word.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' ||x=='u')
            {
                piglatin=word.substring(i)+word.substring(0,i)+"ay";
                vowel=1;
                break;
            }
        }
        if(vowel==0)
        {
            piglatin=word+"ay";
        }
        //The magical capitalization line
        System.out.println(piglatin.substring(0,1).toUpperCase()+ piglatin.substring(1, piglatin.length()));
    }
}

//Alter the above code so that it both runs, and capitalizes the 1st letter of the output.