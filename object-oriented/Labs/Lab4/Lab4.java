import java.util.Scanner;

public class Lab4
{
  public static void main(String args[])
  {
    Scanner keyboard = new Scanner(System.in);
    
    print("What is your name?");
    String name = keyboard.nextLine();
    print("Give me your favourite number: ");
    int favourite = keyboard.nextInt();
    print("Give me your least favourite number: ");
    int leastFavourite = keyboard.nextInt();
    
    if (favourite > leastFavourite)
    {
      print(name + ", your favourite number is bigger than your least favourite number.");
    }
    else if (favourite == leastFavourite)
    {
      print(name + ", wait, your favourite number and your least favourite number are the same?");
    }
    else
    {
      print(name + ",they say if your least favourite number is greater than your favourite number, you're lucky. Guess you're lucky.");
    }
    
  }
  
  public static void print(String s)
  {
    System.out.println(s);
  }
}