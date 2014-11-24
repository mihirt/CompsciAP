/**
   These imports bring in the graphics programs for the program.
   They allow for the creation of turtles and lines
*/
import acm.graphics.GTurtle;
import acm.program.GraphicsProgram;
import acm.graphics.GLine;
import javax.swing.JOptionPane;

/**
   This class creates and moves the turtles;
   It also checks if the turtles have passed the finish line.
*/
public class Turtles_Trivedi extends GraphicsProgram
{
   public void run()
   {
      String s = JOptionPane.showInputDialog("How many objects would you like to race?");
      int amtTurt = Integer.parseInt(s);
      GTurtle[] turt = new GTurtle[amtTurt];
      for (int i = 0; i < amtTurt; i++)
      {
       turt[i] = new GTurtle(30, 100+100*i);
       add(turt[i]);
      }
      GLine finish = new GLine(600,600,600,0);
      add(finish);
      pause(100);
      //String winner = "";
      
      boolean[] turtsFinished = new boolean[amtTurt];
      for (int i = 0; i<amtTurt; i++)
         turtsFinished[i] = false;
      
      boolean exit = false;
      boolean winner = false;
      int winnerNum = 0;
      
      while (!exit)
      {
         for (int i = 0; i<amtTurt; i++)
         {
            if (turt[i].getX() < 615)
               turt[i].forward(Math.random()*100);
            else
            {
               turtsFinished[i] = true;
               if (!winner)
               {
                  winner = true;
                  winnerNum = i;
               }
               
               System.out.println(winnerNum);
            }
            
           if (areAllTrue(turtsFinished))
            exit = true;
           else
            exit = false;           
         }
         pause(500);
      }
         turt[winnerNum].penDown();
         turt[winnerNum].right(180);
         turt[winnerNum].forward(200);
         turt[winnerNum].left(90);
         turt[winnerNum].forward(200);      
      
   }
   
   public static boolean areAllTrue(boolean[] array)
   {
    for(boolean b : array) if(!b) return false;
    return true;
   }
   
   
   public static void main(String[] args)
   {
      new Turtles_Trivedi().start(args);
   }
}
