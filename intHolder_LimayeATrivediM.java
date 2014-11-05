//Mihir Trivedi and Anay Limaye
//Class Asg 8 IntHolder PP

/**
  This program takes an int and stores it
  It can print this number or add another number and print the sum.
*/
public class intHolder_LimayeATrivediM
{
     public static void main(String[] args)
     {
          /**
           Declare objects
          */
          intHolder TrivedInt = new intHolder(5); 
          intHolder LimayeInt = new intHolder(21);
          
          /**
            Print givens ints
          */
          System.out.println("Original int: (TrivedInt) " + TrivedInt.toString()); 
          System.out.println("Original int: (LimayeInt) " + LimayeInt.toString());
          
          /**
            Add numbers to given ints
          */
          System.out.println("Added int: (add TrivedInt to LimayeInt) " + LimayeInt.add(TrivedInt)); //
          System.out.println("Added int: (add LimayeInt to TrivedInt) " + TrivedInt.add(LimayeInt));
          
     }
}

/**
 Takes a number and has a method to print it. 
 It can also add a number to the first given int.
*/
class intHolder
{
     //Declare private int to store given int
     private int storageInt;
     
     /**
       Constructor to take in an int when object is declared
       @param given number
     */
     public intHolder(int number)
     {
          storageInt=number;
          
     }
     /**
       Converts number to string for printing
     */
     public String toString()
     {
          return storageInt+"";
     }
     
     public int getInt()
     {
          return storageInt;
     }
     /**
      Adds the previous given int to a given int
      @param number to add
     */
     public int add(intHolder op)
     {
          int sum = op.getInt()+storageInt;
          return sum;
     }
}