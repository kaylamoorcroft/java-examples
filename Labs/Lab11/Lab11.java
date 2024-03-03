// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Lab 11
// Author: Kayla Moorcroft
// Date: 2022-11-23
// **********************************************************************************************

import java.util.Scanner;

public class Lab11
{
  public static void main(String[] args) throws TooLongStringException
  { 
    Scanner scan = new Scanner(System.in);
    TooLongStringException problem = new TooLongStringException("I'm sorry, we have memory issues here.");
    
    String input = scan.next();
    
    while(!input.equalsIgnoreCase("FINISHED"))
    {
      try
      {
          if(input.length()>12)
          {
            throw problem;
          }
      }
      catch (TooLongStringException exception)
      {
        System.out.println(problem.getMessage());
      }
      input = scan.next();
    }
  }
}
