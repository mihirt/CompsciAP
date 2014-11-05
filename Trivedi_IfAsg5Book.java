//Mihir Trivedi
//If-Asg 5 Book
/*
R5.3
     a) then should not be in the statement
     b) No close paranthesis for if statement
     c) should be ==
     d) no operator in if statment 
     e) no else statement 
R5.4
     a) -1
     b) 1
     c) 1
     d) 1.41
R5.6
     if (y<0) {y = -y;}

R5.19
     It's ordered by capital letters then lowercase letters rather than by letter only.d
R5.29
     a) false
     b) true
     c) true
     d) true
     e) false
     f) false
     g) false
     h) true
R5.31
     a) b = false;
     if (n==0) {b==true;}
     b) b = true
     if (n==0) {b==false;}
     c)b = false;
     if (n<2) {b = true;}
     d) cannot be simplified
*/
//E5.7,E5.9
public void check(int one, int two, int three)
     {
          if ((one<two)&&(two<three))
          {
               System.out.println("ordered correctly");
          }
          else
          {
               System.out.println("out of order");
          }
     }

public void paycheck()
{
     Scanner read = new Scanner(System.in);
     System.out.println("Hours completed in the last week: ");
     double hours = in.nextDouble();
     System.out.println("Name? ");
     String name = read.nextLine();
     System.out.println("Salary? ");
     double salary = read.nextDouble();
     double extraHours = 0;
     if (hours > 40)
     {
          extraHours = hours - 40;
     }
     double pay = (hours*salary)+(extraHours*(1.5*salary));
     System.out.println("You have earned: " + pay);
}

