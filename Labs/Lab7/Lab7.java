// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Lab 7 
// Author: Kayla Moorcroft
// Date: 2022-10-21
// **********************************************************************************************
import java.util.Scanner;

public class Lab7
{
  public static void main(String args[])
  {
    Scanner keyboard = new Scanner(System.in);
    int score, tries = 0;
 
    do
    {
      print("Tell me your score (1-10) and I'll give you some feedback");
      score = keyboard.nextInt();
      tries++;
    } while(!(score <= 10 && score >= 1));
    
    if(tries >= 4) print("You do not deserve an analysis.");
    else
    {
      switch(score)
      {
        case(1):
          print("Not great");
          break;
        case(2):
          print("Not very good");
          break;
        case(3):
          print("You'll get there");
          break;
        case(4):
          print("Almost passed");
          break;
        case(5):
          print("A pass, but really close");
          break;
        case(10):
          print("Way to go!");
          break;
        default:
          print("Uninteresting");
          break;
      }
    }
  }
  
  public static void print(String s) { System.out.println(s); }
}