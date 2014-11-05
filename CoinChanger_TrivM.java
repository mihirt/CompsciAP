//Mihir Trivedi
//Types-Asg5

import java.util.Scanner;

/*
    This program is a change calculator. It takes in an amount $ that is the sale. Then it takes in the amount given by a customer.
    Next, it calculates the change necessary, and prints the amounts of change.
*/
    
public class CoinChanger_TrivM
{
   public static void main (String[] args)
   {
       // Gets the money information for amount tendered and amount given
       Scanner getData = new Scanner(System.in);
       System.out.println("What is your total sale amount? Without the dollar sign and with a decimal. Ex. 3.23");
       double totalD = getData.nextDouble();
       System.out.println("How much money were you given? Same format -- no dollar sign and with a decimal");
       double amountGivenD = getData.nextDouble();
       int total = (int) (totalD*100);
       int amountGiven = (int) (amountGivenD*100);
       int difference = amountGiven-total;
       
       //Calculates change
       int quarters = difference/25;
       difference = difference - (25*quarters);
       int dimes = difference/10;
       difference = difference - (10*dimes);
       int nickels = difference/5;
       difference = difference - (5*nickels);
       int pennies = difference;
       difference = difference-pennies;
       
       //Prints change
       System.out.println("\n\tMihir Trivedi\n\tTypes-asg5 - Change calculator");
       System.out.println("\nChange to give:\n");
       System.out.println("Quarters: " + quarters);
       System.out.println("Dimes: " + dimes);
       System.out.println("Nickels: "+nickels);
       System.out.println("Pennies: "+pennies);
   }
}