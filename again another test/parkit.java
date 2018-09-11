import java.util.Stack;
import java.util. Scanner;


/**
 * Write a description of class parkit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class parkit
{
    public static void main(String[] args)
    {
        Stack <Integer> driveway = new Stack<>();
        Stack <Integer> street= new Stack<>();
        int cont=1;
        Scanner scan= new Scanner(System.in);
        while(cont!=0)
        {
            System.out.println("\nWould You like add (positive License Plate) a car,remove (Negative License Plate)"+
            "a car, or press 0 to exit");
            
            cont= scan.nextInt();
            if(cont>0)
            {driveway.add(cont);
             System.out.print("\nDriveway:"+driveway);
             
            }
            else if(cont<0)
            {
               cont=-1*cont;
               if(driveway.search((Integer)cont)==-1)
               {System.out.println("The car with plate number "+ cont+" does not exists in the driveway");
                }
               else
               {
                 
                 while((int)driveway.peek()!= cont)
                 {street.push(driveway.pop());
                  System.out.println("Driveway: "+driveway);
                  System.out.println("Street: "+street);
                     
                    }
                 driveway.pop();
                 while(street.empty()!=true)
                {driveway.push(street.pop());
                  System.out.println("Driveway: "+driveway);
                  System.out.println("Street: "+street);
                }
                }
                  
            }
            
            
            
        }
    }
}
