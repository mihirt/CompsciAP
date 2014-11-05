//Mihir Trivedi
//Class-Asg 3: Die class -print

/** 
   Java doc method
*/
public class DieTesterPrint_TrivediM 
{
  
   public static void main(String[] args)
   {
      Die die1 = new Die(); //Creates die object
      Die die2 = new Die();
      die1.roll(); //Role die 1
      die1.print();//Print die 1
      die2.roll(); // Role die 2
      die2.print(); // Print die 2
      
   }
}

/** 
   Represents one die with faces showing values between 1 and 6
*/ 
class Die 
{
   //Data Declaration
   private final int MAX_FACE = 6; //Max face value
   private int faceValue; //Current value showing on the die
   
   //Methods
   /** 
      Determines the next faceValue for the die
   */
   public int roll()
   {
      faceValue = (int)(Math.random() * MAX_FACE + 1);
      return faceValue;
   }
   
   /**
      Returns the face value of the die
   */
   public int getFaceValue()
   {
      return faceValue;
   }
   /**
    Convert the int faceValue to a string
    @return a string of faceValue
   */
   public String toString()
   {
      return ""+faceValue;
   }
   /**
    Print the string value of faceValue
   */
   public void print()
   {
      System.out.println(toString());
   }
   
}