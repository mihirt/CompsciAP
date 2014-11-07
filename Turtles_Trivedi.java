import acm.graphics.GTurtle;
import acm.program.GraphicsProgram;
import acm.graphics.GLine;

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
      
      while(turt1.getX() < 600 && turt2.getX() < 600 && turt3.getX() < 600)
      {
         turt1.forward(Math.random()*100);
         turt2.forward(Math.random()*100);
         turt3.forward(Math.random()*100);
         pause(Math.random()*1000);
      }
   }
   
   public static void main(String[] args)
   {
      new Turtles_Trivedi().start(args);
   }
}
