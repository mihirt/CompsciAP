public class Cat_TrivediM
{
     public static void main(String[] args)
     {
     Cat newCat = new Cat();
     System.out.println(newCat);
     newCat.changeColor("Black");
     newCat.changeLocation("House");
     newCat.changeMood("angry");
     System.out.println(newCat);
     //System.out.println("hello");
     }
}

class Cat
{
     private boolean mood;
     private String color;
     private String location;
     
     public Cat()
     {
          mood = false;
          color = "Brown";
          location = "Kitchen";
     }
     
     public Cat(boolean mood, String color, String location)
     {
          this.mood = mood;
          this.color = color;
          this.location = location;
     }
     
     public String getMood()
     {
          if (mood == true)
          {
               return "Angry";
          }
          else
          {
               return "Happy";
          }
     }
     
     public void changeColor(String color)
     {
          this.color = color;
     }
     
     public void changeLocation(String location)
     {
          this.location = location;
     }
     
     public void changeMood(String moodCurrent)
     {
          if (moodCurrent.equals("Angry") || (moodCurrent.equals("angry")))
          {
               this.mood = true;
          }
          else
          {
               this.mood = false;
          }
     }
     public String toString()
     {
          return "The cat is of color "+color+ " and is currently "+this.getMood()+". The cat is currently in the "+location+".";
     }
}