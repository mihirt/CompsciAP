//Mihir Trivedi
//Class-Asg6 Book Program

/**
  The class Employee_TrivediM is the driver class for the Employee class.
  It creates two "Employee" variables and initializes one while leaving
  the other one unintialized (leaving it to the constructor).
*/
public class Employee_TrivediM
{
   public static void main(String[] args)
   {
      Employee employee1 = new Employee("Jane Doe", 50000.0);
      employee1.raiseSalary(30); //Jane gets a 30% raise
      System.out.println(employee1.getName()+" has a salary of $"+employee1.getSalary()); 
      
      Employee employee2 = new Employee();
      employee2.raiseSalary(40); //Employee gets a 40 percent raise
      System.out.println(employee2.getName()+" has a salary of $"+employee2.getSalary());
      
      Employee employee3 = new Employee("Jack Doe", 12345.0);
      employee3.raiseSalary(-2); // Jack gets a 2% downgrade in pay :(
      System.out.println(employee3.getName()+" has a salary of $"+employee3.getSalary());
    }
}

/**
 * Employee gives the an object of the class a name as well as salary.
 * The salary may be increased by percentage. (or decreased using negative percentage.)
 * @param employeeName, currentSalary which take in the name of the employee and current salary. Not required.
*/

class Employee
{
   /**
    String to hold the employee's name
    Double for the salary of the employee
   */
   private String nameEmployee;
   private double salary;
   
   /**
     This constructor initializes the employee instance variables if no constructor given.
   */
   public Employee ()
   {
        nameEmployee = "John Doe";
        salary = 50;
   }
   /**
     This constructor initializes the employee's instance variables with those passed in from the object's declaration.
     @param employeeName, currentSalary for the name and salary of the employee    
   */
   public Employee (String employeeName, double currentSalary)
   {
      nameEmployee = employeeName;
      salary = currentSalary;
   }
   
   /**
    Gets the name of the employee
    @return name of the employee
   */
   public String getName()
   {
      return nameEmployee;
   }
   
   /**
    Gets the salary of the employee
    @return salary
   */
   public double getSalary()
   {
      return salary;
   }
   
   /**
    Increases the salary of the employee by a set percent
   */
   public void raiseSalary(double byPercent)
   {
      salary = salary+(salary*(byPercent/100));
   }
}