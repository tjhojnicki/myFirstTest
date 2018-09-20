import java.util.Stack;
public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   int count=1;
   Stack<pair> numbers = new Stack<>();

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row1, int column2)
   {
       int row=row1;
       int column=column2;
       int x=1;
       int counter=0;
       
       pair fair= new pair(row,column);
       boolean complete= false;
       numbers.add(fair); 
       setPixel(row,column,x);
       x++;
       while(complete==false)
       {
           
           
           if(checkNorth(row,column,x)!=0)
           {numbers.add(new pair(fair.getRow()-1,fair.getColumn()));
            x++;
            }
            if(checkEast(row,column,x)!=0)
           {numbers.add(new pair(fair.getRow(),fair.getColumn()+1));
            x++;
            }
            if(checkSouth(row,column,x)!=0)
           {numbers.add(new pair(fair.getRow()+11,fair.getColumn()));
            x++;
            }if(checkWest(row,column,x)!=0)
           {numbers.add(new pair(fair.getRow(),fair.getColumn()-1));
            x++;
            }
            fair=numbers.pop();
            row= fair.getRow();
            column= fair.getColumn();
            
           
           if(counter==4)
           {
               complete= true;
            }
           counter++;
            
           
           
           
        }
       
   }
   public int checkNorth(int row, int column,int num)
   {
       if(row>=1)
        {row--;}
       else
        { return 0;}
       
       if(pixels[row][column]>0)
       { return 0;
        }
       else
       { pixels[row][column]=num;
         return 1;
        }
    }
     public int checkSouth(int row, int column,int num)
   {
       if(row<=8)
        {row++;}
       else
        { return 0;}
       
       if(pixels[row][column]>0)
       { return 0;
        }
       else
       { pixels[row][column]=num;
           return 1;
        }
    }
    public int checkEast(int row, int column,int num)
   {
       if(column<=8)
        {column++;}
       else
        { return 0;}
       
       if(pixels[row][column]>0)
       { return 0;
        }
       else
       { pixels[row][column]=num;
           return 1;
        }
    }
    public int checkWest(int row, int column,int num)
   {
       if(column>=1)
        {column--;}
       else
        { return 0;}
       
       if(pixels[row][column]>0)
       { return 0;
        }
       else
       { pixels[row][column]=num;
           return 1;
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
