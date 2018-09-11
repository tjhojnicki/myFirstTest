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
    
        TreeSet<String> words = new TreeSet<>();
        String filename="Text.txt";
        try(Scanner in = new Scanner(new File(filename)))
        {
            while(in.hasNext())
            {
                
            }
        
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Coult not find "+filename);
         }

    }
}