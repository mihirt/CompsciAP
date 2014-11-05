//Mihir Trivedi
//Loops-Asg3

public class ASCII_TrivediM
{
     public static void main(String[] args)
     {
          ASCII one = new ASCII();
          one.printChart();
     }
}

class ASCII
{
     private int numToASCII;
     private char charASCII;
     
     public void printChart()
     {
          System.out.println("Start of table: ");
          for (numToASCII = 32; numToASCII < 127; numToASCII++)
          {
               charASCII = (char) numToASCII;
               System.out.printf("%3d. %s", numToASCII, charASCII +" ");
               if ((numToASCII-1)%5 == 0)
               {
                    System.out.println();
               }
          }
          System.out.println();
     }
}