//Mihir Trivedi
//Vikram Vasan
//Class-Asg5


public class BalloonTester_TrivediVasan 
{
     public static void main(String[] args)
     {
          Balloon b1Balloon = new Balloon();
          b1Balloon.inflate(5);
          System.out.println("The volume is: "+b1Balloon.getVolume());
          Balloon b2Balloon = new Balloon();
          b2Balloon.inflate(2);
          System.out.println("The volume is: "+b2Balloon.getVolume());
          int a = 1, b = 1;
          

}
}

class Balloon 
{
     private double radius = 0;
     public void inflate(double amount)
     {
          radius = amount;
     }
     public double getVolume()
     {
          return (4/3)*Math.PI * (radius * radius * radius);
     }
}