//Mihir Trivedi and Clay Rosenthal
//Comp Sci A AP
//If Asg2 Quizzer

import java.util.Scanner;
/**
 This is the public class that tests the Quizzer class
 It initializes an object var of Quizzer and runs it.
*/
public class TestQuizzer_TrivediRosenthal
{
     public static void main(String[] args)
     {
          Scanner playAgain = new Scanner(System.in);
          boolean runAgain = true;
          Quizzer quizee = new Quizzer();
          while (runAgain)
          {
               quizee.askQuestion();
               quizee.displayResults();
               System.out.println("Would you like to play again? (y/n)");
               String yesNo = playAgain.nextLine();
               if (yesNo.equals("y"))
               {
                    runAgain = true;
               }
               else
               {
                    runAgain = false;
               }
          }
          
     }
}
/**
 This is a class that stores a score on a quiz, asks the questions on the quiz,
 validates the answers, and displays the results
*/
class Quizzer
{
     private double score;
     Scanner getAnswers = new Scanner(System.in);
     /**
      This method asks questions to the user.
      It then saves these answers and (for m/c) checks if they are valid
      It then assigns points based on answers for certain questions.
     */
     public void askQuestion()
     {
          System.out.println("What is your name?");
          String name = getAnswers.nextLine();
          name = name.toLowerCase();
          System.out.println("What is your quest?");
          String quest = getAnswers.nextLine();
          quest = quest.toLowerCase();
          System.out.println("What is the airspeed velocity of an " +
          "unladen swallow?");
          System.out.println("a. 25 mph \nb. 35 mph \nc. " +
          "African or European? \nd. 50 kmh");
          String velocity = getAnswers.nextLine();
          velocity = this.isLegit(velocity);
          System.out.println("Solve for \'x\': 4x - 2 = 16");
          String math = getAnswers.nextLine();
          if (math.equals("4.5"))
          {
               System.out.println("It was integer division, yo!");
          }
          System.out.println("R u A l337 haX0r?\na. Yes \nb. No \nc. Maybe" +
          "\nd. #YOLO SWAG");
          String haxor = getAnswers.nextLine();
          haxor = this.isLegit(haxor);
          System.out.println("What\'s the best school?\na. Mitty " +
          "\nb. Bellarmine \nc. Saint Francis \nd. Notre Dame");
          String skewl = getAnswers.nextLine(); 
          skewl = this.isLegit(skewl);
          System.out.println("What mobile operating system is best?" +
          "\na. What? \nb. Who? \nc. When? \nd. Android");
          String mobile = getAnswers.nextLine();
          mobile = this.isLegit(mobile);
          
          if (name.equals("king arthur"))
          {
               score = score + 1.0;
          }
          if (quest.equals("to seek the holy grail"))
          {
               score = score + 2.7;
          }
          
          if (velocity.equals("c"))
          {
               score = score + 25.69;
          }
          if (math.equals("4"))
          {
               score = score + 10.23;
          }
          if (haxor.equals("a"))
          {
               score = score + 100.001;
          }
          if (haxor.equals("d"))
          {
               score = score - 4.20;
          }
         
          if (skewl.equals("b"))
          {
               score = score + 1.21;
          }
         
          if (mobile.equals("d"))
          {
               score = score + 5.99;
          }
     }
     
     public double getScore()
     {
          return score;
     }
     public String toString()
     {
          return "" + score;
     }
     /**
      A method to test if an answer to a multiple choice question is valid
      @param the answer to be checked for validity
      @return a valid answer
     */
     public String isLegit(String answer)
     {
          char ans = answer.toLowerCase().charAt(0);
          String reAnswer = answer;
          while(ans!='a' && ans!='b' && ans!='c' && ans!='d')
          {
               System.out.println("You done messed up. You gimme " +
               "a not valid answer, bruh. Gimme valid answer.");
               reAnswer = getAnswers.nextLine();
               reAnswer = reAnswer.substring(0,1);
               ans = reAnswer.charAt(0);
          }
          return reAnswer;
     }
     /**
      A method to display the results of the quiz and give an opinion
     */ 
     public void displayResults()
     {
          System.out.println("Your swag score bruh: "+this.getScore());
          if (this.getScore() < 21)
          {
               System.out.println("You failed this quiz...");
          }
          if (this.getScore() > 21 && this.getScore() < 100)
          {
               System.out.println(this.getScore() + " points, but it could have been more!");
          }
          else
          {
               System.out.println("Nice Swag!");
          }
     }
     
     
}