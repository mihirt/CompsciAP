//Mihir Trivedi
//Types-Asg2
import java.util.Scanner;

public class StringInput_TrivM
{
   public static void main (String[] args)
   {
      Scanner suchScan = new Scanner(System.in);
      String asg = "Types-asg1";
      System.out.println(asg);
      System.out.println("What is your first name?");
      String firstName = suchScan.nextLine();
      System.out.println("What is your last name?");
      String lastName = suchScan.nextLine();
      System.out.println("Hello, "+firstName+" "+lastName+"!");
      String quote = "This is a cool quote: \"Everything's okay until it isn't - I'm really not sure\"";
      System.out.println(quote);
      
      //R2.8
      String message = "Hello";
      message = message.toUpperCase();
      System.out.println(message);
      /* R2.10
      An object variable is the pointer/holder for the object. 
      For example, in the declaration String sample = "Hello"; sample is the object variable, and Hello is the object.
      */
      
      /* R2.16
      a. missing "new" to create the rectangle
      b. Only able to getWidth of existing object - can't create rectangle in declaration
      c. r isn't initialized as a rectangle - can't be translated.
      d. Can't translate string with an object that takes integers.
      */
      
      
   }
}