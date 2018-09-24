import java.util.LinkedList;
import java.util.Queue;
/**
   Class for simulating a runway.
*/
public class RunwaySimulator
{
   int x=0;
   Queue<String> landing = new LinkedList<>();
   Queue<String> takeoff = new LinkedList<>();
   

   /**
      Constructor.
   */
   public RunwaySimulator()
   {
       
       
      

   }

   /**
      Add a flight symbol to the taking off queue.
      @param flightSymbol the flight symbol.
   */
   public void addTakeOff(String flightSymbol)
   {
      takeoff.add(flightSymbol);

   }

   /**
      Add a flight symbol to the landing queue.
      @param flightSymbol the flight symbol.
   */
   public void addLanding(String flightSymbol)
   {
      landing.add(flightSymbol);

   }

   /**
      Handle the next action.
   */
   public void handleNextAction()
   {
      while(landing.size()!=0)
      {
         System.out.println("Plane "+landing.remove()+ " is landing!");
          x++;
        }
      if(landing.size()==0)
      {
         System.out.println("Plane "+takeoff.remove()+ " is Taking off!");
          x++;
        }


   }
}
