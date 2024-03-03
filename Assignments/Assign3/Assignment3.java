// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Assignment 3
// Author: Kayla Moorcroft
// Date: 2022-10-05
// **********************************************************************************************

import java.util.Scanner;
import java.util.ArrayList;

public class Assignment3
{
  static String input = "";
  static Scanner keyboard = new Scanner(System.in);
  static ArrayList<String> roster = new ArrayList<String>();
  
  public static void main(String args[])
  {
    print("Let's make a roster: \n");
    addPlayers();
    
    print("\nRoster before cuts:");
    printList();
    
    print("\nPlease enter the unlucky letter: ");
    input = keyboard.next();
    cutPlayers();
    
    print("\nRoster after cuts:");
    printList();
  }
  
  private static void print(String s)
  {
    System.out.println(s);
  }
  
  private static void addPlayers()
  {
    while (!input.equals("stop"))
    {
      print("Please enter a player name (enter \"stop\" to stop)");
      input = keyboard.next();
      if (!input.equals("stop"))
        roster.add(input);
    }
  }
  
  private static void cutPlayers()
  {  
    int counter = 0;
    while (counter < roster.size())
    {
      if (roster.get(counter).substring(0,1).equalsIgnoreCase(input.substring(0,1)))
      {
        //print("Have to remove: " + player);
        //Different ways of doing it:
        roster.remove(counter); // I tried this way first
        //roster.remove(roster.indexOf(player)); // and when it didn't work, I tried this way
        // But it's an issue with the removal within the loop. The removal itself works, just not when I try to do it in a loop. 
      }
      else
      {
        counter++;
      }
    }
  }
  
  private static void printList()
  {
    for (String player : roster)
      print(player);
  }
}


