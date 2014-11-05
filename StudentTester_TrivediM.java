/**
 * This program is a "database" system that logs a student's name, id, gender, 
 * age, school year, and twitter handle.
*/
public class StudentTester_TrivediM
{
     public static void main(String[] args)
     {
          /**
           * Initialize the objects (3 students)
          */
          Student john = new Student(217334,"Doe","John","Male","http://twitter.com/john", 10,15);
          Student unkownStudent = new Student();
          Student me = new Student(212738, "You", "There", "Male", "http://twitter.com/mihir_trivedi17", 10, 15);
          
          /**
           * Make use of the methods on different objects.
          */
          me.birthday();
          john.promote();
          unkownStudent.promote();
          unkownStudent.birthday();
          
          /**
           * Print the data contained in each objcet/student
          */
          john.printString();
          unkownStudent.printString();
          me.printString();
     }
}

/**
 * This class stores the data conneting with a Student object
 * It also has the ability to increase a student's age or school year/grade
*/
class Student
{
     /**
      * instance vars for storing data
     */
     private int id;
     private String lastName;
     private String firstName;
     private String gender;
     private String twitter;
     private int schoolYear;
     private int age;
     
     /**
      * This is the default constructor if no parameters 
      * It initializes everything to 0 or N/A - depending on what is applicable
     */
     public Student()
     {
          id = 0;
          lastName = "N/A";
          firstName = "N/A";
          gender = "N/A";
          twitter = "N/A";
          schoolYear = 0;
          age = 0;
     }
     
     /**
      * This constructor initializes the student with given vars
      * @param the ID number, first/last name, individual's gender, 
      * twitter handle, school year, and age.
     */
     public Student (int idNum, String last, String first, String genderType, String twitterHandle, int year, int ageStudent)
     {
          id = idNum;
          lastName = last;
          firstName = first;
          gender = genderType;
          twitter = twitterHandle;
          schoolYear = year;
          age = ageStudent;
     }
     
     /**
      * Increments student's age by 1 year
     */
     public void birthday()
     {
          age = age+1;
     }
     
     /**
      * Increments student's school year by 1 year
     */
     public void promote()
     {
          schoolYear=schoolYear+1;
     }
     
     /**
      * Gives data on student
      * @return all the info on the student
     */
     public String toString()
     {
          return "Name: " + lastName + ", " +firstName +  ", ID: " + id +  ", Gender: " +gender 
          + ", School Year: " +schoolYear + ", Age: " +age+", Twitter Handle: " +twitter;
     }
     
     /**
      * Prints all student's data
     */
     public void printString()
     {
          System.out.println(toString());
     }
     
}