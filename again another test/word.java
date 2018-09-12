import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class word here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class word
{
     public static void main(String [] args)
    {
        int count=0;
        TreeSet<String> words = new TreeSet<>();
        String filename="Text.txt";
        try(Scanner in = new Scanner(new File(filename)))
        {
            while(in.hasNext())
            {
             String word= in.next();
             if(word.contains(".")||word.contains(","))
                {
                    word=word.substring(word.length()-1);
                }
             words.add(word.toLowerCase());
             count++;
            }
            System.out.println("There are "+ count+ " words in the document");
            System.out.println("There are "+words.size()+ " unique words in the document");
        
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Coult not find "+filename);
         }

    }
}