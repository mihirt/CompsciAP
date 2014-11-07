import acm.graphics.GTurtle;
import acm.program.GraphicsProgram;

public class Turtles_Trivedi extends GraphicsProgram
{
   public void run()
   {
      GTurtle turt1 = new GTurtle(30,100);
      GTurtle turt2 = new GTurtle(30,250);
      GTurtle turt3 = new GTurtle(30,400);
      add(turt1);
      add(turt2);
      add(turt3);
      pause(100);
   }
   
   public static void main(String[] args)
   {
      new Turtles_Trivedi().start(args);
   }
}
