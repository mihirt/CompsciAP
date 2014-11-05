//Vidur Maheshwari
//Mihir Trivedi
//Period 3
//Types-Asg4:Average(PP)


import java.util.Scanner;

public class Average_TrivMahesh
{
    public static void main(String[] args)
    {
        //Create Scanner
        Scanner scan = new Scanner(System.in);
        
        //Average of 3 integers given
        System.out.println("Enter three integers. Press Enter after each one");
        int intOne = Integer.parseInt(scan.nextLine());
        int intTwo = Integer.parseInt(scan.nextLine());
        int intThree = Integer.parseInt(scan.nextLine());
        int intAvg = (intOne+intTwo+intThree)/3;
        System.out.println("Average of the three numbers you gave me (as an integer): "+intAvg);
        
        //Average of 3 random integers
        int randOne = (int) ((Math.random()*100)+1);
        int randTwo = (int) ((Math.random()*100)+1);
        int randThree = (int) ((Math.random()*100)+1);
        System.out.println("Random #1: "+randOne);
        System.out.println("Random #2: "+randTwo);
        System.out.println("Random #3: "+randThree);
        int randAvg = (randOne+randTwo+randThree)/3;
        System.out.println("Random numbers' average: "+randAvg);
        
        //Average of given doubles
        System.out.println("Enter three doubles. (With a decimal) Press Enter after each one");
        double doubleOne = scan.nextDouble();
        double doubleTwo = scan.nextDouble();
        double doubleThree = scan.nextDouble();
        double doubleAvg = (doubleOne+doubleTwo+doubleThree)/3;
        System.out.print("Average of the three numbers you gave me (as doubles): "); 
        System.out.format("%.2f%n", doubleAvg); //Rounding to two decimal places.
        
    }
}