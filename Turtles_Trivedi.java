/**
   These imports bring in the graphics programs for the program.
   They allow for the creation of turtles and lines
*/
import acm.graphics.GTurtle;
import acm.program.GraphicsProgram;
import acm.graphics.GLine;

/**
   This class creates and moves the turtles;
   It also checks if the turtles have passed the finish line.
*/
public class Turtles_Trivedi extends GraphicsProgram
{
   public void run()
   {
      GLine finish = new GLine(600,600,600,0);
      GTurtle turt1 = new GTurtle(30,100);
      GTurtle turt2 = new GTurtle(30,250);
      GTurtle turt3 = new GTurtle(30,400);
      add(turt1);
      add(turt2);
      add(turt3);
      add(finish);
      pause(100);
      String winner = "";
      
      while(turt1.getX() < 600 || turt2.getX() < 600 || turt3.getX() < 600)
      {
         if (turt1.getX() < 600)   
            turt1.forward(Math.random()*100);
         if (turt1.getX() > 600 && !(winner.equals("turt2")|| winner.equals("turt3")))
         {
            winner = "turt1";
         }
         
         if (turt2.getX() < 600)
            turt2.forward(Math.random()*100);
         if (turt2.getX() > 600 && !(winner.equals("turt1")|| winner.equals("turt3")))
         {
            winner = "turt2";
         }
         
         if (turt3.getX() < 600)
            turt3.forward(Math.random()*100);
         if (turt2.getX() > 600 && !(winner.equals("turt1") || winner.equals("turt2")))
         {
            winner = "turt3";
         }
         pause(Math.random()*1000);
         //pause(1);
      }
      if (winner.equals("turt1"))
      {
         turt1.right(180);
         turt1.forward(200);
         turt1.left(90);
         turt1.forward(200);
      }
      if (winner.equals("turt2"))
      {
         turt2.right(180);
         turt2.forward(200);
         turt2.left(90);
         turt2.forward(200);
      }
      if (winner.equals("turt3"))
      {
         turt3.right(180);
         turt3.forward(200);
         turt3.left(90);
         turt3.forward(200);
      }

   
      System.out.println(winner);
      
   }
   
   public static void main(String[] args)
   {
      new Turtles_Trivedi().start(args);
   }
}
