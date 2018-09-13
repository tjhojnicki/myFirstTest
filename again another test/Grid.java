import java.util.Stack;
public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   int count=1;
   Stack<Integer> numbers = new Stack<>();

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
       int x=1;
       boolean complete= false;
       while(complete==false)
       {
           numbers.add(x);
           setPixel(row,column,numbers.pop());
           x++;
           
           
           
           
           
        }
       
   }
   public void checkNorth(int row, int column,int num)
   {
       if(row>=1)
        {row--;}
       else
        { return;}
       
       if(pixels[row][column]>0)
       { return;
        }
       else
       { pixels[row][column]=
        }
    }
     public boolean checkSouth(int row, int column,int num)
   {
       if(row<=9)
        {row++;}
       else
        { return true;}
       
       if(pixels[row][column]>0)
       { return true;
        }
       else
       { return false;
        }
    }
    public boolean checkEast(int row, int column,int num)
   {
       if(column<=9)
        {column++;}
       else
        { return true;}
       
       if(pixels[row][column]>0)
       { return true;
        }
       else
       { return false;
        }
    }
    public boolean checkWest(int row, int column,int num)
   {
       if(column>=1)
        {column--;}
       else
        { return true;}
       
       if(pixels[row][column]>0)
       { return true;
        }
       else
       { return false;
        }
    }
   public void setPixel(int row, int column,int value)
   {
       pixels[row][column]=value;
    }
   

   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
